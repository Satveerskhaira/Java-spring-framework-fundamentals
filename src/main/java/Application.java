import com.ss.model.Speaker;
import com.ss.service.SpeakerService;
import com.ss.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
       // SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = appContext.getBean("speakerService",SpeakerService.class);

       //System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getSeedNum());
        //SpeakerService service1 = appContext.getBean("speakerService",SpeakerService.class);

        //System.out.println(service);
    }
}