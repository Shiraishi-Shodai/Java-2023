package 第７章.Practice88;
import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
public class Practice88{
	public static void main(String[]args) throws Exception{

				ObjectMapper mapper = new ObjectMapper();
				JsonFileData file = mapper.readValue(new File("kbc.json"), JsonFileData.class);
				
				System.out.printf("クラス名:%s%d年\n",file.class1.name,file.class1.grade); //⑥キーclass1のクラス名と学年を表示する);
				System.out.printf("担任:%s\n",file.class1.teacher);//⑦キーclass1の担任名を表示する);
				System.out.printf("出席番号:%d 氏名:%s\n",file.class1.student1.no,file.class1.student1.name); //⑧キーclass1内のstudent1の出席番号と氏名を表示する);	
				System.out.printf("出席番号:%d 氏名:%s\n\n",file.class1.student2.no,file.class1.student2.name);//⑨キーclass1内のstudent1の出席番号と氏名を表示する);	
				
				System.out.printf("クラス名:%s%d年\n",file.class2.name,file.class2.grade); //⑩キーclass2のクラス名と学年を表示する);
				System.out.printf("担任:%s\n",file.class2.teacher); //⑪キーclass2の担任名を表示する);
				System.out.printf("出席番号:%d 氏名:%s\n",file.class2.student1.no,file.class2.student1.name); //⑫キーclass2内のstudent2の出席番号と氏名を表示する);	
				System.out.printf("出席番号:%d 氏名:%s\n\n",file.class2.student2.no,file.class2.student2.name); //⑬キーclass2内のstudent2の出席番号と氏名を表示する);	
			}
		}

