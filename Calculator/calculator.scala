object cal{
    def main(args:Array[String]){
        var total=0;
        var num1=0;
        var num2=0;
        var op ='0';
        println("Enter Expression: ");
        while(true){
            var in = scala.io.StdIn.readLine;
            if(in=="="){
                total=total+num2;
                println("Value: "+total);
                System.exit(1);
            }else{
                in match{
                    case "+" => total=total+num2;
                    case "-" => total=total-num2;
                    case "*" => total=total*num2;
                    case "/" => total=total/num2;
                    case _ => num2=in.toInt;
                }
                
            }
        }
    }
}