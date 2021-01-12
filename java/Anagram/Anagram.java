import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;


public class Anagram {

    private String originalWord;

    public Anagram(String word){
        originalWord = word;
    }

    public List<String> match(List<String> words){
        return words.stream()
                    .filter(word -> isNotSameAsOriginalWord(word))
                    .filter(word -> isAnagram(word))
                    .collect(Collectors.toList());
    }

    public String sortLettersInWord(String word){
        char[] array = word.toLowerCase().toCharArray();
        Arrays.sort(array);

        return new String(array);
    }

    public boolean isAnagram(String word){
        String word1 = sortLettersInWord(originalWord);
        String word2 = sortLettersInWord(word);

        return word1.equals(word2);
    }


    public boolean isNotSameAsOriginalWord(String word){
        String word1 = originalWord.toLowerCase();
        String word2 = word.toLowerCase();
        
        return !word1.equals(word2);
    }

}
