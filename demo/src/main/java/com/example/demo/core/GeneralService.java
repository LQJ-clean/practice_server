package com.example.demo.core;

import com.example.demo.common.MyPage;
import com.example.demo.common.MyPageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;
import java.util.List;

public class GeneralService<T, ID, J extends JpaRepository<T, ID>> implements GeneralOperation<T>{

    private J jpaRepository;

    public J getJpaRepository() {
        return jpaRepository;
    }

    @Resource
    public void setJpaRepository(J jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public T add(T entity) {
        return jpaRepository.save(entity);
    }

    @Override
    public int delete(T entity) {
        jpaRepository.delete(entity);
        return 0;
    }

    @Override
    public T update(T entity) {
        return jpaRepository.save(entity);
    }

    @Override
    public Page<T> query(MyPage<T> page) {
        return jpaRepository.findAll(MyPageRequest.getPageable(page));
    }

    @Override
    public List<T> queryAll(T entity) {
        return jpaRepository.findAll();
    }
}
