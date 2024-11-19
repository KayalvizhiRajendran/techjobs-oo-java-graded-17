package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }
    // test full constructor
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job.getEmployer().toString(), "ACME");
        assertEquals(job.getName(), "Product tester");
        assertEquals(job.getLocation().toString(), "Desert");
        assertEquals(job.getPositionType().toString(), "Quality control");
        assertEquals(job.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.toString().startsWith(System.lineSeparator()));
        assertTrue(job1.toString().endsWith(System.lineSeparator()));
    }
    @Test
    public  void testToStringContainsCorrectLabelsAndData(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String testData = System.lineSeparator()+"ID: "+job1.getId()+System.lineSeparator()+"Name: Product tester"+System.lineSeparator();
        testData += "Employer: ACME"+System.lineSeparator()+"Location: Desert"+System.lineSeparator();
        testData += "Position Type: Quality control"+System.lineSeparator()+"Core Competency: Persistence"+System.lineSeparator();
        assertEquals(job1.toString(), testData);
    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job job1 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String testData = System.lineSeparator()+"ID: "+job1.getId()+System.lineSeparator()+"Name: Data not available"+System.lineSeparator();
        testData += "Employer: Data not available"+System.lineSeparator()+"Location: Data not available"+System.lineSeparator();
        testData += "Position Type: Data not available"+System.lineSeparator()+"Core Competency: Data not available"+System.lineSeparator();
        assertEquals(job1.toString(), testData);
    }
}
