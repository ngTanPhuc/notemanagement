package com.ngtanphuc.notemanagement.service;

import com.ngtanphuc.notemanagement.model.Note;
import com.ngtanphuc.notemanagement.model.User;
import com.ngtanphuc.notemanagement.repo.NoteRepo;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
    private NoteRepo noteRepo;

    public NoteService(NoteRepo noteRepo) {
        this.noteRepo = noteRepo;
    }

    public Note createNote(Note note, User user) {
        note.setUser(user);
        return this.noteRepo.save(note);
    }
}
