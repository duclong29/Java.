package exe4;

class Account {
    private String ID;
    private String name;
    private int balance;

    public Account (String ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public String getID () {
        return ID;
    }
    public String getName () {
        return name;
    }
    public int getBalance () {
        return balance;
    }
    public int credit (int amount) {
        balance = balance + amount;
        return balance;
    }
    public int debit (int amount) {
        if (amount <= balance) {
            balance -= amount;
            return balance;
        }
        else {
            System.out.print("amount exceeded");
        }
        return balance;
    }
    public int transferTo (int amount,Account another) {
        if (amount <= balance) {
            another.balance += amount;
            balance -= amount;
        }
        else{
            System.out.printf("amount exceeded");
        }
        return balance;
    }
    public String toString () {
        return ID + " " + name + " " + balance;
    }

    public static void main(String[] args) {
        Account a = new Account("29062000", "chu duc long", 10000);
        Account b = new Account("28052020", "nguyen van tuyen", 50000);
        System.out.println(a.getID());
        System.out.println(a.getName());
        System.out.println(a.getBalance());
        System.out.println(a.credit(3));
        System.out.println(a.debit(3));
        System.out.println(a.transferTo(3, b));
        System.out.println(a);

    }

}
