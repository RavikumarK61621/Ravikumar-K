package week1.day2;

public class FindTheListOfPrimeNumber {
	
	public boolean Isprime(int Input) {
		boolean flag = true;
		for (int i = 2; i <= Input/2; i++) {
			if(Input%i==0) {
			flag=false;
				break;
			}
	
		}
		return flag;
		
	}
}

