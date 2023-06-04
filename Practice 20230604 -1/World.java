public class World {

    private World() {
        System.out.println("建立遊戲世界");
    }
    
    public void start() {
        System.out.println("啟動遊戲");
    }

    private static World world = null;

    public static World getInstance() {
        if(world == null) {
            world = new World();
        }

        return world;
    }
}