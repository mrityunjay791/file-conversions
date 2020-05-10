package com.fileconversion.xmltoobject;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.fileconversion.xmltoobject.model.Question;

public class XmlToObject {

	public static void main(String[] args) {

		File filePath = new File("student.xml");
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Question.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Question que= (Question) jaxbUnmarshaller.unmarshal(filePath);
			
			System.out.println(que);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	        
			
	
		
	}

}
