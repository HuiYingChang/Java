public class App {
    public static void main(String[] args) throws Exception {
        World world = new World.getInstance();

        World.start();

        World world2 = World.getInstance();
        World2.start();
    }
}
