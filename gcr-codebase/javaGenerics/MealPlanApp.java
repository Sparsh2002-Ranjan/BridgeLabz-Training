import java.util.*;

interface MealPlan {
    String getMealType();
    int getCalories();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }

    public int getCalories() {
        return 1800;
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }

    public int getCalories() {
        return 1600;
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }

    public int getCalories() {
        return 2000;
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein";
    }

    public int getCalories() {
        return 2200;
    }
}

class Meal<T extends MealPlan> {
    private final T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    @Override
    public String toString() {
        return mealPlan.getMealType() + " Meal | Calories: " + mealPlan.getCalories();
    }
}

class MealGenerator {
    public static <T extends MealPlan> Meal<T> generateMeal(T plan) {
        if (plan.getCalories() <= 0) {
            throw new IllegalArgumentException("Invalid meal plan");
        }
        return new Meal<>(plan);
    }
}

public class MealPlanApp {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal =
                MealGenerator.generateMeal(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                MealGenerator.generateMeal(new VeganMeal());

        Meal<KetoMeal> ketoMeal =
                MealGenerator.generateMeal(new KetoMeal());

        System.out.println(vegMeal);
        System.out.println(veganMeal);
        System.out.println(ketoMeal);
    }
}
