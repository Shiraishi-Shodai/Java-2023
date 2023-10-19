package 第７章.XML;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Practice86 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\kbc.xml");
		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is); 
		Element kbc = doc.getDocumentElement();//①いちばん外側のkbcタグを取得 
		System.out.println("学生情報－－－－－－－－");
		//②findChildByTagメソッドを呼ぶ　kbcタグの中からstudentタグを探す
		findChildByTag(kbc,"student");
		System.out.println("教員情報－－－－－－－－");
		//③findChildByTagメソッドを呼ぶ　kbcタグの中からteacherタグを探す
		findChildByTag(kbc,"teacher");
	}

	// 指定された名前を持つタグをすべて見つける
	static void findChildByTag(Element self, String name) throws Exception {
		//kbcタグの中の要素を全てNodeListに格納
		NodeList children = self.getChildNodes(); // すべての子を取得
		for (int i = 0; i < children.getLength(); i++) {
			if (children.item(i) instanceof Element) {
				Element e = (Element) children.item(i);
				if (e.getTagName().equals(name)) { // タグ名を照合
					//④printChildByTagメソッドを呼ぶ　エレメントe(studentタグ)の中からnameタグの内容を表示
					printChildByTag(e,"name");
					//⑤printChildByTagメソッドを呼ぶ　エレメントe(studentタグ)の中からclassタグの内容を表示
					printChildByTag(e,"class");
				}
			}
		}
	}

	// 指定された名前を持つタグの値を表示する
	static void printChildByTag(Element self, String name) throws Exception {
		//studentタグの中の要素を全てNodeListに格納
		NodeList children = self.getChildNodes(); // すべての子を取得
		for (int i = 0; i < children.getLength(); i++) {
			if (children.item(i) instanceof Element) {
				Element e = (Element) children.item(i);
				if (e.getTagName().equals(name)) { // タグ名を照合
					System.out.println(e.getTagName()+" "+e.getTextContent());//⑥引数で受け取ったタグ名と、エレメントe(studentタグ)の中からタグ内容を表示する);	
				}
			}
		}
	}
}
