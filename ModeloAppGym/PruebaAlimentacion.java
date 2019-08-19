import java.util.*;
class PruebaAlimentacion {
    public static void main(String[] args){

            Scanner teclado = new Scanner(System.in);
            DietGoal metaAlimento1 = new DietGoal();
            DietGoal metaAlimento2 = new DietGoal();
    // Prueba de DietGoal
            metaAlimento1.countDietGoals("pastel");
            metaAlimento1.countDietGoals("pastel");
            metaAlimento1.countDietGoals("pastel");
            metaAlimento2.setFoodName("aguacate");
            metaAlimento2.setState(false);

    
            Libreria.imprime("**********   Metas Alimenticias   **********");
            Libreria.imprime(metaAlimento1.countDietGoals("pastel"));
            Libreria.imprime(metaAlimento2.toString());
    
    // Prueba Food
            Food alimento1 = new Food();
            Food alimento2 = new Food();
            alimento1.setFoodName("manzana");
            alimento1.setQuantity("1/2 taza");
            alimento1.setCaloriesPerSlice(123.4);
            alimento1.setType(4);
            alimento1.setGroup(5);
            Libreria.imprime("**********   Alimentos   **********");
            Libreria.imprime(alimento1.toString());

    }
}