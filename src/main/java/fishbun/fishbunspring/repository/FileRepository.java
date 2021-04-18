package fishbun.fishbunspring.repository;

import fishbun.fishbunspring.domain.File;

import java.util.List;

public interface FileRepository {
    int insert(List<File> fileList);
    File selectById(Integer file_id);
    int deleteFile(Integer file_id);
    List<File> selectByStoId(Integer sto_id);
}
