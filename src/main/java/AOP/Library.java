package AOP;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook(){
        System.out.println("Мы берем книгу");
    }

}
