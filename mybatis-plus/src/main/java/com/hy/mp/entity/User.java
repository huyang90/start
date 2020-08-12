package com.hy.mp.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @outhor huyang
 * @create 2020/08/12 10:32
 */
@Accessors(chain = true)
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
