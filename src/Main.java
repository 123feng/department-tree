import entity.Department;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List departmentList = new ArrayList<>();
        departmentList.add(new Department(1, "研发部门", 0));
        departmentList.add(new Department(2, "研发团队1", 1));
        departmentList.add(new Department(3, "研发团队2", 1));
        departmentList.add(new Department(4, "财务部门", 0));
        departmentList.add(new Department(5, "财务A部门", 4));
        departmentList.add(new Department(6, "财务B部门", 4));
        departmentList.add(new Department(7, "财务A部门团队1", 5));
        departmentList.add(new Department(8, "财务A部门团队2", 5));
        departmentList.add(new Department(9, "财务B部门团队1", 6));
        departmentList.add(new Department(10, "财务B部门团队2", 6));

        List<Department> three = getThree(departmentList, 0L);

        for(Department item:three) {
            System.out.println(item);
        }
    }

    private static List<Department> getThree(List<Department> list,Long parentId){
        //获取所有子节点
        List<Department> childTreeList = getChildTree(list,parentId);
        for (Department dept:childTreeList) {
            dept.setChildDepartments(getThree(list,dept.getId()));
        }
        return childTreeList;
    }

    private static List<Department> getChildTree(List<Department> list,Long id){
        List<Department> childTree = new ArrayList<>();

        for (Department dept:list) {
            if(dept.getParentId() == id){
                childTree.add(dept);
            }
        }
        return childTree;
    }
}
