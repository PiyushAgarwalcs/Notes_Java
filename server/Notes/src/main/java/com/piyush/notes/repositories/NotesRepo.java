package com.piyush.notes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piyush.notes.entities.Notes;
import com.piyush.notes.entities.User;

public interface NotesRepo extends JpaRepository<Notes, Integer>{
    List<Notes> findByUser(User user);
}
