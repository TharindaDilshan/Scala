object supermarket{
    import scala.io.StdIn
    //var supplies = new Array[Int](5,2);
    var supplies = Array(Array(100,200), Array(150,120), Array(300,130));

    def main (args: Array[String]){
        var op =0;
        while(op!=4){
            println("Select Option");
            println("1. Buy Goods");
            println("2. Add Stock");
            println("3. Display Stock");
            println("4. Exit");

            op = readInt();

            op match{
                case 1 =>buyGoods();
                case 2 =>addStock();
                case 3 =>displayStock();  
            }
        }
        //val n:Int = readInt();
        //reduceStock(0,n);
        //println(supplies(0)(0));
        //println(n);
    }

    def buyGoods():Unit = {
        var item = 0;
        var subTotal=0;
        while(item != -1){
            //display list of products
            println("Select product ID");
            var id = readInt();
            println("Enter quantity");
            var n =readInt();
            reduceStock(id,n);
            subTotal = addToBill(id,subTotal,n);
            println("Enter 0 to continue or -1 to finalize bill");
            item = readInt();
        }
        println("Your bill is " + subTotal);
    }

    def addStock():Unit = {
        println("Enter product ID:");
        var id = readInt();
        println("Enter quantity:");
        var n = readInt();
        addProduct(id,n);
    }

    def reduceStock (id:Int, n:Int) : Unit ={
        supplies(id)(0) = supplies(id)(0) - n;
    }

    def addProduct (id:Int, n:Int) : Unit = {
        supplies(id)(0) = supplies(id)(0) + n;
    }

    def addToBill (id:Int, subTotal:Int, n:Int) : Int = {
        var total = subTotal + supplies(id)(1) * n;
        return total;
    }

    def displayStock (): Unit ={
        var i=0;
        var j=0;

        for(i <- 0 to 2){
            println (i, supplies(i)(0), supplies(i)(1));
        }
    }
    
}