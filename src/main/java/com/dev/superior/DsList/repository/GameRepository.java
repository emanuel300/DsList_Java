package com.dev.superior.DsList.repository;

import com.dev.superior.DsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
