package com.example.springbootstudyweb.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity // DB 테이블과 링크될 클래스
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pk 생성 규칙
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    // 해당 클래스 빌더 패턴
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    // 새로운 제목과 내용으로 수정
    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
