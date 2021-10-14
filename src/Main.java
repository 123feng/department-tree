import entity.Department;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Department> departmentList = new ArrayList<>();
        departmentList.add(new Department(1L, "研发部门", null));
        departmentList.add(new Department(2L, "研发团队1", 1L));
        departmentList.add(new Department(3L, "研发团队2", 1L));
        departmentList.add(new Department(4L, "财务部门", null));
        departmentList.add(new Department(5L, "财务A部门", 4L));
        departmentList.add(new Department(6L, "财务B部门", 4L));
        departmentList.add(new Department(7L, "财务A部门团队1", 5L));
        departmentList.add(new Department(8L, "财务A部门团队2", 5L));
        departmentList.add(new Department(9L, "财务B部门团队1", 6L));
        departmentList.add(new Department(10L, "财务B部门团队2", 6L));

       List<Department> rootNodes = departmentList.stream()
           .filter(department-> Objects.isNull(department.getParentId()))
           .collect(Collectors.toList());

       rootNodes.forEach(item-> getDepartmentTree(departmentList,item));
       System.out.println(rootNodes);
    }

    private static void getDepartmentTree(List<Department> list,Department currentNode){
       List<Department> childDepartments = list.stream()
           .filter(department -> currentNode.getId().equals(department.getParentId()))
           .collect(Collectors.toList());
        currentNode.setChildDepartments(childDepartments);

        for (Department dept:childDepartments) {
            getDepartmentTree(list,dept);
        }
    }
}
