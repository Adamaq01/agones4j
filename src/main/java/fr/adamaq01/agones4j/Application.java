package fr.adamaq01.agones4j;

/**
 * @author Adamaq01 (Adam THIBERT)
 */
public class Application {

    public static void main(String[] args) {
        AgonesSDK agonesSDK = new AgonesSDK();
        System.out.println("Ready: " + agonesSDK.ready().join());
    }
}
