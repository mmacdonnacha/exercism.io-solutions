import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class ProteinTranslator {

    private HashMap<String, String> proteinMap;
    private final int SIZE = 3;

    public ProteinTranslator(){
        proteinMap = new HashMap<String, String>();
        populateProteinMap();
    }

    List<String> translate(String rnaSequence) {
        List<String> translation = new ArrayList<>();

        for (int index = 0; index < rnaSequence.length(); index += SIZE) {
            String rna = rnaSequence.substring(index, index + SIZE);

            if(proteinSequence(rna).equals("STOP")){
                return translation;
            }else{
                translation.add(proteinSequence(rna));

            }

        }

        return translation;
    }
    

    public void populateProteinMap(){
        // AUG                   | Methionine
        proteinMap.put("AUG", "Methionine");

        // UUU, UUC              | Phenylalanine
        proteinMap.put("UUU", "Phenylalanine");
        proteinMap.put("UUC", "Phenylalanine");

        // UUA, UUG              | Leucine
        proteinMap.put("UUA", "Leucine");
        proteinMap.put("UUG", "Leucine");
                
        // UCU, UCC, UCA, UCG    | Serine
        proteinMap.put("UCU", "Serine");
        proteinMap.put("UCC", "Serine");
        proteinMap.put("UCA", "Serine");
        proteinMap.put("UCG", "Serine");

        // UAU, UAC              | Tyrosine
        proteinMap.put("UAU", "Tyrosine");
        proteinMap.put("UAC", "Tyrosine");
        
        // UGU, UGC              | Cysteine
        proteinMap.put("UGU", "Cysteine");
        proteinMap.put("UGC", "Cysteine");
        
        // UGG                   | Tryptophan
        proteinMap.put("UGG", "Tryptophan");
        
        // UAA, UAG, UGA         | STOP
        proteinMap.put("UAA", "STOP");
        proteinMap.put("UAG", "STOP");
        proteinMap.put("UGA", "STOP");
    }

    public String proteinSequence(String protein){
        return proteinMap.get(protein);
    }
}