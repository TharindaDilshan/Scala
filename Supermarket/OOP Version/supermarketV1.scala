//import java.io._

class Stock(val id:Int,val name:String,val quant:Int,val unitPrice:Int){
    var itemId:Int = id;
    var item:String = name;
    var quantity:Int = quant;
    var price:Int = unitPrice;

    def addStock(amount:Int){
        quantity=quantity+amount;
    }
    def purchaseStock(amount:Int){
        quantity=quantity-amount;
    }
}

object supermarket{
    def main(args:Array[String]){
        var cart:Array[Stock]=new Array[Stock](2);
        cart(0)=new Stock(1,"kitKat",100,50);
        cart(1)=new Stock(2,"Galaxy",50,40);

        var y=0;
        while(y!=(-1)){
            view(cart);
            println("\n\n1. Buy Items");
            println("2. Add Items");
            println("3. Exit\n");
            var z = scala.io.StdIn.readLine("Select Option: ");

            z.toInt match{
                case 1 => y=buy(cart,y);
                case 2 => add(cart);
                case 3 => System.exit(1);
            }
        }
    }

    def view(cart:Array[Stock]):Unit={
        println("\n\nWelcome to Chocolate Aisle!\n\n")
        println("\nItemID\tItem\t\tQuantity\tUnit Price\n");
        for(x <- cart){
            println(x.itemId+"\t"+x.item+"\t\t"+x.quantity+"\t\t\t"+x.price);          
        }
    } 

    def buy(cart:Array[Stock],totalBill:Int):Int={
        var bill:Int=totalBill;
        var z=1;
        while(z!= 0){
            var x=scala.io.StdIn.readLine("Enter Product ID: ").toInt;
            var y=scala.io.StdIn.readLine("Enter Quantity: ").toInt;
            cart(x-1).purchaseStock(y);
            bill=bill+(y*cart(x-1).price);
            z=scala.io.StdIn.readLine("Enter 1 to Continue or 0 to Generate the Bill: ").toInt;
            if(z==1){
                return bill;
            }
        }
        println("\nTotal Bill: Rs."+bill);
        return -1;
    }
    def add(cart:Array[Stock]):Int={
        var x=scala.io.StdIn.readLine("Enter Product ID: ").toInt;
        var y=scala.io.StdIn.readLine("Enter Quantity: ").toInt;
        cart(x-1).addStock(y);
        return 1;
    }
}