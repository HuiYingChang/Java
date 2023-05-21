
/*寫一算命程式，使用者執行後，從10之籤裡面抽出一支，如果抽到:
1 = 今天會撿到錢，今天會中樂透
2 = 今天考試100分
3 = 今天會有豔遇
4~10 = 今天不會有特別事發生*/

//public class App {
//public static void main(String[] args) throws Exception {
// 從10之籤裡面抽一支籤(隨機數10個)
//int lucky = (int)(Math.random() * 10) + 1;
//System.out.println(lucky);

//if(lucky == 1)
//System.out.println("今天會撿到錢");  // 縮排

//if(lucky == 2)
//System.out.println("今天考試100分");

//if(lucky == 3)
//System.out.println("今天有豔遇");

//if(lucky >= 4 && lucky <= 10)
//System.out.println("今天沒有特別事情發生");
//}
//}

/*用else if 語法 如果數字是1-3的畫執行效率會較高 */
/*public class App {
    public static void main(String[] args) throws Exception {
int lucky = (int)(Math.random() * 10) + 1;
System.out.println(lucky);

if(lucky == 1) {
    System.out.println("今天會撿到錢");
    System.out.println("今天會中樂透");
} else if(lucky == 2)
    System.out.println("今天考試100分");
else if(lucky == 3)
    System.out.println("今天有豔遇");
else
    System.out.println("今天沒有特別事情發生");
}
}*/

/*用switch語法 不同樹子相同結果 不打break就可以穿透執行 */
/*public class App {
    public static void main(String[] args) throws Exception {
        // 從10之籤裡面抽一支籤(隨機數10個)
        int lucky = (int)(Math.random() * 10) + 1;
        System.out.println(lucky);

        switch(lucky) {
        case 1:
            System.out.println("今天會撿到錢");
            System.out.println("今天會種樂透");
            break;
        case 2:
            System.out.println("今天會考100分");
            break;
        case 3:
            System.out.println("今天有豔遇");
            break;
        case 4:
        case 5:
            System.out.println("今天心情好好");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("今天會遇到很久不見的好友");
            break;
        default:
            System.out.println("今天沒有特別事情發生");
            break;
        }
    }
}*/

/*import java.io.BufferedReader;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args) throws Exception {
        
        //預備讀取輸入資訊
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //將使用者輸入的數字存到陣列 存放大小先設1000個
        int[]userInputs = new int [1000];
        //記錄使用者輸入了幾個數字
        int count=0;

        // 第一個需求：讓使用者輸入數字並將數字保存起來
        //建立迴圈讓使用者可以一直輸入一直存放數字到陣列
        while (true){
            System.out.print("請輸入一個數字 輸入N即可結束輸入"); //後續加上輸入N即可結束輸入避免一定要儲存至1000以才能跳出迴圈
            String user = br.readLine();   //readline 讀取使用者輸入的文字儲存至型態為字串的user

            if (user.equals ("N")) //如果使用者輸入N 就可以跳出迴圈 並開始進行後續的計算程序
            break;

            int userInt = Integer.parseInt(user);  //將user的資訊轉為數字 並存至userInt

            // 將轉換好的數字存到陣列，以count為索引的位置去
            userInputs[count] = userInt;

            count++; //每輸入一個數字就要將索引+1，這樣才不會覆蓋到上個數值

            if(count >= 1000) { //如果數字到達1000筆，跟使用者說哭間已滿並跳出迴圈
                System.out.println("儲存空間已滿");

                // 離開迴圈
                break;
            } 
        }
        System.out.printf("總共輸入了%d個數字.\n", count);  //先顯示目前已輸入了幾個數字
    //第二個需求：顯示使用者輸入的數字讓他確認
        for (int i=0; i<count; i++){   
         System.out.printf("輸入了: %d\n", userInputs[i]);  //把陣列裡的數字一筆一筆印出來
        }

    //第三個需求：將奇數跟偶數分別加總後顯示到畫面上
        int odd = 0;  // 存放奇數加總用
        int even = 0; // 存放偶數加總用
        
        for(int i = 0 ; i < count ; i++) {
            // 偶數加總
            if(userInputs[i] % 2 == 0) 
                even += userInputs[i];
            // 奇數加總
            else 
                odd += userInputs[i];
        }

        System.out.printf("奇數總和為: %d\n偶數總和為: %d\n", odd, even);


    //第四個需求：將所有的數字平均後顯示出來
        int total = 0; // 存放加總用

        for(int i = 0 ; i < count ; i++) {
            // 將陣列所有數字加總到total變數內
            total += userInputs[i];
        }

        System.out.printf("平均: %.1f", (float)total / count); // %d=整數, %f=小數, %.1f表示顯示到小數以下第一位    %.1f代表小數點後第一位 如果要第二位就用%.2f  加上(float)把total型態從int轉為可放小數點的形式 
    }
}*/

