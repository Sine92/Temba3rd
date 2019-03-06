package za.ac.cput.projects;

import java.util.Objects;

public class Student {

    private String stdId;
    private String stdName;
    private String stdCourse;


    private Student()
  {

  }

    public String getStdId() {
        return stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public String getStdCourse() {
        return stdCourse;
    }
    public Student(Builder builder)
    {
        this.stdId = builder.stdId;
        this.stdName = builder.stdName;
        this.stdCourse = builder.stdCourse;

    }
    public static class Builder
    {

        private String stdId;
        private String stdName;
        private String stdCourse;

        public Builder stdId(String value)
        {
            this.stdId = value;
            return this;
        }
        public Builder stdName(String value)
        {
            this.stdName = value;
            return this;
        }
        public Builder stdCourse(String value)
        {
            this.stdCourse = value;
            return this;

        }
        public Student build()
        {
            return new Student(this);
        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stdId.equals(student.stdId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stdId);
    }


}
