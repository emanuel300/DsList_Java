package com.dev.superior.DsList.controller;

import com.dev.superior.DsList.dto.GameMinDto;
import com.dev.superior.DsList.entities.Game;
import com.dev.superior.DsList.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/listar")
    public List<GameMinDto> findAll(){
       List<Game> listarGame = gameService.gameFindAll();
       List<GameMinDto> gameDto = listarGame.stream()
               .map(x -> new GameMinDto(x))
               .toList();
       return gameDto;
    }


}
