package main;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("c:\\rpgsave.dat", true);
    fw.write('A');
    fw.flush();
    fw.close();
  }
}

