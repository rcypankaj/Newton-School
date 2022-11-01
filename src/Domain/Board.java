//package SnakeLadder.Domain;
//
//import java.util.List;
//
//public class Board {
//
//    private int totalCells; //100
//    int numberOfSnakes; //7
//    int numberOfLadders; //4
//    int numberOfPlayers; //2
//    List<SnakeLadder.Domain.Snake> snakeList; // s1 s2 s3 s4 s5 s6 s7
//    List<SnakeLadder.Domain.Ladder> ladderList; // l1 l2 l3 l4
//
//
//    public Board(int totalCells, int numberOfSnakes, int numberOfLadders, int numberOfPlayers) {
//        this.totalCells = totalCells;
//        this.numberOfSnakes = numberOfSnakes;
//        this.numberOfLadders = numberOfLadders;
//        this.numberOfPlayers = numberOfPlayers;
//    }
//
//
//    public void setSnakeList(List<SnakeLadder.Domain.Snake> snakeList) {
//        this.snakeList = snakeList;
//    }
//
//    public void setLadderList(List<SnakeLadder.Domain.Ladder> ladderList) {
//        this.ladderList = ladderList;
//    }
//
//    public int getTotalCells(){
//        return totalCells;
//    }
//
//    public SnakeLadder.Domain.Snake[] getSnakeList() {
//    }
//
//    public SnakeLadder.Domain.Ladder[] getLadderList() {
//    }
//}