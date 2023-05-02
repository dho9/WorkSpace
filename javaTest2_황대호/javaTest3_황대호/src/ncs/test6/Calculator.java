package ncs.test6;

public class Calculator    {


	public double getSum(int data) {
		double sum =0;
		int i=0;



		for(i=1; i<=data; i++) {
			if(data <2 || 5<data ) {

				throw new InvalidException("입력 값에 오류가 있습니다.");
			}else {
				sum += i; 
				
			}

		}
		return  sum;

	}
}



