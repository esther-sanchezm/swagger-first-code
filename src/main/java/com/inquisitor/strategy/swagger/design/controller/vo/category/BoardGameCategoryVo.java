package com.inquisitor.strategy.swagger.design.controller.vo.category;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@ApiModel("BoardGameCategory")
@AllArgsConstructor
public enum BoardGameCategoryVo {

    FAMILY("Family"),
    PARTY("Party");

    @Getter
    private String name;

}
