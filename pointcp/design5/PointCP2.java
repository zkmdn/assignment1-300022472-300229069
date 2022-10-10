// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at http://www.site.uottawa.ca/school/research/lloseng/

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public class PointCP2 extends PointCP
{
  //Instance variables ************************************************

  private double Rho;

  private double Theta;

  public PointCP2( double Rho, double Theta)
  {

    this.Rho = Rho;
    this.Theta = Theta;

  }

 
  public double getX()
  {

      return (Math.cos(Math.toRadians(Theta)) * Rho);
  }
  
  public double getY()
  {

      return (Math.sin(Math.toRadians(Theta)) * Rho);
  }
  
  public double getRho()
  {

      return Rho;

  }
  
  public double getTheta()
  {

      return Theta;


  }
  
	
  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */
  // public void convertStorageToPolar()
  {

  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public PointCP2 convertStorageToCartesian()
  {
    
      //Calculate X and Y
      double temp = getX();
      double newy = getY();
      
   return new PointCP2(temp, newy);
      
    
  }

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP2 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  /**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public PointCP2 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double X = getX();
    double Y = getY();
        
    return new PointCP2(
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored  "  + getRho() + "," + getTheta()  + "\n";
  }
}
