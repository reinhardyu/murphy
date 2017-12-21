package com.murphy.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertiesGetValue extends PropertyPlaceholderConfigurer  {

	
	private static Map<String, Object> propertiesMap;

	@Override
	protected void processProperties(
			ConfigurableListableBeanFactory beanFactoryToProcess,
			Properties props) throws BeansException {

		super.processProperties(beanFactoryToProcess, props);

		propertiesMap = new HashMap<String, Object>();

		for (Object key : props.keySet()) {
			String keyStr = key.toString();
			String value = props.getProperty(keyStr);
			propertiesMap.put(keyStr, value);
		}
	}

	/**
	 * 获取系统消息内容
	 * 
	 * @param name
	 * @return
	 */
	public static String getContextProperty(String name) {
		String value = "";
		if (propertiesMap.get(name) instanceof String) {
			value = propertiesMap.get(name).toString();
		}
		return value;
	}

	/**
	 * 获取系统消息内容,存在置换文字的情�?
	 * 
	 * @param name
	 * @param replaseStr
	 * @return
	 */
	public static String getContextProperty(String name, String... replaseStr) {

		String value = "";
		// 获取消息文件中内�?
		if (propertiesMap.get(name) instanceof String) {
			value = propertiesMap.get(name).toString();
		}

		// 替换其中�?��置换的内�?
		for (int i = 0; i < replaseStr.length; i++) {
			if (!"".equals(value)) {
				value.replaceAll("{" + i + "}", replaseStr[i]);
			}
		}
		return value;
	}
}
