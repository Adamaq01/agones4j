# Agones4J

##### Agones4J is a Java Game Server Client SDK for Agones (https://agones.dev/) that uses the exposed REST API of Agones

****

## Example

Here is a simple example of marking the GameServer as ready and then adding a label to it.

```Java
// Instantiate a new SDK with the default port and URL
AgonesSDK agones = new AgonesSDK();

// Mark the server as ready
agones.ready().thenAccept(success -> {
    // Then add a label
    agones.setLabel("my-label", "dummy").thenAccept(success2 -> {
        System.out.println(success2 ? "Successfully set the label :D" : "It didn\'t work :(");
    });
});
```

****

##### Feel free to contribute to the project ;)