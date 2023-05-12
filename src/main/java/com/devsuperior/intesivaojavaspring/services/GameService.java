package com.devsuperior.intesivaojavaspring.services;

import com.devsuperior.intesivaojavaspring.dto.GameMinDTO;
import com.devsuperior.intesivaojavaspring.entities.Game;
import com.devsuperior.intesivaojavaspring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();

        return dto;
    }
}
