package com.yuan.com;

//用户只要重写该类的方法就可以实现   在目标方法前后添加操作了
public interface Advice {
  public abstract void doBefore();
  public abstract void  doAfter();
}
