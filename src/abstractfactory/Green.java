package abstractfactory;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/10/10 9:23
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("绿色完成填充");
    }
}
