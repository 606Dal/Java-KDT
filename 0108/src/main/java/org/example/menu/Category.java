package org.example.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
public class Category {

    String name; // 음식 이름
    int price; // 가격

    public Category(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "  " + price;
    }
}
