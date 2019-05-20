package io.swagger.client.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JackJsonUtils {

	private static ObjectMapper om;
	static {
		om = new ObjectMapper();
	}
	public static ObjectNode getNewNode() {
		return om.createObjectNode();
	}
	public static String entityToStringJson (Object entity) throws JsonProcessingException {
		return om.writeValueAsString(entity);
	}
	public static ObjectNode entityToObjectNode (Object entity) {
		return om.convertValue(entity, ObjectNode.class);
	}
	public static <T> T  objectNodeToEntity (ObjectNode node, Class<T> clazz) {
		return om.convertValue(node, clazz);
	}
	public static ArrayNode listEntityToArrayNode(List<?> list ) {
		return om.valueToTree(list);
	}
	public static ObjectNode jsonStringToObjectNode (String jsonString ) throws JsonParseException, JsonMappingException, IOException {
		return om.readValue(jsonString, ObjectNode.class);
	}
	public static JsonNode inputStreamToJsonNode(InputStream body) throws IOException {
		return om.readTree(body);
	}
	public static <T> T jsonStringToEntity(String jsonString, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
		return om.readValue(jsonString, clazz);
	}
}
