package rs.dodalovic.bigdata.beanref;

import org.apache.camel.Exchange;

public class MyFileProcessor {
    public void process(Exchange exchange) {
        final byte[] bytes = exchange.getIn().getBody(byte[].class);
        String fileContent = new String(bytes);
        System.out.println(fileContent);
    }
}
