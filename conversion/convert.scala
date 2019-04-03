import scala.collection.mutable.ArrayBuffer;
import scala.math._;

object convert{
    def main(arg:Array[String]){
        println("-----CONVERTER-----");
        var op = 0;
        while(true){
            println("\n\nSelect Option\n");
            println("1.Decimal to Binary");
            println("2.Decimal to Octal");
            println("3.Decimal to Hexadecimal");
            println("4.Binary to Decimal");
            println("5.Octal to Decimal");
            println("6.Hexadecimal to Decimal");
            println("7.Binary to Octal");
            println("8.Binary to Hexadecimal");
            println("9.Octal to Binary");
            println("10.Hexadecimal to Binary");
            println("11.Octal to Hexadecimal");
            println("12.Hexadecimal to Octal");
            println("13.EXIT");

            op = scala.io.StdIn.readLine("\nEnter option: ").toInt;

            op match{
                case 1 =>
                var n = scala.io.StdIn.readLine("\nEnter decimal value: ").toInt;
                decToBin(n);
                case 2 =>
                var n = scala.io.StdIn.readLine("\nEnter decimal value: ").toInt;
                decToOct(n);
                case 3 =>
                var n = scala.io.StdIn.readLine("\nEnter decimal value: ").toInt;
                decToHex(n);
                case 4 =>
                var n = scala.io.StdIn.readLine("\nEnter binary value: ");
                var num = binToDec(n);
                println("\n Decimal representation: " + num);
                case 5 =>
                var n = scala.io.StdIn.readLine("\nEnter octal value: ");
                var num = octToDec(n);
                println("\n Decimal representation: " + num);
                case 6 =>
                var n = scala.io.StdIn.readLine("\nEnter hexadecimal value: ");
                var num = hexToDec(n);
                println("\n Decimal representation: " + num);
                case 7 =>
                var n = scala.io.StdIn.readLine("\nEnter binary value: ");
                var num = binToDec(n);
                decToOct(num);
                case 8 =>
                var n = scala.io.StdIn.readLine("\nEnter binary value: ");
                var num = binToDec(n);
                decToHex(num);
                case 9 =>
                var n = scala.io.StdIn.readLine("\nEnter octal value: ");
                var num = octToDec(n);
                decToBin(num);
                case 10 =>
                var n = scala.io.StdIn.readLine("\nEnter hexadecimal value: ");
                var num = hexToDec(n);
                decToBin(num);
                case 11 =>
                var n = scala.io.StdIn.readLine("\nEnter octal value: ");
                var num = octToDec(n);
                decToHex(num);
                case 12 =>
                var n = scala.io.StdIn.readLine("\nEnter hexadecimal value: ");
                var num = hexToDec(n);
                decToOct(num);
                case 13 =>System.exit(1);
                case _ =>
                println("\nInvalid selection");
            }
        }
        // decToBin(14);
        // decToOct(14);
        // decToHex(14);
        // binToDec("1110");
        // octToDec("16");
        // hexToDec("1AE");
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

        print("\nBinary representation: ");

        for(i <- (0 to (len-1)).reverse){
            print(binary(i));
        }
        println();
    }

    def decToOct(num:Int): Unit = {
        val octal = ArrayBuffer[Int]();
        var r = 0;
        var n = num;

        while(n!=0){
            r = n%8;
            n = n/8;
            octal.append(r);
        }

        var len= octal.length;

        print("\nOctal representation: ");

        for(i <- (0 to (len-1)).reverse){
            print(octal(i));
        }
        println();
    }

    def decToHex(num:Int): Unit = {
        val hex = ArrayBuffer[Int]();
        var r = 0;
        var n = num;

        while(n!=0){
            r = n%16;
            n = n/16;
            hex.append(r);
        }

        var len= hex.length;

        print("\nHexadecimal representation: ");

        for(i <- (0 to (len-1)).reverse){
            
            if(hex(i)<10){
                    print(hex(i));
            }
            else {
                print(('A' + (hex(i)-10)).toChar);
            }
        }
        println();
    }

    def binToDec(num:String): Int = {
        var binary = num.map(_.asDigit);
        var len = binary.length;
        var dec = 0;

        for(i <- 0 to len-1){
            dec = dec + binary(i)*pow(2,len-i-1).toInt;
        }
        return dec;
        //println(dec);
    }

    def octToDec(num:String): Int = {
        var octal = num.map(_.asDigit);
        var len = octal.length;
        var dec = 0;

        for(i <- 0 to len-1){
            dec = dec + octal(i)*pow(8,len-i-1).toInt;
        }
        return dec;
       // println(dec);
    }

    def hexToDec(num:String): Int = {
        var hex = num.map(_.asDigit);
        //println(hex);
        var len = hex.length;
        var dec = 0;

        for(i <- 0 to len-1){
            dec = dec + hex(i)*pow(16,len-i-1).toInt;
        }
        return dec;
        //println(dec);
    }
}