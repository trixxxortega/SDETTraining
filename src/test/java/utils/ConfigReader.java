package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

    public class ConfigReader {

        private static final Properties properties;

        static {
            try {
                FileInputStream input = new FileInputStream("src/test/resources/config.properties");
                properties = new Properties();
                properties.load(input);
                input.close();
            } catch (IOException e) {
                throw new RuntimeException("Could not load config.properties file.", e);
            }
        }

        public static String getProperty(String key) {
            return properties.getProperty(key);
        }
}

