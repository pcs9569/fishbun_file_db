package fishbun.fishbunspring.service;

import fishbun.fishbunspring.repository.FileRepository;

public class FileService {

    private final FileRepository fileRepository;
    public FileService(FileRepository fileRepository) { this.fileRepository=fileRepository; }


}
