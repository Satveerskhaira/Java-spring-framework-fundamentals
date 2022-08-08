package com.ss.repository;

import com.ss.model.Speaker;
import com.ss.util.CalendarFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;
    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    //Below is with spring way
   // private final CalendarFactory calendarFactory = new CalendarFactory();
    @Override
    public List<Speaker> findALL() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Sam");
        speaker.setLastName("Singh");
        speaker.setSeedNum(seedNum);

        System.out.println("cal:" + cal.getTime());

        //Below is with spring way
//        try {
//            System.out.println("Test calfactory" + calendarFactory.getObject().getTime());
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        speakers.add(speaker);

        return speakers;
    }


}
