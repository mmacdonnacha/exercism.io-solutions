import java.util.Set;
import java.util.HashSet;
import java.util.stream.IntStream;

class NaturalNumber {
    private Set<Integer> factors;
    private int number;

    public NaturalNumber(int num){
        if(num < 1)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        factors = new HashSet<Integer>();
        number = num;
    }

    public Classification getClassification(){
        factorization(number);
        int sum = factors.stream().mapToInt(i -> i).sum();

        if(sum > number)
            return Classification.ABUNDANT;
        else if (sum < number)
            return Classification.DEFICIENT;
        else
            return Classification.PERFECT;
    }


    public void factorization(int num){
        int sqrt = (int)Math.sqrt(num);
        IntStream.range(1, sqrt+1)
                 .filter(i -> num % i == 0)
                 .forEach(i -> { 
                            factors.add(i); 
                            factors.add(num/i);
        });
        
        factors.remove(Integer.valueOf(num));
    }
}
