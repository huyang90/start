package com.hy.hutool;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.poi.excel.ExcelUtil;

/**
 * @outhor huyang
 * @create 2020/08/14 9:47
 */
public class Main {
    public static void main(String[] args) {
        String hy = SecureUtil.md5("hy");
        System.out.println(hy);

    }
}
