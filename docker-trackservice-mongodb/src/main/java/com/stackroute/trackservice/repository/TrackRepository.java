package com.stackroute.trackservice.repository;

import com.stackroute.trackservice.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interface to perform database operations
 */
@Repository
public interface TrackRepository extends MongoRepository<Track, Integer> {
//    Select * from is not added as it's boilerplate code and will be added automatically
//    Ref: https://www.youtube.com/watch?v=WTEGvLXxyOY
//    @Query("select track from Track track where track.trackName like %?1%")
    List<Track> findByTrackName(String trackName);
}
