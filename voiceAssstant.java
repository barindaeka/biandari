/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combarin.com.mycompany.voiceofassitand;
import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
/**
 *
 * @author ASUS
 */
public class voiceAssstant {
    public static void main(String[] args)throws IOException {
        
        //String command = "C:/Program Files (x86)/Mozilla Firefox/firefox.exe";
        //ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", command);

        
       Configuration config = new Configuration();
       
       config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("file:C:/Users/ASUS/Documents/NetBeansProjects/VoiceOfAssitand/src/main/java/combarin/com/mycompany/voiceofassitand/5643.dic");
        config.setLanguageModelPath("file:C:/Users/ASUS/Documents/NetBeansProjects/VoiceOfAssitand/src/main/java/combarin/com/mycompany/voiceofassitand/5643.lm");
        
        try {
        LiveSpeechRecognizer speech = new LiveSpeechRecognizer(config);
        speech.startRecognition(true);
        
        SpeechResult result;
        
        while ((result = speech.getResult()) != null) {
	String voiceCommand = result.getHypothesis();
	System.out.println("Voice Command is " + voiceCommand);
            
            
           if (!voiceCommand.equalsIgnoreCase("open Firefox")) {
            Runtime.getRuntime().exec("cmd.exe /c start firefox.exe www.google.com");
            } else if (!voiceCommand.equalsIgnoreCase("close Firefox")) {
                 Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM firefox.exe");
            }
               
        }      
        } catch (IOException e){
              e.printStackTrace();
    }
    
}
}
