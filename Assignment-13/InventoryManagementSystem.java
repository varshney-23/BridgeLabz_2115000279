class Item {
    String name;
    int id, quantity;
    double price;
    Item next;

    public Item(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private Item head;

    public void addItem(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    public void displayInventory() {
        Item temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Qty: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addItem(1, "Desktop", 9, 100000);
        inv.addItem(2, "Earphone", 28, 600);
        inv.displayInventory();
    }
}
