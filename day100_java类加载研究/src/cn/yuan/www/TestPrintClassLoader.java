package cn.yuan.www;

public class TestPrintClassLoader {
	
	public void sayHello(){
		System.out.println("ÄãºÃ£¡£¡£¡");
	}
  public static void main(String[] args) throws ClassNotFoundException{
	 
	  ClassLoader loader  = TestPrintClassLoader.class.getClassLoader();
	  while(loader !=null){
		   System.out.println(loader.toString());
		   loader  = loader.getParent();
	  }
	  Class clazz = new MyClassLoader().loadClass("Hello");
	 
	  loader  =clazz.getClassLoader();
	 // loader = Hello.class.getClassLoader();
	  while(loader !=null){
		   System.out.println(loader.toString());
		   loader  = loader.getParent();
	  }
  }
}
