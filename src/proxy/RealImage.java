package proxy;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 真正加载图片和显示图片的执行类
 * @date 2022/10/9 12:00
 */
public class RealImage implements Image{

    private String fileName;//文件的路径

    public RealImage(String fileName){
        this.fileName = fileName;
        LoadFromDisk(this.fileName);
    }

    @Override
    public void display() {
        System.out.println("正在显示图片");
    }

    private void LoadFromDisk(String fileName){
        System.out.println("从硬盘中加载文件成功！" + fileName);
    }
}
