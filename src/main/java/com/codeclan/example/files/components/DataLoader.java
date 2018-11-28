package com.codeclan.example.files.components;

import com.codeclan.example.files.models.File;
import com.codeclan.example.files.models.Folder;
import com.codeclan.example.files.models.User;
import com.codeclan.example.files.repositories.FileRepository;
import com.codeclan.example.files.repositories.FolderRepository;
import com.codeclan.example.files.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        User stephen = new User ("Stephen");
        userRepository.save(stephen);

        Folder important = new Folder("Important", stephen);
        folderRepository.save(important);

        File contacts = new File("Contacts", "xls", 2, important);
        fileRepository.save(contacts);
    }
}
