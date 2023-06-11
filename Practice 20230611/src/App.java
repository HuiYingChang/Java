/*import java.util.ArrayList;
// 當類別裡面出現抽象方法，該類別必須也變成抽象類別
abstract class animal {
    public void walk(){
        System.out. println("走路");
    }
     // type方法沒有用處，不會呼叫，但是需要給子類別當作介面
    public abstract void type(); // 抽象方法
    
}

class Cat extends animal{
public void walk(){
        System.out.println("四隻腳");
        super.walk(); // 呼叫父類別walk
    }
public void jump(){
        System.out.println("跳躍");
}
public void type() {
        System.out.println("貓");
    } 
}

class Bird extends animal{
public void walk(){
        System.out.println("兩隻腳");
        super.walk(); // 呼叫父類別walk
    }
public void fly(){
        System.out.println("飛翔");
}
public void type() {
        System.out.println("鳥");
    }   
}

public class App {
    // 程式進入點
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        cat.walk();
        
        Bird bird = new Bird();
        bird.walk();

        Animal a1 = new Cat();  // animal變數存放的是Cat物件
        a1.walk();
        // a1.fly();  // Cat沒有fly方法，有也會被裁切掉
        
        Animal a0 = new Animal();
        a0.walk();

        Animal a2 = new Bird();
        a2.walk();
        // a2.fly(); // 因為透過Animal來存放Bird物件，而Animal類別只認識walk方法，所以fly方法被裁切掉了，無法呼叫
        ((Bird)a2).fly();  // 強制轉型回Bird型態，所以可以呼叫fly方法了    
    
        ArrayList<Animal> arrayList = new ArrayList<>();
        arrayList.add(a0);
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(bird);

        for(Animal a : arrayList) 
        {
            a.type();
            a.walk();
    }
    
    }
    }*/

/*積木app-方法版本(主要都由三種圖案組成：正三角形、倒三角形、長方形) */ //這種方法就是把每個圖案都拆開 然後分行列印出來
/*public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        //第一種圖案
        app.RTriangle();
        app.RTriangle();
        app.Rectangle();
        
        // 空白行
        System.out.println();
        
        //第二種圖案
        app.Triangle();
        app.Rectangle();
        app.RTriangle();

        // 空白行
        System.out.println();

        // 第三種圖案
        app.Rectangle();
        app.RTriangle();
        app.Triangle();
    }

    public void Triangle() {
        System.out.println("  *  ");
        System.out.println(" *** ");
    }

    public void RTriangle() {
        System.out.println(" *** ");
        System.out.println("  *  ");
    }

    public void Rectangle() {
        System.out.println("*****");
        System.out.println("*****");
    }
}*/

/*積木app-類別版本(主要都由三種圖案組成：正三角形、倒三角形、長方形) */
//這個先建立好特別圖案類別，再分圖案draw出來
/*class Triangle {
    public void draw() {
        System.out.println("  *  ");
        System.out.println(" *** ");
    }
}

class RTriangle {
    public void draw() {
        System.out.println(" *** ");
        System.out.println("  *  ");
    }
}

class Rectangle {
    public void draw() {
        System.out.println("*****");
        System.out.println("*****");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        //
        Triangle triangle = new Triangle();
        RTriangle rTriangle = new RTriangle();
        Rectangle rectangle = new Rectangle();
        // 第一種圖形
        triangle.draw();
        rTriangle.draw();
        rectangle.draw();
        
        // 空白行
        System.out.println();
        
        //第二種圖形
        triangle.draw();
        rectangle.draw();
        rectangle.draw();

        // 空白行
        System.out.println();

        //第三種圖形
        rectangle.draw();
        rTriangle.draw();
        triangle.draw();
    }
}*/

