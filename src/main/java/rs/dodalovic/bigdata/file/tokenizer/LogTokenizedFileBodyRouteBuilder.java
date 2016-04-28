package rs.dodalovic.bigdata.file.tokenizer;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class LogTokenizedFileBodyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:/home/dodalovic/Desktop/folder?fileName=filebig.txt")
                .split(body().tokenize("\r\n"))
                .log("${body}");
    }
}