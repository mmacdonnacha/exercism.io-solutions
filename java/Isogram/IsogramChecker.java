class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.replace(" ", "").replace("-", "").toLowerCase();
        String[] array = phrase.split("(?!^)");

        for(int i=0; i<array.length-1; i++){
            String letter = array[i];
            if(phrase.substring(i+1).contains(letter)){
                return false;
            }
        }

        return true;
    }

}
