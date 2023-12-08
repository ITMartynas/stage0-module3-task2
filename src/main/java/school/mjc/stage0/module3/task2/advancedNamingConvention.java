package school.mjc.stage0.module3.task2;

public record advancedNamingConvention(int age, int phoneNumber) {
    private static final int adult_age = 18;

    // Constructor to initialize age and phoneNumber

    // Method to check if a person is an adult
    public boolean isAdult() {
        return age >= adult_age;
    }

    void callToFriend() {
        System.out.println("Calling a friend...");
    }

    void callByNumber() {
        int number = 987654321;
        System.out.println("Calling number: " + number);
    }


    public static void main(String[] args) {
        // Creating an instance of the class
        advancedNamingConvention person = new advancedNamingConvention(25, 123456789);

        // Using the getter methods
        System.out.println("Age: " + person.age());
        System.out.println("Phone Number: " + person.phoneNumber());

        // Using the isAdult method
        System.out.println("Is Adult: " + person.isAdult());

        // Using the callToFriend method
        person.callToFriend();

        // Using the callByNumber method
        person.callByNumber();
    }
}
