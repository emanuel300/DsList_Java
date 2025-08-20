package com.dev.superior.DsList.dto;

import com.dev.superior.DsList.entities.Game;
import com.dev.superior.DsList.projections.GameMinProjection;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class GameMinDto {

    private Long id;
    private String title;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto() {
    }

    public GameMinDto(Game entity) {
       id = entity.getId();
       title = entity.getTitle();
       imgUrl = entity.getImgUrl();
       shortDescription = entity.getShortDescription();
    }


    public GameMinDto(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getshortDescription();

    }
}
