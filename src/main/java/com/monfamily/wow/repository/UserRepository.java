package com.monfamily.wow.repository;

import com.monfamily.wow.model.BoardVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<BoardVO, Long> {








}
