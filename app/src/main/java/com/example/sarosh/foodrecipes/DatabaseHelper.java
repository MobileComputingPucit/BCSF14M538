package com.example.sarosh.foodrecipes;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseLockedException;

/**
 * Created by Sarosh on 1/25/2018.
 */
public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "recipe.db";
    public static final String TABLE_NAME = "pakistani_food";
    public static final String TABLE_NAME1 = "fast_food";
    public static final String TABLE_NAME2 = "chinese_food";
    public static final String TABLE_NAME3 = "italian_food";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "INGREDIENTS";
    public static final String COL_4 = "RECIPE";

    public static final String COL_1_FAST = "ID_FAST";
    public static final String COL_2_FAST = "NAME_FAST";
    public static final String COL_3_FAST = "INGREDIENTS_FAST";
    public static final String COL_4_FAST = "RECIPE_FAST";

    public static final String COL_1_CHINESE = "ID_CHINESE";
    public static final String COL_2_CHINESE= "NAME_CHINESE";
    public static final String COL_3_CHINESE = "INGREDIENTS_CHINESE";
    public static final String COL_4_CHINESE = "RECIPE_CHINESE";

    public static final String COL_1_ITALIAN = "ID_ITALIAN";
    public static final String COL_2_ITALIAN = "NAME_ITALIAN";
    public static final String COL_3_ITALIAN = "INGREDIENTS_ITALIAN";
    public static final String COL_4_ITALIAN = "RECIPE_ITALIAN";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , NAME TEXT,INGREDIENTS TEXT, RECIPE TEXT)");
        sqLiteDatabase.execSQL("create table " + TABLE_NAME1 + "(ID_FAST INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , NAME_FAST TEXT,INGREDIENTS_FAST TEXT, RECIPE_FAST TEXT)");



        ContentValues contentValues = new ContentValues();
        ContentValues contentValues2 = new ContentValues();
        ContentValues contentValues3 = new ContentValues();
        ContentValues contentValues4 = new ContentValues();

        contentValues.put(COL_2, "Biryani");

        contentValues.put(COL_3, "\n"+
                "Chicken ½ kg \n" +
                " Lal mirch powder (Red chili powder) 2 tsp or to taste\n" +
                "Haldee powder (Turmeric powder) ½ tsp\n" +
                "Dhania powder (Coriander powder) 1 tsp\n" +
                "Garam masala powder 1 tsp\n" +
                "Oil ½ Cup\n" +
                "Hari elaichi (Green cardamom) 3-4\n" +
                "Laung (Cloves) 4-5\n" +
                "Tez paat (Bay leaves) 2-3\n" +
                "Badiyan ka phool (Star anise) 1\n" +
                "Zeera (Cumin seeds) ½ tsp\n" +
                "Hari mirch (Green chilies) julienne 3-4\n" +
                "Adrak lehsan paste (Ginger garlic paste) 2 tbs\n" +
                "Tamatar (Tomato) 1 small\n" +
                "Namak (Salt) 1 tsp or to taste\n" +
                "Dahi (Yogurt) whisked ½ Cup\n" +
                "Zarda ka rang (Yellow food color) ½ tsp or as required\n" +
                "Chawal (Rice) Sella ½ kg (soaked & boiled with salt)\n" +
                "Pyaz (Onion) fried 1 medium\n" +
                "Hara dhania (Fresh coriander) chopped 2-3 tbs\n" +
                "Podina (Mint leaves) chopped 2-3 tbs\n" +
                "Hari mirch ka achar (Pickled green chilies) 2 tbs\n" +
                "Chawal (Rice) Sella boiled \n" +
                "Pyaz (Onion) fried 1 small \n" +
                "Kewra water 1 tbs \n");

        contentValues.put(COL_4, "In chicken,add red chili powder,turmeric powder,coriander powder and garam masala powder,mix well and marinate for 15 minutes.\n" +
                "\n" +
                "Cut pickled green chilies with the help of kitchen scissor & set aside.\n" +
                "\n" +
                "In pot,add oil,green cardamom,cloves,bay leaves,star anise,cumin seeds and mix well.\n" +
                "\n" +
                "Now add marinated chicken,green chilies and mix well.\n" +
                "\n" +
                "Add ginger garlic paste and mix well for 2-3 minutes then cover and cook on low flame for 6-8 minutes.\n" +
                "\n" +
                "Add tomato and salt,mix well and cook until tomatoes are soft.\n" +
                "\n" +
                "Add yogurt and mix well,cover and cook for 5 minutes then cook on high flame until oil separates.\n" +
                "\n" +
                "In yogurt,add yellow food color and mix well & add it in pot.\n" +
                "\n" +
                "Cut pickled green chilies with the help of kitchen scissor & set aside.\n" +
                "\n" +
                "Add half quantity of boiled rice,fried onion,fresh coriander,mint leaves,pickled green chilies,remaining  boiled rice,fried onion and kewra water.\n" +
                "\n" +
                "Cover and steam cook on low flame for 8-10 minutes.");

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues);


        contentValues2.put(COL_2, "White Chicken Karahi");

        contentValues2.put(COL_3, "Oil 3-4 tbs \n"+
                "Ginger garlic ½ tbs \n"+
                "Green chili paste 4-6\n" +
                "Chicken ½ kg\n" +
                "Salt 1 tsp or to taste\n" +
                "Yogurt 3/4 cup\n" +
                "Black pepper 1 tsp\n" +
                "Cumin 1 tsp\n" +
                "Coriander 1 tsp\n" +
                "Ginger (julienne cut) 2 inch piece or as preferred\n" +
                "Garam masala ½ tsp\n" +
                "Tetra pack cream 4 tbs\n" +
                "Green chili 2-3\n" +
                "Lemon juice 1 tbs (optional)\n");
        contentValues2.put(COL_4, "Heat oil in a wok, add chicken and fry until it turns golden.\n" +
                "\n" +
                "Add ginger garlic paste, green chili paste and salt.\n" +
                "\n" +
                "Cook for 6-8 mins on medium flame.\n" +
                "\n" +
                "In bowl, add yogurt, black pepper, roasted and crushed cumin and coriander crushed and mix well.\n" +
                "\n" +
                "Add yogurt in chicken and mix well.\n" +
                "\n" +
                "Cook for 6-8 mins or until yogurt water dries out and chicken is tender.\n" +
                "\n" +
                "You can add 1-2 tsb water if required.\n" +
                "\n" +
                "Add ginger (julienne cut), garam masala lemon juice, and Tetra pack cream 4 tbs - cook for few mins.\n" +
                "\n" +
                "White chicken karahi is ready to serve with roti chapati or naan.");

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues2);

        contentValues3.put(COL_2, "Seekh Kabab");

        contentValues3.put(COL_3, "Minced meat ½ kg\n" +
                " Fried onion 1 \n" +
                "Gram flour 2 Tablespoon \n" +
                "Salt 2 Teaspoon \n" +
                "Dried pomegranate seeds powder 1 ½ Teaspoon\n" +
                " Garlic+Ginger paste 1 Tablespoon\n" +
                " Coriander + cumin (roast and grind) powder 1 Teaspoon\n" +
                " Red chili powder ½ Tablespoon \n" +
                "Garam Masala 1 Teaspoon\n" +
                " Green chili chopped 2\n" +
                "Coriander leaves ½ Bunch \n" +
                "Cooking oil Required for shallow frying\n");

        contentValues3.put(COL_4, "Take a bowl add minced meat, fried onion, gram flour, salt, and pomegranate seeds, ginger garlic paste, garam masala, coriander and cumin powder, red chili powder, green chili and coriander leaves.\n" +
                "\n" +
                "Mix them well with hands or spatula and refrigerate mixture for 45 minutes.\n" +
                "\n" +
                "To prepare seekh, add mixture on skewers with hands and press properly for the grip and make seekh kababs.\n" +
                "\n" +
                "Put little oil in a pan and place the skewers on it.\n" +
                "\n" +
                "Keep rotating so they get evenly cooked.\n" +
                "\n" +
                "Serve them with your favorite dip or chutney.");

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues3);


        contentValues4.put(COL_2, "Malai Boti");

        contentValues4.put(COL_3, "Green Chilies 2-3\n" +
                "Coriander Leaves 2 Tbs\n" +
                "Green Onion Whites 2 Tbs\n" +
                "Chicken Boneless ½ Kg\n" +
                "Meat Tenderizer ½ Tsp\n" +
                "Ginger Garlic Paste 1 Tbs\n" +
                "Yogurt ¼ Cup\n" +
                "Cream ¼ Cup\n" +
                "Black Pepper ½ Tsp\n" +
                "White Pepper ¼ Tsp\n" +
                "Whole Spice Powder ½ Tsp\n" +
                "Corn Flour 1 Tbs\n" +
                "Salt ½ Tsp Or To Taste\n" +
                "Lemon Juice 2 Tbs");
        contentValues4.put(COL_4, "In blender, make paste of green chilies, coriander leaves and green onion’s white.\n" +
                "\n" +
                "In a bowl, add chicken and all ingredients except butter. Mix well and marinate for 2-3 hours\n" +
                "\n" +
                "Add butter before cooking and mix well.\n" +
                "\n" +
                "Bake at 180 degrees for 20-25 mins\n" +
                "\n" +
                "BBQ or shallow fry in a pan until it’s done.\n" +
                "\n" +
                "Delicious Malai Boti is ready.");

        sqLiteDatabase.insert(TABLE_NAME, null, contentValues4);





        ContentValues contentValues5 = new ContentValues();
        ContentValues contentValues6 = new ContentValues();
        ContentValues contentValues7 = new ContentValues();
        ContentValues contentValues8 = new ContentValues();

        contentValues5.put(COL_2_FAST, "Zinger Burger");

        contentValues5.put(COL_3_FAST, "\n"+
                "Chicken breast fillets 2\n" +
                " Vinegar 2 tsp \n" +
                "Mustard paste 1 tsp \n" +
                "Garlic powder 1 tsp \n" +
                "White pepper powder ½ tsp \n" +
                "Red chili powder ½ tsp \n" +
                "Worcestershire sauce 1 tsp \n" +
                "Salt to taste\n"+ "Flour 2 cup \n" +
                " +Red chili powder 1 tsp\n" +
                " + Black pepper ½ tsp \n" +
                "Garlic powder ½ tsp \n" +
                "Salt to taste \n" +
                "Corn flour 3 tsp \n" +
                "Rice flour 4tsp \n" +
                "Egg 2 Milk ½ cup \n" +
                "Oil for deep frying");

        contentValues5.put(COL_4_FAST, "Take chicken breast and make 4 fillets, pound fillets with steak hammer.\n" +
                "\n" +
                "In bowl,add vinegar,mustard paste,garlic powder,white pepper powder,red chilli powder, worcestershire sauce and salt,mix well.\n" +
                "\n" +
                "Add fillets and coat fillets properly,marinate it for 30-45 minutes.\n" +
                "\n" +
                "For flour coating, combine flour,red chili powder,black pepper,garlic powder,salt,corn flour and rice flour, mix well and set aside.\n" +
                "\n" +
                "For egg coating, in a bowl beat 2 eggs with milk and set aside.\n" +
                "\n" +
                "Heat oil in a wok, take one marinated chicken fillet, dip into egg mixture and coat it with flour mixture then again dip into egg mixture and flour mixture (press hard for crispy fillet).\n" +
                "\n" +
                "Deep fry the fillet on medium flame, fry 3minutes each side. Fry until a crispy coat is turned brown.\n" +
                "\n" +
                "Repeat same process with all the fillets.\n" +
                "\n" +
                "To make mayo sauce, combine chili garlic sauce, mustard paste and mayonnaise and mix well to form a paste. Pour mayo sauce in dressing bottle.\n" +
                "\n" +
                "For assembling,take burger buns. Apply mayonnaise on bun. Add ice burg leaf, fried chicken fillet, mayo sauce, cheese slice and then cover with the bun.\n" +
                "\n" +
                "Serve with homemade French fries and ketchup.");

        sqLiteDatabase.insert(TABLE_NAME1, null, contentValues5);


        contentValues6.put(COL_2_FAST, "Pizza");

        contentValues6.put(COL_3_FAST, "Chicken boneless ½ kg\n" +
                "Lemon juice 1 tbs\n" +
                "Adrak lehsan paste (Ginger garlic paste) 1 tsp\n" +
                "Lal mirch (Red chili) Crushed 1 tsp\n" +
                "Lal mirch powder (Red chili powder) ½ tsp\n" +
                "Namak (Salt) 1 tsp or to taste\n" +
                "Dhania powder (Coriander powder) ½ tsp\n" +
                "Oil 2 tbs for frying\n" +
                "Coal for smoke\n"+"Oil 2 tbs\n" +
                "Pyaz (Onion) Finely chopped 1 Medium\n" +
                "Lehsan (Garlic) 1 tbs\n" +
                "Tamatar (Tomatoes) Finely chopped 2 Cups\n" +
                "Namak (Salt) ½ tsp\n" +
                "Tomato ketchup 1 Cup\n" +
                "Safed mirch (White pepper) 1 tsp\n" +
                "Brown sugar 1 tbs\n" +
                "Soy sauce 1 tbs\n" +
                "Worcestershire sauce 1 tbs\n" +
                "Lal mirch powder (Red chili powder) ½ tsp\n" +
                "Dried oregano 1 tsp\n" +
                "Dried basil leaves 1 tsp\n" +
                "Lal mirch (Red chili) Crushed 1 tsp or to taste\n"+"Neem garam doodh (Warm milk) ¾ Cup\n" +
                "Neem garam pani (Warm water) ¾ Cup\n" +
                "Maida (All-purpose flour) 3 & ½ Cups\n" +
                "Namak (Salt) 1 tsp\n" +
                "Cheeni (Sugar) 1 tsp\n" +
                "Khameer (Dry instant yeast) 2 tsp\n" +
                "Makhan (Butter) Soften 2 tbs\n" +
                "Anda (Egg) 1\n" +
                "Oil 1 tbs");
        contentValues6.put(COL_4_FAST, "For Chicken Tikka Filling: In bowl,add chicken,lemon juice,ginger garlic paste,red chili crushed,red chili powder,salt and coriander powder,mix and marinate for 15-20 minutes.\n" +
                "\n" +
                "In frying pan,add oil and marinated chicken,fry until chicken is done and give a coal smoke for 1-2 minutes,set aside.\n" +
                "\n" +
                "For Homemade Pizza Sauce: In frying pan,add oil and onion,saute until translucent.\n" +
                "\n" +
                "Add garlic and tomatoes,cook until tomatoes are soft.\n" +
                "\n" +
                "Add salt,tomato ketchup,white pepper,brown sugar,soy sauce,worcestershire sauce,red chili powder, dried oregano,dried basil leaves and red chili crushed and cook until sauce thickens, set aside.\n" +
                "\n" +
                "For Pizza Dough: In milk,add water and mix.\n" +
                "\n" +
                "In bowl,add all-purpose flour,salt,sugar,instant yeast,butter,egg and mix.\n" +
                "\n" +
                "Add milk+water mixture,mix & knead to form dough.\n" +
                "\n" +
                "Add oil,cover and let it sit for 2 hour or until dough is doubled in size.\n" +
                "\n" +
                "Add oil and knead again.");

        sqLiteDatabase.insert(TABLE_NAME1, null, contentValues6);

        contentValues7.put(COL_2_FAST, "Fried Chicken");

        contentValues7.put(COL_3_FAST, "Anday (Eggs) 2\n"+
                "Lemon juice 2-3 tbs\n" +
                "\"+Lehsan paste (Garlic paste) 1 tsp\n" +
                "\"+Corn flour 1 Cup\n" +
                "\"+Til (Sesame seeds) ¼ cup\n" +
                "\"+Lal mirch (Red chili) Crushed 1 & ½ tsp\n" +
                "\"+Chicken powder 1 tsp\n" +
                "\"+Namak (Salt) 1 tsp or to taste\n" +
                "\"+Chicken strips ½ kg\n" +
                "\"+Oil for frying\n" +
                "\"+Chaat masala to taste\n" +
                "\"+Green onion");

        contentValues7.put(COL_4_FAST, "In bowl,add eggs,lemon juice and garlic paste,whisk well.\n" +
                "\n" +
                "Add corn flour,sesame seeds,red chili crushed,chicken powder,salt and mix.\n" +
                "\n" +
                "Add chicken strips,mix well and marinate for 20 minutes.\n" +
                "\n" +
                "In wok,heat oil and fry until golden brown.\n" +
                "\n" +
                "Sprinkle chaat masala,green onion and serve.");

        sqLiteDatabase.insert(TABLE_NAME1, null, contentValues7);


        contentValues8.put(COL_2_FAST, "Fries");

        contentValues8.put(COL_3_FAST, "Aloo (Potatoes) peeled 3-4\n" +
                "\n" +
                "-Pani (Water) as required\n" +
                "\n" +
                "-Pani (Water) as required\n" +
                "\n" +
                "-Namak (Salt) 1 tbs\n" +
                "\n" +
                "-Oil for frying");
        contentValues8.put(COL_4_FAST, "Cut potatoes with the help of the french fries cutting machine (1.3 cm thick).\n" +
                "\n" +
                "-In bowl,add water,potato fries and let it rest for 30-45 minutes.\n" +
                "\n" +
                "-In pot,add water,salt and heat it to boiling point.\n" +
                "\n" +
                "-Add potato fries and leave for 6-8 minutes.\n" +
                "\n" +
                "-Now pat dry potato fries with the help of the kitchen towel or paper & let them cool.\n" +
                "\n" +
                "-Can be freeze in zip lock bag for up to 1-2 weeks.\n" +
                "\n" +
                "-In pot,heat oil and fry potato fries for 2-3 minutes and rest it for 5 minutes.\n" +
                "\n" +
                "-Heat oil and again fry potato fries until crispy & set aside.");

        sqLiteDatabase.insert(TABLE_NAME1, null, contentValues8);


        sqLiteDatabase.execSQL("create table " + TABLE_NAME2 + "(ID_CHINESE INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , NAME_CHINESE TEXT,INGREDIENTS_CHINESE TEXT, RECIPE_CHINESE TEXT)");

        ContentValues contentValues9 = new ContentValues();
        ContentValues contentValues10 = new ContentValues();
        ContentValues contentValues11 = new ContentValues();
        ContentValues contentValues12 = new ContentValues();

        contentValues9.put(COL_2_CHINESE, "Chicken Fried Rice");

        contentValues9.put(COL_3_CHINESE, "\n"+
                "Chicken breast fillets 2\n" +
                " Vinegar 2 tsp \n" +
                "Mustard paste 1 tsp \n" +
                "Garlic powder 1 tsp \n" +
                "White pepper powder ½ tsp \n" +
                "Red chili powder ½ tsp \n" +
                "Worcestershire sauce 1 tsp \n" +
                "Salt to taste\n"+ "Flour 2 cup \n" +
                " +Red chili powder 1 tsp\n" +
                " + Black pepper ½ tsp \n" +
                "Garlic powder ½ tsp \n" +
                "Salt to taste \n" +
                "Corn flour 3 tsp \n" +
                "Rice flour 4tsp \n" +
                "Egg 2 Milk ½ cup \n" +
                "Oil for deep frying");

        contentValues9.put(COL_4_CHINESE, "Take chicken breast and make 4 fillets, pound fillets with steak hammer.\n" +
                "\n" +
                "In bowl,add vinegar,mustard paste,garlic powder,white pepper powder,red chilli powder, worcestershire sauce and salt,mix well.\n" +
                "\n" +
                "Add fillets and coat fillets properly,marinate it for 30-45 minutes.\n" +
                "\n" +
                "For flour coating, combine flour,red chili powder,black pepper,garlic powder,salt,corn flour and rice flour, mix well and set aside.\n" +
                "\n" +
                "For egg coating, in a bowl beat 2 eggs with milk and set aside.\n" +
                "\n" +
                "Heat oil in a wok, take one marinated chicken fillet, dip into egg mixture and coat it with flour mixture then again dip into egg mixture and flour mixture (press hard for crispy fillet).\n" +
                "\n" +
                "Deep fry the fillet on medium flame, fry 3minutes each side. Fry until a crispy coat is turned brown.\n" +
                "\n" +
                "Repeat same process with all the fillets.\n" +
                "\n" +
                "To make mayo sauce, combine chili garlic sauce, mustard paste and mayonnaise and mix well to form a paste. Pour mayo sauce in dressing bottle.\n" +
                "\n" +
                "For assembling,take burger buns. Apply mayonnaise on bun. Add ice burg leaf, fried chicken fillet, mayo sauce, cheese slice and then cover with the bun.\n" +
                "\n" +
                "Serve with homemade French fries and ketchup.");

        sqLiteDatabase.insert(TABLE_NAME2, null, contentValues9);


        contentValues10.put(COL_2_CHINESE, "Chicken Manchurian");

        contentValues10.put(COL_3_CHINESE, "Chicken boneless ½ kg\n" +
                "Lemon juice 1 tbs\n" +
                "Adrak lehsan paste (Ginger garlic paste) 1 tsp\n" +
                "Lal mirch (Red chili) Crushed 1 tsp\n" +
                "Lal mirch powder (Red chili powder) ½ tsp\n" +
                "Namak (Salt) 1 tsp or to taste\n" +
                "Dhania powder (Coriander powder) ½ tsp\n" +
                "Oil 2 tbs for frying\n" +
                "Coal for smoke\n"+"Oil 2 tbs\n" +
                "Pyaz (Onion) Finely chopped 1 Medium\n" +
                "Lehsan (Garlic) 1 tbs\n" +
                "Tamatar (Tomatoes) Finely chopped 2 Cups\n" +
                "Namak (Salt) ½ tsp\n" +
                "Tomato ketchup 1 Cup\n" +
                "Safed mirch (White pepper) 1 tsp\n" +
                "Brown sugar 1 tbs\n" +
                "Soy sauce 1 tbs\n" +
                "Worcestershire sauce 1 tbs\n" +
                "Lal mirch powder (Red chili powder) ½ tsp\n" +
                "Dried oregano 1 tsp\n" +
                "Dried basil leaves 1 tsp\n" +
                "Lal mirch (Red chili) Crushed 1 tsp or to taste\n"+"Neem garam doodh (Warm milk) ¾ Cup\n" +
                "Neem garam pani (Warm water) ¾ Cup\n" +
                "Maida (All-purpose flour) 3 & ½ Cups\n" +
                "Namak (Salt) 1 tsp\n" +
                "Cheeni (Sugar) 1 tsp\n" +
                "Khameer (Dry instant yeast) 2 tsp\n" +
                "Makhan (Butter) Soften 2 tbs\n" +
                "Anda (Egg) 1\n" +
                "Oil 1 tbs");
        contentValues10.put(COL_4_CHINESE, "For Chicken Tikka Filling: In bowl,add chicken,lemon juice,ginger garlic paste,red chili crushed,red chili powder,salt and coriander powder,mix and marinate for 15-20 minutes.\n" +
                "\n" +
                "In frying pan,add oil and marinated chicken,fry until chicken is done and give a coal smoke for 1-2 minutes,set aside.\n" +
                "\n" +
                "For Homemade Pizza Sauce: In frying pan,add oil and onion,saute until translucent.\n" +
                "\n" +
                "Add garlic and tomatoes,cook until tomatoes are soft.\n" +
                "\n" +
                "Add salt,tomato ketchup,white pepper,brown sugar,soy sauce,worcestershire sauce,red chili powder, dried oregano,dried basil leaves and red chili crushed and cook until sauce thickens, set aside.\n" +
                "\n" +
                "For Pizza Dough: In milk,add water and mix.\n" +
                "\n" +
                "In bowl,add all-purpose flour,salt,sugar,instant yeast,butter,egg and mix.\n" +
                "\n" +
                "Add milk+water mixture,mix & knead to form dough.\n" +
                "\n" +
                "Add oil,cover and let it sit for 2 hour or until dough is doubled in size.\n" +
                "\n" +
                "Add oil and knead again.");

        sqLiteDatabase.insert(TABLE_NAME2, null, contentValues10);

        contentValues11.put(COL_2_CHINESE, "Chicken Chowmein");

        contentValues11.put(COL_3_CHINESE, "Anday (Eggs) 2\n"+
                "Lemon juice 2-3 tbs\n" +
                "\"+Lehsan paste (Garlic paste) 1 tsp\n" +
                "\"+Corn flour 1 Cup\n" +
                "\"+Til (Sesame seeds) ¼ cup\n" +
                "\"+Lal mirch (Red chili) Crushed 1 & ½ tsp\n" +
                "\"+Chicken powder 1 tsp\n" +
                "\"+Namak (Salt) 1 tsp or to taste\n" +
                "\"+Chicken strips ½ kg\n" +
                "\"+Oil for frying\n" +
                "\"+Chaat masala to taste\n" +
                "\"+Green onion");

        contentValues11.put(COL_4_CHINESE, "In bowl,add eggs,lemon juice and garlic paste,whisk well.\n" +
                "\n" +
                "Add corn flour,sesame seeds,red chili crushed,chicken powder,salt and mix.\n" +
                "\n" +
                "Add chicken strips,mix well and marinate for 20 minutes.\n" +
                "\n" +
                "In wok,heat oil and fry until golden brown.\n" +
                "\n" +
                "Sprinkle chaat masala,green onion and serve.");

        sqLiteDatabase.insert(TABLE_NAME2, null, contentValues11);


        contentValues12.put(COL_2_CHINESE, "Chicken Shashlik");

        contentValues12.put(COL_3_CHINESE, "Aloo (Potatoes) peeled 3-4\n" +
                "\n" +
                "-Pani (Water) as required\n" +
                "\n" +
                "-Pani (Water) as required\n" +
                "\n" +
                "-Namak (Salt) 1 tbs\n" +
                "\n" +
                "-Oil for frying");
        contentValues12.put(COL_4_CHINESE, "Cut potatoes with the help of the french fries cutting machine (1.3 cm thick).\n" +
                "\n" +
                "-In bowl,add water,potato fries and let it rest for 30-45 minutes.\n" +
                "\n" +
                "-In pot,add water,salt and heat it to boiling point.\n" +
                "\n" +
                "-Add potato fries and leave for 6-8 minutes.\n" +
                "\n" +
                "-Now pat dry potato fries with the help of the kitchen towel or paper & let them cool.\n" +
                "\n" +
                "-Can be freeze in zip lock bag for up to 1-2 weeks.\n" +
                "\n" +
                "-In pot,heat oil and fry potato fries for 2-3 minutes and rest it for 5 minutes.\n" +
                "\n" +
                "-Heat oil and again fry potato fries until crispy & set aside.");

        sqLiteDatabase.insert(TABLE_NAME2, null, contentValues12);




        sqLiteDatabase.execSQL("create table " + TABLE_NAME3 + "(ID_ITALIAN INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL , NAME_ITALIAN TEXT,INGREDIENTS_ITALIAN TEXT, RECIPE_ITALIAN TEXT)");

        ContentValues contentValues13 = new ContentValues();
        ContentValues contentValues14 = new ContentValues();
        ContentValues contentValues15 = new ContentValues();
        ContentValues contentValues16 = new ContentValues();

        contentValues13.put(COL_2_ITALIAN, "Pasta");

        contentValues13.put(COL_3_ITALIAN, "\n"+
                "Chicken breast fillets 2\n" +
                " Vinegar 2 tsp \n" +
                "Mustard paste 1 tsp \n" +
                "Garlic powder 1 tsp \n" +
                "White pepper powder ½ tsp \n" +
                "Red chili powder ½ tsp \n" +
                "Worcestershire sauce 1 tsp \n" +
                "Salt to taste\n"+ "Flour 2 cup \n" +
                " +Red chili powder 1 tsp\n" +
                " + Black pepper ½ tsp \n" +
                "Garlic powder ½ tsp \n" +
                "Salt to taste \n" +
                "Corn flour 3 tsp \n" +
                "Rice flour 4tsp \n" +
                "Egg 2 Milk ½ cup \n" +
                "Oil for deep frying");

        contentValues13.put(COL_4_ITALIAN, "Take chicken breast and make 4 fillets, pound fillets with steak hammer.\n" +
                "\n" +
                "In bowl,add vinegar,mustard paste,garlic powder,white pepper powder,red chilli powder, worcestershire sauce and salt,mix well.\n" +
                "\n" +
                "Add fillets and coat fillets properly,marinate it for 30-45 minutes.\n" +
                "\n" +
                "For flour coating, combine flour,red chili powder,black pepper,garlic powder,salt,corn flour and rice flour, mix well and set aside.\n" +
                "\n" +
                "For egg coating, in a bowl beat 2 eggs with milk and set aside.\n" +
                "\n" +
                "Heat oil in a wok, take one marinated chicken fillet, dip into egg mixture and coat it with flour mixture then again dip into egg mixture and flour mixture (press hard for crispy fillet).\n" +
                "\n" +
                "Deep fry the fillet on medium flame, fry 3minutes each side. Fry until a crispy coat is turned brown.\n" +
                "\n" +
                "Repeat same process with all the fillets.\n" +
                "\n" +
                "To make mayo sauce, combine chili garlic sauce, mustard paste and mayonnaise and mix well to form a paste. Pour mayo sauce in dressing bottle.\n" +
                "\n" +
                "For assembling,take burger buns. Apply mayonnaise on bun. Add ice burg leaf, fried chicken fillet, mayo sauce, cheese slice and then cover with the bun.\n" +
                "\n" +
                "Serve with homemade French fries and ketchup.");

        sqLiteDatabase.insert(TABLE_NAME3, null, contentValues13);


        contentValues14.put(COL_2_ITALIAN, "Chicken Lasagna");

        contentValues14.put(COL_3_ITALIAN, "Chicken boneless ½ kg\n" +
                "Lemon juice 1 tbs\n" +
                "Adrak lehsan paste (Ginger garlic paste) 1 tsp\n" +
                "Lal mirch (Red chili) Crushed 1 tsp\n" +
                "Lal mirch powder (Red chili powder) ½ tsp\n" +
                "Namak (Salt) 1 tsp or to taste\n" +
                "Dhania powder (Coriander powder) ½ tsp\n" +
                "Oil 2 tbs for frying\n" +
                "Coal for smoke\n"+"Oil 2 tbs\n" +
                "Pyaz (Onion) Finely chopped 1 Medium\n" +
                "Lehsan (Garlic) 1 tbs\n" +
                "Tamatar (Tomatoes) Finely chopped 2 Cups\n" +
                "Namak (Salt) ½ tsp\n" +
                "Tomato ketchup 1 Cup\n" +
                "Safed mirch (White pepper) 1 tsp\n" +
                "Brown sugar 1 tbs\n" +
                "Soy sauce 1 tbs\n" +
                "Worcestershire sauce 1 tbs\n" +
                "Lal mirch powder (Red chili powder) ½ tsp\n" +
                "Dried oregano 1 tsp\n" +
                "Dried basil leaves 1 tsp\n" +
                "Lal mirch (Red chili) Crushed 1 tsp or to taste\n"+"Neem garam doodh (Warm milk) ¾ Cup\n" +
                "Neem garam pani (Warm water) ¾ Cup\n" +
                "Maida (All-purpose flour) 3 & ½ Cups\n" +
                "Namak (Salt) 1 tsp\n" +
                "Cheeni (Sugar) 1 tsp\n" +
                "Khameer (Dry instant yeast) 2 tsp\n" +
                "Makhan (Butter) Soften 2 tbs\n" +
                "Anda (Egg) 1\n" +
                "Oil 1 tbs");
        contentValues14.put(COL_4_ITALIAN, "For Chicken Tikka Filling: In bowl,add chicken,lemon juice,ginger garlic paste,red chili crushed,red chili powder,salt and coriander powder,mix and marinate for 15-20 minutes.\n" +
                "\n" +
                "In frying pan,add oil and marinated chicken,fry until chicken is done and give a coal smoke for 1-2 minutes,set aside.\n" +
                "\n" +
                "For Homemade Pizza Sauce: In frying pan,add oil and onion,saute until translucent.\n" +
                "\n" +
                "Add garlic and tomatoes,cook until tomatoes are soft.\n" +
                "\n" +
                "Add salt,tomato ketchup,white pepper,brown sugar,soy sauce,worcestershire sauce,red chili powder, dried oregano,dried basil leaves and red chili crushed and cook until sauce thickens, set aside.\n" +
                "\n" +
                "For Pizza Dough: In milk,add water and mix.\n" +
                "\n" +
                "In bowl,add all-purpose flour,salt,sugar,instant yeast,butter,egg and mix.\n" +
                "\n" +
                "Add milk+water mixture,mix & knead to form dough.\n" +
                "\n" +
                "Add oil,cover and let it sit for 2 hour or until dough is doubled in size.\n" +
                "\n" +
                "Add oil and knead again.");

        sqLiteDatabase.insert(TABLE_NAME3, null, contentValues14);

        contentValues15.put(COL_2_ITALIAN, "Sphagetti with metaballs");

        contentValues15.put(COL_3_ITALIAN, "Anday (Eggs) 2\n"+
                "Lemon juice 2-3 tbs\n" +
                "\"+Lehsan paste (Garlic paste) 1 tsp\n" +
                "\"+Corn flour 1 Cup\n" +
                "\"+Til (Sesame seeds) ¼ cup\n" +
                "\"+Lal mirch (Red chili) Crushed 1 & ½ tsp\n" +
                "\"+Chicken powder 1 tsp\n" +
                "\"+Namak (Salt) 1 tsp or to taste\n" +
                "\"+Chicken strips ½ kg\n" +
                "\"+Oil for frying\n" +
                "\"+Chaat masala to taste\n" +
                "\"+Green onion");

        contentValues15.put(COL_4_ITALIAN, "In bowl,add eggs,lemon juice and garlic paste,whisk well.\n" +
                "\n" +
                "Add corn flour,sesame seeds,red chili crushed,chicken powder,salt and mix.\n" +
                "\n" +
                "Add chicken strips,mix well and marinate for 20 minutes.\n" +
                "\n" +
                "In wok,heat oil and fry until golden brown.\n" +
                "\n" +
                "Sprinkle chaat masala,green onion and serve.");

        sqLiteDatabase.insert(TABLE_NAME3, null, contentValues15);


        contentValues16.put(COL_2_ITALIAN, "Macroni and Cheese");

        contentValues16.put(COL_3_ITALIAN, "Aloo (Potatoes) peeled 3-4\n" +
                "\n" +
                "-Pani (Water) as required\n" +
                "\n" +
                "-Pani (Water) as required\n" +
                "\n" +
                "-Namak (Salt) 1 tbs\n" +
                "\n" +
                "-Oil for frying");
        contentValues16.put(COL_4_ITALIAN, "Cut potatoes with the help of the french fries cutting machine (1.3 cm thick).\n" +
                "\n" +
                "-In bowl,add water,potato fries and let it rest for 30-45 minutes.\n" +
                "\n" +
                "-In pot,add water,salt and heat it to boiling point.\n" +
                "\n" +
                "-Add potato fries and leave for 6-8 minutes.\n" +
                "\n" +
                "-Now pat dry potato fries with the help of the kitchen towel or paper & let them cool.\n" +
                "\n" +
                "-Can be freeze in zip lock bag for up to 1-2 weeks.\n" +
                "\n" +
                "-In pot,heat oil and fry potato fries for 2-3 minutes and rest it for 5 minutes.\n" +
                "\n" +
                "-Heat oil and again fry potato fries until crispy & set aside.");

        sqLiteDatabase.insert(TABLE_NAME3, null, contentValues16);

        sqLiteDatabase.close();

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }


}