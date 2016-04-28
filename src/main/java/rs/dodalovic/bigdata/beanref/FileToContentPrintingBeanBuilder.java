package rs.dodalovic.bigdata.beanref;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileToContentPrintingBeanBuilder extends RouteBuilder {

    @Autowired
    MyFileProcessor myFileProcessor;

    @Override
    public void configure() throws Exception {
        from("file:/home/dodalovic/Desktop/folder?fileName=file.txt")
                .bean(myFileProcessor);
    }
}