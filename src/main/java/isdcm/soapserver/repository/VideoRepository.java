package isdcm.soapserver.repository;

import isdcm.soapserver.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Integer> {

    List<Video> findAllVideoByTittle(@Param("tittle") String tittle);

    List<Video> findAllVideoByAuthor(@Param("author") String author);

    List<Video> findAllVideoByCreationDateGreaterThanEqual(@Param("creationDate") LocalDateTime creationDate);

}
