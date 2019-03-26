object numeric{
    def main(args: Array[String]){
        var ones = Array("One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
        var teens = Array("Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen");
        var tens = Array("Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety");
        var number = new Array[Int](6);

        var num = scala.io.StdIn.readLine()
        num.toInt;
        var index = num - 1;
        println(ones(index));
        //var len = num.length;
    

        // len match{
        //     case 1 =>
        //     //var n = num(0);
        //     num.toInt;
        //     var index = num-1;
        //     // var n = ones(index);
        //     println(ones(index));
        //     case 2 =>
        //     case 3 =>
        //     case 4 =>
        //     case 5 =>
        //     case 6 =>
        //     case _ =>
        // }
    }
}