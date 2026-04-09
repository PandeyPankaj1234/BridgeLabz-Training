public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * radiusKm * radiusKm * radiusKm;
        double volumeMiles = volumeKm * Math.pow(0.621371, 3);
        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
