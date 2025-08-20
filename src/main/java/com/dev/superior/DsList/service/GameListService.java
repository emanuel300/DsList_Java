package com.dev.superior.DsList.service;

import com.dev.superior.DsList.dto.GameDto;
import com.dev.superior.DsList.dto.GameListDto;
import com.dev.superior.DsList.entities.Game;
import com.dev.superior.DsList.entities.GameList;
import com.dev.superior.DsList.repository.GameListRepository;
import com.dev.superior.DsList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;


    @Transactional(readOnly = true)
    public List<GameListDto> gameFindAll(){
        List<GameList> listaGames = gameListRepository.findAll();
        return listaGames.stream()
                .map(x -> new GameListDto(x))
                .toList();

    }


}
