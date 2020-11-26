package sun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * SungJukV8Service
 * 성적처리
 *
 */

public class SungJukV8Service extends SungJukV8GenericService {


    // 멤버변수 선언
    // 입력받은 모든 성적데이터를 저장하는 동적배열 변수선언
    List<SungJukVO> sjdata = new ArrayList<>();


    // 이름과 성적데이터를 입력받아
    // 총점, 평균, 학점을 계산한 뒤, 동적배열에 추가함
    @Override
    public void newSungJuk() {
        String name;
        int kor, eng, mat;
        Scanner sc = new Scanner(System.in);

        System.out.printf("이름을 입력하시오 : ");
        name = sc.nextLine();

        System.out.printf("국어 점수를 입력하시오 : ");
        kor = sc.nextInt();

        System.out.printf("영어 점수를 입력하시오 : ");
        eng = sc.nextInt();

        System.out.printf("수학 점수를 입력하시오 : ");
        mat = sc.nextInt();

        // 입력받은 성적데이터를 동적배열에 저장
        SungJukVO sj = new SungJukVO(name, kor, eng, mat, 0, 0, ' ');

        // 총점, 평균, 학점을 계산하는 성적처리
        computeSungJuk(sj);

        // 처리된 성적데이터를 동적배열에 저장
        sjdata.add(sj);

        // 뭔가 겹치는 변수가 있을때 안의 내용을 비우라는 의미
        // sc = null;
        // sj = null;

    } // 뉴 성적 클래스 끝

    
    // 저장된 성적 데이터들 중에서
    // 이름, 국어, 영어, 수학만 뽑아서
    // 번호, 리스트 형태로 출력
    @Override
    public void readSungJuk() {
        String fmt = "이름 : %s, 국어 : %d, 영어 : %d, 수학 %d\n";
        Iterator<SungJukVO> iter = sjdata.iterator();
        
        while(iter.hasNext())
        {
            SungJukVO sj = iter.next();

            System.out.printf(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
        }
    }// 리드 성적 클래스 끝


    // 상세조회 할 학생이름을 입력받아,
    // 이름, 국어, 영어, 수학, 총점, 평균, 학점을 출력

    @Override
    public void readOneSungJuk() {
        String name;
        String fmt = "이름:%s, 국어:%d, 영어:%d, 수학:%d\n" + "총점:%d , 평균:%.1f, 학점:%s\n";
        
        // 상세조회 할 학생 이름받기
        Scanner sc = new Scanner(System.in);
        System.out.print("조회 할 학생이름은? ");
        name = sc.nextLine();
        
        // 입력받은 이름으로 데이터 검색 후 결과출력
        for(SungJukVO sj : sjdata){
            if(sj.getName().equals(name)){
                System.out.printf(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getSum(), sj.getMean(), sj.getGrd());
                break;
            }
        }
    } // 리드 원 성적 클래스 끝




    // 일반적인 클래스는 인터페이스에 정의된 클래스를 전부 선언해야하지만, 추상클래스로 미리 선언함으로써 일부만 선언하여 사용가능.
    //또한, 밑의 새로운 보이드 클래스를 추가해도 상관없다.
    // 성적처리 프로그램 메뉴출력
    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
            .append("성적 처리프로그램 v8\n")
            .append("-------------------\n")
            .append("1. 성적 데이터 입력\n")
            .append("2. 성적 데이터 조회\n")
            .append("3. 성적 데이터 상세조회\n")
            .append("4. 성적 데이터 수정\n")
            .append("5. 성적 데이터 삭제\n")
            .append("0. 프로그램 종료\n")
            .append("-------------------\n")
            .append("원하시는 작업은 ? ");

        System.out.print(sb);

    }// 디스플레이 메뉴 클래스 끝
    public void computeSungJuk(SungJukVO sj){

        sj.setSum(sj.getKor()+sj.getEng()+sj.getMat());
        sj.setMean((double)sj.getSum()/3);

        switch ((int)(sj.getMean()/10)) {
            case 10:
                if(sj.getMean()==100) {
                    sj.setGrd('만');
                    System.out.println("당신은 만점입니다.");
                }
                else {
                    sj.setGrd('오');
                    System.out.println("오류입니다.");
                }
                break;
            case 9:
                sj.setGrd('수');
                break;
            case 8:
                sj.setGrd('우');
                break;
            case 7:
                sj.setGrd('미');
                break;
            case 6:
                sj.setGrd('양');
                break;
            case 5:
                sj.setGrd('가');
                break;
            default:
                sj.setGrd('오');
                System.out.println("오류입니다.");
                break;

        } // 스위치문 끝

    } // 컴퓨트 성적 클래스 끝


}// end
