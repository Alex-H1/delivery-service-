package mybatis.interfaces;

import model.Staff;

import java.sql.SQLException;
import java.util.List;

public interface IStaffDAO extends IParentDAO<Staff> {

    List<Staff> getStaffByName(String name) throws SQLException;

}
