import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class TestGhiozdan {
    public static void main(String[] args) {
        TestGhiozdan testGhiozdan = new TestGhiozdan();
        List<Rechizita> rechizite = testGhiozdan.readfile("Rechizite.xml");

        Ghiozdan ghiozdan = new Ghiozdan(rechizite);

        System.out.println("Nr total rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Nr total caiete: " + ghiozdan.getNrCaiete());
        System.out.println("Nr total manuale: " + ghiozdan.getNrManuale());

        ghiozdan.listItems();
        ghiozdan.listCaiet();
        ghiozdan.listManual();

        ghiozdan.add(new Manual("atlas", Arrays.asList("Mihai", "Iulia"), "Nord"));

        System.out.println("Nr total rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Nr total caiete: " + ghiozdan.getNrCaiete());
        System.out.println("Nr total manuale: " + ghiozdan.getNrManuale());

        ghiozdan.listItems();
    }

    private List<Rechizita> readfile(String fileName) {

        List<Rechizita> returnList = new ArrayList<>();
        try {
            URL res = getClass().getClassLoader().getResource(fileName);
            File inputFile = Paths.get(res.toURI()).toFile();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList listaRechizite = doc.getElementsByTagName("rechizita");

            for (int i = 0; i < listaRechizite.getLength(); i++) {
                Node nNode = listaRechizite.item(i);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;
                    String nume = element.getElementsByTagName("nume").item(0).getTextContent();

                    if (element.getAttribute("type").equals("manual")) {
                        List<String> autori = new ArrayList<>();

                        Element nodeAutori = (Element) element.getElementsByTagName("autori").item(0);
                        NodeList valueAutori = nodeAutori.getElementsByTagName("value");

                        for (int j = 0; j < valueAutori.getLength(); j++) {
                            autori.add(valueAutori.item(j).getTextContent());
                        }

                        String editura = element.getElementsByTagName("editura").item(0).getTextContent();
                        returnList.add(new Manual(nume, autori, editura));
                    } else {
                        String tip = element.getElementsByTagName("tip").item(0).getTextContent();
                        int numarFile = Integer.parseInt(element.getElementsByTagName("numarFile").item(0).getTextContent());
                        returnList.add(new Caiet(nume, tip, numarFile));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return returnList;
    }
}
