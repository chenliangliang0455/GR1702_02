package com.hashmaptest;
/**�����ߣ�������
 *����ʱ�䣺2017��12��5������9:03:04
 *���䣺2507147605@qq.com
 */
public class Country {
String name;
long population ;

public Country(String name, long population) {
	this.name = name;
	this.population = population;
}

@Override
public String toString() {
	return "Country [name=" + name + ", population=" + population + "]";
}

}
