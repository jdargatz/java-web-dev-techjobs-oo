package org.launchcode.techjobs_oo.tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob;
    Job testJob2;
    Job emptyJob;
    Job emptyEmployer;
    @Before
    public void createJobs(){
    testJob = new Job("Technical Support", new Employer("Emerson"), new Location("STL"), new PositionType("Customer" +
            " Experience"), new CoreCompetency("Problem Solving"));
    testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    emptyEmployer = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"),
            new CoreCompetency("Taste"));
    emptyJob = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
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

//test custom toString method - Job listing should print out as expected: blank line before/after, every
// parameter on its own line.
    @Test
    public void testJobsForToString() {
    String convertedTestJob = testJob.toString();
    String tester = "\nID: " + testJob.getId() +
            "\nName: Technical Support" +
            "\nEmployer: Emerson" +
            "\nLocation: STL" +
            "\nPosition Type: Customer Experience" +
            "\nCore Competency: Problem Solving" + "\n";
    assertEquals(tester, convertedTestJob);
    } // end test 4

    @Test
    public void testJobsForDataNotAvailable() {
        String convertedTestJob = emptyEmployer.toString();
        String tester = "\nID: " + emptyEmployer.getId() +
                "\nName: Ice cream taster" +
                "\nEmployer: Data not available." +
                "\nLocation: Home" +
                "\nPosition Type: UX" +
                "\nCore Competency: Taste" + "\n";
        assertEquals(tester, convertedTestJob);
    } // end test 5

    @Test
    public void testJobsForJobNotAvailable() {
        String convertedTestJob = emptyJob.toString();
        String tester = "OOPS! This job does not seem to exist.";
        assertEquals(tester, convertedTestJob);
    } // end test 6

} // end JobTest class
