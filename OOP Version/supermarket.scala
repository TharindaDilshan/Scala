//import scala.io.StdIn

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

        //var y=0;
        println("\n\nWELCOME TO CHOCLATE AISLE!\n\n");
        while(true){
            println("1. Buy Items");
            println("2. Add Items");
            println("3. View Items")
            println("4. Exit\n");
            var z = scala.io.StdIn.readLine("Select Option: ");

            z.toInt match{
                case 1 => buy(cart);
                case 2 => add(cart);
                case 3 => view(cart);
                case 4 => System.exit(1);
            }
        }
    }

    def view(cart:Array[Stock]):Unit={
        println("\nItemID\tItem\t\tQuantity\tUnit Price\n");
        for(x <- cart){
            println(x.itemId+"\t"+x.item+"\t\t"+x.quantity+"\t\t\t"+x.price);          
        }
        println("\n");
    } 

    def buy(cart:Array[Stock]):Unit={
        var bill:Int=0;
        var z=1;
        println("\n\n----------BUY ITEMS----------\n\n");
        view(cart);
        while(z!= 0){
            var x=scala.io.StdIn.readLine("Enter Product ID: ").toInt;
            var y=scala.io.StdIn.readLine("Enter Quantity: ").toInt;
            if(y > cart(x-1).quantity){
                println("\n\nInsufficient Stocks. Please buy a smaller quantity\n\n");
            }
            else{
                cart(x-1).purchaseStock(y);
                bill=bill+(y*cart(x-1).price);
            }
            z=scala.io.StdIn.readLine("Enter 1 to Continue or 0 to Generate the Bill: ").toInt;
        }
        println("\nTotal Bill: Rs."+bill + "\n\n");
    }
    def add(cart:Array[Stock]):Unit={
        println("\n\n----------ADD ITEMS TO CART----------\n\n");
        view(cart);
        var z = 1;
        while(z!=0){
            var x=scala.io.StdIn.readLine("Enter Product ID: ").toInt;
            var y=scala.io.StdIn.readLine("Enter Quantity: ").toInt;
            cart(x-1).addStock(y);
            println("\n\n" + y + " " + cart(x-1).item + "s added to cart.\n\n");
            z=scala.io.StdIn.readLine("Enter 1 to Continue Adding Items or 0 to finish: ").toInt;
        }
        println("\n\nUpdated Cart\n");
        view(cart);
    }
}