/*積木app-多型化版本(主要都由三種圖案組成：正三角形、倒三角形、長方形) */ //這個先把形狀和draw都統合，只要下面都繼承shape 呼叫之後每個圖案都會draw出來
/*abstract class Shape { // 因為都是draw出圖形 乾脆叫shape / 下面有用到abstract 這裡也要加上  
    public abstract void draw(); //因為下面都有draw  所以拉出來統一寫 因為沒有要建立實體物件 所以用abstract
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("  *  ");
        System.out.println(" *** ");
    }
}

class RTriangle extends Shape {
    public void draw() {
        System.out.println(" *** ");
        System.out.println("  *  ");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("*****");
        System.out.println("*****");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        //
        Shape triangle = new Triangle();
        Shape rTriangle = new RTriangle();
        Shape rectangle = new Rectangle();

        triangle.draw();
        rTriangle.draw();
        rectangle.draw();
        
        // 空白行
        System.out.println();
        
        //
        triangle.draw();
        rectangle.draw();
        rectangle.draw();

        // 空白行
        System.out.println();

        // 
        rectangle.draw();
        rTriangle.draw();
        triangle.draw();
    }
}*/

/*積木app-多型化版本(主要都由三種圖案組成：正三角形、倒三角形、長方形) */
//這個先把形狀和draw都統合，只要下面都繼承shape 呼叫之後每個圖案都會draw出來 如果要重複列印某圖案 不用每次都貼一堆程式碼
//只要先存在動態陣列裡 需要就draw出來就好 這樣萬一要改圖案，就可以只改最上面存入的部分 其他會自己套用 draw出來即是新圖~
/*import java.util.ArrayList;

//abstract class Shape {  // 因為都是draw出圖形 乾脆叫shape / 下面有用到abstract 這裡也要加上  
// 介面一定都是抽象的
interface IShape {  //從類別改成介面 一般習慣命名旗面會加大寫I 以示提醒
    public abstract void draw(); //因為下面都有draw  所以拉出來統一寫 因為沒有要建立實體物件 所以用abstract
}

//class Triangle extends IShape {   //因為改成介面 不能繼續用繼承(extends 要改成implements )
class Triangle implements IShape {
    public void draw() {
        System.out.println("  *  ");
        System.out.println(" *** ");
    }
}

//class RTriangle extends IShape { //因為改成介面 不能繼續用繼承(extends 要改成implements )
class RTriangle implements IShape {
    public void draw() {   
        System.out.println(" *** ");
        System.out.println("  *  ");
    }
}

//class Rectangle extends IShape { //因為改成介面 不能繼續用繼承(extends 要改成implements )
class Rectangle implements IShape {
    public void draw() {
        System.out.println("*****");
        System.out.println("*****");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        //
        IShape triangle = new Triangle();
        IShape rTriangle = new RTriangle();
        IShape rectangle = new Rectangle();

        // 圖形1
        ArrayList<IShape> shape1 = new ArrayList<>();
        shape1.add(triangle);
        shape1.add(rTriangle);
        shape1.add(rectangle);

        // 圖形2
        ArrayList<IShape> shape2 = new ArrayList<>();
        shape2.add(triangle);
        shape2.add(rectangle);
        shape2.add(rectangle);

        // Shape 1
        for(IShape s : shape1) s.draw();  //因為上面已經將圖形1的樣子存入動態陣列了 這時候只要再把它draw出來就好
        
        // 空白行
        System.out.println();
        
        // Shape 2
        for(IShape s : shape2) s.draw();  //因為上面已經將圖形12的樣子存入動態陣列了 這時候只要再把它draw出來就好

        // 空白行
        System.out.println();

        // Shape 1
        for(IShape s : shape1) s.draw();
        
        // 空白行
        System.out.println();
        
        // Shape 2
        for(IShape s : shape2) s.draw();

        // 空白行
        System.out.println();

        // Shape 1
        for(IShape s : shape1) s.draw();
        
        // 空白行
        System.out.println();
        
        // Shape 2
        for(IShape s : shape2) s.draw();
        
    }
}*/

