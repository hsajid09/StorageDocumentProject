package com.java.spring.count;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.document.Document;

@RestController
public class StorageController {
	@Autowired
	private StorageService storageService;
	
	@RequestMapping("/document/{id}/storage")
	public List<Storage> getAllStorage(@PathVariable String docId){
		
		return storageService.getAllStorage(docId);
		}
	@RequestMapping("document/{documentId}/storage/{id}")
	public Optional getStorage(@PathVariable String id) {
		return storageService.getStorage(id);
	}
	@RequestMapping(method=RequestMethod.POST, value="document/{documentId}/storage")
	public void addStorage(@RequestBody Storage storage, @PathVariable String documentId) {
		storage.setDocument(new Document("documentId", "",""));
		storageService.addStorage(storage);
	}
	@RequestMapping(method=RequestMethod.PUT, value="document/{documentId}/storage/{id}")
	public void updateStorage(@RequestBody Storage storage, @PathVariable String id, @PathVariable String documentId) {
		storage.setDocument(new Document("documentId", "",""));
		storageService.updateStorage(id, storage);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="document/{documentId}/storage/{id}")
	public void deleteCourse(@PathVariable String id) {
		storageService.deleteStorage(id);
	}
	
}
