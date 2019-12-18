package Team;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Arrays;

public class BookRentalSystemMain {
    public static void main(String[] args) {
        Gson gson=new Gson();
        JsonParser parser=new JsonParser();
        JsonArray  jsonArray=(JsonObject)

        DisplayMenu display=new DisplayMenu();
        display.startMenu();



    }
}