package com.example.springbootstudyweb.controller;

import com.example.springbootstudyweb.domain.posts.Posts;
import com.example.springbootstudyweb.dto.PostsResponseDto;
import com.example.springbootstudyweb.dto.PostsSaveRequestDto;
import com.example.springbootstudyweb.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor    // final이 선언된 모든 필드의 생성자 생성
@RestController
public class PostsApiController {

    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {

        return postService.save(requestDto);
    }

    @GetMapping("/api/v1/posts")
    public List<Posts> findAll() {
        return postService.findAll();
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsSaveRequestDto requestDto) {

        return postService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id) {

        return postService.findById(id);
    }
}
