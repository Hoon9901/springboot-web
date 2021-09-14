package com.example.springbootstudyweb.service;

import com.example.springbootstudyweb.domain.posts.Posts;
import com.example.springbootstudyweb.domain.posts.PostsRepository;
import com.example.springbootstudyweb.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
