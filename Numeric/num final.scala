object number{
	def main(args:Array[String]){
		var ones = Array("","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
		var decimal = Array("Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        var teens = Array("","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen");
        var tens = Array("","Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety");
		
		var num = scala.io.StdIn.readLine("Enter number (0-100000): ");
        var n = num.map(_.asDigit);
		var len = n.length;
		var countDigit=0;
		var countDecimal=0;
		var i=0;
		while(countDigit!=len && n(i)!= -1){
			countDigit += 1;
			i += 1;
		}
		i=0;
		for(i<-countDigit+1 to len-1){	
			countDecimal+=1;
		}
		
		countDigit match{
            case 1 =>
				var index = n(0);
				print(decimal(index));
            case 2 =>
				var i1 = n(0);
				var i2 = n(1);
				if(isOne(i1) && isZero(i2)){
					print(tens(i2+1));
				}
				else if(isOne(i1)){
					print(teens(i2));
				}
				else if(isZero(i2)){
					print(tens(i1));
				}
				else{
					print(tens(i1)+ " " + ones(i2));
				}
            case 3 => //123
				var i1 = n(0);
				var i2 = n(1);
				var i3 = n(2);
				if(isOne(i2) && !isZero(i3)){
					print(ones(i1) + " Hundred " + teens(i3));
				}
				else{
					print(ones(i1) + " Hundred " + tens(i2) + " " + ones(i3));
				}
            case 4 =>//1234
				var i1 = n(0);
				var i2 = n(1);
				var i3 = n(2);
				var i4 = n(3);
				if(isZero(i2)){
				   if(isOne(i3) && !isZero(i4)){
					   if(isZero(i2)){
						   print(ones(i1) + " Thousand " + teens(i4));
					   }
					   else{
						   print(ones(i1) + " Thousand " + ones(i2) + " Hundred " + teens(i4));
					   }
				   }
				   else{
					   print(ones(i1) + " Thousand " + tens(i3) + ones(i4));       
					}
				} 
				else{
					print(ones(i1) + " Thousand " + ones(i2) + " Hundred " + tens(i3) + " " + ones(i4));
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
							print(teens(i2) + " Thousand " + teens(i5));
						}
						else{
							print(teens(i2) + " Thousand " + ones(i3) + " Hundred " + teens(i5));
						}
					}
					else if(isOne(i1) && isZero(i2)){
						if(isZero(i3)){
							print(tens(i1) + " Thousand " + teens(i5));
						}
						else{
							print(tens(i1) + " Thousand " + ones(i3) + " Hundred " + teens(i5));
						}
					}
					else{
						if(isZero(i3)){
							print(tens(i1) + ones(i2) + " Thousand " + teens(i5));
						}
						else{
							print(tens(i1) + ones(i2) + " Thousand " + ones(i3) + " Hundred " + teens(i5));
						}
					}
				}
				else if(isOne(i4) && isZero(i5)){
					 if(isOne(i1) && !isZero(i2)){
						if(isZero(i3)){
							print(teens(i2) + " Thousand " + tens(i4));
						}
						else{
							print(teens(i2) + " Thousand " + ones(i3) + " Hundred " + tens(i4));
						}
					}
					else if(isOne(i1) && isZero(i2)){
						if(isZero(i3)){
							print(tens(i1) + " Thousand " + tens(i4));
						}
						else{
							print(tens(i1) + " Thousand " + ones(i3) + " Hundred " + tens(i4));
						}
					}
					else{
						if(isZero(i3)){
							print(tens(i1) + ones(i2) + " Thousand " + tens(i4));
						}
						else{
							print(tens(i1) + ones(i2) + " Thousand " + ones(i3) + " Hundred " + tens(i4));
						}
					}
				}
				else{
				   if(isOne(i1) && !isZero(i2)){
						if(isZero(i3)){
							print(teens(i2) + " Thousand " + tens(i4) + ones(i5));
						}
						else{
							print(teens(i2) + " Thousand " + ones(i3) + " Hundred " + tens(i4) + ones(i5));
						}
					}
					else if(isOne(i1) && isZero(i2)){
						if(isZero(i3)){
							print(tens(i1) + " Thousand " + tens(i4) + ones(i5));
						}
						else{
							print(tens(i1) + " Thousand " + ones(i3) + " Hundred " + tens(i4) + ones(i5));
						}
					}
					else{
						if(isZero(i3)){
							print(tens(i1) + ones(i2) + " Thousand " + tens(i4) + ones(i5));
						}
						else{
							print(tens(i1) + ones(i2) + " Thousand " + ones(i3) + " Hundred " + tens(i4) + ones(i5));
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
					print(ones(i1) + " Hundred Thousand");
				}
				else{
					print("Out of range");
				}
				case _ => print("Out of range");
			}
		if(countDecimal!=0){
			countDecimal match{
				case 1 =>
					var n1=n(countDigit+countDecimal);
					print(" Point "+decimal(n1));
				case 2 =>
					var n1=n(countDigit+countDecimal-1);
					var n2=n(countDigit+countDecimal);
					print(" Point "+decimal(n1)+" "+decimal(n2));
				case 3 =>
					var n1=n(countDigit+countDecimal-2);
					var n2=n(countDigit+countDecimal-1);
					var n3=n(countDigit+countDecimal);
					print(" Point "+decimal(n1)+" "+decimal(n2)+" "+decimal(n3));
				case _ =>
					print("Out of Range");
			}
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