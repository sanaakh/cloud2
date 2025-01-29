package fr.efrei.rag.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import fr.efrei.rag.service.DocumentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import fr.efrei.rag.domain.Document;

@RestController
@RequestMapping("/api")
public class DocumentResource {

    private final DocumentService documentService;


    public DocumentResource(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/document")
    public List<Document> getDocuments() {
        return documentService.findAll();
    }

    @PostMapping("/document")
    public ResponseEntity<Document> createDocument(@RequestBody Document document) throws URISyntaxException {
        Document result = documentService.buildAndSaveDocument(document);
        return ResponseEntity
                .created(new URI("/documents/" + result.getId()))
                .body(result);
    }
}