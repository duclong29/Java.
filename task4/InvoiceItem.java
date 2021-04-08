package exe4;

class InvoiceItem {
    private String ID;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem (String ID, String desc, int qty, double unitPrice) {
        this.ID = ID;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getID () {
        return ID;
    }
    public String getDesc () {
        return desc;
    }
    public int getQty () {
        return qty;
    }
    public void setQty (int qty) {
        this.qty = qty;
    }
    public double getUnitPrice () {
        return unitPrice;
    }
    public void setUnitPrice (double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public String  total () {
        return "Total : " + unitPrice * qty;
    }
    public String toString () {
        return "InvoiceItem [ " + ID + "," + desc + "," + qty + "," + unitPrice + "]";
    }

    public static void main(String[] args) {
        InvoiceItem i = new InvoiceItem("long290620", "chu duc long", 5, 200);
        System.out.println(i.getID());
        System.out.println(i.getDesc());
        System.out.println(i.getQty());
        System.out.println(i.getUnitPrice());
        System.out.println(i.total());
        System.out.println(i);
        System.out.println("----------------");
        i.setQty(10);
        System.out.println(i.getQty());
        i.setUnitPrice(300);
        System.out.println(i.getUnitPrice());
        System.out.println(i.total());
        System.out.println(i);

    }
}
