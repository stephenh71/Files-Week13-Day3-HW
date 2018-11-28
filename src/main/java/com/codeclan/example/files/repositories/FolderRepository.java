package com.codeclan.example.files.repositories;

import com.codeclan.example.files.models.Folder;
import com.codeclan.example.files.projections.EmbedFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFiles.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
