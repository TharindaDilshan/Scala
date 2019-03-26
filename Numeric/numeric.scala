object numeric{
    def main(args: Array[String]){
        var ones = Array("","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        var teens = Array("","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen");
        var tens = Array("","Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety");
        var number = new Array[Int](6);

        //var num = scala.io.StdIn.readLine().toArray;
        // var n = num.toInt;
        // var index = n - 1;
        // println(ones(index));
        // var intNum = num.map(x=>x.toInt);
        // var len = num.length;
        // println(num(0));

        var num = scala.io.StdIn.readLine();
        var n = num.map(_.asDigit);
        var len = n.length;
        // println(len);
        // println(n(0));

        len match{
            case 1 =>
            var index = n(0);
            println(ones(index));
            case 2 =>
            var i1 = n(0);
            var i2 = n(1);
            if(isOne(i1) && isZero(i2)){
                println(tens(i2+1));
            }
            else if(isOne(i1)){
                println(teens(i2));
            }
            else if(isZero(i2)){
                println(tens(i1));
            }
            else{
                println(tens(i1)+ " " + ones(i2));
            }
            case 3 => //123
            var i1 = n(0);
            var i2 = n(1);
            var i3 = n(2);
            if(isOne(i2) && !isZero(i3)){
                println(ones(i1) + " Hundered " + teens(i3));
            }
            else{
                println(ones(i1) + " Hundered " + tens(i2) + " " + ones(i3));
            }
            case 4 =>//1234
            var i1 = n(0);
            var i2 = n(1);
            var i3 = n(2);
            var i4 = n(3);
            
            case 5 =>//12345
            var i1 = n(0)-1;
            var i2 = n(1)-1;
            var i3 = n(2)-1;
            var i4 = n(3)-1;
            var i5 = n(4)-1;
            
            case 6 =>
            case _ =>
        }
    }

    def isOne(x: Int):Boolean ={
        if(x==1){
            return true;
        }
        else{
            return false;
        }
    }

    def isZero(x:Int): Boolean = {
        if(x==0){
            return true;
        }
        else{
            return false;
        }
    }
}