package SBS_Labs;

import java.io.*;
import java.util.*;

public class DisplayInfo {
	public static void main(String[] args) {
		String strFileName = "src/SBS_Labs/twograde.csv";
		
		/*
		 * BufferedReader �씠�슜�빐�꽌 twograde.csv �뙆�씪�쓣 遺덈윭�샂. 
		 */
		try {
			Reader reader = new InputStreamReader(new FileInputStream(strFileName),"euc-kr");
			BufferedReader br = new BufferedReader(reader);
			try {
				String strTemp;//�뙆�씪�쓽 �븘�뱶�뿉 �빐�떦�븯�뒗 遺�遺꾩쓣 �뿬怨쇳븯湲� �쐞�빐 �궗�슜�븯�뒗 蹂��닔.
				int nLine = 0;
				while((strTemp = br.readLine())!=null) {
					nLine++;
				}
				br.close();
				reader.close();
				
				int nStudent = nLine-1;//�븘�뱶瑜� 類� �쟾泥댁쓽 �뻾�쓽 �젙�솗�븳 媛쒖닔瑜� 留뚮벉;
				
				GIS[] oneStudent = new GIS[nStudent];
				FileInputStream fin = new FileInputStream(strFileName);
				Scanner scan = new Scanner(fin);//�뙆�씪�쓣 �뒪�듃由� �떒�쐞濡� �엯�젰 諛쏅뒗 �뒪罹먮꼫;
				strTemp = scan.nextLine();//�젣紐� 遺�遺꾩쓣 洹쇱빞 �씫怨� 吏��굹媛�寃� �닔�젙�븿. 援щ텇�옄瑜� 肄ㅻ쭏濡� 吏��젙�븯怨� �뀕 �뀖�꽩 以� �씫怨� 洹� 媛믪쓣 ���옣�븷 諛곗뿴�쓣 �꽑�뼵�븳�떎.
				String csvSplitsBy = ",";
				String[] strLineArray;// �븳 以꾩쓣 肄ㅻ쭏濡� 援щ텇�븯怨� 諛곗뿴�쓣 遺꾨━�븯�뒗 蹂��닔.
				//�뙆�씪�쓣 �떎�떆 �씫�뼱  GIS[] 諛곗뿴 媛앹껜 �슂�냼�뿉 �븰怨�,�븰�뀈,�븰踰�,�꽦紐�,嫄곗＜吏��뿭,�씠硫붿씪�쓣 �븷�떦�븿.
				for(int i=0;i<=28;i++) {
					// �뒪罹먮꼫瑜� next�떆�궓�떎.
					if(scan.hasNextLine()) {//scan�맂 �뻾�떒�쐞 媛믪씠 �젙�쓽�맂�떎硫�.
						// �븰怨� �븰�뀈 �븰踰� �꽦紐� 嫄곗＜吏��뿭 �씠硫붿씪濡� ���옣�븳�떎.
						strTemp = scan.nextLine();
						strLineArray = strTemp.split(csvSplitsBy);
						String strDepartment = strLineArray[0];//�븰怨�
						String nGrade = strLineArray[1];//�븰�뀈
						String strId = strLineArray[2];// �븰踰�
						String strName = strLineArray[3];//�씠由�
						String strAddress = strLineArray[4];// 嫄곗＜吏��뿭
						String strEmail = strLineArray[5];//�씠硫붿씪;
						System.out.println(strDepartment);
						System.out.println(nGrade);
						System.out.println(strId);
						System.out.println(strName );
						System.out.println(strAddress );
						System.out.println(strEmail);
						//ms-949로 수정할것.
						//객체 배열에 담기
						oneStudent[i] = new GIS(nGrade,strId,strName,strAddress,strEmail);
						oneStudent[i].SetDepartment(strDepartment);
						
					}
				}
				//스트림을 닫는당.
				scan.close();
				fin.close();
 				
				//System.out.println(nLine);
				/*
				 *�뙆�씪�쓣 �쟾泥댁쟻�쑝濡� �씫�뼱�꽌 �뜲�씠�꽣�쓽 媛쒖닔媛� 紐뉕컻�씤吏�瑜� �뙆�븙�븳�떎.
				 *GIS諛곗뿴 媛앹껜瑜� �븰�깮 �닔 留뚰겮 �깮�꽦�븳�떎.
				 *Scanner �씠�슜�븯�뿬�꽌 �뙆�씪�쓣 �떎�떆 �씫�뼱�궡硫댁꽌 �븳以꾨떒�쐞瑜�(肄ㅻ쭏) 湲곗��쑝濡� �뿴�떒�쐞 �븘�뱶瑜� 諛곗뿴濡� �깮�꽦�븳�떎.
				 */
				
			}catch(Exception e) {
				
			}
		}catch(Exception e) {
			
		}
		
	}
}
