package com.dev.superior.DsList.dto;

import com.dev.superior.DsList.entities.GameList;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GameListDto {
   private Long Id;
   private String name;

    public GameListDto(GameList entity) {
        Id = entity.getId();
        name = entity.getName();
    }
}
