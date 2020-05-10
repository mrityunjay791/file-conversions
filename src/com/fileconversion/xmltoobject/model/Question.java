package com.fileconversion.xmltoobject.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//@XmlAccessorType(XmlAccessType.PROPERTY)
public class Question {
	
	private int id;  
	private String questionname;  
	private List<Answer> answers;
	
	public Question() {
		
	}
	
	
	@Override
	public String toString() {
		return "Question [id=" + id + ", questionname=" + questionname + ", answers=" + answers + "]";
	}


	public Question(int id, String questionname, List<Answer> answers) {
		super();
		this.id = id;
		this.questionname = questionname;
		this.answers = answers;
	}
	public int getId() {
		return id;
	}
	
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestionname() {
		return questionname;
	}
	
	@XmlElement
	public void setQuestionname(String questionname) {
		this.questionname = questionname;
	}
	
	public List<Answer> getAnswers() {
		return answers;
	}
	
	@XmlElement
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}  
	
	
}
