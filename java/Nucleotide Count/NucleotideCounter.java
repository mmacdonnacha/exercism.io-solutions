import java.util.HashMap;
import java.util.Map;


public class NucleotideCounter {
    private String nucleotide;
    Map<Character, Integer> map;

    public NucleotideCounter(String input){
        if(!input.isBlank() && !input.matches("^[ACGT]+$"))
            throw new IllegalArgumentException();


        nucleotide = input;
        map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);
    }


    public Map<Character, Integer> nucleotideCounts(){
        nucleotide.chars().forEach(c -> incrementNucleotide((char)c));

        return map;
    }


    public void incrementNucleotide(char c){
        int newValue = map.get(c) + 1;
        map.put(c, newValue);
    }
}