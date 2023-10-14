package Serialize;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Student student = new Student("John", 25);

        // Ghi đối tượng vào tệp
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Đối tượng đã được serialized và lưu trữ trong tệp 'student.ser'");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Đọc đối tượng từ tệp
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student deserializedStudent = (Student) in.readObject();
            in.close();
            fileIn.close();

            // In thông tin của đối tượng sau khi deserialize
            System.out.println("Tên: " + deserializedStudent.getName());
            System.out.println("Tuổi: " + deserializedStudent.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
