package fr.adamaq01.agones4j;

/**
 * @author Adamaq01 (Adam THIBERT)
 */
public class Application {

    public static void main(String[] args) throws InterruptedException {
        AgonesSDK agonesSDK = new AgonesSDK();
        agonesSDK.gameServer().thenAccept(System.out::println);
        agonesSDK.ready().thenAccept(aBoolean -> agonesSDK.watchGameServer(System.out::println));
        Thread.sleep(2000);
        agonesSDK.setLabel("test", "test");
    }
}
