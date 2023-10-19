package 第７章.jsoncheck;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Main {
  public static void main(String[] args) throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode root = mapper.readTree(new File("kbc.json"));
    JsonNode hero = root.get("hero");
    JsonNode weapon = hero.get("weapon");
    System.out.println("名前:" + hero.get("name").textValue());
    System.out.println("武器:" + weapon.get("name").textValue());
  }
}
