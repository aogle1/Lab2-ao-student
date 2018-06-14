package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test
  public void testConstructorValidName() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }

  @Test
  public  void testGetHeadcoachValidHeadcoach(){
    Team team = new Team("USA", "Klinsmann", 500);
    assertEquals(team.getHeadcoach(), "Klinsmann");
  }

  @Test
  public  void testGetFundingValidFunding(){
    Team team = new Team("USA", "Klinsmann", 500);
    assertEquals(team.getFunding(), 500);
  }
  
  // TODO testConstructorValidHeadcoach
  // TODO testConstructorValidFunding

  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testGetHeadcoachFail() {
    new Team("USA",null, 1);

    }

  // TODO testGetHeadcoach

  @Test(expected = IllegalArgumentException.class)
  public void testGetFunding() {
    new Team("USA", "Alex Ogle", 0);


  }



  // TODO testGetFunding
}