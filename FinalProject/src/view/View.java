
package view;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public interface View {
	<T> void showData(List<T> data, DefaultTableModel model);
}
