package U8_T3_Stax;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class mostrarStax {
    public static void main(String[] args) {
        ArrayList<ClasesParticulares> clases = new ArrayList<>();
        ClasesParticulares claseActual = null;
        String tagActual = "";


        try {
            //Recorrer el fichero XML con Stax
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("XMLcero.xml"));

            //Mostrar por pantalla el contenido del fichero XML.
            while (xmlReader.hasNext()) {

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement startTag = xmlEvent.asStartElement();

                    System.out.print(" <" + startTag.getName().getLocalPart());

                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName) {
                        case "ClasesParticulares":
                            claseActual = new ClasesParticulares();
                            tagActual = "clase";
                            Attribute clas = startTag.getAttributeByName(new QName("NombreClase"));

                            claseActual.setNombre(clas.getValue());

                            System.out.print(" " + clas.getName() + "=\"" + clas.getValue() + "\"");
                            break;

                        case "horasSemanales":
                            tagActual = "horasSemanales";
                            break;

                        case "profesor":
                            tagActual = "profesor";
                            break;

                        case "precioClases":
                            tagActual = "precioClases";
                            break;
                    }
                    System.out.print(">");

                } else if (xmlEvent.isEndElement()) {

                    EndElement endtag = xmlEvent.asEndElement();
                    System.out.println("<\\" + endtag.getName().getLocalPart() + ">");

                    if (endtag.getName().getLocalPart().equals("ClasesParticulares")) {
                        clases.add(claseActual);
                    }

                    tagActual = "";

                } else if (xmlEvent.isStartDocument()) {
                    System.out.println("Comienzo del parseado del documento");

                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("Fin del parseado del documento");

                } else if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (!texto.getData().contains("\n")) {
                        System.out.print(" " +texto.getData()+" ");
                    }

                    if (!tagActual.equals("")) {
                        switch (tagActual) {
                            case "horasSemanales":
                                claseActual.setHorasSemanales(Integer.valueOf(texto.getData()));
                                break;
                            case "profesor":

                                claseActual.setProfesor(texto.getData());
                                break;
                            case "precioClases":
                                claseActual.setPrecioClases(Integer.valueOf(texto.getData()));
                                break;
                        }
                    }
                }

            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }
}
