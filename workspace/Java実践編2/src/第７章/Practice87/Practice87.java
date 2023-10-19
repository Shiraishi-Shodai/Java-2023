package 第７章.Practice87;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Practice87 {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode root = mapper.readTree(new File("kbc.json"));
		JsonNode cls,stu;
		cls = root.get("class1");//①インスタンスrootよりclass1キーの内容を取得する
		System.out.printf("クラス名:%s%d年\n",cls.get("name").textValue(),cls.get("grade").intValue()); //②インスタンスclsよりnameキーの値とgradeキーの値を表示する);
		System.out.printf("担任:%s\n",cls.get("teacher").textValue()); //③インスタンスclsよりteacherキーの値を表示する);
		stu = cls.get("student1");//④インスタンスclsよりstudent1キーの内容を取得する
		System.out.printf("出席番号:%d 氏名:%s\n", stu.get("no").intValue(),stu.get("name").textValue());//⑤インスタンスstuよりnoキーの値とnameキーの値を表示する);	
		stu = cls.get("student2");//⑥インスタンスclsよりstudent2キーの内容を取得する
		System.out.printf("出席番号:%d 氏名:%s\n", stu.get("no").intValue(),stu.get("name").textValue()); //⑦インスタンスstuよりnoキーの値とnameキーの値を表示する);	
	}
}
