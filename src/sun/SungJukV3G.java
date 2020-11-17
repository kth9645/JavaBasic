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


public class SungJukV3G {
    public static void main(String[] args) {


        String name[] = new String[3];
        // int kor,eng,mat,sum,mean,grd; // kor = 국, eng=영, mat=수 , sum=합계 , mean=평균, grd=?

        int kor[] = new int[3];
        int eng[] = new int[3];
        int mat[] = new int[3];

        int sum[] = new int[3];

        double mean[] = new double[3];

        char grd[] = new char[3];


        String fmt = "이름 : %s \n국어 : %d \n영어 : %d \n수학 : %d \n총점 : %d \n평균 : %s \n학점 : %c \n";


        Scanner sc = new Scanner(System.in); // Scanner scanner = new Scanner(System.in);

        for(int i = 0 ; i<3 ; i++) {

            System.out.print((i + 1) + "번째 학생 이름을 입력하시오 : ");
            name[i] = sc.nextLine();

            System.out.print("국어점수를 입력하시오 : ");
            kor[i] = sc.nextInt();
            System.out.print("영어점수를 입력하시오 : ");
            eng[i]= sc.nextInt();
            System.out.print("수학점수를 입력하시오 : ");
            mat[i] = sc.nextInt();

            sc.skip("\r\n|[\n\r]");
            
            //수학성적 입력시 같이 입력된 enter 키가
            //다음 데이터(이름) 입력시 입력값으로 자동으로 전달됨
            //그러한 상황을 해결하기 위해 미리 엔터키를 제거하는 코드 삽입

            // 만약 skip 을 쓰고 싶지않다면, mat[i] = Integer.parseInt(sc.nextLine());
            // 를 사용하여, 애초에 문자열로 형변환하여 받는 방법도 있다.

            sum[i] = kor[i]+eng[i]+mat[i];
            mean[i] = (double)sum[i] / 3;

            switch ((int)(mean[i]/10)) {
                case 10:
                    if(mean[i]==100) {
                        grd[i] = '만';
                        System.out.println("당신은 만점입니다.");
                        break;
                    }
                case 9: grd[i] = '수'; break;
                case 8: grd[i] = '우'; break;
                case 7: grd[i] = '미'; break;
                case 6: grd[i] = '양'; break;
                default:
                    if(mean[i]<0 || mean[i]>100) {
                        grd[i] = '오';
                        System.out.println("오류입니다.");
                    }
                    else {
                        grd[i] = '가';
                    }
                    break;
            }

            System.out.println("==========================================================");
        }




        //String.format(형식지정자, 변수들)
        //mean = Double.parseDouble(String.format("%.1f",mean));
        // 실수 처리기.. 실제 사용밥법은 애매

        //mean = Double.parseDouble(String.format("%.1f",mean));
        //아예 형식을 이것으로 고정한다는 의미.


        //결과출력

        for(int i = 0 ; i<3 ; i++)
        {
         System.out.printf(fmt, name[i], kor[i], eng[i], mat[i], sum[i], mean[i], grd[i]);
         System.out.println("==========================================================");
        }


    }

}
