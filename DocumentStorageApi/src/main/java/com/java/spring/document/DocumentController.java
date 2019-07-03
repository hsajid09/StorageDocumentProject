package com.java.spring.document;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DocumentController {
	@Autowired
	private DocumentService documentService;
	
	@RequestMapping("/document")
	public List<Document> getAllDocument(){
		return documentService.getAllDocument();
		}
	@RequestMapping("/document/{id}")
	public Optional getDocument(@PathVariable String id) {
		return documentService.getDocument(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="/document")
	public void addDocument(@RequestBody Document document) {
		documentService.addDocument(document);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/document/{id}")
	public void updateDocument(@RequestBody Document document, @PathVariable String id) {
		documentService.updateDocument(document, id);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/document/{id}")
	public void deleteDocument(@PathVariable String id) {
		documentService.deleteDocument(id);
		}
	
}
