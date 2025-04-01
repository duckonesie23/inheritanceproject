import java.util.*;
public class Sandwich extends Food{
    int length;
    public Sandwich(){
        super();
        ingredients.add("Bread");
        ingredients.add("Bread");
        length = 12;
    }
    public Sandwich(String n, double p, String bread, String i1, String i2, String i3, int len){
        super(n,p,i1,i2,i3);
        ingredients.add(0,bread);
        ingredients.add(ingredients.size(),bread);
        length = len;
    }
    
    public int getLength(){
        return length;
    }
    public void setLength(int len){
        length = len;
    }

    //Override one interesting method
    //adds under top bread
    public void addIngredient(String i){
        ingredients.add(1,i);
    }
    
    public String toString(){
        return super.toString() +"\n" +listIngredients();
	}
	public boolean equals(Food other){
	    if(super.equals(other) && this.ingredients.equals(other.ingredients)){
            return true;
        }
        return false;
	}

    //two unique methods
    public void substituteBread(String bread){
        ingredients.set(0,bread);
        ingredients.set(ingredients.size()-1,bread);
    }
    public String listIngredients(){
        String ingredientsList = "";
        for(int i = 0;i<ingredients.size()-1;i++){
            ingredientsList += ingredients.get(i)+", ";
        }
        return ingredientsList + ingredients.get(ingredients.size()-1);
    }
}
