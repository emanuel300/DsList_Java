package com.dev.superior.DsList.controller;

import com.dev.superior.DsList.dto.GameDto;
import com.dev.superior.DsList.dto.GameListDto;
import com.dev.superior.DsList.dto.GameMinDto;
import com.dev.superior.DsList.service.GameListService;
import com.dev.superior.DsList.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping("/listar")
    public List<GameListDto> findAll(){
       List<GameListDto> listarGame = gameListService.gameFindAll();
       return listarGame;
    }



}
