package com.atguigu.mybatis.pojo;

public class Emp {

    private Integer id;


    private String empName;


    private String password;


    private String gender;


    private Integer age;


    private String email;


    private Integer did;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getEmpName() {
        return empName;
    }


    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }


    public Integer getAge() {
        return age;
    }



    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }


    public Integer getDid() {
        return did;
    }


    public void setDid(Integer did) {
        this.did = did;
    }

    public Emp() {
    }

    public Emp(Integer id, String empName, String password, String gender, Integer age, String email, Integer did) {
        this.id = id;
        this.empName = empName;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.did = did;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", did=" + did +
                '}';
    }
}