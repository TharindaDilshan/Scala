object numeric{
    def main(args: Array[String]){
        val ones = Array("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        var teens = Array("Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen");
        var tens = Array("Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety");
        var number = new Array[Int](6);

        var num = scala.io.StdIn.readLine().toArray;

        var len = num.length;
    

        len match{
            case 1 =>
                var index = num(0).toInt-49;
                println(ones(index));
            case 2 =>
                var n = num(0).toInt-48;
                var m = num(1).toInt-48;
                if(n==1 && m!=0){
                    println(teens(m-1));
                }else if(m==0){
                    println(tens(n-1));
                }else{
                    print(tens(n-1));
                    print(" "+ones(m-1));
                }
            case 3 =>
                var p = num(0).toInt-48;
                var n = num(1).toInt-48;
                var m = num(2).toInt-48;

                if(m==0 && n==0){
                    printf(ones(p-1)+" Hundred");
                }else if(n==1 && m!=0){
                    println(ones(p-1)+" Hundred and "+teens(m-1));
                }else if(m==0){
                    println(ones(p-1)+" Hundred and "+tens(n-1));
                }else if(n==0){
                    println(ones(p-1)+" Hundred and "+ones(m-1));
                }else{
                    print(ones(p-1)+" Hundred and ");
                    print(tens(n-1));
                    print(" "+ones(m-1));
                }
            case 4 =>
                var q = num(0).toInt-48;
                var p = num(1).toInt-48;
                var n = num(2).toInt-48;
                var m = num(3).toInt-48;

                if(p==0 && n==0 && m==0){
                    printf(ones(q-1)+" Thousand");
                }else if(p==0 && n==1 && m!=0){
                    printf(ones(q-1)+" Thousand and "+teens(m-1));
                }else if(p==0 && m==0){
                    printf(ones(q-1)+" Thousand and "+tens(n-1));
                }


                
            case 5 =>
            case 6 =>
            case _ =>
        }
    }
}