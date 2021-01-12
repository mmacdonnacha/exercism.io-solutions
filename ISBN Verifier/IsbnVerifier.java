import java.util.stream.IntStream;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        
        String isbn = stringToVerify.replace("-", "");

        // check for correct format
        if(!isbn.matches("[0-9]{9}[0-9X]{1}"))
            return false;
        
        int total = IntStream.range(0, 10)
            .map(i -> getNumericValue(isbn.charAt(i), i) * (10-i))
            .sum();

        return (total % 11) == 0;
     }

    public static int getNumericValue(char c, int i) {
        int num;

        if (c == 'X') 
            num = 10;
        else 
            num = Character.getNumericValue(c);

        return num;

    }
}