/*積木app-介面版本(實作多個介面) */
/*import java.util.ArrayList;

// 介面一定都是抽象的
interface IShape {
    int a = 5; // 這是個final，無法被修改 後面指定新的東西存入就會顯示錯誤
    public void draw();
}

interface IWork {
    public void run();
}

// 透過implements來實作介面
class Triangle implements IShape, IWork {
    public void draw() {
        System.out.println("  *  ");
        System.out.println(" *** ");
    }

    @Override  //加上這個是在提醒編譯器這部分是在實作介面 也可以不加沒關係
    public void run() {
        System.out.println("Triangle實作run方法");
    }
}

class RTriangle implements IShape, IWork {
    public void draw() {
        System.out.println(" *** ");
        System.out.println("  *  ");
    }

    @Override
    public void run() {
        System.out.println("RTriangle");
    }
}

class Rectangle implements IShape, IWork {
    public void draw() {
        System.out.println("*****");
        System.out.println("*****");
    }

    @Override
    public void run() {
        System.out.println("Rectangle");
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(IShape.a);
        // IShape.a = 8; // 無法被修改

        //
        IShape triangle = new Triangle();
        IShape rTriangle = new RTriangle();
        IShape rectangle = new Rectangle();

        IWork w1 = (IWork)triangle; //可以new出來或是直接強制轉型 因為run是在IWork底下 所以必須要提到IWork
        w1.run(); 

        // 圖形1
        ArrayList<IShape> shape1 = new ArrayList<>();
        shape1.add(triangle);
        shape1.add(rTriangle);
        shape1.add(rectangle);

        // 圖形2
        ArrayList<IShape> shape2 = new ArrayList<>();
        shape2.add(triangle);
        shape2.add(rectangle);
        shape2.add(rectangle);

        // Shape 1
        for(IShape s : shape1) s.draw();
        
        // 空白行
        System.out.println();
        
        // Shape 2
        for(IShape s : shape2) s.draw();

        // 空白行
        System.out.println();

        // Shape 1
        for(IShape s : shape1) s.draw();
        
        // 空白行
        System.out.println();
        
        // Shape 2
        for(IShape s : shape2) s.draw();

        // 空白行
        System.out.println();

        // Shape 1
        for(IShape s : shape1) s.draw();
        
        // 空白行
        System.out.println();
        
        // Shape 2
        for(IShape s : shape2) s.draw();
        
    }
}*/

/*instanceof 判斷關係 */
// 介面一定都是抽象的

/*import java.util.ArrayList;

interface IShape {
    public void draw();
}

interface IWork {
    public void run();
}

// 透過implements來實作介面
class Triangle implements IShape, IWork {
    public void draw() {
        System.out.println("  *  ");
        System.out.println(" *** ");
    }

    @Override
    public void run() {
        System.out.println("Triangle實作run方法");
    }
}

class Rectangle implements IShape {
    public void draw() {
        System.out.println("*****");
        System.out.println("*****");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<IShape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Rectangle());

        for (IShape s : shapes) {
            s.draw();

            if (s instanceof IWork) {    //有關係就會是true 就會顯示結果(run的結果) 如果沒關係就會顯示 run原本就在IWork底下 所以有關係(本段不確定)
                IWork w = (IWork) s;
                w.run();
            }
        }

    }
}*/

/*匿名類別 */
/*interface IShape {
    void draw();
    void show();
}

// class Triangle implements IShape {  //如果有名字(Triangle)的話 就可以被多次使用
//     @Override
//     public void draw() {
//         System.out.println("draw");
//     }

//     @Override
//     public void show() {
//         System.out.println("show");
//     }
// }


public class App {
    public static void main(String[] args) throws Exception {  
        IShape shape = new IShape() { // 建立實現IShape的匿名物件    //在new的同時實作出介面 如果只會用到一次就適合這樣 如：整個app只會用到一個儲存 這樣也可以避免被誤用
            @Override
            public void draw() {   //在new的同時實作出 這兩個方法(draw、show)有實體，但IShape(介面)仍然沒有實體
                System.out.println("draw");
            }

            @Override
            public void show() {
                System.out.println("show");
            }
        };
        
        shape.draw();
        shape.show();
    }
}*/


