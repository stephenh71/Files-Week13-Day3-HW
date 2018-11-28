package com.codeclan.example.files.repositories;

import com.codeclan.example.files.models.User;
import com.codeclan.example.files.projections.EmbedFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}