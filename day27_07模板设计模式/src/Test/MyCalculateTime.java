package Test;

public class MyCalculateTime extends CalculateTime {

	@Override
	public void code() {
		//����forѭ����ʱ��
		long sum =0;
		for(int i =0; i<100000;i++){
			sum +=i;
		}

	}

}
