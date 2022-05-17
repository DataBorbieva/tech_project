package ifElseStatements.ifStatements;

public class BalanceExample {
    public static void main(String[] args){

        double balance = 150;
        //you can use relational and logical operators
        //expression which is going to be true if balance is less than 0
        boolean isBalanceLessThan0 = balance < 0 ;//false // we can not put - or + , cuz we need to compare something we need expression
       boolean isBalanceEquals100 = balance == 0 ; //false
       boolean isBalanceBiggerOrEqualThan1000 = balance >= 1000; //false

       //create an expression  for cheking if balance is not equal to -1

        boolean isBMOne= balance != -1; //true

        if (isBMOne){//if this is true execute otherwise skip
            System.out.println("Your balance is not equals to -1 ");
        }

       // if(statement,expression,boolean){
       //     //action my code to be executed
       // }


    }
}
