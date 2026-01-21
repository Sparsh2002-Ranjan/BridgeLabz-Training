package jasonpractice;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JSONToXML {

    public static void main(String[] args) throws Exception {

        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        JsonNode jsonNode = jsonMapper.readTree(new File("user.json"));

        String xml = xmlMapper.writerWithDefaultPrettyPrinter()
                              .writeValueAsString(jsonNode);

        System.out.println(xml);

        xmlMapper.writerWithDefaultPrettyPrinter()
                 .writeValue(new File("user.xml"), jsonNode);
    }
}

