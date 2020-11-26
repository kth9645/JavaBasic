package semiproject;

import sun.SungJukVO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeV1Service extends EmployeeV1GenericService{

    List<EmployeeVO> emdata = new ArrayList<>();


    @Override
    public void newEmplo() {

        int empno;   // 사번
        String fname;   // 성
        String lname;   // 이름
        String email;   // 이메일
        String phone;   // 핸드폰
        String hdate;   // 입사일
        String jobid;   // 직책
        int sal;        // 연봉
        float comm;     // 인센티브
        String mgrid;   // 상사번호
        String deptid;  // 부서 번호

        // EmployeeVO em = new EmployeeVO(0, " ", " ", " ", " ", " ", " ", 0, 0.0, " ", " ");

        Scanner sc = new Scanner(System.in);

        // System.out.printf("사번을 입력하시오 : ");
        // em.setEmpno(sc.nextInt());


        System.out.printf("사번을 입력하시오 : ");
        empno = Integer.parseInt(sc.nextLine());
        for(EmployeeVO em : emdata){
            if(empno == em.getEmpno()) { empno+=1; }
            else if(empno != em.getEmpno()){ break; }
        }

        System.out.printf("성[first name]을 입력하시오 : ");
        fname = sc.nextLine();

        System.out.printf("이름을 입력하시오 : ");
        lname = sc.nextLine();

        System.out.printf("이메일 ID 를 입력하시오 : ");
        email = sc.nextLine();

        System.out.printf("전화번호[ex)010-1234-5678]를 입력하시오 : ");
        phone = sc.nextLine();

        System.out.printf("입사일[ex)2020-12-25]을 입력하시오 : ");
        hdate = sc.nextLine();

        System.out.printf("직책을 입력하시오 : ");
        jobid = sc.nextLine();

        System.out.printf("연봉을 입력하시오 : ");
        sal = sc.nextInt();

        System.out.printf("인센티브를 입력하시오 : ");
        comm = sc.nextFloat();

        sc.nextLine();

        System.out.printf("고유번호[상사]를 입력하시오 : ");
        mgrid = sc.nextLine();

        System.out.printf("고유번호[부서]를 입력하시오 : ");
        deptid = sc.nextLine();

        // 입력받은 성적데이터를 동적배열에 저장
        EmployeeVO em = new EmployeeVO(empno, fname, lname, email, phone, hdate, jobid, sal, comm, mgrid, deptid);

        // 처리된 성적데이터를 동적배열에 저장
        emdata.add(em);


    } // 인사 정보 입력 끝

    @Override
    public void readEmplo() {

        String fmt = "사번:%d, 성:%s, 이메일:%s, 직책:%s, 상사번호[고유]:%s, 부서번호[고유]:%s \n";
        Iterator<EmployeeVO> iter = emdata.iterator();

        while(iter.hasNext())
        {
            EmployeeVO e = iter.next();

            System.out.printf(fmt, e.getEmpno(), e.getFname(), e.getEmail(), e.getJobid(), e.getMgrid(), e.getDeptid());
        }
    }

    @Override
    public void readOneEmplo() {
        EmployeeVO em = new EmployeeVO();
        String fmt = "사번:%d, 이름%s%s 이메일:%s, 전화번호:%s, 입사일:%s, 직책:%s, 연봉:%d, 인센티브:%.2f, 상사번호[고유]:%s, 부서번호[고유]:%s \n";

        // 상세조회 할 학생 이름받기
        Scanner sc = new Scanner(System.in);
        System.out.print("조회 할 직원 사번은? ");
        em.setEmpno(Integer.parseInt(sc.nextLine()));

        // 입력받은 이름으로 데이터 검색 후 결과출력
        for(EmployeeVO e : emdata){ // emdata 에서 가져온 정보를 e에 대입, 더이상 대입할 자료가 없으면 종료
            // 입력한 사원번호와
            // 순회해서 읽어온 사원정보의 사원번호와 비교
            if(e.getEmpno() == em.getEmpno()){
                em = e;
            }
        }
        System.out.printf(fmt, em.getEmpno(), em.getFname(), em.getLname(),
                em.getEmail(), em.getPhone(), em.getHdate(), em.getJobid(),
                em.getSal(), em.getComm(), em.getMgrid(), em.getDeptid());
    }

    @Override
    public void modifyEmplo() {
        for (int i = 0; i < emdata.size(); ++i) {
            System.out.println("이름의"+i+ "번째 데이터" + emdata.get(i));
        }
    }

    @Override
    public void removeEmplo() {
        super.removeEmplo();
    }

    public void displayMenu(){
        StringBuilder em = new StringBuilder();
        em.append("-------------------\n")
                .append("인사 관리 프로그램 v1\n")
                .append("-------------------\n")
                .append("1. 인사 정보 입력\n")
                .append("2. 인사 정보 조회\n")
                .append("3. 인사 정보 상세조회\n")
                .append("4. 인사 정보 수정\n")
                .append("5. 인사 정보 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("-------------------\n")
                .append("원하시는 작업은 ? ");

        System.out.print(em);

    }// 디스플레이 메뉴 클래스 끝
}
