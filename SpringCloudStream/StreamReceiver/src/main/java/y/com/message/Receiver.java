package y.com.message;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


@EnableBinding(Sink.class)
public class Receiver {
    @StreamListener(Sink.INPUT)
    public void receive(String payload){
        System.out.println(payload);
    }
}
