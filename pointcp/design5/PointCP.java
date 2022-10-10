abstract class PointCP{
     char typeCoord;

     double xOrRho;

     double yOrTheta;

    public PointCP(char type, double xOrRho, double yOrTheta){
        if(type != 'C' && type != 'P')
          throw new IllegalArgumentException();
        this.xOrRho = xOrRho;
        this.yOrTheta = yOrTheta;
        typeCoord = type;
      }

      public double getX()
      {
        if(typeCoord == 'C') 
          return xOrRho;
        else 
          return (Math.cos(Math.toRadians(yOrTheta)) * xOrRho);
      }
      
      public double getY()
      {
        if(typeCoord == 'C') 
          return yOrTheta;
        else 
          return (Math.sin(Math.toRadians(yOrTheta)) * xOrRho);
      }
      
      public double getRho()
      {
        if(typeCoord == 'P') 
          return xOrRho;
        else 
          return (Math.sqrt(Math.pow(xOrRho, 2) + Math.pow(yOrTheta, 2)));
      }
      
      public double getTheta()
      {
        if(typeCoord == 'P')
          return yOrTheta;
        else 
          return Math.toDegrees(Math.atan2(yOrTheta, xOrRho));
      }
      abstract void convertStorageToPolar();

      abstract void convertStorageToCartesian();
    
      abstract double getDistance(PointCP pointB);

      abstract PointCP rotatePoint(double rotation);

      public abstract String toString();

}


    
    

