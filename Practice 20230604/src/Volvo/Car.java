package Volvo;
public class Car {
    public String type = "車子";
    public String color = "白色";

    public int gas = 0;
     // 建構式
     public Car(String color, int gas) {
        this.color = color;
        this.gas = gas;
    }

    public void start() {
        System.out.printf("%s啟動\n", type);
    }

    public void run() {
        System.out.println("開車");
    }

    public void show() {
        System.out.printf("我是一輛%s, 顏色: %s, 汽油: %d公升\n", type, color, gas);
    }

    //取得物件資訊的另一種方式(比show更常使用)
    public String toString() {    
        return "我是一輛"+type + "，顏色: " + color +"，汽油:" +gas+"公升";

    }

}