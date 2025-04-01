import java.util.*;
public class Food{
	String dishName;
	double price;
    ArrayList<String> ingredients;

	public Food(){
		dishName = "Blank";
		price = 0.0;
        ingredients = new ArrayList<String>();
	}
	public Food(String n, double p, String i1, String i2, String i3){
	    dishName = n;
	    price = p;
        ingredients = new ArrayList<String>();
        ingredients.add(i1);
        ingredients.add(i2);
        ingredients.add(i3);
	}
	
	public String getDishName(){
	    return dishName;
	}
	public double getPrice(){
	    return price;
	}
    public ArrayList<String> getIngredients(){
        return ingredients;
    }
	public void setDishName(String n){
	    dishName = n;
	}
	public void setPrice(double p){
	    price = p;
    }
    public void setIngredients(ArrayList<String> ing){
        ingredients = ing;
    }

    //interesting methods

    public void addIngredient(String i){
        ingredients.add(i);
    }
    public void removeIngredient(String ing){
  
            for(int i = 0; i<ingredients.size();i++){
                if(ingredients.get(i).equals(ing)){
                    ingredients.remove(i);
                }
            }
        
    }
	
	public String toString(){
	    return dishName + ": "+ price;
	}
	public boolean equals(Food other){
	    if(other.getDishName().equals(this.dishName)){
	        if(other.getPrice() == this.price){
	            return true;
	        }
	    }
	    return false;
	}
}
