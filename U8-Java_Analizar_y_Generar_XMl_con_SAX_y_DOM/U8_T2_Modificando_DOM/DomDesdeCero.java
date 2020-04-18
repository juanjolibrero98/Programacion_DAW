package U8_T2_Modificando_DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;

public class DomDesdeCero {
    public static void main(String[] args) {
        ArrayList<ClasesParticulares> centroClases = new ArrayList(10);
        ClasesParticulares mates = new ClasesParticulares("Mates",7,"Ana",60);
        ClasesParticulares lengua = new ClasesParticulares("Lengua",6,"Pepe",20);
        ClasesParticulares fisica = new ClasesParticulares("Física",8,"Rosa",80);
        ClasesParticulares quimica = new ClasesParticulares("Química",6,"Ana",30);
        ClasesParticulares eF = new ClasesParticulares("EF",2,"Juan",50);
        ClasesParticulares religion = new ClasesParticulares("Religión",3,"Pepe",40);
        ClasesParticulares recreo = new ClasesParticulares("Recreo",8,"Rosa",70);
        ClasesParticulares filosifia = new ClasesParticulares("Filosifía",4,"Juan",20);
        ClasesParticulares historia = new ClasesParticulares("Historia",6,"Jose",40);
        ClasesParticulares dibujo = new ClasesParticulares("Dibujo técnico",3,"Juana",30);
        centroClases.add(mates);
        centroClases.add(lengua);
        centroClases.add(fisica);
        centroClases.add(quimica);
        centroClases.add(eF);
        centroClases.add(religion);
        centroClases.add(recreo);
        centroClases.add(filosifia);
        centroClases.add(historia);
        centroClases.add(dibujo);


        try {

            //Obtenemos la referencia al objeto Document
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            //No parseo ningún fichero XML existente, simplemente lo obtengo
            Document doc = db.newDocument();

            //Creo el elemento raíz ya que está vacío
            Element root = doc.createElement("CentroParticular");

            //Añado el elemento raíz
            doc.appendChild(root);


            //Procedo a crear la etiqueta que voy a almacenar el fichero
            for (int i = 0; i <centroClases.size() ; i++) {

                Element centroTag = doc.createElement("Clase");
                centroTag.setAttribute("horas", Integer.toString(centroClases.get(i).getHorasSemanales()));

                //Creo la etiqueta nombre que añadiré luego como hija
                Element nombre = doc.createElement("nombre");
                nombre.setTextContent(centroClases.get(i).getNombre());

                //Creo la etiqueta profesor que añadiré luego como hija
                Element profesor = doc.createElement("profesor");
                profesor.setTextContent(centroClases.get(i).getProfesor());
                Element precio = doc.createElement("precio");
                profesor.setTextContent(Double.toString(centroClases.get(i).getPrecioClases()));

                //Añado las hijas
                centroTag.appendChild(nombre);
                centroTag.appendChild(profesor);
                centroTag.appendChild(precio);

                //Añado esa nueva etiqueta al nodo raíz
                root.appendChild(centroTag);
            }



            // PROCEDEMOS A VOLCAR TODAS LAS MODIFICACIONES, TODO ÉL ARBOL AL FICHERO

            //Obtenemos el objeto transformer
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            //Configuración del transformer
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            //Creación del origen DOMSource
            DOMSource origenDOM = new DOMSource(root);

            //Creación del fichero que va a ser mi destino
            File nuevoCentro = new File("XMLcero.xml");
            StreamResult destino = new StreamResult(nuevoCentro);

            //Hacemos la transformación que en nuestro caso es la escritura
            transformer.transform(origenDOM,destino);


        } catch (Exception e ) {
            e.printStackTrace();
        }

    }
}
