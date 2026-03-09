package com.obedotto.spaceendangered.game.play;

public class BattleCell {
  private AlienUnit alienUnit;
  private BattleCell north, south, east, west;

  public BattleCell() {

  }

  public void setAlienUnit(AlienUnit unit) {
    this.alienUnit = unit;
  }
  public AlienUnit getAlienUnit() {
    return this.alienUnit;
  }

  private void goNorth() {
    setAlienUnit(null);
    north.setAlienUnit(this.alienUnit);
    this.alienUnit.setContainer(this.north);
  }
  private void goSouth() {
    setAlienUnit(null);
    south.setAlienUnit(this.alienUnit);
    this.alienUnit.setContainer(this.south);
  }
  private void goEast() {
    setAlienUnit(null);
    east.setAlienUnit(this.alienUnit);
    this.alienUnit.setContainer(this.east);
  }
  private void goWest() {
    setAlienUnit(null);
    west.setAlienUnit(this.alienUnit);
    this.alienUnit.setContainer(this.west);
  }
  
}
