package sun;

import java.util.Scanner;

/**
 *  파일명 : SungJukV2
 *  작성일 : 2020.11.17
 *
 *  프로그램 설명 : 성적처리프로그램 v2
 *  이름,국어,영어,수학
 *  총점,평균,학점을 계산하고 결과 출력
 *
 *  단, 평균은 소수점 첫째 자리까지 출력하고
 *  단, 학점기준은 '수우미양가'로 하되
 *  Switch 문으로
 *
 *  만점은 100점으로, 100~90, 89~80, 79~70, 69~60, 59~0
 *  name, kor, eng, mat, sum, mean, grd
 *
 *  삼항연산자 : (조건식) ? 참일때 결과값 : 거짓일때 결과값
 */


public class SungJukV2 {
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
        System.out.println("국어 : " + kor);  //
        System.out.printf("영어 : %d \n",eng);
        System.out.println("수학 : " + mat);

        sum = kor+eng+mat;
        mean = (double)sum/3;

        System.out.printf("총점 : %d \n",sum);
        System.out.printf("평균 : %.1f \n",mean);

        /*grd = (mean>=90 && mean<=100) ? '수' :
                (mean>=80 && mean<90) ? '우' :
                        (mean>=70 && mean<80) ? '미' :
                                (mean>=60 && mean<70) ? '양' :
                                        (mean>=0 && mean<60) ? '가' : '오';

        switch (grd) {
            case '수':
                System.out.println("당신의 학점은 : "+grd);
                break;
            case '우':
                System.out.println("당신의 학점은 : "+grd);
                break;
            case '미':
                System.out.println("당신의 학점은 : "+grd);
                break;
            case '양':
                System.out.println("당신의 학점은 : "+grd);
                break;
            case '가':
                System.out.println("당신의 학점은 : "+grd);
                break;
            case '오':
                System.out.println("오류입니다.");
                break;

        }*/
        switch ((int)mean/10) {
            case 10:
                grd = '만';
                System.out.println("당신은 만점입니다.");
                break;
            case 9:
                grd = '수';
                System.out.println("당신의 학점은 : "+grd);
                break;
            case 8:
                grd = '우';
                System.out.println("당신의 학점은 : "+grd);
                break;
            case 7:
                grd = '미';
                System.out.println("당신의 학점은 : "+grd);
                break;
            case 6:
                grd = '양';
                System.out.println("당신의 학점은 : "+grd);
                break;
            case 5:
                grd = '가';
                System.out.println("당신의 학점은 : "+grd);
                break;
            default:
                System.out.println("오류입니다.");
                break;

        }



    }

}
