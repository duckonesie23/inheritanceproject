import java.util.*;
public class BLT extends Sandwich{
    //instance variable
    Boolean cooked;
    public BLT(){
        super();
        cooked = false;
    }
    public BLT(boolean c){
        super("BLT",11.99, "White", "Bacon","Lettuce","Tomato",12);
        cooked = c;
    }

    public boolean getCooked(){
        return cooked;
    }
    public void setCooked(boolean c){
        cooked = c;
    }

    public void addIngredient(String i){
        ingredients.add(1,i);
        ingredients.add(ingredients.size()-1,i);
    }
    public void makeSymmetrical(){
        ArrayList<String> tempList = (ArrayList<String>) ingredients.clone();
        tempList.remove(ingredients.size()-1);
        for(int i = ingredients.size()-2;i>=0;i--){
            tempList.add(ingredients.get(i));
        }
        ingredients = tempList;
    }
    public void makeOpenSandwich(){
        int size = ingredients.size();
        for(int i = size/2;i>=0;i--){
            ingredients.remove(i);
        }
    }

    public String toString(){
        return super.toString() + "\n"+ cooked;
	}
	public boolean equals(Food other){
	    if(super.equals(other) && other instanceof BLT){
            return true;
        }
        return false;
	}
}
