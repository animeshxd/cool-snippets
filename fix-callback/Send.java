import java.util.concurrent.CompletableFuture;

public class Send {
    public CompletableFuture<Object> newSend(Object request) {
      // Create a CompletableFuture to hold the result
      CompletableFuture<Object> future = new CompletableFuture<>();

      // Call the send() function and provide a callback to set the result
      _send(request, (Object result) -> {
        future.complete(result);
      });

      // Return the CompletableFuture
      return future;
    }
}

