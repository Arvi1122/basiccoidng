// prime NUmber 1 to 100
public class PrimeNumber {
	public static void main(String[] args) {
		int i;
		int num;
		String prime_number=" ";
		for(i=1;i<=100;i++) {
			int counter=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					counter = counter+1;
				}
			}
			if(counter ==2) {
				prime_number=prime_number + i +  " ";
			}
			
		}
		System.out.println("one to 100 prime Number::"+prime_number);	
	}

}
