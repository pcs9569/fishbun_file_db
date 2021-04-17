package fishbun.fishbunspring.repository;

import fishbun.fishbunspring.domain.File;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTemplateFileRepository implements FileRepository{

    private final JdbcTemplate jdbcTemplate;
    public JdbcTemplateFileRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public File insert(List<File> fileList) {
        return null;
    }

    @Override
    public File selectById(Integer file_id) {
        return null;
    }

    @Override
    public int deleteFile(Integer file_id) {
        return 0;
    }

    @Override
    public List<File> selectByStoId(Integer sto_id) {
        return null;
    }
}
