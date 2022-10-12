package proxy;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 代理类
 * @date 2022/10/9 12:02
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;

    }

    @Override
    public void display() {
        //借助真正加载图片的类完成图片加载的操作
        if (realImage == null){ //判断realImage是否为空
            //初始化加载图片的类对象
            this.realImage = new RealImage(this.fileName);
        }
        //调用当前加载图片的类对象的display的方法
        realImage.display();
    }
}
