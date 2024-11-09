
public class Main {
    public static void main(String[] args) {

        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // should return -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); // should return 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // should return 3

        System.out.println("____________" + "\n");

        System.out.println(getBucketCount(-3.4, 2.1, 1.5)); // should return -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); // should return 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35)); // should return 14

        System.out.println("____________" + "\n");

        System.out.println(getBucketCount(3.4, 1.5));   // should return 3
        System.out.println(getBucketCount(6.26, 2.2));  // should return 3
        System.out.println(getBucketCount(3.26, 0.75)); // should return 5

    }

    public static double getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        int numberofbuckets = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        if (width > 0 && height > 0 && areaPerBucket > 0 && extraBuckets > 0) {

            numberofbuckets = (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);

        }

        //System.out.println("numberofbuckets: " + numberofbuckets);

        return numberofbuckets;
    }


    public static double getBucketCount(double width, double height, double areaPerBucket) {

        int numberofbuckets = 0;

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        if (width > 0 && height > 0 && areaPerBucket > 0) {

            numberofbuckets = (int) Math.ceil((width * height) / areaPerBucket);

        }

        //System.out.println("numberofbuckets: " + numberofbuckets);

        return numberofbuckets;
    }


    public static double getBucketCount(double area, double areaPerBucket) {

        int numberofbuckets = 0;

        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        if (area > 0 && areaPerBucket > 0) {
            numberofbuckets = (int) Math.ceil((area) / areaPerBucket);
        }

        //System.out.println("numberofbuckets: " + numberofbuckets);

        return numberofbuckets;
    }
}