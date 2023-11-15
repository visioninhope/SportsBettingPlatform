package com.SBS.Models;

import com.SBS.Models.Bet;
import com.SBS.Models.Odds;

import java.util.List;

public class OddsSoccer implements Odds {
    private float homeTeamOdd = 2.50F; //odd that home team/player will win
    private float awayTeamOdd = 2.50F; //odd that away team/player will win
    private float drawOdd = 3.10F; //odd that there will be a draw
//    private float homeTeamCornersOdd; //odd that home team will have over 5.5 corner kicks in a game
//    private float awayTeamCornersOdd; //odd that home team will have over 5.5 corner kicks in a game

    @Override
    public List<Bet> getOdds() {
        return List.of(
                new Bet("1", homeTeamOdd),
                new Bet("X", drawOdd),
                new Bet("2", awayTeamOdd)
//                new Bet("1 over 5.5 corners", homeTeamCornersOdd),
//                new Bet("2 over 5.5 corners", awayTeamCornersOdd)
        );
    }
}
