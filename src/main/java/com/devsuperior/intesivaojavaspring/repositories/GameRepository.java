package com.devsuperior.intesivaojavaspring.repositories;

import com.devsuperior.intesivaojavaspring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
