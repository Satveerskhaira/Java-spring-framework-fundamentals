package com.ss.repository;

import com.ss.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findALL();
}
