import java.util.Arrays;
import java.util.List;

class ResistorColorDuo {
    int value(String[] colors) {
        String resistance = "" + getColorValue(colors[0]) + getColorValue(colors[1]);

        return Integer.valueOf(resistance);
    }

    public int getColorValue(String color){
        List<String> colors = Arrays.asList(
                new String[]{ "black",  "brown",  "red",
                              "orange", "yellow", "green", 
                              "blue",  "violet", "grey",   
                              "white" });

        return colors.indexOf(color);
    }
}
  