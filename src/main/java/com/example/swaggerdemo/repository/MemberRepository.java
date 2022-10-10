package com.example.swaggerdemo.repository;

import com.example.swaggerdemo.vo.MemberVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 1)JpaRespository 인터페이스에는 미리 데이터 검색 등의 구조가 준비되어있음
 * 2)제네릭스 첫번째 타입은 엔티티, 두번째 타입은 엔티티의 id를 넣어주면 됨
 */
@Repository
public interface MemberRepository extends JpaRepository<MemberVo, Long> {

    public List<MemberVo> findById(String id);
    public List<MemberVo> findByName(String name);
    public List<MemberVo> findByNameLike(String keyword);
}

