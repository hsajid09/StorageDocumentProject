package com.java.spring.count;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.java.spring.document.Document;

@Entity
public class Storage {
	@Id
	private String id;
	private String docContent;
	private String docType;
	
	@ManyToOne
	private Document document;
	
	public Storage() {
	
	}
	public Storage(String id, String docContent, String docType, String documentId ) {
	
		this.id = id;
		this.docContent = docContent;
		this.docType = docType;
		this.document =new Document("documentId", "","");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDocContent() {
		return docContent;
	}
	public void setDocContent(String docContent) {
		this.docContent = docContent;
	}
	public String getDocType() {
		return docType;
	}
	public void setDocType(String description) {
		this.docType = docType;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	
	
}
