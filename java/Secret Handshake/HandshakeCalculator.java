import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class HandshakeCalculator {
    private List<Signal> handshakeList;
    private String stringOfBinary;

    public HandshakeCalculator(){
        handshakeList = new ArrayList<Signal>();
    }


    List<Signal> calculateHandshake(int number) {

        stringOfBinary = Integer.toBinaryString(number);
        int length = stringOfBinary.length();

        for(int i=0; i<length; i++){
            if(rightMostDigitIsOne()){
                handshake(i);
            }

            stringOfBinary = shiftBits();
        }

        return handshakeList;
    }


    public void handshake(int index){
        switch(index){
            case 0:
                handshakeList.add(Signal.WINK);
                break;
            case 1:
                handshakeList.add(Signal.DOUBLE_BLINK);
                break;
            case 2:
                handshakeList.add(Signal.CLOSE_YOUR_EYES);
                break;
            case 3:
                handshakeList.add(Signal.JUMP);
                break;
            case 4:
                Collections.reverse(handshakeList);
            default:
                break;
        }
    }


    public boolean rightMostDigitIsOne(){
        return stringOfBinary.charAt(stringOfBinary.length()-1) == '1';
    }


    public String shiftBits(){
        int num = Integer.parseInt(stringOfBinary, 2);
        num = num >> 1;

        return Integer.toBinaryString(num);
    }
}
