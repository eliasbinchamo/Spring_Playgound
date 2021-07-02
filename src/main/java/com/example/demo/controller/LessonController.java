package com.example.demo.controller;

import com.example.demo.domain.Lesson;
import com.example.demo.repository.LessonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LessonController {

    private final LessonRepository repository;

    public LessonController(LessonRepository repository){
        this.repository = repository;
    }

    @PostMapping("/lessons")
    public Lesson create(@RequestBody Lesson lesson){ return (Lesson) this.repository.save(lesson); }

    @GetMapping("/lessons/{id}")
    public Optional<Lesson> read(@PathVariable Long id) { return this.repository.findById(id); }

    @PatchMapping("/lessons/{id}")
    public Lesson patch(@RequestBody Lesson lessonInput, @PathVariable Long id) {
        Lesson lesson = this.repository.findById(id).get();
        lesson.setTitle(lessonInput.getTitle());
        lesson.setDeliveredOn(lessonInput.getDeliveredOn());
        return this.repository.save(lesson);
    }

    @DeleteMapping("/lessons/{id}")
    public void delete(@PathVariable Long id ) {
        this.repository.deleteById(id);
    }

}