//public class App {
/* 筆記，註解  */
//public static void main(String[] args) throws Exception {
//int[] a = new int[30]; // 建立一個可以存放30筆整數的陣列  []代表宣告陣列

//a[0] = 30;

//System.out.println(a[0]);
//System.out.println(a[20]);
//System.out.println(a[23]);
//System.out.println(a[25]);
//System.out.println(a[27]);

// 建立一個陣列，並直接把資料存放進去   {}可以直接放陣列的值
//int[] b = {3, 4, 5, 6, 7};

//System.out.println(b[4]);
//}   

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

/*寫一程式，用來建立一筆客戶資料:請使用者輸入: 姓名、英文名、生日、電話、地址等資料。使用陣列存放。建立後請將輸入的資料顯示到畫面上給使用者看。*/
//public class App {
/* 筆記，註解  */
//public static void main(String[] args) throws Exception {
// 建立可以存放五筆資料的陣列
//String[] userData = new String[5];

// 準備輸入物件
//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

// 接收使用者輸入
//System.out.print("請輸入姓名: ");

// 存下使用者輸入的姓名
//userData[0] = bf.readLine();

// 接收使用者輸入
//System.out.print("請輸入英文名: ");

// 存下使用者輸入的英文名
//userData[1] = bf.readLine(); 

// 接收使用者輸入
//System.out.print("請輸入生日: ");

// 存下使用者輸入的生日
//userData[2] = bf.readLine(); 

// 接收使用者輸入
//System.out.print("請輸入電話: ");

// 存下使用者輸入的電話
//userData[3] = bf.readLine(); 

// 接收使用者輸入
//System.out.print("請輸入地址: ");

// 存下使用者輸入的地址
//userData[4] = bf.readLine(); 

//輸出資料讓填寫者確認
//System.out.println("您輸入的姓名："+userData[0] + ", 英文名：" +userData[1]+", 生日："+userData[2]+", 電話："+userData[3]+", 地址："+userData[4]);
//以格式化方式撰寫 用printf
//System.out.printf("您輸入的姓名：%s, 英文名：%s, 生日：%s, 電話：%s, 地址：%s",userData[0],userData[1],userData[2],userData[3],userData[4] );

//}   
//}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
/*建立二維陣列 */
//public class App {
/* 筆記，註解  */
//public static void main(String[] args) throws Exception {
//String[][] userDatas = new String[3][];

//userDatas[0]=new String[5]; // 建立內層的陣列

//userDatas[0][0]="姓名";
//userDatas[0][1]="英文名";
//userDatas[0][2]="生日";
//userDatas[0][3]="電話";
//userDatas[0][4]="住址";

//userDatas[1]=new String[5]; // 建立內層的陣列

//userDatas[1][0]="艾莎";
//userDatas[1][1]="Elsa";
//userDatas[1][2]="20101212";
//userDatas[1][3]="0912345678";
//userDatas[1][4]="冰雪王國";

//userDatas[2]=new String[5]; // 建立內層的陣列

//userDatas[2][0]="白露";
//userDatas[2][1]="White";
//userDatas[2][2]="19960714";
//userDatas[2][3]="0945678123";
//userDatas[2][4]="蘇瀾鎮";     

//System.out.println( Arrays.toString(userDatas[0])  );
//System.out.println( Arrays.toString(userDatas[1])  );
//System.out.println( Arrays.toString(userDatas[2])  );
//}
//}

/*無窮迴圈與字串的equals()方法
while(true)為一個無窮迴圈
break為迴圈專用指令，用來中斷迴圈執行
equals()為字串方法，用來比較字串，如果一樣的話會回得到true，反之為false。 */

//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//public class App {
/* 筆記，註解  */
//public static void main(String[] args) throws Exception {
//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
// 無窮迴圈
//while(true) {
//System.out.print("請問餵食蘇瀾鎮上的哪隻寵物可獲得深夜食堂的稱號: ");
//String userInput = bf.readLine();

// 比對userInput字串是不是quit
//System.out.println(  userInput.equals("大可")   );

// 比對使用者輸入的字串是否為"裡面的詞語"
//if(     userInput.equals("大可")  )
//break; // 結束迴圈
//}

