package Assesment;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double pricePerItem;
   // private double invoiceAmount;


    public Invoice(String partNumber, String partDescription, int itemQuantity, double pricePerItem, double invoiceAmount){
    this.partNumber = partNumber;
    this.partDescription = partDescription;
    this.itemQuantity = itemQuantity;
    this.pricePerItem = pricePerItem;
    }

    public Invoice() {

    }


    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;

    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;

    }
    public void setItemQuantity(int itemQuantity){
        if (itemQuantity >= 0){
            this.itemQuantity = itemQuantity;
         // System.out.println(itemQuantity);
        }

    }

    public void setPricePerItem(double pricePerItem){
        if (pricePerItem >= 0.0){
            this.pricePerItem = pricePerItem;
           // System.out.println(pricePerItem);
        }
    }

    public void setInvoiceAmount(double invoiceAmount){
        if (itemQuantity >= 0 || pricePerItem >= 0.0) {
            invoiceAmount = itemQuantity * pricePerItem;
        }
    }

    public String getPartNumber(){
        return partNumber;
    }
    public String getPartDescription(){
        return partDescription;
    }

    public int getItemQuantity(){
        return itemQuantity;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
    public double getInvoiceAmount(){
        return (double) itemQuantity*pricePerItem;
    }
}
