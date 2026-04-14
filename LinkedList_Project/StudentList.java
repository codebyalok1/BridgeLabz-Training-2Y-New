class Student {
    int roll;
    String name;
    int age;
    String grade;
    Student next;

    Student(int r, String n, int a, String g) {
        roll = r; name = n; age = a; grade = g;
    }
}

class StudentList {
    Student head;

    void addFirst(Student s) {
        s.next = head;
        head = s;
    }

    void addLast(Student s) {
        if (head == null) { head = s; return; }
        Student temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = s;
    }
}