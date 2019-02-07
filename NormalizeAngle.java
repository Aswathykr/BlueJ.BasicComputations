 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        angle = Math.abs(angle);
        return angle % 360;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        //integer = Math.abs(integer);
        return Math.floorMod(integer, 360);
    }

    public static void main(String[] args){

    }
}
