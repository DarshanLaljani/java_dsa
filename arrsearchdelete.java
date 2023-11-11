import java.util.Scanner;

class City {
    private String name;
    private int x;
    private int y;

    public City(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}

class CityDatabase {
    private City[] cities;
    private int size;

    public CityDatabase() {
        cities = new City[10];
        size = 0;
    }

    // Insert a record
    public void insert(String name, int x, int y) {
        City city = new City(name, x, y);
        if (size == cities.length) {
            City[] temp = new City[cities.length * 2];
            for (int i = 0; i < cities.length; i++) {
                temp[i] = cities[i];
            }
            cities = temp;
        }
        cities[size] = city;
        size++;
    }

    // Delete a record by name
    public void deleteByName(String name) {
        for (int i = 0; i < size; i++) {
            if (cities[i].getName().equals(name)) {
                for (int j = i; j < size - 1; j++) {
                    cities[j] = cities[j + 1];
                }
                size--;
                break;
            }
        }
    }

    // Delete a record by coordinates
    public void deleteByCoordinates(int x, int y) {
        for (int i = 0; i < size; i++) {
            if (cities[i].getX() == x && cities[i].getY() == y) {
                for (int j = i; j < size - 1; j++) {
                    cities[j] = cities[j + 1];
                }
                size--;
                break;
            }
        }
    }

    // Search a record by name
    public City searchByName(String name) {
        for (int i = 0; i < size; i++) {
            if (cities[i].getName().equals(name)) {
                return cities[i];
            }
        }
        return null;
    }

    // Search a record by coordinates
    public City searchByCoordinates(int x, int y) {
        for (int i = 0; i < size; i++) {
            if (cities[i].getX() == x && cities[i].getY() == y) {
                return cities[i];
            }
        }
        return null;
    }

    // Print all records within a given distance of a specified point
    public void printWithinDistance(int x, int y, int distance) {
        for (int i = 0; i < size; i++) {
            if (distance(cities[i].getX(), cities[i].getY(), x, y) <= distance) {
                System.out.println(cities[i]);
            }
        }
    }

    // Distance formula
    private double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Display
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(cities[i].toString());
        }
    }
}

public class arrsearchdelete {
    public static void main(String[] args) {
        CityDatabase db = new CityDatabase();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert a record");
            System.out.println("2. Delete a record by name");
            System.out.println("3. Delete a record by coordinates");
            System.out.println("4. Search a record by name");
            System.out.println("5. Search a record by coordinates");
            System.out.println("6. Print all records within a given distance of a specified point");
            System.out.println("7. Display the entries Till now");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String name = sc.next();
                    System.out.print("Enter x coordinate: ");
                    int x = sc.nextInt();
                    System.out.print("Enter y coordinate: ");
                    int y = sc.nextInt();
                    db.insert(name, x, y);
                    break;

                case 2:
                    System.out.print("Enter city name: ");
                    name = sc.next();
                    db.deleteByName(name);
                    break;

                case 3:
                    System.out.print("Enter x coordinate: ");
                    x = sc.nextInt();
                    System.out.print("Enter y coordinate: ");
                    y = sc.nextInt();
                    db.deleteByCoordinates(x, y);
                    break;

                case 4:
                    System.out.print("Enter city name: ");
                    name = sc.next();
                    City city = db.searchByName(name);
                    if (city == null) {
                        System.out.println("City not found");
                    } else {
                        System.out.println("City found: " + city);
                    }
                    break;

                case 5:
                    System.out.print("Enter x coordinate: ");
                    x = sc.nextInt();
                    System.out.print("Enter y coordinate: ");
                    y = sc.nextInt();
                    city = db.searchByCoordinates(x, y);
                    if (city == null) {
                        System.out.println("City not found");
                    } else {
                        System.out.println("City found: " + city);
                    }
                    break;

                case 6:
                    System.out.print("Enter x coordinate: ");
                    x = sc.nextInt();
                    System.out.print("Enter y coordinate: ");
                    y = sc.nextInt();
                    System.out.print("Enter distance: ");
                    int distance = sc.nextInt();
                    db.printWithinDistance(x, y, distance);
                    break;

                case 7:
                    db.display();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please Enter Correct Value!");
                    break;
            }
        }
    }
}
