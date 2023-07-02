package com.mjc.stage2.impl;

import com.mjc.stage2.Observable;
import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements  Observer {


    @Override
    public void handleEvent(RectangleEvent event){
        Rectangle rectangle = event.getSource();
        if (RectangleWarehouse.getInstance().get(rectangle.getId()) != null){
            RectangleWarehouse.getInstance().get(rectangle.getId()).setPerimeter(2 * (rectangle.getSideA() + rectangle.getSideB()));
            RectangleWarehouse.getInstance().get(rectangle.getId()).setSquare(rectangle.getSideA() * rectangle.getSideB());
        }

        //RectangleWarehouse.getInstance().put(rectangle.getId(), rectangleValues);
    }
    // Write your code here!
}
