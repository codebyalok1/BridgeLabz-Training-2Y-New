class Item {
    int id;
    String name;
    int qty;
    double price;
    Item next;
}

class Inventory {
    Item head;

    double totalValue() {
        double sum = 0;
        Item temp = head;
        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        return sum;
    }
}