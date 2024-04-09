package com.pritam.designpatter101.solid.liskovsubstuitionprinciple.start;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
public class Rectangle {
    private int width;
    private int height;

    protected int computeArea(){
        return width*height;
    }
}
