package com.codeclan.example.files.projections;

import com.codeclan.example.files.models.File;
import com.codeclan.example.files.models.Folder;
import com.codeclan.example.files.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFiles", types = Folder.class)
public interface EmbedFiles {
    String getTitle();
    User getUser();
    List<File> getFiles();
}

