package sun;

import java.util.Scanner;

/**
 *  파일명 : SungJukV3
 *  작성일 : 2020.11.17
 *
 *  프로그램 설명 : 성적처리프로그램 v3
 *
 *
 *  이름,국어,영어,수학
 *  학생 3명의 성적 데이터를 키보드로 입력받아
 *  총점,평균,학점을 계산하고 결과 출력
 *
 *  단, 평균은 소수점 첫째 자리까지 출력하고
 *  단, 학점기준은 '수우미양가'로 하되 Switch 문으로
 *
 *  만점은 100점으로, 100~90, 89~80, 79~70, 69~60, 59~0
 *  name, kor, eng, mat, sum, mean, grd
 *
 *  삼항연산자 : (조건식) ? 참일때 결과값 : 거짓일때 결과값
 */


public class SungJukV3 {
    public static void main(String[] args) {


        String[] name = new String[3];
        // int kor,eng,mat,sum,mean,grd; // kor = 국, eng=영, mat=수 , sum=합계 , mean=평균, grd=?

        int[][] jum = new int[3][3];

        int sum[] = new int[3];

        double mean[] = new double[3];

        char grd;

        String fmt = "이름 : %s \n국어 : %d \n영어 : %d \n수학 : %d \n총점 : %d \n평균 : %s \n학점 : %c";
        String result;


        Scanner sc = new Scanner(System.in); // Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i<3 ; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print((i+1)+"번째 학생 이름을 입력하시오 : ");
            name[i] = sc1.nextLine();

            for(int j = 0 ; j<3 ; j++) {
                Scanner sc2 = new Scanner(System.in);
                System.out.print((j+1)+"번째 점수를 입력하시오(국어[1],영어[2],수학[3]) : ");
                jum[i][j] = sc2.nextInt();
            }
            System.out.println("==========================================================");
        }


        for(int i = 0 ; i<3 ; i++) {
            for(int j = 0 ; j<3 ; j++) {
                sum[i] += jum[i][j];
            }
            mean[i] = (double)sum[i] / 3;
        }


        //String.format(형식지정자, 변수들)
        //mean = Double.parseDouble(String.format("%.1f",mean));
        // 실수 처리기.. 실제 사용밥법은 애매

        //mean = Double.parseDouble(String.format("%.1f",mean));
        //아예 형식을 이것으로 고정한다는 의미.


        //결과출력

        for(int i = 0 ; i<3 ; i++)
        {
            System.out.println("학생이름 : "+name[i]);
            System.out.println("국어점수 : "+jum[i][0]);
            System.out.println("영어점수 : "+jum[i][1]);
            System.out.println("수학점수 : "+jum[i][2]);
            System.out.println("총점 : "+sum[i]);
            System.out.println("평균 : "+mean[i]);
            System.out.println("=========================================");
        }


    }

}
