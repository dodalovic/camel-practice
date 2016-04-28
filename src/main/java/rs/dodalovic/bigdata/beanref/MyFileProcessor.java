package rs.dodalovic.bigdata.beanref;

import org.apache.camel.Handler;
import org.apache.camel.Message;

public class MyFileProcessor {
    @Handler
    public void process(Message message) {
        String fileContent = new String(message.getBody(byte[].class));
        System.out.println(fileContent);
    }
}
