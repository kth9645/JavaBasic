package sun;

import java.util.Scanner;

/**
 *  파일명 : SungJukV1
 *  작성일 : 2020.11.17
 *
 *  프로그램 설명 : 성적처리프로그램 v1
 *  이름,국어,영어,수학
 *  총점,평균,학점을 계산하고 결과 출력
 *  단, 학점기준은 '수우미양가'로 함
 *  만점은 100점으로, 100~90, 89~80, 79~70, 69~60, 59~0
 *  name, kor, eng, mat, sum, mean, grd
 *
 *  삼항연산자 : (조건식) ? 참일때 결과값 : 거짓일때 결과값
 */


public class SungJukV1 {
    public static void main(String[] args) {


        String name;
        // int kor,eng,mat,sum,mean,grd; // kor = 국, eng=영, mat=수 , sum=합계 , mean=평균, grd=?

        int kor,eng,mat;
        int sum = 0;

        double mean = 0;

        char grd;

        System.out.printf("이름을 입력하시오 : ");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.printf("국어 점수를 입력하시오 : ");
        Scanner scanner1 = new Scanner(System.in);
        kor = scanner.nextInt();

        System.out.printf("영어 점수를 입력하시오 : ");
        Scanner scanner2 = new Scanner(System.in);
        eng = scanner.nextInt();

        System.out.printf("수학 점수를 입력하시오 : ");
        Scanner scanner3 = new Scanner(System.in);
        mat = scanner.nextInt();


        System.out.printf("이름 : %s \n",name);  // println("이름 : " + name);
        System.out.printf("국어 : %d \n",kor);  //
        System.out.printf("영어 : %d \n",eng);
        System.out.printf("수학 : %d \n",mat);

        sum = kor+eng+mat;
        mean = (double)sum/3;

        System.out.printf("총점 : %d \n",sum);
        System.out.printf("평균 : %.1f \n",mean);

        grd = (mean>=90 && mean<=100) ? '수' :
                (mean>=80 && mean<90) ? '우' :
                        (mean>=70 && mean<80) ? '미' :
                                (mean>=60 && mean<70) ? '양' :
                                        (mean>=0 && mean<60) ? '가' : '오';

        System.out.printf("당신의 학점은 : %c \n",grd);
        


    }

}
