package com.hy.mp.test;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.hy.mp.entity.User;
import com.hy.mp.mapper.UserMapper;
import com.hy.mp.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @outhor huyang
 * @create 2020/08/12 10:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {

    @Autowired
    private UserMapper userMapper;



    @Test
    public void testInsert() {
        User user = new User().setAge(22).setName("hu");
        int insertNum = userMapper.insert(user);
        System.out.println(insertNum);
        assert (insertNum > 0);
        System.out.println(user);
    }
}
