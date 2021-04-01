package isdcm.soapserver.service;

import isdcm.soapserver.domain.Video;
import isdcm.soapserver.repository.VideoRepository;
import isdcm.soapserver.ws.VideoDTO;
import org.springframework.stereotype.Service;

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
