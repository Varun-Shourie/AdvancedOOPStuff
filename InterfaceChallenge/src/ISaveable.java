import java.util.List;

public interface ISaveable {

	List write();
	
	void read(List list);
}
