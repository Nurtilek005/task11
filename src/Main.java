import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        University university = new University();
        Object[] univer = new Object[4];
        School school = new School();
        Object[] schols = new Object[3];
        Person person = new Person();
        Object[] persons = new Object[2];
        Car car = new Car();
        Object[] cars = new Object[4];

        while (true) {
            System.out.println("1 - UNVERSITY\n2 - SCHOOL\n3 - PERSON\n4 - CAR");
            System.out.print("Select an action: ");
            int x = scan.nextInt();
            switch (x) {
                // UNVERSITY
                case 1:
                    System.out.print("Дайте название (универститету): ");
                    univer[0] = university.setNameUniver(scan.next());

                    System.out.print("Напишите когда был основан (университет): ");
                    univer[1] = university.setDatafoundation(scan.nextInt());

                    System.out.print("Какой професии обучают: ");
                    univer[2] = university.setOrintion(scan.next());

                    System.out.print("Имя вашего учителя: ");
                    univer[3] = person.setName(scan.next());
                    for (int i = 0; i < univer.length; i++) {
                        System.out.println("=============================================");
                        System.out.println("*|UNIVERSITY|*:");
                        System.out.println("Name: " + university.getNameUniver());
                        System.out.println("Based: " + university.getDatafoundation());
                        System.out.println("Orintion: " + university.getOrintion());
                        System.out.println("Mentor: " + person.getName());
                        System.out.println("=============================================");
                        break;
                    }
                    break;
                case 2:
                    // SCHOL
                    System.out.print("Write school number: ");
                    schols[0] = school.setNumberSchool(Integer.parseInt(scan.next()));

                    System.out.print("Write students quantity: ");
                    schols[1] = school.setQuantityStudents(Integer.parseInt(scan.next()));
                    scan.nextLine();

                    System.out.print("Write Mentor name: ");
                    schols[2] = person.setName(scan.nextLine());

                    for (int i = 0; i < schols.length; i++) {
                        System.out.println("=============================================");
                        System.out.println("*|SCHOOL|*:");
                        System.out.println("Number school: " + school.getNumberSchool());
                        System.out.println("Quantity of students: " + school.getQuantityStudents());
                        System.out.println("Mentor: " + person.getName());
                        System.out.println("=============================================");
                        break;
                    }
                    break;
                case 3:
                    // PERSON
                    System.out.print("Name: ");
                    persons[0] = person.setName(scan.next());

                    System.out.print("Age: ");
                    persons[1] = person.setAge(scan.nextInt());
                    for (int i = 0; i < persons.length; i++) {
                        System.out.println("=============================================");
                        System.out.println("*|PERSON|*:");
                        System.out.println("Name: " + person.getName());
                        System.out.println("Age: " + person.getAge());
                        System.out.println("=============================================");
                        break;
                    }
                    break;
                case 4:
                    // CAR
                    System.out.print("Write driver name: ");
                    cars[0] = person.setName(scan.next());

                    System.out.print("Write brand car: ");
                    cars[1] = car.setBrand(scan.next());

                    System.out.print("Write car number: ");
                    cars[2] = car.setNumber(scan.nextInt());

                    System.out.print("Write speed car: ");
                    cars[3] = car.setSpeed(scan.nextInt());
                    for (int i = 0; i < cars.length; i++) {
                        System.out.println("=============================================");
                        System.out.println("*|SCHOOL|*:");
                        System.out.println("Driver name: " + car.getName());
                        System.out.println("Brand: " + car.getBrand());
                        System.out.println("Car number: " + car.getNumber());
                        System.out.println("Speed: " + car.getSpeed());
                        System.out.println("=============================================");
                        break;
                    }
                    break;
            }
        }
    }
}

