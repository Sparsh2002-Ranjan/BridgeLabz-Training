package jasonpractice;

import java.io.File;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class ValidateEmailWithSchema {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonData = mapper.readTree(new File("user-s.json"));
        JsonNode schemaNode = mapper.readTree(new File("user-schema.json"));

        JsonSchemaFactory factory =
                JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012);

        JsonSchema schema = factory.getSchema(schemaNode);

        Set<ValidationMessage> errors = schema.validate(jsonData);

        if (errors.isEmpty()) {
            System.out.println("JSON is valid");
        } else {
            for (ValidationMessage msg : errors) {
                System.out.println(msg.getMessage());
            }
        }
    }
}

