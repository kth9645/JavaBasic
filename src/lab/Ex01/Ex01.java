package lab.Ex01;

public class Ex01 {
    public static void main(String[] args) {
        // 학생 클래스를 이용해서 객체생성
        Student kim = new Student();
        // 학과 클래스를 이용해서 객체생성
        Hnote com = new Hnote();
        // 과목 클래스를 이용해서 객체생성
        Note pro = new Note();
        // 교수 클래스를 이용해서 객체생성
        Tic lee = new Tic();
        
        // 각 객체의 변수에 값 대입

        //학생
        kim.hnum = 201350050;
        kim.name = "김태희";
        kim.point = "경기도고양시";
        kim.bday = "1985.3.22";
        kim.hnote = "컴퓨터";
        kim.tic = 504;

        //학과
        com.hnote = "컴퓨터공학";
        com.phnum = "123-4567-8901";
        com.spoint = "E동 2층";
        com.hking = 504;

        //과목
        pro.nnum = "0205";
        pro.nname = "프로그래밍";
        pro.ntxt = "자바 프로그래밍";
        pro.tic = 301;

        //교수
        lee.tnum = 301;
        lee.name = "이순신";
        lee.skll = "프로그래밍";


        // 객체에 저장된 값 출력
        System.out.println("=================학생=================");
        System.out.printf(" 학번 : %d\n 이름 : %s\n 주소 : %s\n 생년월일 : %s\n 학과명 : %s\n 교수 : %d\n",
                kim.hnum ,kim.name ,kim.point ,kim.bday ,kim.hnote ,kim.tic);

        System.out.println("=================학과=================");
        System.out.printf(" 학과명 : %s\n 전화번호 : %s\n 사무실위치 : %s\n 학과장 : %d\n",
                com.hnote, com.phnum, com.spoint, com.hking);

        System.out.println("=================과목=================");
        System.out.printf(" 과목번호 : %s\n 과목명 : %s\n 과목개요 : %s\n 담당교수 : %d\n",
                pro.nnum, pro.nname, pro.ntxt, pro.tic);

        System.out.println("=================교수=================");
        System.out.printf(" 교수번호 : %d\n 이름 : %s\n 전공분야 : %s\n",
                lee.tnum, lee.name, lee.skll);

    }
}
