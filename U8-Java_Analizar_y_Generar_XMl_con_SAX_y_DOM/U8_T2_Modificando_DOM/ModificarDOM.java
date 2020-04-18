package U8_T2_Modificando_DOM;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class ModificarDOM {
    public static void main(String[] args) {
        try {
            //Carga el contenido del XML en la estructura DOM.
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("yeguada.xml"));

            //Añadir antes de cada nodo hijo el comentario
            Element root =  doc.getDocumentElement();
            NodeList nl = root.getChildNodes();
            Comment coment = doc.createComment("<!-- COMENTARIO AÑADIDO DESDE DOM -->");
            for (int i = 0; i <nl.getLength() ; i++) {
                Element anahirCome = (Element) doc.getElementsByTagName("caballo").item(i);
                root.insertBefore(coment,anahirCome);

            }

            //Añadir un nueva etiqueta hija
                // Creo la etiqueta padre caballo, le doy nombre
                Element caballo = doc.createElement("caballo");
                caballo.setAttribute("id","6");

                Element nombre = doc.createElement("nombre");
                nombre.setTextContent("Pepito");
                Element edad = doc.createElement("edad");
                edad.setTextContent("2");
                Element duenho = doc.createElement("duenho");
                duenho.setTextContent("yo");
                //Creo la etiqueta hija valor y le doy valor
                Element valor = doc.createElement("valor");
                valor.setTextContent("3000€");


                //Construyo toda la estructura general de la etiqueta
                //caballo.appendChild(saltoLinea);
                caballo.appendChild(nombre);
                //caballo.appendChild(saltoLinea);
                caballo.appendChild(edad);
                //caballo.appendChild(saltoLinea);
                caballo.appendChild(duenho);
                //caballo.appendChild(saltoLinea);
                caballo.appendChild(valor);
                //caballo.appendChild(saltoLinea);

                //Añadimos ese nuevo nodo al root
                root.appendChild(caballo);

        //Crear un nuevo nodo etiqueta (en el ejemplo una nueva persona) y reemplazar la primera etiqueta hija por ese nodo creado.

            NodeList nl1 = doc.getElementsByTagName("caballo");
            Node node = nl1.item(nl1.getLength()-1);
            Element caballoClonada = (Element) node.cloneNode(true);

            //Cambio el atributo
            caballoClonada.setAttribute("id","5");

            //Añadimos ese nuevo no al root
            root.appendChild(caballoClonada);

            /*Volcar todo a un fichero XML llamado dom_modificado.xml*/
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            //Creación del origen DOMSource
            DOMSource origenDOM = new DOMSource(root);

            //Creación del fichero que va a ser mi destino
            File nuevaYeguada = new File("dom_modificado.xml");
            StreamResult destino = new StreamResult(nuevaYeguada);

            //Hacemos la transformación que en nuestro caso es la escritura
            transformer.transform(origenDOM,destino);

        }catch (IOException | ParserConfigurationException | SAXException | TransformerConfigurationException e){
            System.out.println(e.getMessage());
        } catch (TransformerException e) {
            e.printStackTrace();
        }


    }
}
