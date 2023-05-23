package com.largeapi.api; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.lang.*;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@SpringBootApplication
@RestController
public class Largedata  {

    @RequestMapping("/hello")
    String hello() {
        
        //return "Hello from MyApp!";
        return pdfparser();
    }

    @RequestMapping("/echo")
    String echo(@RequestParam("message") String message) {
        return message;
    }

    public static void main(String[] args) {
        SpringApplication.run(Largedata.class, args);
    }

    private String pdfparser() {

        StringBuilder sampleString = new StringBuilder();
        sampleString.append("a");
        for ( int i =0;i<25;i++) {
            sampleString.append(sampleString.toString());
        }
        return sampleString.toString().substring(800000);
        // @RequestMapping("/hello")
        // String hello() {
        //     Gson gson = new GsonBuilder().serializeNulls().create();
        //     //return "Hello from MyApp!";
        //     return gson.toJson(pdfparser());
        // }
    
        // @RequestMapping("/echo")
        // String echo(@RequestParam("message") String message) {
        //     return message;
        // }
    
        // public static void main(String[] args) {
        //     SpringApplication.run(Largedata.class, args);
        // }
    
        // private Map<String, String> pdfparser() {
    
        //     StringBuilder sampleString = new StringBuilder();
        //     sampleString.append("a");
        //     for ( int i =0;i<23;i++) {
        //         sampleString.append(sampleString.toString());
        //     }
        //     return Map.of("1", sampleString.toString().substring(8),
        //     "2", sampleString.toString().substring(8));
        // StringBuilder sampleString = new StringBuilder();
    
        // sampleString.append("a");
        // for ( int i =0;i<25;i++) {
        //     sampleString.append(sampleString.toString());
        // }
        // return "{\"name\": \"" + sampleString + "\","+
        // " \"url\": \"https://www.example.com/support\"," +
        // " \"email\": \"support@example.com\"" +
        // "}";   
        // try {
        // String folderPath = "https://github.com/vpatchala/largedata/blob/main/LargePdf.pdf";
        // //String fileName = "LargePdf.pdf";
        // File file = new File(folderPath);
        
        // PDDocument document = PDDocument.load(file);
        // PDFTextStripper pdfStripper = new PDFTextStripper();
        // String text = pdfStripper.getText(document);
        // document.close();
        // return text;
        // }
        // catch(IOException e) {
        //     return "Exception Occured"+e;
        // }
    }

}