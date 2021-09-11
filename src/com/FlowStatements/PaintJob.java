package com.FlowStatements;

public class PaintJob {
    public static double getBucketCount(double width,double height,double areaPerBucket,double extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        int numOfBuckets = (int) Math.ceil((width * height) / areaPerBucket);
        numOfBuckets -= extraBuckets;
        return numOfBuckets;
    }// end of getBucketCount method 1

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        int numOfBuckets = (int) Math.ceil((width * height) / areaPerBucket);
        return numOfBuckets;

    }// end of getBucketCount method 2

    public static int getBucketCount(double area, double areaPerBucket){

        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int numOfBuckets = (int) Math.ceil(area / areaPerBucket);
        return numOfBuckets;



    }
}
