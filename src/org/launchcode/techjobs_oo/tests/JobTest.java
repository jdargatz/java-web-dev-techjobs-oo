package org.launchcode.techjobs_oo.tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob;
    Job testJob2;
    @Before
    public void createJobs(){
    testJob = new Job("Technical Support", new Employer("Emerson"), new Location("STL"), new PositionType("Customer" +
            " Experience"), new CoreCompetency("Problem Solving"));
    testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    } // end createJobs

 //Test that the unique ID sets correctly - not equal and differs by 1
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
    boolean var;
        if ((job1.getId() != job2.getId()) && (job2.getId() == job1.getId()+1)){
            var = true;
        } else {
            var = false;
        }
        assertTrue(var);
        } // end test 1

//testJobConstructorSetsAllFields - test that parameters of initialized testJob is of specified class
    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(testJob2.getEmployer() instanceof Employer);
        assertTrue(testJob2.getLocation() instanceof Location);
        assertTrue(testJob2.getPositionType() instanceof PositionType);
        assertTrue(testJob2.getCoreCompetency() instanceof CoreCompetency);
    } // end test 2


//testJobsForEquality - Two Job objects are considered equal if they have the same id value - test equality
// between two jobs
    @Test
    public void testJobsForEquality() {
    assertFalse(testJob == testJob2);
    } // end test 3

} // end JobTest class
