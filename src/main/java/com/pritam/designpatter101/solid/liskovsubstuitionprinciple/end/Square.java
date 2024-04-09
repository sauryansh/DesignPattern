package com.pritam.designpatter101.solid.liskovsubstuitionprinciple.end;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Square implements Shape {
    private int side;
    @Override
    public int computeArea() {
        return side*side;
    }
}
