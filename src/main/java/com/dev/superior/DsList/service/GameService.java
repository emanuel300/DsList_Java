package com.dev.superior.DsList.service;

import com.dev.superior.DsList.dto.GameDto;
import com.dev.superior.DsList.dto.GameMinDto;
import com.dev.superior.DsList.entities.Game;
import com.dev.superior.DsList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public GameDto gameFindById(Long id){
       Game result = gameRepository.findById(id).get();
        GameDto dto = new GameDto(result);
        return dto;

    }

    @Transactional(readOnly = true)
    public List<Game> gameFindAll(){
        List<Game> ListaGames = gameRepository.findAll();
        return ListaGames;
    }


}
