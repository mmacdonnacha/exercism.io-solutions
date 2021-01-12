class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		String[] strArray = Integer.toString(numberToCheck).split("");
		int power = strArray.length;
		int[] intArray = new int[power];
		
		for(int i=0; i<power; i++){
			intArray[i] = Integer.parseInt(strArray[i]);
		}
		
		int number = 0;
		for(int num : intArray){
			number += Math.pow(num, power);
		}
		
		if(number == numberToCheck){
			return true;
		}
		else{
			return false;
		}
	}

}