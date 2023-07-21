import java.util.Scanner;
public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numd = scanner.nextInt();
        scanner.nextLine(); 
        String letterRange = scanner.nextLine().trim();
        String digitRange = scanner.nextLine().trim();
        int maxVehicles = calculateMaxVehicles(numDistricts, letterRange, digitRange);
        System.out.println(maxVehicles);
    }
    private static int calculateMaxVehicles(int numDistricts, String letterRange, String digitRange) {
        int numLetters = letterRange.length();
        int numDigits = digitRange.length();
        int numSeries = numLetters * numLetters;
        int numNumbers = numDigits * numDigits * numDigits * numDigits;
        int totalVehicles = numDistricts * numSeries * numNumbers;
        int specialVehicles = numNumbers * numDistricts;
        int nonSpecialVehicles = totalVehicles - specialVehicles;
    return nonSpecialVehicles;
    }
}
