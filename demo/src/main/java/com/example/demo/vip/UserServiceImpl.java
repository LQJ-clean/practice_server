package com.example.demo.vip;

import com.example.demo.common.MyPage;
import com.example.demo.core.GeneralService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
@Transactional
public class UserServiceImpl extends GeneralService<User, Integer, UserRepository> implements UserService{

    @Override
    public User add(User entity) {
        return super.add(entity);
    }

    @Override
    public int delete(User entity) {
        return super.delete(entity);
    }

    @Override
    public User update(User entity) {
        return super.update(entity);
    }

    @Override
    public List<User> queryAll(User entity) {
        return super.queryAll(entity);
    }
}
