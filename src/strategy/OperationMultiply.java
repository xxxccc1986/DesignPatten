package strategy;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 乘法算法(策略类)
 * @date 2022/10/9 16:00
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
