package com.example.springbootstudyweb.controller;

import com.example.springbootstudyweb.dto.PostsSaveRequestDto;
import com.example.springbootstudyweb.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor    // final이 선언된 모든 필드의 생성자 생성
@RestController
public class PostsApiController {

    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {

        return postService.save(requestDto);
    }
}
