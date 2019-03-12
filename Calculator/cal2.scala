<<<<<<< HEAD
object cal2{
    def main(args: Array[String]){
        var n = 0.0;
        var op = "0";
        var total = 0.0;

        println("Enter expression:");
        total = scala.io.StdIn.readLine.toInt;

        while(true){
            var op = scala.io.StdIn.readLine;
            
            if (op == "="){
                println ("Total = " + total);
                System.exit(1);
            }

            n = scala.io.StdIn.readLine.toFloat;
            op match{
                case "+" => total = total + n;
                case "-" => total = total - n;
                case "*" => total = total * n;
                case "/" => total = total / n;
                case _ => println("Undefined operator");
            }
        }
    }
=======
object cal2{
    def main(args: Array[String]){
        var n = 0;
        var op = "0";
        var total = 0;

        println("Enter expression:");
        total = scala.io.StdIn.readLine.toInt;

        while(true){
            var op = scala.io.StdIn.readLine;
            
            if (op == "="){
                println ("Total = " + total);
                System.exit(1);
            }

            n = scala.io.StdIn.readLine.toInt;
            op match{
                case "+" => total = total + n;
                case "-" => total = total - n;
                case "*" => total = total * n;
                case "/" => total = total / n;
                case _ => println("Undefined operator");
            }
        }
    }
>>>>>>> 0cb6fe346bc9c01a33a1aee32e1531e3b25fdbe3
}