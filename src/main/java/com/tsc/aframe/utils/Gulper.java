package com.tsc.aframe.utils;

import org.w3c.dom.*;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.tsc.aframe.Aentity;
import com.tsc.aframe.Ascene;
import com.tsc.aframe.assets.Aassetitem;
import com.tsc.aframe.assets.Aassets;
import com.tsc.aframe.assets.Audio;
import com.tsc.aframe.assets.Img;
import com.tsc.aframe.assets.Video;
import com.tsc.aframe.base.AFrameBase;
import com.tsc.aframe.camera.Acamera;
import com.tsc.aframe.camera.Acursor;
import com.tsc.aframe.primitives.Abox;
import com.tsc.aframe.primitives.Acircle;
import com.tsc.aframe.primitives.Acone;
import com.tsc.aframe.primitives.Acurvedimage;
import com.tsc.aframe.primitives.Acylinder;
import com.tsc.aframe.primitives.Adodecahedron;
import com.tsc.aframe.primitives.Agltfmodel;
import com.tsc.aframe.primitives.Aicosahedron;
import com.tsc.aframe.primitives.Aimage;
import com.tsc.aframe.primitives.Alight;
import com.tsc.aframe.primitives.Alink;
import com.tsc.aframe.primitives.Aobjmodel;
import com.tsc.aframe.primitives.Aoctahedron;
import com.tsc.aframe.primitives.Aplane;
import com.tsc.aframe.primitives.Aring;
import com.tsc.aframe.primitives.Asky;
import com.tsc.aframe.primitives.Asound;
import com.tsc.aframe.primitives.Asphere;
import com.tsc.aframe.primitives.Atetrahedron;
import com.tsc.aframe.primitives.Atext;
import com.tsc.aframe.primitives.Atorus;
import com.tsc.aframe.primitives.Atorusknot;
import com.tsc.aframe.primitives.Atriangle;
import com.tsc.aframe.primitives.Avideo;
import com.tsc.aframe.primitives.Avideosphere;

import javax.xml.parsers.*;
import java.io.*;
import java.util.HashMap;

public class Gulper {
	public static HashMap<String, String> parseXml(String xmlString) {
		
		//Build Document
	    Document document = convertStringToXMLDocument(xmlString);
	    if ( document == null ) {
	    	return new HashMap<String, String>();
	    }
	    //Normalize the XML Structure; It's just too important !!
	    document.getDocumentElement().normalize();
	       
	    //Here comes the root node
	    Element root = document.getDocumentElement();
	    //System.out.println(root.getNodeName());
	       
	    //Get all employees
	    NodeList nList = document.getElementsByTagName(root.getNodeName());
	    //System.out.println("============================");
	    return visitChildNodes(nList);
	}
	
	//This function is called recursively
	private static HashMap<String, String> visitChildNodes(NodeList nList) {
		HashMap<String, String> attributesList = new HashMap<String, String>();
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node node = nList.item(temp);
	        if (node.getNodeType() == Node.ELEMENT_NODE) {
	        	//System.out.println("Node Name = " + node.getNodeName() + "; Value = " + node.getTextContent());
	            //Check all attributes
	            if (node.hasAttributes()) {
	            	// get attributes names and values
	            	NamedNodeMap nodeMap = node.getAttributes();
	            	for (int i = 0; i < nodeMap.getLength(); i++) {
	            		Node tempNode = nodeMap.item(i);
	            		//System.out.println("Attr name : " + tempNode.getNodeName()+ "; Value = " + tempNode.getNodeValue());
	            		attributesList.put(tempNode.getNodeName(), tempNode.getNodeValue());
	            	}
	            	// Lets leave this out for the moment
	            	/*
	            	if (node.hasChildNodes()) {
	            		//We got more childs; Let's visit them as well
	            		visitChildNodes(node.getChildNodes());
	               }
	               */
	            }
	        }	        
		}
		return attributesList;
	}
	private static Document convertStringToXMLDocument(String xmlString) {
		//Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         
        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();
             
            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        } catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return null;
    }
	
	public static AFrameBase aFrameFactory( String xmlString ) {
		
		// Get root name
		//Build Document
	    Document document = convertStringToXMLDocument(xmlString);
	    if ( document == null ) {
	    	return null;
	    }
	    //Normalize the XML Structure; It's just too important !!
	    document.getDocumentElement().normalize();
	       
	    //Here comes the root node
	    Element root = document.getDocumentElement();
	    //System.out.println(root.getNodeName());
	    
	    AFrameBase returnObj = null;
	    
	    switch (root.getNodeName().toLowerCase()) {
		case "a-box":
			returnObj = new Abox(xmlString);
			break;
		case "a-entity":
			returnObj = new Aentity(xmlString);
			break;
		case "a-sky":
			returnObj = new Asky(xmlString);
			break;
		case "a-sphere":
			returnObj = new Asphere(xmlString);
			break;
		case "img":
			returnObj = new Img(xmlString);
			break;
		case "video":
			returnObj = new Video(xmlString);
			break;
		case "a-assets":
			returnObj = new Aassets(xmlString);
			break;
		case "a-scene":
			returnObj = new Ascene(xmlString);
			break;
		case "a-plane":
			returnObj = new Aplane(xmlString);
			break;
		case "a-light":
			returnObj = new Alight(xmlString);
			break;
		case "a-camera":
			returnObj = new Acamera(xmlString);
			break;
		case "a-cursor":
			returnObj = new Acursor(xmlString);
			break;
		case "audio":
			returnObj = new Audio(xmlString);
			break;
		case "a-circle":
			returnObj = new Acircle(xmlString);
			break;
		case "a-cone":
			returnObj = new Acone(xmlString);
			break;
		case "a-curvedimage":
			returnObj = new Acurvedimage(xmlString);
			break;
		case "a-cylinder":
			returnObj = new Acylinder(xmlString);
			break;
		case "a-dodecahedron":
			returnObj = new Adodecahedron(xmlString);
			break;
		case "a-gltf-model":
			returnObj = new Agltfmodel(xmlString);
			break;
		case "a-asset-item":
			returnObj = new Aassetitem(xmlString);
			break;
		case "a-icosahedron":
			returnObj = new Aicosahedron(xmlString);
			break;
		case "a-image":
			returnObj = new Aimage(xmlString);
			break;
		case "a-link":
			returnObj = new Alink(xmlString);
			break;
		case "a-obj-model":
			returnObj = new Aobjmodel(xmlString);
			break;
		case "a-octahedron":
			returnObj = new Aoctahedron(xmlString);
			break;
		case "a-ring":
			returnObj = new Aring(xmlString);
			break;
		case "a-tetrahedron":
			returnObj = new Atetrahedron(xmlString);
			break;
		case "a-text":
			returnObj = new Atext(xmlString);
			break;
		case "a-torus-knot":
			returnObj = new Atorusknot(xmlString);
			break;
		case "a-torus":
			returnObj = new Atorus(xmlString);
			break;	
		case "a-triangle":
			returnObj = new Atriangle(xmlString);
			break;
		case "a-video":
			returnObj = new Avideo(xmlString);
			break;	
		case "a-videosphere":
			returnObj = new Avideosphere(xmlString);
			break;	
		case "a-sound":
			returnObj = new Asound(xmlString);
			break;
		default:
			break;
		}
	    
		return returnObj;
	}
}
