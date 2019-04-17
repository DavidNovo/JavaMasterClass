package novogrodsky.solarsystem;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public final class HeavenlyBody {

  private final String name;
  private final double orbitalPeriod;
  private final Set<HeavenlyBody> satellites;

  public HeavenlyBody(String name, double orbitalPeriod) {
    this.name = name;
    this.orbitalPeriod = orbitalPeriod;
    this.satellites = new HashSet<>();
  }

  public String getName() {
    return name;
  }

  public double getOrbitalPeriod() {
    return orbitalPeriod;
  }

  public boolean addMoon(HeavenlyBody moon) {
    return this.satellites.add(moon);
  }

  public Set<HeavenlyBody> getSatellites() {
    return new HashSet<>(this.satellites);
  }


  // to make sure I am overriding, use parm of Object.
  @Override
  public boolean equals(Object obj) {
    // this is referencial equality
    // if both references point to the same object, they are equal
    if (this == obj) {
      return true;
    }

    // checking for null objects and checking for the class type
    System.out.println("obj.getClass() is " + obj.getClass());
    System.out.println("this.getClass() is " + this.getClass());
    if ((obj == null) || (obj.getClass() != this.getClass())) {
      return false;
    }

    String objName = ((HeavenlyBody) obj).getName();
    return this.name.equals(objName);
  }


}
