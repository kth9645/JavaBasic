package sun;

import java.util.Scanner;

/**
 *  파일명 : SungJukV6Main
 *  작성일 : 2020.11.23
 *
 *  프로그램 설명 : 성적처리프로그램 v6
 *  중간고사와 기말고사 성적처리프로그램을 만들려고 함
 *  SungJukV1을 토대로 중간고사 성적과 기말고사 성적 클래스를
 *  상속을 이용해서 작성하세요
 * 
 *  중간고사 MidSungJuk : 국어 kor,영어 eng,수학 mat
 *  기말고사 FinalSungJuk : 국어,영어,수학, 미술 art,과학 sci
 *  성적처리 : ComputeSungJuk
 *  결과출력 : PrintSungJuk
 */

public class SungJukV6Main {

    public static void main(String[] args) {

        MidSungJuk msj = new MidSungJuk();

        msj.readSungJuk();
        msj.computeSungJuk();
        msj.printSungJuk();

        System.out.println("==============================================");

        // MidSungJuk fsj = new FinalSungJuk();  //묵시적 클래스 형변환과 메서드 재정의로 사용가능
        FinalSungJuk fsj = new FinalSungJuk();

        fsj.readSungJuk();
        fsj.computeSungJuk();
        fsj.printSungJuk();
    }

}

class MidSungJuk {
    protected String name;
    // int kor,eng,mat,sum,mean,grd; // kor = 국, eng=영, mat=수 , sum=합계 , mean=평균, grd=학점

    protected int kor;
    protected int eng;
    protected int mat;

    protected int sum;
    protected double mean;
    protected char grd;

    public MidSungJuk() { }

    public MidSungJuk(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;

        // sum = 0;
        // mean = 0.0;
        // grd = '가';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    protected void readSungJuk()
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("이름을 입력하시오 : ");
        name = sc.nextLine();

        System.out.printf("국어 점수를 입력하시오 : ");
        kor = sc.nextInt();

        System.out.printf("영어 점수를 입력하시오 : ");
        eng = sc.nextInt();

        System.out.printf("수학 점수를 입력하시오 : ");
        mat = sc.nextInt();
    }

    protected void computeSungJuk()
    {
        sum = kor+eng+mat;
        mean = (double)sum/3;

        switch ((int)(mean/10)) {
            case 10:
                if(mean==100) {
                    grd = '만';
                    System.out.println("당신은 만점입니다.");
                }
                else {
                    grd = '오';
                    System.out.println("오류입니다.");
                }
                break;
            case 9:
                grd = '수';
                break;
            case 8:
                grd = '우';
                break;
            case 7:
                grd = '미';
                break;
            case 6:
                grd = '양';
                break;
            case 5:
                grd = '가';
                break;
            default:
                grd = '오';
                System.out.println("오류입니다.");
                break;

        }
    }

    protected void printSungJuk()
    {
        String fmt = "이름 : %s\n국어 :%d\n영어 : %d\n"+ "수학 : %d\n총점 : %d\n평균 %.1f\n"+"학점 : %c";
        String result = String.format(fmt, name,kor,eng,mat,sum,mean,grd);

        System.out.println(result);

    }
}

class FinalSungJuk extends MidSungJuk{
    protected int art;
    protected int sci;

    public FinalSungJuk() {
    }

    public FinalSungJuk(String name, int kor, int eng, int mat, int art, int sci) {
        super(name, kor, eng, mat); // 부모클래스에 정의된 멤버변수 초기화 코드를 super 라는 이름으로 치환해서 호출
        // super(생성자의 매개변수 목록)
        // this.name = name;
        // this.kor = kor;
        // this.eng = eng;
        // this.mat = mat;
        this.art = art;
        this.sci = sci;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    @Override
    protected void readSungJuk() {
        // 부모클래스에 정의된 성적 입력코드를
        // super 라는 이름으로 치환해서 호출한 것
        // => super.메서드이름()
        super.readSungJuk();

        Scanner sc = new Scanner(System.in);
        System.out.printf("미술 점수를 입력하세요 : ");
        art = sc.nextInt();
        System.out.printf("과학 점수를 입력하세요 : ");
        sci = sc.nextInt();
    }

    @Override
    protected void computeSungJuk() {
        
        // 부모클래스에 정의된 총점 변수를
        // super 라는 이름으로 치환해서 호출한 것
        // super.멤버변수명[ex) super.sum]
        // super.computeSungJuk();
        // sum = super.sum + sci +art;

        sum = kor+eng+mat+art+sci;
        mean = (double)sum/5;

        switch ((int)(mean/10)) {
            case 10:
                if (mean == 100) {
                    grd = '만';
                    System.out.println("당신은 만점입니다.");
                } else {
                    grd = '오';
                    System.out.println("오류입니다.");
                }
                break;
            case 9:
                grd = '수';
                break;
            case 8:
                grd = '우';
                break;
            case 7:
                grd = '미';
                break;
            case 6:
                grd = '양';
                break;
            case 5:
                grd = '가';
                break;
            default:
                grd = '오';
                System.out.println("오류입니다.");
                break;
        }// 스위치문 끝
    }

    @Override
    protected void printSungJuk() {
        String fmt = "이름 : %s\n국어 :%d\n영어 : %d\n"+"수학 : %d\n미술 : %d\n과학 : %d\n"+"총점 : %d\n평균 %.1f\n"+"학점 : %c";
        String result = String.format(fmt, name,kor,eng,mat,art,sci,sum,mean,grd);

        System.out.println(result);
    }
}

//알트+인서트  = 컨스트럭트,겟셋
//컨트롤+스페이스 = 프로텍티드 ,,,
//컨트롤+B = 참조