object cal{
    def main(args:Array[String]){
        
        var total=scala.io.StdIn.readLine("Enter Expression:\n").toDouble;
        var num2=0.0;
        var op ="0";
        
        while(true){
            var in = scala.io.StdIn.readLine;
            if(in=="="){
                //total=total+num2;
                total=(total-(total%0.01));
                println("Value: "+total);
                System.exit(1);
            }
            var num2=scala.io.StdIn.readLine.toDouble;
            
            
            in match{
                case "+" => total=total+num2;
                case "-" => total=total-num2;
                case "*" => total=total*num2;
                case "/" => total=total/num2;
                case _ => println("Invalid operator");
            }
                
            
        }
    }
}