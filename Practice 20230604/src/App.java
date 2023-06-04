import Toyota.SportCar;
import Toyota.Truck;

public class App {
    // 程式進入點
    public static void main(String[] args) throws Exception {
        SportCar sportCar = new SportCar("紅色", 20);
        sportCar.start();
        sportCar.run();
        sportCar.show();
        sportCar.trubo();

        Truck truck = new Truck("藍色", 50);
        truck.start();
        truck.run();
        truck.show();
        truck.release();

        System.out.println(sportCar.toString());
        System.out.println(truck.toString());

        SportCar sportCar2 = new SportCar("紅色", 20);
        if (sportCar.equals(sportCar2) == true) {
            System.out.println("兩輛車一樣");
        } else {
            System.out.println("兩輛車不一樣");
        }
    }
}
