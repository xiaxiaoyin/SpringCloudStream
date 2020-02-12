package y.com.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TestChannel {
     String Topic="input";

    @Output(TestChannel.Topic)
    MessageChannel out();
}
