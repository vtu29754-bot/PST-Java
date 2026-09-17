public class JavaFactory {
    interface Food {
        String getType();
    }

    static class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    static class Cake implements Food {
        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    static class FoodFactory {
        public Food getFood(String order) {
            if (order.equalsIgnoreCase("pizza")) {
                return new Pizza();
            } else if (order.equalsIgnoreCase("cake")) {
                return new Cake();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Food food1 = foodFactory.getFood("cake");
        System.out.println("The factory returned " + food1.getClass().getSimpleName());
        System.out.println(food1.getType());

        Food food2 = foodFactory.getFood("pizza");
        System.out.println("The factory returned " + food2.getClass().getSimpleName());
        System.out.println(food2.getType());
    }
}

/*
INPUT & OUTPUT:

The factory returned Cake
Someone ordered a Dessert!
The factory returned Pizza
Someone ordered a Fast Food!
*/
