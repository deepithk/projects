package com.mindtree.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class GetProperties {
	public static Properties get;

	public GetProperties() throws Exception {
		if (get == null) {
			try {
				get = new Properties();
				FileInputStream fs = new FileInputStream(
						System.getProperty("user.dir") + "/src/test/resources/config.properties");
				get.load(fs);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
