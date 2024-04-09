package com.pritam.designpatter101.solid.liskovsubstuitionprinciple.start;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Square extends Rectangle{
    public Square(int side){
        super(side,side);
    }

    @Override
    public void setWidth(int width){
        setSide(width);
    }
    @Override
    public void setHeight(int height){
        setSide(height);
    }
    private void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
}
