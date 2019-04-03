import scala.collection.mutable.ArrayBuffer;
import scala.math._;

object convert{
    def main(arg:Array[String]){
        decToBin(14);
        decToOct(14);
        decToHex(14);
        binToDec("1110");
        octToDec("16");
        hexToDec("1AE");
    }

    def decToBin(num:Int):Unit = {
        val binary = ArrayBuffer[Int]();
        var r = 0;
        var n = num;

        while(n!=0){
            r = n%2;
            n = n/2;
            binary.append(r);
        }

        var len= binary.length;

        for(i <- (0 to (len-1)).reverse){
            print(binary(i));
        }
        println();
    }

    def decToOct(num:Int){
        val octal = ArrayBuffer[Int]();
        var r = 0;
        var n = num;

        while(n!=0){
            r = n%8;
            n = n/8;
            octal.append(r);
        }

        var len= octal.length;

        for(i <- (0 to (len-1)).reverse){
            print(octal(i));
        }
        println();
    }

    def decToHex(num:Int){
        val hex = ArrayBuffer[Int]();
        var r = 0;
        var n = num;

        while(n!=0){
            r = n%16;
            n = n/16;
            hex.append(r);
        }

        var len= hex.length;

        for(i <- (0 to (len-1)).reverse){
            if(hex(i)<10){
                print(hex(i));
            }
            else{
                print(('A' + (hex(i)-10)).toChar);
            }
        }
        println();
    }

    def binToDec(num:String): Unit = {
        var binary = num.map(_.asDigit);
        var len = binary.length;
        var dec = 0;

        for(i <- 0 to len-1){
            dec = dec + binary(i)*pow(2,len-i-1).toInt;
        }
        println(dec);
    }

    def octToDec(num:String): Unit = {
        var octal = num.map(_.asDigit);
        var len = octal.length;
        var dec = 0;

        for(i <- 0 to len-1){
            dec = dec + octal(i)*pow(8,len-i-1).toInt;
        }
        println(dec);
    }

    def hexToDec(num:String): Unit = {
        var hex = num.map(_.asDigit);
        println(hex);
        var len = hex.length;
        var dec = 0;

        for(i <- 0 to len-1){
            dec = dec + hex(i)*pow(16,len-i-1).toInt;
        }
        println(dec);
    }
}