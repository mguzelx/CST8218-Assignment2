/*
 *  Name:            Mehmet Serif Guzel
 *  Student Number:  040971127
 *  Class Name:      ColorAdapter
 */

package cst8218.guze0002.entity;

import java.awt.Color;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * @author mhser
 */
class ColorAdapter extends XmlAdapter<ColorAdapter.ColorValueType, Color> {
  

    @Override
    public Color unmarshal(ColorValueType v) throws Exception {
        return new Color(v.red, v.green, v.blue);
    }

    @Override
    public ColorValueType marshal(Color v) throws Exception {
        return new ColorValueType(v.getRed(), v.getGreen(), v.getBlue());
    }
    
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ColorValueType{
    private int red;
    private int green;
    private int blue;
    public ColorValueType() {
    }
    public ColorValueType(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
    }
    }
    
}
