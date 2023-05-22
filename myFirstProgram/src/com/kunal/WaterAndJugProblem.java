package com.kunal;

// Famous Die hard 3 movie example
public class WaterAndJugProblem {
    public static void main(String[] args) {
        int jug1Capacity = 3, jug2Capacity = 5, targetCapacity = 4;
        System.out.println(canMeasureWater(jug1Capacity,jug2Capacity,targetCapacity));
}
    public static boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        //The first case

        if( jug1Capacity + jug2Capacity < targetCapacity )
        {
            return false;
        }

        //The second case

        if( jug1Capacity == targetCapacity || jug2Capacity == targetCapacity || jug1Capacity + jug2Capacity == targetCapacity )
        {
            return true;
        }

        //The third case

        if( targetCapacity % gcd( jug1Capacity, jug2Capacity ) == 0 )
        {
            return true;
        }

        return false;

    }
    public static int gcd( int a, int b ){

        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
