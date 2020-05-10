package com.fileconversion.xmltoobject;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.fileconversion.xmltoobject.model.SetXmlValueUsingReflection;

public class GetXMLNodeInJavaDemo {

    public static void main(String[] args) {

        try {
            File fXmlFile = new File("xmlnamespace.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            dbFactory.setNamespaceAware(true);

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();

            printByElementTagname(doc, "inventoryInfo");
            printByElementTagname(doc, "site");
//            printByElementTagname(doc, "alarmHistory");
//            printByElementTagname(doc, "deliveryInfo");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printByElementTagname(Document doc, String tagName) {
        NodeList nodes = doc.getDocumentElement().getElementsByTagNameNS("*", tagName);
        Node node;
        List<SetXmlValueUsingReflection> listCls = new ArrayList<SetXmlValueUsingReflection>();
        for(int i = 0; i < nodes.getLength(); i++) {
            node = nodes.item(i);
            NodeList nodesTemp = node.getChildNodes();
            SetXmlValueUsingReflection refObj = new SetXmlValueUsingReflection();
            
            if(nodesTemp.getLength() > 1) {
            	
            	for(int j = 0; j < nodesTemp.getLength(); j++) {
                	Node temp = nodesTemp.item(j);
                	String p = temp.getTextContent();
                	if(temp.getLocalName() != null) {
                		System.out.println(temp.getLocalName() + " : " +p);
                		refObj.setValue(temp.getLocalName(), p);
                		
                		System.out.println();
                	}
                	
                }
            	 listCls.add(refObj);
            	 System.out.println(refObj);
            } else {
            	System.out.print(node.getNodeName() + " : " + node.getTextContent());
            }
           
            
//            System.out.println(node.getNodeName() + " : " + node.getTextContent());
        }
    }

}