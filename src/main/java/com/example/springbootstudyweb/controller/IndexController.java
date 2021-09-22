package com.example.springbootstudyweb.controller;

import com.example.springbootstudyweb.config.auth.dto.SessionUser;
import com.example.springbootstudyweb.dto.PostsResponseDto;
import com.example.springbootstudyweb.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostService postService;
    private final HttpSession httpSession;

    @GetMapping
    public String index(Model model) {  // Server Template에서 사용할 객체를 지정
        model.addAttribute("posts", postService.findAllDesc()); // service로 받은 객체를 posts로 index.must ... 에 전달

        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        if (user != null) {
            model.addAttribute("userName", user.getName());
        }

        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postService.findById(id);
        model.addAttribute("post", dto); // dto를 post로 매핑

        return "posts-update";
    }


}
