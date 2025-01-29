package fr.efrei.rag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.efrei.rag.domain.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
} 