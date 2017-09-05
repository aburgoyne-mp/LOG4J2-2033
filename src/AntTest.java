import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.util.ProviderUtil;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;


public class AntTest extends Task {
    private static void logTest() {
		System.out.println("ProviderUtil.hasProviders() = " + ProviderUtil.hasProviders());
		System.out.println("LogManager.getContext() = " + LogManager.getContext());
        LogManager.getLogger(AntTest.class).warn("test warn");
    }

	public void execute() throws BuildException {
        logTest();
	}

    public static void main(String[] args) {
        logTest();
    }
}
