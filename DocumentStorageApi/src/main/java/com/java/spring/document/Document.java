package com.java.spring.document;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document {
	@Id
	private String id;
	private String docContent;
	private String docType;
	public Document() {
	
	}
	public Document(String id, String docContent, String docType) {
	
		this.id = id;
		this.docContent = docContent;
		this.docType = docType;
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
	
	
}
