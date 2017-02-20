package hello;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
    	
        return "Hello Docker World";
    }

    public static void main(String[] args) throws InterruptedException {
    	
    	SpringApplication.run(Application.class, args);
    	while(true) {
    		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    		Date date = new Date();
    		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
            Thread.sleep(10000);
        }
    }
}
