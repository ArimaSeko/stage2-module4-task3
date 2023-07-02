package com.mjc.stage2.impl;

import com.mjc.stage2.Observable;
import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements  Observer {


    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rectangle = event.getSource();
        double sideA = rectangle.getSideA();
        double sideB = rectangle.getSideB();
        double square = sideA * sideB;
        double perimeter = (sideA * 2)+ (sideB * 2);
        RectangleWarehouse.getInstance().get(rectangle.getId()).setPerimeter(perimeter);
        RectangleWarehouse.getInstance().get(rectangle.getId()).setSquare(square);
    }
    // Write your code here!
}
