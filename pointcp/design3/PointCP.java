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
public class PointCP
{
  //Instance variables ************************************************

  /**
   * Contains C(artesian) or P(olar) to identify the type of
   * coordinates that are being dealt with.
   */
  // private char typeCoord;
  
  /**
   * Contains the current value of X or RHO depending on the type
   * of coordinates.
   */
  // private double xOrRho;
  private double X;
  /**
   * Contains the current value of Y or THETA value depending on the
   * type of coordinates.
   */
  // private double yOrTheta;
	private double Y;
  
  //Constructors ******************************************************

  /**
   * Constructs a coordinate object, with a type identifier.
   */
  public PointCP(double X, double Y)
  {
    
    this.X = X;
    this.Y = Y;
    
  }
	
  
  //Instance methods **************************************************
 
 
  public double getX()
  {
    // if(typeCoord == 'C') 
    //   return xOrRho;
    // else 
    //   return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
    return X;
  }
  
  public double getY()
  {
    // if(typeCoord == 'C') 
    //   return yOrTheta;
    // else 
    //   return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
    return Y;
  }
  
  public double getRho()
  {
    return (Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2)));
  }
  
  public double getTheta()
  {
    
      return Math.toDegrees(Math.atan2(Y, X));
  }
  

  /**
   * Converts Cartesian coordinates to Polar coordinates.
   */

  public PointCP convertStorageToPolar()
  {
    
      //Calculate RHO and THETA
      double temp = getRho();
      double newtheta = getTheta();

      return new PointCP(temp,newtheta) ;

    
  }
	
  /**
   * Converts Polar coordinates to Cartesian coordinates.
   */
  public void convertStorageToCartesian()
  {
    
  }

  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public double getDistance(PointCP pointB)
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
  public PointCP rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
    double Xr = getX();
    double Yr = getY();
        
    return new PointCP(
      (Math.cos(radRotation) * Xr) - (Math.sin(radRotation) * Yr),
      (Math.sin(radRotation) * Xr) + (Math.cos(radRotation) * Yr));
  }

  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public String toString()
  {
    return "Stored  " +  + getX() + "," + getY() + "\n";
  }
}