/*import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {

        // 預備讀取輸入資訊
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 將使用者輸入的數字存到陣列 存放大小先設1000個
        int[] userInputs = new int[1000];
        // 記錄使用者輸入了幾個數字
        int count = 0;

        // 第一個需求：讓使用者輸入數字並將數字保存起來
        // 建立迴圈讓使用者可以一直輸入一直存放數字到陣列
        while (true) {
            System.out.print("請輸入一個數字 輸入N即可結束輸入"); // 後續加上輸入N即可結束輸入避免一定要儲存至1000以才能跳出迴圈
            String user = br.readLine(); // readline 讀取使用者輸入的文字儲存至型態為字串的user

            if (user.equals("N")) // 如果使用者輸入N 就可以跳出迴圈 並開始進行後續的計算程序
                break;

            int userInt = Integer.parseInt(user); // 將user的資訊轉為數字 並存至userInt

            // 將轉換好的數字存到陣列，以count為索引的位置去
            userInputs[count] = userInt;

            count++; // 每輸入一個數字就要將索引+1，這樣才不會覆蓋到上個數值

            if (count >= 1000) { // 如果數字到達1000筆，跟使用者說哭間已滿並跳出迴圈
                System.out.println("儲存空間已滿");

                // 離開迴圈
                break;
            }
        }
        System.out.printf("總共輸入了%d個數字.\n", count); // 先顯示目前已輸入了幾個數字
        // 統合二三四需求
        int odd = 0; // 存放奇數加總用
        int even = 0; // 存放偶數加總用
        int total = 0; // 存放加總用
        for (int i = 0; i < count; i++) {
            System.out.printf("輸入了: %d\n", userInputs[i]); // 把陣列裡的數字一筆一筆印出來
            // 偶數加總
            if (userInputs[i] % 2 == 0)
                even += userInputs[i];
            // 奇數加總
            else
                odd += userInputs[i];
            total += userInputs[i];
        }
        System.out.printf("奇數總和為: %d\n偶數總和為: %d\n", odd, even);
        System.out.printf("平均: %.1f", (float) total / count); // %d=整數, %f=小數, %.1f表示顯示到小數以下第一位 %.1f代表小數點後第一位
                                                              // 如果要第二位就用%.2f 加上(float)把total型態從int轉為可放小數點的形式
    }
}*/

/*Do While 迴圈和while迴圈的差別在於前者一定會執行一次 */

/*import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String userInput = "";
    do {
        System.out.println("請輸入(不輸入，ENTER來結束):");
        userInput = br.readLine();

        if (userInput.length()>0);
            System.out.print ("你輸入了"+ userInput);
    }

    while(userInput.length() > 0);

        System.out.println("結束");
    }
}*/

/*動態陣列使用ArrayList */
/*public class App {
    public static void main(String[] args) throws Exception {  
        ArrayList<String> a = new ArrayList<>();
        a.add("abc");
        a.add("def");
        a.add("000");
        a.add("def");
        a.add("def");
        a.add(0, "111");
        a.remove(3);
        a.remove("def"); //若原本里面有三組def 用remove只會刪除一個 不會全刪除
        
        System.out.println(a);
        System.out.println("陣列有幾筆資料: " + a.size());
    }
}*/


/*Collections.shuffle 用來打亂順序 */
/*import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {  
        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("C");
        a.add("D");
        Collections.shuffle(a);  //打亂順序
        System.out.println(a);
        
    }
}*/

/*設計幾A幾B遊戲 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> answer = new ArrayList<>();
        answer.add("0");
        answer.add("1");
        answer.add("2");
        answer.add("3");
        answer.add("4");
        answer.add("5");
        answer.add("6");
        answer.add("7");
        answer.add("8");
        answer.add("9");
        Collections.shuffle(answer);
        answer.remove(4);
        answer.remove(4);
        answer.remove(4);
        answer.remove(4);
        answer.remove(4);
        answer.remove(4);
        System.out.println("答案: " + answer);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 預備用來存放使用者答案的動態陣列
        ArrayList<String> user = new ArrayList<>();

        // 紀錄猜了幾次
        int count = 0;

        do {
           
            System.out.print("請輸入四個不重覆數字: ");

            // 使用者輸入答案
            String userInput = br.readLine();

            // 猜測次數加一
            count++;

            // 判斷使用者是不是輸入四個字
            if(userInput.length() != 4) {
                System.out.println("輸入的數字不是四個，請重新輸入。");

                // 停止執行迴圈剩下的程式碼，並回到開頭重新下一輪
                continue;
            }

            try {
                Integer.parseInt(userInput);
            } catch(NumberFormatException e) {
                System.out.println("只能輸入數字。");

                // 停止執行迴圈剩下的程式碼，並回到開頭重新下一輪
                continue;
            }

            // 將使用者的答案切開陣列
            String[] userInputArray = userInput.split("");

            // 清除上次猜的答案
            user.clear();

            // 將陣列轉換成List並加入到user這個ArrayList內
            user.addAll(Arrays.asList(userInputArray));

            // 判斷輸入的數字有沒有重複
            HashSet<String> test = new HashSet<>();
            test.addAll(user);

            System.out.println("使用者輸入: " + user);
            System.out.println("使用者輸入HashSet: " + test);

            if(test.size() != 4) {
                System.out.println("數字不可重複。");
                continue;
            }

            // 紀錄幾個A
            int howManyA = 0;

            if(answer.get(0).equals(user.get(0))) howManyA++;
            if(answer.get(1).equals(user.get(1))) howManyA++;
            if(answer.get(2).equals(user.get(2))) howManyA++;
            if(answer.get(3).equals(user.get(3))) howManyA++;

            // 紀錄幾個B
            int howManyB = 0;

            if(answer.contains(user.get(0)) && answer.get(0).equals(user.get(0)) == false) howManyB++;
            if(answer.contains(user.get(1)) && answer.get(1).equals(user.get(1)) == false) howManyB++;
            if(answer.contains(user.get(2)) && answer.get(2).equals(user.get(2)) == false) howManyB++;
            if(answer.contains(user.get(3)) && answer.get(3).equals(user.get(3)) == false) howManyB++;

            System.out.printf("%dA%dB\n", howManyA, howManyB);

        }while(answer.equals(user) == false); // 答案不同就繼續猜

        System.out.printf("猜對了, 遊戲結束, 總共猜了%d次\n", count);
    }
}