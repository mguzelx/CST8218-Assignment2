/*
 *  Name:            Mehmet Serif Guzel
 *  Student Number:  040971127
 *  Class Name:      JsonColorDeserializer
 */

package cst8218.guze0002.entity;

import java.awt.Color;
import java.lang.reflect.Type;
import javax.json.bind.serializer.DeserializationContext;
import javax.json.bind.serializer.JsonbDeserializer;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;
import static javax.json.stream.JsonParser.Event.VALUE_NUMBER;

/**
 *
 * @author mhser
 */
class JsonColorDeserializer implements JsonbDeserializer<Color> {

    @Override
    public Color deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
        String keyname ="";
        int value = 0;
        int red = 0;
        int green = 0;
        int blue = 0;
        while (parser.hasNext()) {
        Event event = parser.next();
        switch(event) {
            case KEY_NAME: {
            keyname= parser.getString();
            break;}
            case VALUE_NUMBER: {
                value = parser.getInt();
                if(keyname.equals("red")) {
                red = value;
                }
                else if (keyname.equals("green")) {
                    green = value;
                }
                else if (keyname.equals("blue")) {
                blue = value;
                }
                break;
                
            }
        }
        } return new Color(red,green,blue);
    }
    
    
}
