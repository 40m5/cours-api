package com.example.cours_api.repository;

import com.example.cours_api.model.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Long> {
    List<Cours> findByMatiereContainingIgnoreCase(String matiere);
}
