package com.inquisitor.strategy.swagger.design.controller.vo;

import com.inquisitor.strategy.swagger.design.controller.vo.category.BoardGameCategoryVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@ApiModel("BoardGame")
public class BoardGameVo {

    @NotNull
    @ApiModelProperty(example = "0982134")
    private Integer id;

    @NotBlank
    private String name;

    @Min(value = 0, message = "Puntuation should not be less than 0")
    @Max(value = 10, message = "Puntuation should not be greater than 5")
    private Float complexity;

    @ApiModelProperty(value = "Reference page for board game", example = "https://boardgamegeek.com/boardgame/34635/stone-age")
    @Pattern(regexp = "^(https://boardgamegeek.com/boardgame/).+", message = "Board game geek should be valid url board game geek")
    private String boardGameGeek;

    private BoardGameCategoryVo boardGameCategory;

    @ApiModelProperty(allowableValues = "NO PLEASE,Why not?,Not bad")
    private String playability;


}
