package y.com.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import y.com.channel.TestChannel;

@EnableBinding({TestChannel.class})
public class Sender {

    @Autowired
    TestChannel channel;

    public void sendMessage(){
        channel.out().send(MessageBuilder.withPayload("nihao").build());
    }
}
