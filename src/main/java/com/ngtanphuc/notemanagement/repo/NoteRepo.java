package com.ngtanphuc.notemanagement.repo;

import com.ngtanphuc.notemanagement.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {
    List<Note> findByUser_Id(Long id);
}
