package co.com.automationpractice2025.utils;

import co.com.automationpractice2025.models.UserModel;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class UserDataReader {

    private static final String USER_JSON_PATH = "/data/users.json";

    public static UserModel getUser(String userKey) {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream is = UserDataReader.class.getResourceAsStream(USER_JSON_PATH)) {
            JsonNode root = mapper.readTree(is);
            JsonNode node = root.path(userKey);
            return mapper.treeToValue(node, UserModel.class);
        } catch (IOException e) {
            throw new RuntimeException("Could not read user data from JSON", e);
        }
    }
}
