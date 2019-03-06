package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student std;
    Student stds;
    @Before
    public void setUp() throws Exception {

        std = new Student
                .Builder()
                .stdCourse("ADP")
                .stdId("200")
                .stdName("Sine")
                .build();
        stds = new Student.Builder()
                .stdCourse("ADP")
                .stdId("200")
                .stdName("Sine")
                .build();



    }

    @Test
    public void getStdId() {


        Assert.assertEquals("200",std.getStdId());


    }

    @Test
    public void getStdName() {

   Assert.assertEquals("Sine",std.getStdName());
    }

    @Test
    public void getStdCourse() {

        Assert.assertEquals("ADP",std.getStdCourse());

    }

    @Test
    public void testObjectIdentity() {


        Assert.assertSame(std,stds);

    }

    @Test
    public void testObjectEquality()
    {
        Assert.assertEquals(std,stds);

    }

}