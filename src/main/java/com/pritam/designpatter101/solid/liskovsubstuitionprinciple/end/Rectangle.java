package com.pritam.designpatter101.solid.liskovsubstuitionprinciple.end;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
public class Rectangle implements Shape{
    private int width;
    private int height;

    @Override
    public int computeArea() {
        return width*height;
    }
}
