package com.hy.lombok;

import lombok.ToString;

/**
 * @outhor huyang
 * @create 2020/08/14 10:24
 */
@ToString
public class Person {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
