package dev.rhc.post;

import dev.rhc.post.post.Post;
import dev.rhc.post.post.PostController;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PostController.class)
@AutoConfigureMockMvc
public class PostControllerTest {

    @Autowired
    MockMvc mockMvc;

    List<Post> posts = new ArrayList<>();

    @BeforeEach
    void setUp(){
        // create some posts
        posts = List.of(
                new Post(2, 1, "title2", "body2", null),
                new Post(1, 1, "title1", "body1", null),
                new Post(3, 2, "title3", "body3", null),
                new Post(4, 2, "title4", "body4", null),
                new Post(5, 3, "title5", "body5", null),
                new Post(9, 5, "title9", "body9", null),
                new Post(6, 3, "title6", "body6", null),
                new Post(7, 4, "title7", "body7", null),
                new Post(8, 4, "title8", "body8", null),
                new Post(10, 5, "title10", "body10", null)
        );

    }

    // rest api

    // list
    @Test
    void shouldFindAllPosts() throws Exception {
        mockMvc.perform(get("/api/posts"))
                .andExpect(status().isOk());
    }
}

