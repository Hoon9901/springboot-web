package com.example.springbootstudyweb.controller;

import com.example.springbootstudyweb.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostService postService;

    @GetMapping
    public String index(Model model) {  // Server Template에서 사용할 객체를 지정
        model.addAttribute("posts", postService.findAllDesc()); // service로 받은 객체를 posts로 index.must ... 에 전달

        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }


}
