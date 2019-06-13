package controller.dao;

import model.Student;

import java.util.Optional;
/*
 * @the abstract class, in which can add method and ovverides their in a another class
 */
public abstract class ImplStudentDao<T> implements DAO<Student, String>{
    /*
     * @add methods:
     */
    public abstract Optional<T> ad(String s);
}
