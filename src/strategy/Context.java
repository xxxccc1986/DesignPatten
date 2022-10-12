package strategy;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 表示使用哪种策略对应的类
 * 并不关注细节，仅仅关注以什么样的策略实现目的
 * @date 2022/10/9 16:00
 */
public class Context {
    //依赖于策略接口(不能依赖实现类)
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //执行策略业务的逻辑
    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);//调用目标方法
    }
}
