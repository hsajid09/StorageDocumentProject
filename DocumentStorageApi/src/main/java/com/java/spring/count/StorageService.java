package com.java.spring.count;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StorageService {
	@Autowired
	private StorageRepository storageRepository;
	
	public List<Storage> getAllStorage(String documentId){
		List<Storage> storage=new ArrayList<Storage>();
		storageRepository.findByDocumentId(documentId).forEach(storage::add);
		return storage;
	}
	public Optional<Storage> getStorage(String id) {
		
		return storageRepository.findById(id);
	}
	public void addStorage(Storage storage) {
		storageRepository.save(storage);
	}
	public void updateStorage(String id, Storage storage) {
		storageRepository.save(storage);
	}
	public void deleteStorage(String id) {
		storageRepository.deleteById(id);
	}

}
