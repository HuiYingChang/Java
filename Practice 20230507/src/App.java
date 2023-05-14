import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class App {
  //public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!1");
       //System.out.println("Hello, World!2");
        //System.out.println("hey");
        //System.out.println(3+3);   /*結果會是6 */
        //System.out.println("3+3");    /*結果會是3+3 */
        //System.out.println("3"+"3");   /*結果會是33 */
       
        /*用來從終端機接受資料的準備動作(初始化) */
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("請輸入你養的寵物類型");
        //String Data = bufferedReader.readLine();
        //System.out.println("你的寵物是："+Data);
    //}
//}

/*運算設計 */
//public class App {
    //public static void main(String[] args) throws Exception {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("籠子子有幾隻雞");
        //String text1 = bufferedReader.readLine(); 
        
        /*將text1從字串轉成數字 */
        //int num1 = Integer.parseInt(text1);
        //System.out.println("籠子裡有幾隻腳");
       // String text2 = bufferedReader.readLine(); 
        /*將text2從字串轉成數字 */
       // int num2 = Integer.parseInt(text2);
        //System.out.println("籠子裡有"+(num1*2+num2*4)+"隻腳");
        
        /*偵測資料型態 */
        //String type1 = ((Object)text2).getClass().getSimpleName();
        //System.out.println("text2的資料型態是："+ type1);
        //type1 = ((Object)num1).getClass().getSimpleName();
        //System.out.println("num1的資料型態是："+ type1);
    //}
//}

/*整數型態的極限值差異 */
//public class App {
    //public static void main(String[] args) throws Exception {
    //System.out.println("int最小值："+Integer.MIN_VALUE);
    //System.out.println("int最大值："+Integer.MAX_VALUE);

    //System.out.println("short最小值："+Short.MIN_VALUE);
    //System.out.println("short最大值："+Short.MAX_VALUE);
    
    //System.out.println("long最小值："+Long.MIN_VALUE);
    //System.out.println("long最大值："+Long.MAX_VALUE);

    //short test = (short)50000;   /*因為50000大於short的上限32767，所以數值會不正確 */
    //System.out.println("Test:" + test);


        //float a = (float)3.3;
        //double b = 3.3;
        //int c = (int)3.3;

        //System.out.println("a=" + a); /*結果會是a=3.3 */
        //System.out.println("b=" + b); /*結果會是a=3.3 */
        //System.out.println("c=" + c); /*結果會是a=3 因為Int只能儲存整數*/
    //}
//}

//public class App {
    //public static void main(String[] args) throws Exception {
        //System.out.println("3>4的結果是"+(3>4));
        //System.out.println("5==4的結果是"+(5==4));
        //System.out.println("3!=4的結果是"+(3!=4));

        //String type1 = ((Object)(3!=4)).getClass().getSimpleName();
        //System.out.println(type1);
/*產生10以內(0-9)的隨機數 */
        //int a = (int)(Math.random()*10);  /*Math.random() 呼叫可獲得0-1間的隨機小數 */
        //System.out.println(a);
/*產生1-10內的隨機數 */
        //int b = (int)(Math.random()*10)+1; 
        //System.out.println(b);
/*產生3-20內的隨機數 */
    //int c = (int)(Math.random()*18)+3; /*Math.random()*18 呼叫可獲得0-17間的隨機小數 */  /*可以選擇在Math.random()*18)後面+3 或是在println的時候用(c+3) */
    //System.out.println(c);
        //}
//}


//public class App {
    //public static void main(String[] args) throws Exception {
    //int a = 3;
    //int b = 4;
    //if (a>b) 
        //System.out.println("沒錯喔 a>b"); 
    //else 
        //System.out.println("錯誤喔 4>3才對啦");
    //}
//}

/*開發猜數字遊戲 */
//public class App {
    //public static void main(String[] args) throws Exception {
        /* 電腦產生隨機1-5的數字*/
        //int ans = (int)(Math.random()*5)+1;

            // 這行是測試用，正式產品要拿掉
            //System.out.println("答案: " + ans);

         /* 使用者輸入*/
         //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         //System.out.println("猜數字遊戲");
         //System.out.println("------------------");
         //System.out.print("請輸入1-5間的數字");
        /* 接收使用者輸入*/
         //String userinput = bf.readLine();
        /* 將使用者輸入的字串轉為數字*/
        //int userinputnum = Integer.parseInt(userinput);
        //if (userinputnum == ans) 
            //System.out.println("答對啦 你真棒");
        //else
            //System.out.println("答錯啦 正確答案是"+ ans );
     //}
//}

/*開發猜拳遊戲 */
public class App {
    public static void main(String[] args) throws Exception {
        /* 電腦產生0-2隨機數 0=剪刀 1=石頭 2=布*/
        int ans = (int)(Math.random()*3);

            // 這行是測試用，正式產品要拿掉
            System.out.println("電腦出: " + ans);

         /* 使用者輸入0-2數字 各代表含意*/
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("歡迎來到猜拳遊戲 請出拳 剪刀是0 石頭是1 布是2");
         /* 將使用者輸入的字串轉為數字*/
         String userinput = bf.readLine();
         int player = Integer.parseInt(userinput);  /*這兩行可簡化成int player = Integer.parseInt(bf.readLine()); */
          // 電腦出剪刀，玩家出石頭
          if(pc == 0 && player == 1)
          System.out.println("你贏了");
          // 電腦出剪刀，玩家出布
          if(pc == 0 && player == 2)
          System.out.println("你輸了");
         // 電腦出石頭，玩家出剪刀
          if(pc == 1 && player == 0)
          System.out.println("你輸了");
         // 電腦出石頭，玩家出布
          if(pc == 1 && player == 2)
          System.out.println("你贏了");
         // 電腦出布，玩家出剪刀
          if(pc == 2 && player == 0)
          System.out.println("你贏了");
         // 電腦出布，玩家出石頭
          if(pc == 2 && player == 1)
          System.out.println("你輸了");
          if(pc == player)
          System.out.println("平手");
  }   
}