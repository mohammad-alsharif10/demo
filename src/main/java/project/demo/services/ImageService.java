package project.demo.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import project.demo.dataBase.ImageRepository;
import project.demo.models.Image;

@AllArgsConstructor
@Service
public class ImageService extends BaseService<Long, Image> {

    private ImageRepository imageRepository;

    @Override
    public ImageRepository getRepository() {
        return imageRepository;
    }
}
