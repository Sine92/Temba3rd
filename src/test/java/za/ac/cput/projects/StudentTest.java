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
    @Ignore //Disabling test
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

    @Test(expected = AssertionError.class)// Failing test and testing identity test
    public void testObjectIdentity() {


        Assert.assertSame(std,std);

    }

    @Test
    public void testObjectEquality()// Object test
    {
        Assert.assertEquals(std,stds);

    }
    @Test( timeout = 10000)// timeout 
    public void testObjectTimeout()
    {
        Assert.assertEquals(std,stds);
        while(true);
    }
    
}