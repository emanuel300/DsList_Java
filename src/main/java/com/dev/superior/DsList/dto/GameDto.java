package com.dev.superior.DsList.dto;


import com.dev.superior.DsList.entities.Game;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Data
public class GameDto {

    private Long id;

    private String title;

    private Integer year;

    private String genre;

    private String platforms;

    private Double score;

    private String imgUrl;

    private String shortDescription;

    private String longDescription;


    public GameDto(Game entity){
        BeanUtils.copyProperties(entity, this);
    }



}
