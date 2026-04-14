class Task {
    int id;
    Task next;

    Task(int id) { this.id = id; }
}

class CircularList {
    Task head;

    void add(Task t) {
        if (head == null) {
            head = t;
            t.next = head;
            return;
        }
        Task temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = t;
        t.next = head;
    }
}