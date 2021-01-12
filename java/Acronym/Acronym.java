class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String getAcronym() {
        String acronym  = "";

        for(String s : phrase.split(" ")){
            
            if(s.contains("-")){
                if(s.length() == 1){
                    continue;

                } else {
                   acronym += s.split("-")[0].charAt(0);
                   acronym += s.split("-")[1].charAt(0);
                } 

            } else {
                acronym += s.charAt(0);
            }
        }

        return acronym.toUpperCase();
    }

}
