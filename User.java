import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User {
    private String surname;
    private String name;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String numberOfTelephone;
    private GenderType gender;


    public User(String surname, String name, String patronymic, LocalDate dateOfBirth,
                String numberOfTelephone, GenderType gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.numberOfTelephone = numberOfTelephone;
        this.gender = gender;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public String getNumberOfTelephone() {
        return numberOfTelephone;
    }

    public void setNumberOfTelephone(String numberOfTelephone) {
        this.numberOfTelephone = numberOfTelephone;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = GenderType.valueOf(gender);
    }

    @Override
    public String toString() {
        //<Фамилия><Имя><Отчество><дата рождения><номер телефона><пол>
        return "<" + getSurname() + "><" + getName() + "><" + getPatronymic()
                + "><" + getDateOfBirth() + "><" + getNumberOfTelephone() + "><"
                + getGender() + ">";
    }
}

