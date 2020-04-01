package Librero_Cansino_U8_T1_SAX_DOM_Recorrido.xml.dom;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.*;

public class RecorridoDOM {
    public static void main(String[] args) {
        numNodosHijos();
        mostrarXMLDom();

    }

    public static void numNodosHijos() {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("yeguada.xml"));
            Element root = doc.getDocumentElement();
            NodeList nList = root.getChildNodes();
            System.out.println("Nº nodos hijos: " + nList.getLength());

            for (int i = 0; i < nList.getLength(); i++) {
                Node nodo = nList.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("El nodo " + i + " es una etiqueta" +" y de "+ " Valor= " + nodo.getNodeType());
                } else if (nodo.getNodeType() == Node.COMMENT_NODE) {
                    System.out.println("El nodo " + i + " es un comentario" +" y de "+ " Valor= " + nodo.getNodeType());
                } else if (nodo.getNodeType() == Node.TEXT_NODE) {
                    System.out.println("El nodo " + i + " es texto" +" y de "+ " Valor= " + nodo.getNodeType());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void mostrarXMLDom() {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("yeguada.xml"));
            Element root = doc.getDocumentElement();
            NodeList nList = root.getChildNodes();
            System.out.println("¿Mostrar contenido completo?");
            Scanner sc = new Scanner(System.in);
            String opc = sc.nextLine().toUpperCase();

            for (int i = 0; i < nList.getLength(); i++) {
                Node nodo = nList.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE ) {
                    System.out.println(nodo.getNodeName());

                    System.out.println("Encontrado nodo etiqueta");
                    Element ele = (Element) nodo;
                    System.out.println("Nombre nodo: " + nList.item(i).getNodeName());
                    if (ele.hasAttributes() ) {
                        System.out.println("Tiene atributos");
                        NamedNodeMap nodeMap = ele.getAttributes();
                        for (int j = 0; j < nodeMap.getLength(); j++) {
                            Node node = nodeMap.item(j);
                            Attr atributo = ele.getAttributeNode(node.getNodeName());
                            System.out.println(atributo.getNodeName() + " = " + atributo.getValue());
                        }
                    }


                    if (nodo.hasChildNodes()&& opc.equals("SI")) {
                        System.out.println("Contenido");
                        NodeList listhija = nodo.getChildNodes();
                        for (int j = 0; j < listhija.getLength(); j++) {
                            if (listhija.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eleHijo = (Element) listhija.item(j);
                                System.out.println(eleHijo.getTagName() + " = " + eleHijo.getTextContent());
                            }
                        }
                    }

                } else if (nodo.getNodeType() == Node.COMMENT_NODE  ){
                    System.out.println("Encontrado nodo comentario");
                    System.out.println("Contiene: ");
                    Comment comentario = (Comment) nList.item(i);
                    System.out.println(comentario.getTextContent());

                } else if (nodo.getNodeType() == Node.TEXT_NODE ) {
                    System.out.println("Encontrado nodo comentario");
                    System.out.println("Contiene: ");
                    Text texto = (Text) nList.item(i);
                    System.out.println(texto.getTextContent());

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mostrarContenidoEtiqueta(Element e) {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("yeguada.xml"));
            Element root = doc.getDocumentElement();
            NodeList nList = root.getChildNodes();

            for (int i = 0; i < nList.getLength(); i++) {
                Node nodo = nList.item(i);

                if ((nodo.getNodeType() == Node.ELEMENT_NODE) && (root.getTagName().equals(e.getTagName()))) {
                    System.out.println(nodo.getNodeName());

                    System.out.println("Encontrado nodo etiqueta");
                    Element ele = (Element) nodo;
                    System.out.println("Nombre nodo: " + nList.item(i).getNodeName());
                    if (ele.hasAttributes()) {
                        System.out.println("Tiene atributos");
                        NamedNodeMap nodeMap = ele.getAttributes();
                        for (int j = 0; j < nodeMap.getLength(); j++) {
                            Node node = nodeMap.item(j);
                            Attr atributo = ele.getAttributeNode(node.getNodeName());
                            System.out.println(atributo.getNodeName() + " = " + atributo.getValue());
                        }
                    }
                    if (nodo.hasChildNodes()) {
                        System.out.println("Contenido");
                        NodeList listhija = nodo.getChildNodes();
                        for (int j = 0; j < listhija.getLength(); j++) {
                            if (listhija.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eleHijo = (Element) listhija.item(j);
                                System.out.println(eleHijo.getTagName() + " = " + eleHijo.getTextContent());
                            }
                        }
                    }

                } else if (nodo.getNodeType() == Node.COMMENT_NODE) {
                    System.out.println("Encontrado nodo comentario");
                    System.out.println("Contiene: ");
                    Comment comentario = (Comment) nList.item(i);
                    System.out.println(comentario.getTextContent());

                } else if (nodo.getNodeType() == Node.TEXT_NODE) {
                    System.out.println("Encontrado nodo comentario");
                    System.out.println("Contiene: ");
                    Text texto = (Text) nList.item(i);
                    System.out.println(texto.getTextContent());

                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
