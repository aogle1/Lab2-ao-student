package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
    }
    if (headcoach == null) {
      throw new IllegalArgumentException("head coach is null");
    }
    if (funding <= 0) {
      throw new IllegalArgumentException("funding must be positive");
    }
    // TODO validity checking for headcoach
    // TODO validity checking for funding
    this.name = name;
    this.headcoach = headcoach;
    this.funding = funding;
    // TODO complete this constructor
  }

  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
    // TODO complete this method
    return this.headcoach;
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // TODO complete this method
    return this.funding;
  }
}
