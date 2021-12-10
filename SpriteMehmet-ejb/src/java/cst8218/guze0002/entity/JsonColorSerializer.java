/*
 *  Name:            Mehmet Serif Guzel
 *  Student Number:  040971127
 *  Class Name:      JsonColorSerializer
 */

package cst8218.guze0002.entity;

import java.awt.Color;
import javax.json.bind.serializer.JsonbSerializer;
import javax.json.bind.serializer.SerializationContext;
import javax.json.stream.JsonGenerator;

/**
 *
 * @author mhser
 */
class JsonColorSerializer implements JsonbSerializer <Color> {

    @Override
    public void serialize(Color obj, JsonGenerator generator, SerializationContext ctx) {
       generator.writeStartObject();
       generator.write("red", obj.getRed());
        generator.write("green", obj.getGreen());
         generator.write("blue", obj.getBlue());
          generator.writeEnd();
    }
    
}
