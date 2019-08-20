/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;



/**
 *
 * @author rock and roll
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;









/**
 *
 * @author rock and roll
 */
public class NewClass  {
    public static void main(String[] args) throws Exception{
        
          HttpClient client=HttpClientBuilder.create().build();
          String url="https://jsonplaceholder.typicode.com/posts/1";
          HttpGet request=new HttpGet(url);
//          request.addHeader("id", "1");
         
          HttpResponse response = client.execute(request);
          if(response.getStatusLine().getStatusCode()!=200){
              throw new RuntimeException("Failed:Http error code:"+response.getStatusLine().getStatusCode());
              
          }
          BufferedReader br=new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
          StringBuffer result=new StringBuffer();
          String line="";
          while((line=br.readLine())!=null){
                        result.append(line);
       
          }
          System.out.println("Response:"+result);
         try{
          FileWriter file = new FileWriter("C:\\json\\ram\\shyam1.html");
          file.write(result.toString());
          file.close();
      }catch(Exception ex){
          System.out.println(ex);
      } 
    
      
 
          
          
       
    }
  

  
               
               
        


  
    
}
