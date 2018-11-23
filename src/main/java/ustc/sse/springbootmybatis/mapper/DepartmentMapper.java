package ustc.sse.springbootmybatis.mapper;

import org.apache.ibatis.annotations.*;
import ustc.sse.springbootmybatis.domain.Department;

/**
 * @author LRK
 * @project_name spring-boot-mybatis
 * @package_name ustc.sse.springbootmybatis.mapper
 * @date 2018/11/24 0:10
 * @description God Bless, No Bug!
 */
@Mapper
public interface DepartmentMapper {

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    int saveDepartment(Department department);

    @Delete("delete form department where id = #{id}")
    int deleteDepartmentById(Integer id);

    @Update("update department set departmentName = #{departmentName} where id = #{id}")
    int updatDepartmentById(Department department);

    @Select("select * from department where id = #{id}")
    Department selectDepartmentById(Integer id);
}
