package com.hy.mp.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @outhor huyang
 * @create 2020/08/14 16:44
 */
@Data
@Accessors(chain = true)
public class Class {
    private Long id;
    private String name;
}
