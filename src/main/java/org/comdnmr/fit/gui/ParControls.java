/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.comdnmr.fit.gui;

import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;

/**
 *
 * @author Bruce Johnson
 */
public interface ParControls {
    
    String getName();

    void addTo(HBox hBox);

    Slider getSlider();

    void disabled(boolean state);

    void setValue(double value);

    void setText();

    double getValue();
    
}