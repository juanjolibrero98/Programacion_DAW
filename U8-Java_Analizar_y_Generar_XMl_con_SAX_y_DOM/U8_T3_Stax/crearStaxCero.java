package U8_T3_Stax;

import java.util.ArrayList;
import javax.swing.text.Document;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
public class crearStaxCero {
    public static void main(String[] args) {
        //Crear un ArrayList con al menos 10 objetos. Dicho objetos deben tener al menos 4 atributos. La clase del Objeto deberá crearse en un fichero aparte.
        ArrayList<ClasesParticulares> clases = new ArrayList<>(10);

        clases.add(0, new ClasesParticulares("Mates",7,"Ana",60));
        clases.add(1, new ClasesParticulares("Lengua",6,"Pepe",20));
        clases.add(2, new ClasesParticulares("Física",8,"Rosa",80));
        clases.add(3, new ClasesParticulares("Química",6,"Ana",30));
        clases.add(4, new ClasesParticulares("EF",2,"Juan",50));
        clases.add(5, new ClasesParticulares("Religión",3,"Pepe",40));
        clases.add(6, new ClasesParticulares("Recreo",8,"Rosa",70));
        clases.add(7, new ClasesParticulares("Filosifía",4,"Juan",20));
        clases.add(8, new ClasesParticulares("Historia",6,"Jose",40));
        clases.add(9, new ClasesParticulares("Dibujo técnico",3,"Juana",30));

        //Usando Stax volcar el contenido de ese ArrayList al fichero XML stax.xml
        try {

            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("XMLstax.xml"));

            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);

            Characters saltoLinea = eventFactory.createCharacters("\n");
            Characters saltoTab = eventFactory.createCharacters("\n\t");
            Characters tabula = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoLinea);



            StartElement claseStartElement = eventFactory.createStartElement("","","CentroDeClases");
            xmlWriter.add(claseStartElement);
            xmlWriter.add(saltoTab);

            //Recorro pedidos y voy creando las etiquetas (eventos) necesarias para cada uno de elllas

            //Esta variable la creo para controlar si es el último de los pedidos ya que querré diferente salida
            int longitud = 0;

            for (ClasesParticulares aula : clases) {

                //Creo todas las etiquetas de apertura  que va a tener cada uno de los pedidos
                StartElement horasSemanalesStart = eventFactory.createStartElement("","","horasSemanales");
                StartElement nombreStart = eventFactory.createStartElement("","","nombre");
                StartElement precioClasesStart = eventFactory.createStartElement("","","precioClases");
                StartElement profesorStart = eventFactory.createStartElement("","","profesor");


                //Creo el atribudo id
                Attribute horass = eventFactory.createAttribute("Horas",(Integer.toString(aula.getHorasSemanales())));


                //Creo todas las etiquetas de cierre que va a tener cada uno de los pedidos
                EndElement horaEnd = eventFactory.createEndElement("","","horasemanales");
                EndElement nombreEnd = eventFactory.createEndElement("","","nombre");
                EndElement precioEnd = eventFactory.createEndElement("","","PrecioClases");
                EndElement profesorEnd = eventFactory.createEndElement("","","profesor");

                //Creo los contenidos
                Characters nombre = eventFactory.createCharacters(aula.getNombre());
                Characters precio  = eventFactory.createCharacters(Integer.toString(aula.getPrecioClases()));
                Characters profesor = eventFactory.createCharacters(aula.getProfesor());



                //Añado todos los elementos correspondientes a un pedido en el orden que es necesario
                xmlWriter.add(horasSemanalesStart);

                //Añado el atributo
                xmlWriter.add(horass);

                xmlWriter.add(saltoTab);
                xmlWriter.add(tabula);

                //Lo hijos de cada pedido
                xmlWriter.add(nombreStart);
                xmlWriter.add(nombre);
                xmlWriter.add(nombreEnd);
                xmlWriter.add(saltoTab);
                xmlWriter.add(tabula);
                xmlWriter.add(precioClasesStart);
                xmlWriter.add(precio);
                xmlWriter.add(precioEnd);
                xmlWriter.add(saltoTab);
                xmlWriter.add(tabula);
                xmlWriter.add(profesorStart);
                xmlWriter.add(profesor);
                xmlWriter.add(profesorEnd);
                xmlWriter.add(saltoTab);

                //Cierro el pedido que estoy escribiendo
                xmlWriter.add(horaEnd);

                //En el último quiero un tratamiendo diferente
                if (longitud == clases.size() - 1) {
                    xmlWriter.add(saltoLinea);
                } else {
                    xmlWriter.add(saltoTab);
                }
                longitud++;

            }



            //Creo el evento necesario para cerrar la etiqueta raíz pedidos
            EndElement aulaEndElement = eventFactory.createEndElement("","","Aulas");
            xmlWriter.add(aulaEndElement);
            xmlWriter.add(saltoLinea);



            //Creo el evento de finalización del documento y lo escribo con el objeto escritor
            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);


        } catch (XMLStreamException | FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }




    }
}
