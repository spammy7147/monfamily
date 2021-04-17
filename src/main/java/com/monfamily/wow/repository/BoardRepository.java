package com.monfamily.wow.repository;

import com.monfamily.wow.model.BoardVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardVO, Long> {


}
