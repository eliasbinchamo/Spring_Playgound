package com.example.demo;

import com.example.demo.domain.Lesson;
import com.example.demo.repository.LessonRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class LessonControllerTest {

    @Autowired
    MockMvc mvc;

    @Autowired
    LessonRepository repository;

    @Test
    @Transactional
    @Rollback
    public void testCreate() throws Exception {
        Lesson lesson = new Lesson();
        lesson.setTitle("Spring Security");
        lesson.setDeliveredOn("2017-04-12");
        repository.save(lesson);

        MockHttpServletRequestBuilder request = patch("/lessons/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"title\": \"SQL\" , \"deliveredOn\": \"2017-04-12\"}");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", equalTo(lesson.getId().intValue()) ))
                .andExpect(jsonPath("$.title", equalTo("SQL" )))
                .andExpect(jsonPath("$.deliveredOn", equalTo("2017-04-12")));
    }

}
