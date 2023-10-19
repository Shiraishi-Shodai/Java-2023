
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectEmployees {
  public static void main(String[] args) {
    // JDBCドライバを読み込む
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        throw new IllegalStateException("JDBCドライバを読み込めませんでした");
    }	  
    // データベースに接続
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/dokotsubu", "root", "pathSQL")) {
    	
      // SELECT文を準備
      String sql = "SELECT NAME, TEXT FROM MUTTERS";
      PreparedStatement pStmt = conn.prepareStatement(sql);

      // SELECTを実行し、結果表（ResultSet）を取得
      ResultSet rs = pStmt.executeQuery();

      // 結果表に格納されたレコードの内容を表示
      while (rs.next()) {
        String id = rs.getString("NAME");
        String name = rs.getString("TEXT");

        // 取得したデータを出力
        System.out.println("ID:" + id);
        System.out.println("名前:" + name);
      }
    } catch (SQLException e) {
    	System.out.println("エラーだよ");
     // e.printStackTrace();
    }
  }
}