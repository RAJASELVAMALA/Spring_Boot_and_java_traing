interface vehicleone{
    int  speed=90;
    public void distance();
}

interface vehicletwo{
    int distance=1000;
    public void speed();
}
interface vehiclethree{
    int  avgspeed=50;
    public void avgspeed();
}


class Vehicle  implements vehicleone,vehicletwo,vehiclethree{
    public void distance(){
        int  distance=speed*100;
        System.out.println("distance travelled is "+distance +"km");
    }
    public void speed(){
        int speed=distance/90;
        System.out.println("travelled speed is "+speed +"hr");
    }
    public void avgspeed(){
        int  avgspeed=distance/50;
        System.out.println("Vehicle travelled avgspeed is "+avgspeed + "hr");
    }
}

public class MultipleInheritanceUsingInterface41{
    public static void main(String args[]){
        System.out.println("Vehicle");
        Vehicle obj=new Vehicle();
        obj.distance();
        obj.speed();
        obj.avgspeed();
    }
}



