package isdcm.soapserver.endpoints;

import isdcm.soapserver.service.VideoService;
import isdcm.soapserver.ws.FindVideoByAuthorRequest;
import isdcm.soapserver.ws.FindVideoByDateRequest;
import isdcm.soapserver.ws.FindVideoByTittleRequest;
import isdcm.soapserver.ws.VideoResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Endpoint
public class VideoEndPoint {

    private static final String NAMESPACE = "http://ws.soapserver.isdcm";

    private final VideoService videoService;

    public VideoEndPoint(VideoService videoService) {this.videoService = videoService;}

    @PayloadRoot(namespace = NAMESPACE, localPart = "findAllVideoRequest")
    @ResponsePayload
    public JAXBElement<VideoResponse> findAllVideo() {
        VideoResponse response = new VideoResponse();
        response.set_return(videoService.findAllVideo());
        QName qname = new QName("findVideoByTittleRequest");
        return new JAXBElement<>(qname, VideoResponse.class, response);
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "findVideoByTittleRequest")
    @ResponsePayload
    public JAXBElement<VideoResponse> findVideoByTittle(@RequestPayload FindVideoByTittleRequest request) {
        VideoResponse response = new VideoResponse();
        response.set_return(videoService.findVideoByTitle(request.getTittle()));
        QName qname = new QName("findVideoByTittleRequest");
        return new JAXBElement<>(qname, VideoResponse.class, response);
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "findVideoByAuthorRequest")
    @ResponsePayload
    public JAXBElement<VideoResponse> findVideoByAuthor(@RequestPayload FindVideoByAuthorRequest request) {
        VideoResponse response = new VideoResponse();
        response.set_return(videoService.findVideoByAuthor(request.getAuthor()));
        QName qname = new QName("findVideoByAuthorRequest");
        return new JAXBElement<>(qname, VideoResponse.class, response);
    }


    @PayloadRoot(namespace = NAMESPACE, localPart = "findVideoByDateRequest")
    @ResponsePayload
    public JAXBElement<VideoResponse> findVideoByDate(@RequestPayload FindVideoByDateRequest request) {
        VideoResponse response = new VideoResponse();
        response.set_return(videoService.findVideoByDate(request.getYear(),request.getMonth(),request.getDay()));
        QName qname = new QName("findVideoByDateRequest");
        return new JAXBElement<>(qname, VideoResponse.class, response);
    }


}
