package jasonpractice;

import java.io.File;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSON {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode json1 = mapper.readTree(new File("user.json"));
        JsonNode json2 = mapper.readTree(new File("user-s.json"));

        ObjectNode merged = mapper.createObjectNode();

        merge(merged, json1);
        merge(merged, json2);

        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("merge.json"), merged);
    }

    private static void merge(ObjectNode target, JsonNode source) {
        Iterator<Map.Entry<String, JsonNode>> fields = source.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> entry = fields.next();
            target.set(entry.getKey(), entry.getValue());
        }
    }
}
