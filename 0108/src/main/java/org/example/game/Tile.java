package org.example.game;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Tile {

    int ladder; // 사다리
    int snake; // 뱀
    boolean player; // 유저가 칸에 있는지?

    public Tile(int ladder, int snake, boolean player) {
        this.ladder = ladder;
        this.snake = snake;
        this.player = player;
    }


}
