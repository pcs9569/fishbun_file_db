package fishbun.fishbunspring.repository;

import fishbun.fishbunspring.domain.File;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class JdbcTemplateFileRepository implements FileRepository{

    private final JdbcTemplate jdbcTemplate;
    public JdbcTemplateFileRepository(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int insert(List<File> fileList) {

        for(File i : fileList) {
            jdbcTemplate.update("INSERT INTO file (file_id, sto_id, file_origin_name, file_save_name, file_size, file_reg_date, file_del_date) VALUES (?,?,?,?,?,NOW()), i.getFile_id(), i.getSto_id(), i.getFile_origin_name(), i.getFile_save_name(), i.getFile_size(), i.getFile_del_date()");
        }
        return 0;
    }

    @Override
    public File selectById(Integer file_id) {

        jdbcTemplate.update("SELECT * FROM file WHERE file_id = ?", fileRowMapper(), file_id);
        return null;
    }

    @Override
    public int deleteFile(Integer file_id) {
        int result = jdbcTemplate.update("UPDATE file SET file_delete_yn WHERE file_id =?", file_id);
        return result;
    }

    @Override
    public List<File> selectByStoId(Integer sto_id) {
        return null;
    }

    private RowMapper<File> fileRowMapper(){
        return (rs, rowNum) -> {
            File file = new File();
            file.setFile_id(rs.getInt("file_id"));
            file.setSto_id(rs.getInt("sto_id"));
            file.setFile_origin_name(rs.getString("file_origin_name"));
            file.setFile_save_name(rs.getString("file_save_name"));
            file.setFile_size(rs.getInt("file_size"));
            file.setFile_delete_yn(rs.getString("file_delete_yn"));
            file.setFile_reg_date(rs.getString("file_reg_date"));
            file.setFile_del_date(rs.getString("file_del_date"));

            return file;
        };
    }


}
