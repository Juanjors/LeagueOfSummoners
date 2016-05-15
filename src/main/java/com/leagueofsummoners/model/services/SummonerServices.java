package com.leagueofsummoners.model.services;

import com.leagueofsummoners.SessionAtts;
import com.leagueofsummoners.model.dao.SummonerDAO;
import com.leagueofsummoners.model.dto.MatchDTO;
import com.leagueofsummoners.model.dto.UserDTO;
import com.leagueofsummoners.model.interfaces.services.IServicesSummoner;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class SummonerServices implements IServicesSummoner {


    @Autowired
    private SummonerDAO summonerDAO;

    @Override
    public List<MatchDTO> getLatestMatches(UserDTO userlogged, int nMatches) {
        List<MatchDTO> lista = null;
        try {
            lista = this.summonerDAO.getLatestMatches(userlogged.getSummonerID(), userlogged.getSummonerName(), nMatches);
        } catch (Exception e) {
            log.debug("Error en GetLatestMatches " + e.getMessage());
        }
        return lista;
    }

    @Override
    public List<MatchDTO> getLatestMatchesFromDB(UserDTO userlogged) {
        List<MatchDTO> lista = null;
        lista = this.summonerDAO.getLatestMatchesFromDb(userlogged);
        return lista;
    }
}
