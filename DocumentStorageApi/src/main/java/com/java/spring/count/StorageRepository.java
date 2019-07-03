package com.java.spring.count;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.java.spring.document.Document;

public interface StorageRepository extends CrudRepository<Storage, String> {
	public List<Storage> findByDocumentId(String documentId);
}
