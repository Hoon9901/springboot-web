package com.example.springbootstudyweb.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass   // JPA Entity 클래스들이 이 클랙스를 상속하면 필드들을 칼럼으로 인식함.
@EntityListeners(AuditingEntityListener.class)  // 현 클래스에 Auditing 기능을 포함함.
public class BaseTimeEntity {

    @CreatedDate        // 엔티티가 생성되어 저장되면 시간이 자동으로 저장
    private LocalDateTime createDate;

    @LastModifiedDate   // 조회한 Entity의 값이 변경될때 시간자동저장
    private LocalDateTime modifiedDate;
}
