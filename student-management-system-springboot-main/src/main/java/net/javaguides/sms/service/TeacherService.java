package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.entity.Teacher;

public interface TeacherService {
    List<Teacher> getAllTeachers();

    Teacher saveTeacher(Teacher teacher);

    Teacher getTeacherById(Long id);

    Teacher updateTeacher(Teacher teacher);

    void deleteTeacherById(Long id);
}
