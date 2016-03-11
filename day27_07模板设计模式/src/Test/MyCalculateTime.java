package Test;

public class MyCalculateTime extends CalculateTime {

	@Override
	public void code() {
		//计算for循环的时间
		long sum =0;
		for(int i =0; i<100000;i++){
			sum +=i;
		}

	}

}
