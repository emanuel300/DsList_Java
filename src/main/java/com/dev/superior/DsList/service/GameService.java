package com.dev.superior.DsList.service;

import com.dev.superior.DsList.dto.GameMinDto;
import com.dev.superior.DsList.entities.Game;
import com.dev.superior.DsList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<Game> gameFindAll(){
        List<Game> ListaGames = gameRepository.findAll();
        return ListaGames;
    }


}
