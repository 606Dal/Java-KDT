package org.example.knn;

// KNN 알고리즘
public class Point {

    public String type; // J/Z 짜장면이냐 짬뽕
    public int xpos;
    public int ypos;

    //Point를 만드는 방법이 2종류 - 생성자 함수는 여러개 만들 수 있음.

    public Point(String type, int xpos, int ypos) {
        this.type = type;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public Point(int xpos, int ypos) {
        this.xpos = xpos;
        this.ypos = ypos;
    }

}
