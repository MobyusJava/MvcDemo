package util;

import bean.NumberBean;

public class RandomUtil {
	public static NumberBean RandomNumber(String irange) {
	    double range;
	    try {
	      range = Double.parseDouble(irange);
	    } catch(Exception E) {
	      range = 10.0;
	    }
	    return new NumberBean(Math.round(Math.random()*range));
	  }
}
