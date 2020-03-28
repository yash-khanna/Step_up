package com.kaydeeinternational.stepup1;

/**
 * Created by yashk on 24-01-2020.
 */
import java.math.*;

public class SensorFilter {
    private SensorFilter(){}// This shall restricting the further instances of being created other than the class body
    public static float sum(float array[]){
        float a=0f;
        for(int i=0;i<array.length;i++){a+=array[i];}
        return a;
    }
    public static float[] cross(float ar1[],float ar2[]){
        float a[]=new float[3];
        a[0]=ar1[1]*ar2[2]-ar1[2]*ar2[1];
        a[2]=ar1[0]*ar2[1]-ar1[1]*ar2[0];
        a[1]=ar1[0]*ar2[2]-ar1[2]*ar1[0];
        return a;
    }
    public static float norm(float ar1[]){
        float a=0;
        for(int i=0;i<ar1.length;i++){a+=ar1[i]*ar1[i];}
        return (float) Math.sqrt(a);
    }
    public static float dot(float a[],float b[]){
        return a[0]*b[0]+a[1]*b[1]+a[2]*b[2];
    }

    public static float[] normalize(float []a){
        float [] retval=new float[a.length];
        float norm=norm(a);
        for(int i=0;i<a.length;i++){
            retval[i]=a[i]/norm;
        }
        return retval;
    }
}
