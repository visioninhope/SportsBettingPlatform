package com.SBS.Models;

import com.SBS.Models.Bet;
import com.SBS.Models.Odds;

import java.util.List;

public class OddsTennis implements Odds {
    private float homeTeamOdd = 1.90F; //odd that home team/player will win
    private float awayTeamOdd = 1.90F; //odd that away team/player will win

//    private float homeTeamAcesOdd; //odd that home player will have over 8.5 service aces in a game
//    private float awayTeamAcesOdd; //odd that away player will have over 8.5 service aces in a game

    @Override
    public List<Bet> getOdds() {
        return List.of(
                new Bet("1", homeTeamOdd),
                new Bet("2", awayTeamOdd)
//                new Bet("1 over 8.5 aces", homeTeamAcesOdd),
//                new Bet("2 over 8.5 aces", awayTeamAcesOdd)
        );
    }

}
