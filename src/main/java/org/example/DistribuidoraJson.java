package org.example;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DistribuidoraJson {

    public static void main(String[]args) {
        try {

            JSONParser jsonParser = new JSONParser();
            FileReader reader = new FileReader("dados.json");
            Object obj = jsonParser.parse(reader);
            JSONArray jsonArray = (JSONArray) obj;

            List<Integer> valores = new ArrayList<>();

            jsonArray.forEach(j -> {
                valores.add(Integer.parseInt(distribuidor((JSONObject) j).toString()));
            });

            int maiorValor = 0;
            for (Integer integer : valores) {
                if (integer > maiorValor)
                    maiorValor = integer;
            }

            int menorValor = 0;
            for (Integer integer : valores) {
                if (integer < maiorValor)
                    maiorValor = integer;
            }

            System.out.println("O maior valor: " + maiorValor);
            System.out.println("O menor valor: " + menorValor);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Integer distribuidor(JSONObject jsonObject) {
        int valorFormatado = Integer.parseInt(jsonObject.get("valor").toString().replaceAll("\\p{Punct}", ""));
        return valorFormatado;
    }
}
