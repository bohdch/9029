package com.demo.demoproject.services;

import com.demo.demoproject.models.Lecturer;
import com.demo.demoproject.repositories.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LecturerService {

    private final LecturerRepository lecturerRepository;


    @Autowired
    public LecturerService(LecturerRepository lecturerRepository ) {
        this.lecturerRepository = lecturerRepository;
    }

    public List<Lecturer> findAll() {
        return lecturerRepository.findAll();
    }

    public Optional<Lecturer> findById(Long id) {
        return lecturerRepository.findById(id);
    }



    public List<Lecturer> getAllLecturers() {
        return lecturerRepository.findAll();
    }
}
