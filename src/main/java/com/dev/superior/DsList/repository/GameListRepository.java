package com.dev.superior.DsList.repository;

import com.dev.superior.DsList.entities.Game;
import com.dev.superior.DsList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
