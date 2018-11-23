package ustc.sse.springbootmybatis.domain;

import java.io.Serializable;

/**
 * @author LRK
 * @project_name spring-boot-mybatis
 * @package_name ustc.sse.springbootmybatis.domain
 * @date 2018/11/24 0:05
 * @description God Bless, No Bug!
 */
public class Department implements Serializable {

    private Integer id;
    private String departmentName;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
