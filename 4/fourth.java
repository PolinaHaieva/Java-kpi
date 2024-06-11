// This Java code defines a class Student with properties such as first name, last name, age, faculty, and mark.
// It also includes a method to sort an array of Student objects by age in both ascending and descending order.

class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String faculty;
    private double mark;

    // Constructor to initialize Student objects
    public Student(String first_name, String last_name, int age, String faculty, double mark) {
        this.firstName = first_name;
        this.lastName = last_name;
        this.age = age;
        this.faculty = faculty;
        this.mark = mark;
    }

    // Override toString() method to provide a string representation of Student object
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + faculty + " " + mark;
    }

    // Getter method to retrieve the age of the student
    public int getAge() {
        return age;
    }
}

public class fourth {
    // Method to sort an array of Student objects by age in descending order
    public static void sortStudentsByAge(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getAge() < key.getAge()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Array of Student objects
        Student[] students = new Student[5];

        // Initializing Student objects with sample data
        students[0] = new Student("Іван", "Іванович", 20, "ФІОТ", 85.5);
        students[1] = new Student("Вікторія", "Петрівна", 19, "ФСП", 92.0);
        students[2] = new Student("Марія", "Сидорівна", 21, "ФЛ", 78.5);
        students[3] = new Student("Василь", "Ігнатович", 30, "ФЕА", 90.5);
        students[4] = new Student("Максим", "Андрійович", 15, "ІПСА", 60.5);

        // Sort the students by age in descending order
        sortStudentsByAge(students);
        System.out.println("# Сортування за зростанням віку:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Reverse the array to sort students by age in ascending order
        for (int i = 0; i < students.length / 2; i++) {
            Student temp = students[i];
            students[i] = students[students.length - 1 - i];
            students[students.length - 1 - i] = temp;
        }

        System.out.println();
        System.out.println("# Сортування за спаданням віку:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
