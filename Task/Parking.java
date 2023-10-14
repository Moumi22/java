public class Parking 
{
    private int car=0,bike=0,rikshaw=0;
    public int getCar() 
    {
        return car;
    }
    
    public void setCar(int car) 
    {
     this.car = car;
    }

    public int getBike()
    {
      return bike;
    }

    public void setBike(int bike) 
    {
      this.bike = bike;
    }

    public int getRikshaw() 
    {
      return rikshaw;
    }

    public void setRikshaw(int rikshaw) 
    {
      this.rikshaw = rikshaw;
    }

    public void delete()
    {
      car=0;
      bike=0;
      rikshaw=0;
    }
}