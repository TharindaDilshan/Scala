object cal{
    def main(args:Array[String]){
        var total=0.0;
        var num2=0.0;
        var op ="0";
        println("Enter Expression: ");
        while(true){
            var in = scala.io.StdIn.readLine;
            if(in=="="){
                total=total+num2;
                total=(total-(total%0.01));
                println("Value: "+total);
                System.exit(1);
            }else{
                in match{
                    case "+" => total=total+num2;
                    case "-" => total=total-num2;
                    case "*" => total=total*num2;
                    case "/" => total=total/num2;
                    case _ => num2=in.toFloat;
                }
                
            }
        }
    }
}