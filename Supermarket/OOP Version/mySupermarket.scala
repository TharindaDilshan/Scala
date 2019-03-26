import scala.io.StdIn
class Item(val a:Int, val b:String, val c:Int, val d:Int){
	var itemID:Int = a;
	var itemName:String = b;
	var itemPrice:Int = c;
	var itemStock:Int = d;

	def addStock(e:Int):Unit = {
		itemStock += e;
	}

	def removeStock(e:Int):Unit = {
		itemStock -= e;
	}
}

object mySupermarket{
	def main(args: Array[String]){
		var stock:Array[Item] = new Array[Item](3);
		stock(0) = new Item(1,"APPLES",65,3000);
		stock(1) = new Item(2,"ORANGES",55,3500);
		stock(2) = new Item(3,"PEARS",70,2800);

		do{
			println("\n\nWelcome to SUPERMARKET");
			println("1. View Items");
			println("2. Buy Items");
			println("3. Restock");
			println("4. Exit");
			var option = readLine("\nPlease enter your option: ");

			option.toInt match{
				case 1 => view(stock);
				case 2 => buy(stock);
				case 3 => restock(stock);
				case 4 => System.exit(1);
				case _ => println("Invalid Option. Please try again");
			}
		}
		while(true);
	}

	def view(array:Array[Item]):Unit = {
		println("\nItem Id\t\tItem Name\tItem Price\tStock");
		for(x <- array){
			println(x.itemID+ "\t\t" + x.itemName + "\t\t" + x.itemPrice  + "\t\t" + x.itemStock);
		}
		println("\n");
	}

	def buy(array:Array[Item]):Unit = {
		var bill: Int = 0;
		var cont:String = "YES";

		while(cont.toUpperCase() == "YES"){
			var x:Int = 0;
			var buyingItem = readLine("\nWhat do you wish to buy: ");

			while(x<3 && array(x).itemName!=buyingItem.toUpperCase()){
				x+=1;
			}

			if(x>=3){
				println("There is no such item");
			}
			else{
				var buyingQty = readLine("How many " + buyingItem + " do you need: ");

				if(array(x).itemStock < buyingQty.toInt){
				println("Insufficient stock");
				}
				else{
					array(x).removeStock(buyingQty.toInt);
					bill +=buyingQty.toInt*array(x).itemPrice;
				}

				cont = readLine("Do you wish to buy more items:(yes/no): ");
			}
		}
		println("\nYour Total bill = " + bill);
		println("Thank you. Have a nice day!");
	}

	def restock(array:Array[Item]):Unit = {
		var cont:String = "YES";

		while(cont.toUpperCase() == "YES"){
			var x:Int = 0;
			var restockItem = readLine("\nRestock Item: ");

			while(x<3 && array(x).itemName != restockItem.toUpperCase()){
				x+=1;
			}

			if(x>=3){
				println("\nThere is no such Item");
			}
			else{
				var restockQty = readLine("How many " + restockItem + " do you wish stock: ");

				array(x).addStock(restockQty.toInt);
				println("\nSuccessfully restocked\n");
			}

			cont = readLine("Do you wish to restock more Items:(yes/no): ");
		}
	}
}