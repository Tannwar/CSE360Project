public class pizza {
    private boolean cheese, pepperoni, veggi;
    private boolean[] toppings;
    private int id;
    public pizza(int id1, boolean che, boolean pep, boolean veg, boolean[] top){ //bool array has toppings values in this order: mushroom, onion,olive,extra.
        this.id = id1;
        cheese = che;
        pepperoni = pep;
        veggi = veg;
        toppings = new boolean[4];
        toppings = top.clone();
    }
    public String toString(){
        String str = "Student ID: " + id + " Pizza type: ";
        if (cheese == true){
            str += "Cheese.";
        }
        else if (pepperoni == true){
            str += "Pepproni.";
        }
        else{
            str += "Veggi.";
        }
        str += " Toppings: ";
        boolean check = false;
        for (int i = 0; i < toppings.length; i++){
            if(toppings[i] == true){
                check = true;
                if(i == 0){
                    str += "mushroom, ";
                }
                if(i == 1){
                    str += "onion, ";
                }
                if(i == 2){
                    str += "olive, ";
                }
                if(i == 3){
                    str += "Extra cheese, ";
                }
            }
        }
        if(check == false){
            str += "none.";
        }
        else{
            str = str.substring(0, str.length()-2);
            str += ".";
        }
        return str;
    }
}


