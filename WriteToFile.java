import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {
    public void writeToFile(User user) throws IOException {
        try (FileWriter writer = new FileWriter(user.getSurname() + ".txt", true)) {
            writer.write("<" + user.getSurname() + ">" + "<"
                    + user.getName() + ">" + "<"
                    + user.getPatronymic() + ">" + "<"
                    + user.getDateOfBirth() + ">" + "<"
                    + String.valueOf(user.getNumberOfTelephone()) + ">" + "<"
                    + user.getGender().toString() + ">");
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Данные пользователя записаны");
    }
}
