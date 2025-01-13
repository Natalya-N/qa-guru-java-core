import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import utils.TestDataGenerator;


public class RegistrationWithPageObjectsTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    TestDataGenerator testData = new TestDataGenerator();
    private final String
            studentName = "Student Name",
            studentEmail = "Student Email",
            gender = "Gender",
            mobile = "Mobile",
            dateOfBirth ="Date of Birth",
            subjects = "Subjects",
            hobbies = "Hobbies",
            picture = "Picture",
            address = "Address",
            stateAndCity = "State and City",
            gitPicture = "git.png";

    @Test
    void successfulRegistrationTest() {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.emailAddress)
                .setGender(testData.gender)
                .setUserNumber(testData.mobileNumber)
                .setDateOfBirth(testData.dayOfBirth, testData.monthOfBirth, testData.yearOfBirth)
                .setSubjects(testData.subjects)
                .setHobbiesWrapper(testData.hobbies)
                .setUploadPicture(gitPicture)
                .setCurrentAddress(testData.currentAddress)
                .setState(testData.state)
                .setCity(testData.city);
        registrationPage.submit();
        registrationPage.checkModalDialogAppear()
                .checkDataInTable(studentName, testData.firstName + " " + testData.lastName)
                .checkDataInTable(studentEmail, testData.emailAddress)
                .checkDataInTable(gender, testData.gender)
                .checkDataInTable(mobile, testData.mobileNumber)
                .checkDataInTable(dateOfBirth, testData.dayOfBirth + " " + testData.monthOfBirth + "," + testData.yearOfBirth)
                .checkDataInTable(subjects ,testData.subjects)
                .checkDataInTable(hobbies ,testData.hobbies)
                .checkDataInTable(picture,gitPicture)
                .checkDataInTable(address, testData.currentAddress)
                .checkDataInTable(stateAndCity, testData.state +" " + testData.city);

    }

    @Test
    void successfulRegistrationMinimumValuesTest() {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName(testData.firstName)
                .setLastName(testData.lastName)
                .setEmail(testData.emailAddress)
                .setGender(testData.gender)
                .setUserNumber(testData.mobileNumber)
                .setDateOfBirth(testData.dayOfBirth, testData.monthOfBirth, testData.yearOfBirth);
        registrationPage.submit();
        registrationPage.checkModalDialogAppear()
                .checkDataInTable(studentName, testData.firstName + " " + testData.lastName)
                .checkDataInTable(studentEmail, testData.emailAddress)
                .checkDataInTable(gender, testData.gender)
                .checkDataInTable(mobile, testData.mobileNumber)
                .checkDataInTable(dateOfBirth, testData.dayOfBirth + " " + testData.monthOfBirth + "," + testData.yearOfBirth);
    }

    @Test
    void unsuccessfulRegistrationTest() {
        registrationPage.openPage()
                .removeBanner()
                .setFirstName(testData.firstName)
                .submit()
                .checkModalDialogNotAppear();
      }
}