public class PangramChecker {

    public boolean isPangram(String input) {

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        if(input.length() < 26)
            return false;

        for(char c: alphabet){
            String s = "" + c;
            if(!input.toLowerCase().contains(s))
                return false;
        }
        return true;

    }

}