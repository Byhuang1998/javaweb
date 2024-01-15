package com.byhuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Brand {

    private String name;

    private String entName;

    private Integer order;

    private String remark;

    private Integer status;
}
