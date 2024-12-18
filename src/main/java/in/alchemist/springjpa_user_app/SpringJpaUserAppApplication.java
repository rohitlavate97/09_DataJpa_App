package in.alchemist.springjpa_user_app;

import in.alchemist.springjpa_user_app.entity.Employee;
import in.alchemist.springjpa_user_app.repo.EmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringJpaUserAppApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=SpringApplication.run(SpringJpaUserAppApplication.class, args);
        EmployeeRepo repo=context.getBean(EmployeeRepo.class);
        /*Employee e1=new Employee(1,"Rushabh",2000.00,"male","IT");
        Employee e2=new Employee(2,"Tejal",1000.00,"female","PM");
        Employee e3=new Employee(3,"Shekhar",3000.00,"male","Operations");
        repo.saveAll(Arrays.asList(e1,e2,e3));*/
        Employee e1=new Employee();
        e1.setEmpId(5);
        e1.setEmpName("Ajay");
        e1.setEmpSalary(1234.00);
        e1.setEmpGender("Male");
        e1.setDept("IT");
        repo.save(e1);
//        Sort ascending=Sort.by("empName").ascending();
//        Sort ascending=Sort.by("empName","empSalary").ascending();

//        Sort ascending=Sort.by(Sort.Direction.ASC, "empName");
//        List<Employee> employees=repo.findAll(ascending);

        //Example for Pagination

        /*PageRequest page=PageRequest.of(0, 2, Sort.by(Sort.Direction.ASC, "empName"));
        Page<Employee> findAll=repo.findAll(page);
        List<Employee> employees=findAll.getContent();*/

        //For filters
        /*Employee employee=new Employee();
        employee.setEmpGender("Male");
        employee.setDept("IT");
        Example<Employee> of=Example.of(employee);
        List<Employee> employees=repo.findAll(of);
        employees.forEach(System.out::println);*/
    }

}
