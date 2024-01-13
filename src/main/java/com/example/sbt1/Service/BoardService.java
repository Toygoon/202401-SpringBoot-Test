package com.example.sbt1.Service;

import com.example.sbt1.Entity.BoardEntity;
import com.example.sbt1.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public BoardEntity getBoard(Long id) throws Exception {
        return boardRepository.findById(id).orElseThrow(() -> new Exception("Not Found"));
    }
}
