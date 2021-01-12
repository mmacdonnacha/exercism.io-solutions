import java.util.HashMap;

class Scrabble {
    private HashMap<Character, Integer> scoreValues;
    private String word;

    Scrabble(String word) {
        this.word = word.toUpperCase();
        scoreValues = new HashMap<Character, Integer>();

        populatescoreValues();
    }


    int getScore(){
        return word.chars()
                   .map(c -> scoreValues.get((char)c))
                   .sum();
    }

    public void populatescoreValues(){

        scoreValues.put('A', 1);
        scoreValues.put('E', 1);
        scoreValues.put('I', 1);
        scoreValues.put('O', 1);
        scoreValues.put('U', 1);
        scoreValues.put('L', 1);
        scoreValues.put('N', 1);
        scoreValues.put('R', 1);
        scoreValues.put('S', 1);
        scoreValues.put('T', 1);

        scoreValues.put('D', 2);
        scoreValues.put('G', 2);
        
        scoreValues.put('B', 3);
        scoreValues.put('C', 3);
        scoreValues.put('M', 3);
        scoreValues.put('P', 3);
        
        scoreValues.put('F', 4);
        scoreValues.put('H', 4);
        scoreValues.put('V', 4);
        scoreValues.put('W', 4);
        scoreValues.put('Y', 4);

        scoreValues.put('K', 5);

        scoreValues.put('J', 8);
        scoreValues.put('X', 8);

        scoreValues.put('Q', 10);
        scoreValues.put('Z', 10);
    }
}
