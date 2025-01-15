package utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestDataGenerator {

    Faker faker = new Faker(new Locale("en"));

    public String firstName = getFirstName(),
            lastName = getLastName(),
            emailAddress = getEmail(),
            currentAddress = getCurrentAddress(),
            gender = getGender(),
            mobileNumber = getMobileNumber(),
            subjects = getSubjects(),
            hobbies = getHobbies(),
            state = getState(),
            city = getCity(state),
            image = getImage(),
            dayOfBirth = getDayOfBirth(),
            monthOfBirth = getMonthOfBirth(),
            yearOfBirth = getYearOfBirth();

    public String getFirstName() {
        return faker.name().firstName();
    }

    public String getLastName() {
        return faker.name().lastName();
    }

    public String getEmail() {
        return faker.internet().emailAddress();
    }

    public String getGender() {
        return faker.options().option("Male", "Female", "Other");

    }

    public String getMobileNumber() {
        return faker.number().digits(10);
    }

    public String getDayOfBirth() {
        return String.valueOf(faker.number().numberBetween(10,28));
    }

    public String getMonthOfBirth() {
        return faker.options().option("January","February","March","April","May","June","July",
                "August","September","October","November","December");
    }

    public String getYearOfBirth() {
        return String.valueOf(faker.number().numberBetween(1924, 2024));
    }

    public String getSubjects() {
        return faker.options().option("Arts", "History", "English", "Chemistry",
                "Commerce", "Economics", "Maths", "Social Studies", "Physics", "Biology");
    }

    public String getHobbies() {
        return faker.options().option("Sports", "Reading", "Music");
    }
    public String getImage() {
        return faker.options().option("git.png", "git2.png", "git3.png");
    }

    public String getCurrentAddress() {
        return faker.address().streetAddress();
    }

    public String getState() {
        return faker.options().option("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
    }

    public String getCity(String state) {
        if (state.equals("NCR")) return faker.options().option("Delhi", "Gurgaon", "Noida");
        if (state.equals("Uttar Pradesh")) return faker.options().option("Agra", "Lucknow", "Merrut");
        if (state.equals("Haryana")) return faker.options().option("Karnal", "Panipat");
        if (state.equals("Rajasthan")) return faker.options().option("Jaipur", "Jaiselmer");
        return null;
    }


}
