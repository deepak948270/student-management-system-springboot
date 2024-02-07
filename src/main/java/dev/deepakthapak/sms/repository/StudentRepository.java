package dev.deepakthapak.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.deepakthapak.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
