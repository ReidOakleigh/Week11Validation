package edu.dmacc.week11validation.repo;



import edu.dmacc.week11validation.beans.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Rumbi Chinhamhora rchinhamhora
 * CIS 175 - Spring 2021
 * Apr 5, 2021
 */
@Repository
public interface FriendRepo extends CrudRepository<Friend, Long> {
    List<Friend> findAll();
}