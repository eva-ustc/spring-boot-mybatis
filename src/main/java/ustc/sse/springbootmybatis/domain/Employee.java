package ustc.sse.springbootmybatis.domain;

import java.io.Serializable;

/**
 * @author LRK
 * @project_name spring-boot-mybatis
 * @package_name ustc.sse.springbootmybatis.domain
 * @date 2018/11/24 0:03
 * @description God Bless, No Bug!
 */
public class Employee implements Serializable{
    private Integer id;
    private String lastName;
    private Integer gender;
    private String email;
    private Integer dId;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", dId=" + dId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
}
