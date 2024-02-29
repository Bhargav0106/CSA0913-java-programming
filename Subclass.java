class Superclass {
    int value;

    Superclass(int value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value in superclass: " + value);
    }
}

class Subclass extends Superclass {
    int value;

    Subclass(int value1, int value2) {
        super(value1);
        value = value2;
    }

    void display() {
        super.display();
        System.out.println("Value in subclass: " + value);
    }
}

class Main {
    public static void main(String[] args) {
        Subclass obj = new Subclass(100, 200);
        obj.display();
    }
}