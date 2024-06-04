
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import Model.DatosConversion1;



class Main {
    public static void main(String[] args) {



        // creates an object of Scanner
        System.out.println("*****************************************");
        System.out.println ("Bienvenid@ al conversor de Moneda ");
        System.out.println ( "1 - Dólar a Peso Argentino \n2 - Peso Argentino a Dólar \n3 - Dólar a Real brasileño \n4 - Real brasileño a Dólar \n5 - Dólar a Peso Colombiano \n6 - Peso Colombiano a Dólar \n7 - Salir");
        Scanner input = new Scanner(System.in);
        System.out.print("Seleccione su Opcion: ");
        // takes input from the keyboard
        String op = input.nextLine();
        System.out.print("Digite su valor a convertir: ");
        // takes input from the keyboard
        String cantidad = input.nextLine();
        // closes the scanner
        input.close();
        // prints variables
        System.out.println("Su eleccion fue " + op + " La cantidad es: " + cantidad);


        switch(op) {
            case "1":
                System.out.println ("Opcion 1 ");
                URI direccion_1 = URI.create("https://v6.exchangerate-api.com/v6/1a45912a55b4425d06fd6a9d/pair/USD/ARS/" + cantidad);


                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(direccion_1)
                        .build();

                try {
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    Gson gsonObject = new Gson();

                     DatosConversion1 ConversionData = gsonObject.fromJson(response.body().toString(),DatosConversion1.class);
                    System.out.println ("El resultado de la conversión es: " + ConversionData.getConversion_result());
                } catch (Exception e) {
                    throw new RuntimeException("No se puede convertir");
                }


                break;
            case "2":
                System.out.println ("Opcion 2");
                URI direccion_2 = URI.create("https://v6.exchangerate-api.com/v6/1a45912a55b4425d06fd6a9d/pair/ARS/USD/" + cantidad);


                HttpClient client2 = HttpClient.newHttpClient();
                HttpRequest request2 = HttpRequest.newBuilder()
                        .uri(direccion_2)
                        .build();

                try {
                    HttpResponse<String> response = client2
                            .send(request2, HttpResponse.BodyHandlers.ofString());

                    Gson gsonObject = new Gson();

                    DatosConversion1  ConversionData = gsonObject.fromJson(response.body().toString(),DatosConversion1.class);
                    System.out.println ("El resultado de la conversión es: " + ConversionData.getConversion_result());
                } catch (Exception e) {
                    throw new RuntimeException("No se puede convertir");
                }
                break;

            case "3":
                System.out.println ("Opcion 3");
                URI direccion_3 = URI.create("https://v6.exchangerate-api.com/v6/1a45912a55b4425d06fd6a9d/pair/USD/BRL/" + cantidad);


                HttpClient client3 = HttpClient.newHttpClient();
                HttpRequest request3 = HttpRequest.newBuilder()
                        .uri(direccion_3)
                        .build();

                try {
                    HttpResponse<String> response = client3
                            .send(request3, HttpResponse.BodyHandlers.ofString());

                    Gson gsonObject = new Gson();

                    DatosConversion1 ConversionData = gsonObject.fromJson(response.body().toString(),DatosConversion1.class);
                     System.out.println ("El resultado de la conversión es: " + ConversionData.getConversion_result());
                } catch (Exception e) {
                    throw new RuntimeException("No se puede convertir");
                }
                break;
            case "4":
                System.out.println ("Opcion 4");
                URI direccion_4 = URI.create("https://v6.exchangerate-api.com/v6/1a45912a55b4425d06fd6a9d/pair/BRL/USD/" + cantidad);


                HttpClient client4 = HttpClient.newHttpClient();
                HttpRequest request4 = HttpRequest.newBuilder()
                        .uri(direccion_4)
                        .build();

                try {
                    HttpResponse<String> response = client4
                            .send(request4, HttpResponse.BodyHandlers.ofString());

                    Gson gsonObject = new Gson();

                    DatosConversion1 ConversionData = gsonObject.fromJson(response.body().toString(),DatosConversion1.class);
                    System.out.println ("El resultado de la conversión es: " + ConversionData.getConversion_result());
                } catch (Exception e) {
                    throw new RuntimeException("No se puede convertir");
                }
                break;
            case "5":
                System.out.println ("Opcion 5 ");
                URI direccion_5 = URI.create("https://v6.exchangerate-api.com/v6/1a45912a55b4425d06fd6a9d/pair/USD/COP/" + cantidad);


                HttpClient client5 = HttpClient.newHttpClient();
                HttpRequest request5 = HttpRequest.newBuilder()
                        .uri(direccion_5)
                        .build();

                try {
                    HttpResponse<String> response = client5
                            .send(request5, HttpResponse.BodyHandlers.ofString());

                    Gson gsonObject = new Gson();

                    DatosConversion1 ConversionData = gsonObject.fromJson(response.body().toString(),DatosConversion1.class);
                    System.out.println ("El resultado de la conversión es: " + ConversionData.getConversion_result());
                } catch (Exception e) {
                    throw new RuntimeException("No se puede convertir");
                }
                break;
            case "6":
                System.out.println ("Opcion 6 ");
                URI direccion_6 = URI.create("https://v6.exchangerate-api.com/v6/1a45912a55b4425d06fd6a9d/pair/ARS/USD/" + cantidad);


                HttpClient client6 = HttpClient.newHttpClient();
                HttpRequest request6 = HttpRequest.newBuilder()
                        .uri(direccion_6)
                        .build();

                try {
                    HttpResponse<String> response = client6
                            .send(request6, HttpResponse.BodyHandlers.ofString());

                    Gson gsonObject = new Gson();

                    DatosConversion1 ConversionData = gsonObject.fromJson(response.body().toString(),DatosConversion1.class);
                    System.out.println ("El resultado de la conversión es: " + ConversionData.getConversion_result());
                } catch (Exception e) {
                    throw new RuntimeException("No se puede convertir");
                }


                break;

            case "7":
                System.out.println("Fin del programa");
                break;


        }





    }
}