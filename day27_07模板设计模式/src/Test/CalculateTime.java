package Test;
// 需求分析     计算一段代码的运行的时间
// 这里面变的是   用户要测哪些代码这是 不定的
// 定的是 从开始计时   结束时  计算时间

//定的部分  已近实现 不定的部分用户实现  
//这就是提供了一个模板     基础部分已经实现，用户继承并实现部分方法就可以了
//这就是设计模板
public abstract  class CalculateTime {

	public abstract void code();
	
	public long  getTime(){
		long beginTime =  System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-beginTime+"毫秒");
		return endTime-beginTime;
		
	}
	
}
