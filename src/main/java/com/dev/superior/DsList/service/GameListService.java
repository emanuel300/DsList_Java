package com.dev.superior.DsList.service;

import com.dev.superior.DsList.dto.GameDto;
import com.dev.superior.DsList.dto.GameListDto;
import com.dev.superior.DsList.entities.Game;
import com.dev.superior.DsList.entities.GameList;
import com.dev.superior.DsList.projections.GameMinProjection;
import com.dev.superior.DsList.repository.GameListRepository;
import com.dev.superior.DsList.repository.GameRepository;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameListDto> gameFindAll(){
        List<GameList> listaGames = gameListRepository.findAll();
        return listaGames.stream()
                .map(x -> new GameListDto(x))
                .toList();

    }

    @Transactional(readOnly = true)
    public void move(long listId, int sourceIndex, int destinationIndex){

        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj =  list.remove(sourceIndex);
        list.add(destinationIndex, obj);
        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i <= max; i++) {
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }

    @Transactional(readOnly = true)
    public GameListDto findById(Long id) {
        GameList entity = gameListRepository.findById(id).get();
        return new GameListDto(entity);
    }

}
