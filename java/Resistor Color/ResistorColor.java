class ResistorColor {
    private String[] code = { "black", "brown", "red",    "orange", "yellow", 
                              "green", "blue",  "violet", "grey",   "white" };
    int colorCode(String color) {
        int index = 0;

        for(int i=0; i<code.length; i++){
            if(code[i].equals(color)){
                index =  i;
            }
        }

        return index;
    }

    String[] colors() {
        return code;
    }
}