//}   
//}

/*寫一學生成績管理方式 可儲存姓名、學號、國文、英文、數學成績 上限10筆 每輸入完一筆 詢問是否繼續輸入 Y=繼續 N=結束 結束後將陣列資料顯示在畫面上*/
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;

//public class App {
/* 筆記，註解  */
//public static void main(String[] args) throws Exception {

//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

//String[][] database = new String[10][5];

//int index = 0;

//while (true){ 
//System.out.print("請輸入姓名: ");
//database[index][0]=bf.readLine();

//System.out.print("請輸入學號: ");
//database[index][1]=bf.readLine();

//System.out.print("請輸入國文成績: ");
//database[index][2]=bf.readLine();

//System.out.print("請輸入英文成績: ");
//database[index][3]=bf.readLine();

//System.out.print("請輸入數學成績: ");
//database[index][4]=bf.readLine();   

//index++;
//if(index>=10)
//break;

//System.out.println("請問還要繼續嗎(Y=繼續，N=結束)？");
//if(bf.readLine().equals("N"))
//break;
//}

//index=0;
//while(true){
//System.out.println(Arrays.toString(database[index]));
//index++;
//if(index>=10)
//break;
//}

//System.out.println("程式結束");
//}
//}

/*for迴圈    for(int (初始變數);(條件式);(變化)) */ //從1加到10
//public class App {
/* 筆記，註解  */
//public static void main(String[] args) throws Exception {
//int sum=0;
//for(int i=1;i<=10; i++) 
//sum+=i;
//System.out.println(sum);
//}
//}

/*輸入己就算出該數的階乘*/
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//public class App {
    /* 筆記，註解  */
    //public static void main(String[] args) throws Exception {
        
        //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("請輸入您欲計算的數字階乘: ");
        //String userInput = input.readLine();
        //int num=Integer.parseInt(userInput);
        //int sum=1;
        //for(int first=1;first<=num; first++) {
            //sum=sum*first;
            //}
    //System.out.println(sum);
//}
//}


/*判斷某數是奇數還是偶數 */
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

//public class App {
    /* 筆記，註解  */
    //public static void main(String[] args) throws Exception {
        
        //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("請輸入您欲判斷的數字: ");
         //String userInput = input.readLine();
         //int num=Integer.parseInt(userInput);
        //if(num%2==1)
        //System.out.println("此數是奇數");
        //else
        //System.out.println("此數是偶數");
        //}
        
    //}


    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import java.util.Arrays;

import com.opencsv.CSVReader;
public class App {
    public static void main(String[] args) throws Exception {
        // Ubike OpenData 網址
        final String openDataUrl = "https://data.tycg.gov.tw/api/v1/rest/datastore/a1b4714b-3b75-4ff8-a8f2-cc377e4eaa0f?format=csv&limit=1000";
        
        // 建立URL物件
        URL ubikeUrl = new URL(openDataUrl);

        // 開始連線，並取得連線用的物件
        HttpURLConnection connection = (HttpURLConnection)ubikeUrl.openConnection();

        // 200代表連線成功
        if(connection.getResponseCode() == 200) {
            System.out.println("連線成功");

            // 建立讀取網頁/CSV資料的物件
            InputStreamReader isr = new InputStreamReader(connection.getInputStream(), "UTF-8");

            // 建立CSVReader物件來解析CSV格式資料
            CSVReader csvReader = new CSVReader(isr);

            String[] row = csvReader.readNext();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("請輸入站名: ");
            String userInput = br.readLine();

            while( (row = csvReader.readNext()) != null) {
                // System.out.println(Arrays.toString(row));

                if(row[3].indexOf(userInput) != -1) {
                    System.out.printf("站名: %s, 地址: %s\n", row[3], row[6]);
                    System.out.printf(" - 可借: %s\n", row[12]);
                    System.out.printf(" - 可還: %s\n", row[5]);
                    System.out.printf(" - 總數: %s\n\n", row[10]);
                }
            }
 
            // 用完要呼叫close關閉連線
            csvReader.close();
        } else {
            System.out.println("連線失敗");
        }

    }   
}