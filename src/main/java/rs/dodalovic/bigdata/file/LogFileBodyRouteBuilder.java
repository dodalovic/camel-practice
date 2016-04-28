package rs.dodalovic.bigdata.file;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class LogFileBodyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/home/dodalovic/Desktop/folder?fileName=file2.txt")
                .log("${body}");
    }
}