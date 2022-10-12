package flyweight;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试类
 * @date 2022/10/8 23:27
 */
public class FlyWeightPatternDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            String color = getColor();
            Circle circle = (Circle) ShapeFactory.getShape(color);
            System.out.print("第" + (i+1) + "个图形创建" + "\t");
            circle.setRadius((int) (Math.random()*100));
            circle.setX((int) (Math.random()*100));
            circle.setY((int) (Math.random()*100));
            circle.draw();
            System.out.println();
        }
    }

    public static String getColor(){
        String color = "";
        int colorNum = (int) (Math.random()*5);
        switch (colorNum){
            case 0:
                color = "red";
                break;
            case 1:
                color = "blue";
                break;
            case 2:
                color = "yellow";
                break;
            case 3:
                color = "white";
                break;
            case 4:
                color = "black";
                break;
        }
        return color;
    }


}
