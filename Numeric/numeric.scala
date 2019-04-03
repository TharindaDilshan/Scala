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
                println(ones(i1) + " Hundred " + teens(i3));
            }
            else{
                println(ones(i1) + " Hundred " + tens(i2) + " " + ones(i3));
            }
            case 4 =>//1234
            var i1 = n(0);
            var i2 = n(1);
            var i3 = n(2);
            var i4 = n(3);
            if(isZero(i2)){
               if(isOne(i3) && !isZero(i4)){
                   if(isZero(i2)){
                       println(ones(i1) + " Thousand " + teens(i4));
                   }
                   else{
                       println(ones(i1) + " Thousand " + ones(i2) + " Hundred " + teens(i4));
                   }
               }
               else{
                   println(ones(i1) + " Thousand " + tens(i3) + ones(i4));       
                }
            } 
            else{
                println(ones(i1) + " Thousand " + ones(i2) + " Hundred " + tens(i3) + " " + ones(i4));
            }
            case 5 =>//12345 
            var i1 = n(0);
            var i2 = n(1);
            var i3 = n(2);
            var i4 = n(3);
            var i5 = n(4);
            if(isOne(i4) && !isZero(i5)){
                if(isOne(i1) && !isZero(i2)){
                    if(isZero(i3)){
                        println(teens(i2) + " Thousand " + teens(i5));
                    }
                    else{
                        println(teens(i2) + " Thousand " + ones(i3) + " Hundred " + teens(i5));
                    }
                }
                else if(isOne(i1) && isZero(i2)){
                    if(isZero(i3)){
                        println(tens(i1) + " Thousand " + teens(i5));
                    }
                    else{
                        println(tens(i1) + " Thousand " + ones(i3) + " Hundred " + teens(i5));
                    }
                }
                else{
                    if(isZero(i3)){
                        println(tens(i1) + ones(i2) + " Thousand " + teens(i5));
                    }
                    else{
                        println(tens(i1) + ones(i2) + " Thousand " + ones(i3) + " Hundred " + teens(i5));
                    }
                }
            }
            else if(isOne(i4) && isZero(i5)){
                 if(isOne(i1) && !isZero(i2)){
                    if(isZero(i3)){
                        println(teens(i2) + " Thousand " + tens(i4));
                    }
                    else{
                        println(teens(i2) + " Thousand " + ones(i3) + " Hundred " + tens(i4));
                    }
                }
                else if(isOne(i1) && isZero(i2)){
                    if(isZero(i3)){
                        println(tens(i1) + " Thousand " + tens(i4));
                    }
                    else{
                        println(tens(i1) + " Thousand " + ones(i3) + " Hundred " + tens(i4));
                    }
                }
                else{
                    if(isZero(i3)){
                        println(tens(i1) + ones(i2) + " Thousand " + tens(i4));
                    }
                    else{
                        println(tens(i1) + ones(i2) + " Thousand " + ones(i3) + " Hundred " + tens(i4));
                    }
                }
            }
            else{
               if(isOne(i1) && !isZero(i2)){
                    if(isZero(i3)){
                        println(teens(i2) + " Thousand " + tens(i4) + ones(i5));
                    }
                    else{
                        println(teens(i2) + " Thousand " + ones(i3) + " Hundred " + tens(i4) + ones(i5));
                    }
                }
                else if(isOne(i1) && isZero(i2)){
                    if(isZero(i3)){
                        println(tens(i1) + " Thousand " + tens(i4) + ones(i5));
                    }
                    else{
                        println(tens(i1) + " Thousand " + ones(i3) + " Hundred " + tens(i4) + ones(i5));
                    }
                }
                else{
                    if(isZero(i3)){
                        println(tens(i1) + ones(i2) + " Thousand " + tens(i4) + ones(i5));
                    }
                    else{
                        println(tens(i1) + ones(i2) + " Thousand " + ones(i3) + " Hundred " + tens(i4) + ones(i5));
                    }
                } 
            }
            case 6 =>
            var i1 = n(0);
            var i2 = n(1);
            var i3 = n(2);
            var i4 = n(3);
            var i5 = n(4);
            var i6 = n(5);
            if(isOne(i1) && isZero(i2) && isZero(i3) && isZero(i4) && isZero(i5) && isZero(i6)){
                println(ones(i1) + " Hundred Thousand");
            }
            else{
                println("Out of range");
            }
            case _ => println("Out of range");
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