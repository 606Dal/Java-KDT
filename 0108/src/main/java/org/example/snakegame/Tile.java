package org.example.snakegame;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class Tile {

    private int num;
    private String desc;
    private String type;
    private int moving;

    public Tile(int num) {
        this.num = num;
    }

    /*
    int ladder; // 사다리
    int snake; // 뱀
    boolean player; // 유저가 칸에 있는지?

    public Tile(int ladder, int snake, boolean player) {
        this.ladder = ladder;
        this.snake = snake;
        this.player = player;
    }

 */

}
