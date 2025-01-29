package fr.efrei.rag.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.efrei.rag.domain.Document;
import fr.efrei.rag.repository.DocumentRepository;

@RestController
@RequestMapping("/api")
public class DocumentResource {

    private final DocumentRepository documentRepository;

    public DocumentResource(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @GetMapping("/documents")
    public List<Document> getDocuments() {
        return documentRepository.findAll();
    }

}
