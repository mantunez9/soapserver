package isdcm.soapserver.service;

import isdcm.soapserver.domain.Video;
import isdcm.soapserver.repository.VideoRepository;
import isdcm.soapserver.ws.VideoDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;

    public VideoServiceImpl(VideoRepository videoRepository) {this.videoRepository = videoRepository;}

    @Override
    public List<VideoDTO> findVideoByTitle(String title) {
        List<Video> videoList = videoRepository.findAllVideoByTittle(title);
        return getVideoDTOList(videoList);
    }

    @Override
    public List<VideoDTO> findVideoByAuthor(String author) {
        List<Video> videoList = videoRepository.findAllVideoByAuthor(author);
        return getVideoDTOList(videoList);
    }

    @Override
    public List<VideoDTO> findVideoByDate(String year, String month, String day) {
        LocalDateTime dateTime = LocalDateTime.of(Integer.parseInt(year), Integer.parseInt((StringUtils.isNotBlank(month) ? month : "01")), Integer.parseInt((StringUtils.isNotBlank(day) ? day : "01")), 0, 0);
        List<Video> videoList = videoRepository.findAllVideoByCreationDateGreaterThanEqual(dateTime);
        return getVideoDTOList(videoList);
    }

    private List<VideoDTO> getVideoDTOList(List<Video> videoList) {

        List<VideoDTO> videoDTOList = new ArrayList<>();

        for (Video video : videoList) {

            VideoDTO videoDTO = new VideoDTO();
            videoDTO.setVideoId(video.getVideoId());
            videoDTO.setTittle(video.getTittle());
            videoDTO.setAuthor(video.getAuthor());
            videoDTO.setDescription(video.getDescription());
            videoDTO.setDuration(String.valueOf(video.getDuration()));
            videoDTO.setCreationDate(String.valueOf(video.getCreationDate()));
            videoDTO.setFormat(video.getFormat());
            videoDTO.setUrl(video.getUrl());
            video.setReproduction(video.getReproduction());
            videoDTOList.add(videoDTO);

        }

        return videoDTOList;

    }
}