//多執行序版本 (用Thread)
//// 1. 將要當成多執行緒的類別繼承自Thread類別
// 2. 覆寫run()方法，把要做的事情寫在這個方法內
// 3. 呼叫start()方法來啟動執行緒

/*import java.util.ArrayList;
import java.util.Date;
class JobA extends Thread {
    public void run() {
        System.out.println("開始執行JobA");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        } // 暫停2秒鐘
        System.out.println("結束執行JobA");
    }
}

class JobB extends Thread {
    public void run() {
        System.out.println("開始執行JobB");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        } // 暫停3秒鐘
        System.out.println("結束執行JobB");
    }
}


class JobC extends Thread {
    public void run()  {
        System.out.println("開始執行JobC");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        } // 暫停4秒鐘
        System.out.println("結束執行JobC");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Thread> threads = new ArrayList<>();

        System.out.println("[" + new Date().toString() +  "]");
        JobA jobA = new JobA();
        threads.add(jobA);
        jobA.start(); // 啟動執行緒

        JobB jobB = new JobB();
        threads.add(jobB);
        jobB.start();

        JobC jobC = new JobC();
        threads.add(jobC);
        jobC.start();

        // 暫停等待所有執行緒結束
        for(Thread t : threads) {
            t.join();
        }

        System.out.println("[" + new Date().toString() +  "]");
    }
}*/

/*使用Runnable建立執行 */
// 1. 將要當成多執行緒的類別繼承自Thread類別
// 2. 覆寫run()方法，把要做的事情寫在這個方法內
// 3. 呼叫start()方法來啟動執行緒

/*import java.util.ArrayList;
import java.util.Date;

class JobA implements Runnable {
    public void run() {
        System.out.println("開始執行JobA");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        } // 暫停2秒鐘
        System.out.println("結束執行JobA");
    }
}

class JobB implements Runnable {
    public void run() {
        System.out.println("開始執行JobB");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        } // 暫停3秒鐘
        System.out.println("結束執行JobB");
    }
}


class JobC implements Runnable {
    public void run()  {
        System.out.println("開始執行JobC");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        } // 暫停4秒鐘
        System.out.println("結束執行JobC");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Thread> threads = new ArrayList<>();

        System.out.println("[" + new Date().toString() +  "]");
        Thread jobA = new Thread(new JobA());  // 透過Runnable物件來建立Thread物件 跟Thread差別之處主要在這 其他都沒什麼變 Runnable較常使用的原因在於繼承只能使用一次，但介面可以實做很多次 註：繼承跟實作可同時存在
        threads.add(jobA);
        jobA.start(); // 啟動執行緒

        Thread jobB = new Thread(new JobB());
        threads.add(jobB);
        jobB.start();

        Thread jobC = new Thread(new JobC());
        threads.add(jobC);
        jobC.start(); //呼叫執行序 不可直接呼叫run

        // 暫停等待所有執行緒結束
        for(Thread t : threads) {
            t.join();
        }

        System.out.println("[" + new Date().toString() +  "]");
    }
}*/

/*練習 */
import java.util.ArrayList;
import java.util.Date;

class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
        }
        synchronized(App.sum.getClass()){  //用synchronized鎖住 在其中一條執行期間其他條要暫停
        App.sum++;
    }
    }
}


public class App {
    public static Integer sum = 0;

    public static void main(String[] args) throws Exception {
        ArrayList<Thread> threads = new ArrayList<>();

        System.out.println("[" + new Date().toString() +  "]");
        for(int i = 0 ; i < 10 ; i++) {
            // Thread t = new MyThread();
            // t.start();
            
            threads.add(new MyThread());
        }

        // 啟動執行緒
        for(Thread t : threads) t.start();

        // 等待執行緒
        for(Thread t : threads) t.join();

        System.out.println("總和: " + App.sum);
        System.out.println("[" + new Date().toString() +  "]");
    }
}