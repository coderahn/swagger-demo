package com.example.swaggerdemo.vo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 1)@Data : @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
 * 2)@AllArgsConstructor : 모든 필드 값을 파라미터로 받는 생성자를 만듦
 * 3)@NoArgsConstructor(access = AccessLevel.PROTECTED) : 파라미터가 없는 기본 생성자를 생성
 * 4)@Entity(name="member") : DB의 멤버테이블과 매핑할 vo객체 선언
 */
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="member")
public class MemberVo {

    /**
     * 1)no를 기본키(PK)로 지정
     * 2)해당 필드를 auto_increment로 설정하였기 때문에 직접할당 방식이 아니라 자동생성을 위해
     * @GeneratedValue 사용.
     * 3)stragegy = GenerationType.INDENTITY는 생성방식을 DB에 위임
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    private String id;

    private String password;

    private String name;
}
