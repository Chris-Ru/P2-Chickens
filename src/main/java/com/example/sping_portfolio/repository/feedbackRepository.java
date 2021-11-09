package com.example.sping_portfolio.repository;
//imports
import com.example.sping_portfolio.entity.feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface feedbackRepository extends JpaRepository<feedback, Integer> {

    @Query("select max(f.id) from feedback f")
    public Integer findMaxId();
}
