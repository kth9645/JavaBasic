package semiproject;

public class EmployeeVO {
    private int empno;   // 사번
    private String fname;   // 성
    private String lname;   // 이름
    private String email;   // 이메일
    private String phone;   // 핸드폰
    private String hdate;   // 입사일
    private String jobid;   // 직책
    private int sal;        // 연봉
    private double comm;     // 인센티브
    private String mgrid;   // 상사번호
    private String deptid;  // 부서 번호


    public EmployeeVO() {
    }


    public EmployeeVO(int empno, String fname, String lname, String email, String phone, String hdate, String jobid, int sal, double comm, String mgrid, String deptid) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
        this.jobid = jobid;
        this.sal = sal;
        this.comm = comm;
        this.mgrid = mgrid;
        this.deptid = deptid;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(float comm) {
        this.comm = comm;
    }

    public String getMgrid() {
        return mgrid;
    }

    public void setMgrid(String mgrid) {
        this.mgrid = mgrid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }
}
