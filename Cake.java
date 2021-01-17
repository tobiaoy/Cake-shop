import java.text.NumberFormat;
public class Cake{

// fields
public int layers;
public String icing;
public String shape;
public int candles;
public int size = 6;
public int price;

// Constructor


// getters
public int getlayers(){
return layers;
}

public String geticing(){
return icing;
}

public String getshape(){
return shape;
}

public int getcandles(){
return candles;
}

public int getsize(){
return size;
}

// setters
public void setlayers(int layers){
layers = layers;
}

public void seticing(String icing){
icing = icing;
}

public void setshape(String shape){
shape = shape;
}

public void setcandles(int candles){
candles = candles;
}

public void setsize(int size){
size = size;
}

// methods
public int addLayers(int increment){
layers += increment;
  return layers;
}

public int removeLayers(int decrement){
layers -= decrement;
  return layers;
}

public int addCandles(int increment){
candles += increment;
  return candles;
}

public int removeCandles(int decrement){
candles -= decrement;
  return candles;
}

public int price(){
  price = (4 * candles) + (5 * layers) + (2 * size);
    return price;
}

// string statement
public String toString(){
  NumberFormat fmt = NumberFormat.getCurrencyInstance();

  return "Your cake has " + layers + " layers and " + icing + " icing. " + "\nIt also has a " + shape + " shape with " + candles +
  " candles. " + "\nIt's a size " + size + "\nIt will cost: " + fmt.format(price);


}
}
