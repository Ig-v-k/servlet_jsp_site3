package controller.dao;

import model.Course;

import java.util.List;

public class CourseImplDao extends ImplCourseDao {

    public CourseImplDao() {
    }

    private static class SingletonHelper {
        private static final CourseImplDao INSTANCE = new CourseImplDao();
    }

    public static CourseImplDao getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    public void add(Course o) {

    }

    @Override
    public void delete(Integer o) {

    }

    @Override
    public void update(Course o) {

    }

    @Override
    public List<Course> getAll() {
        return null;
    }

    @Override
    public Course getById(Integer o) {
        return null;
    }
}
