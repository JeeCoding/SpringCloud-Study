package com.huzh.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author huzh
 * @date 2020/4/7 17:57
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    /**
     * 部门编码 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;
    /**
     * 数据库名称
     */
    private String dbSource;
}
