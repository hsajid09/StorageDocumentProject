package com.java.spring.document;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DocumentService {
	@Autowired
	private DocumentRepository DocumentRepository;
	
	public List<Document> getAllDocument(){
		List<Document> document=new ArrayList<Document>();
		DocumentRepository.findAll().forEach(document::add);
		return document;
	}
	public Optional<Document> getDocument(String id) {
		
		return DocumentRepository.findById(id);
	}
	public void addDocument(Document document) {
		DocumentRepository.save(document);
	}
	public void updateDocument(Document document, String id) {
		DocumentRepository.save(document);
	}
	public void deleteDocument(String id) {
		DocumentRepository.deleteById(id);
	}

}
