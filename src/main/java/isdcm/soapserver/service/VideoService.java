package isdcm.soapserver.service;

import isdcm.soapserver.ws.VideoDTO;

import java.util.List;

public interface VideoService {

    List<VideoDTO> findAllVideo();

    List<VideoDTO> findVideoByTitle(String title);

    List<VideoDTO> findVideoByAuthor(String author);

    List<VideoDTO> findVideoByDate(String year, String month, String day);

}
