package strategy;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 减法运算(策略类)
 * @date 2022/10/9 15:59
 */
public class OperationSubtract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
