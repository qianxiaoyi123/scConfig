package multipledatasources.bordertrade.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.log4j.Logger;

public class DateUtil {
	private static Logger logger = Logger.getLogger(DateUtil.class);
	
	/**** 
     * 传入具体日期 ，返回具体日期增加/减少N个天 
     * @param date 日期(2019-01-01 01:01:01) 
     * @param interval 增加减少月数
     * @return 2019-02-01 01:01:01
     * @throws ParseException 
     */
    public static Date subOrAddDay(Date date, int interval) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.DAY_OF_MONTH, interval);
        return rightNow.getTime();
    }
    
    /**** 
     * 传入具体日期 ，返回具体日期增加/减少N个月
     * @param date 日期(2019-01-01 01:01:01) 
     * @param interval 增加减少月数
     * @return 2019-02-01 01:01:01
     * @throws ParseException 
     */
    public static Date subOrAddMonth(Date date, int interval) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.MONTH, interval);
        return rightNow.getTime();
    }
	
	/**
	 * @return yesr month day
	 */
	public static String getStringByDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddhhmmss");
		Date date = new Date();
		long cc = Math.round(Math.random() * 100);
		return formatter.format(date) + cc;
	}

	/**
	 * 对当前日期进行格式化处理
	 *
	 * @Title: getNowDateFormat
	 *
	 *         zhangwei 2018年8月29日
	 * @return Date
	 */
	public static Date getNowDateFormat() {
		Date date = new Date();// 对当前日期进行格式化处理
		String sDate = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat dateDf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date nowDate = null;
		try {
			nowDate = dateDf1.parse(sDate);
		} catch (ParseException e) {
			logger.info("关闭流异常" + e);
			return null;
		}
		return nowDate;
	}

	/**
	 * 获取时间精确到毫秒
	 *
	 * @return
	 * @author zzzhao
	 */
	public static String getSeqID() {
		SimpleDateFormat TIME = new SimpleDateFormat("yyyyMMddHHmmssSS", Locale.CHINESE);
		StringBuffer time = new StringBuffer(TIME.format(new Date(System.currentTimeMillis())));
		// 产生Min-Max之间的数字
		// Math.round(Math.random()*(Max-Min)+Min)
		if (time.length() < 17)
			time.append(String.valueOf(Math.round(Math.random() * (9 - 0) + 0)));
		return time.toString();
	}

	public static Date getDateByString(Object value) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return formatter.parse(value.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			logger.info("系统异常：" + e);
		}
		return null;
	}

	public static String getStringByDate(Date date) {
		if (date != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			return formatter.format(date);
		}
		return null;
	}

	public static String getCurrentDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		return formatter.format(date);
	}

	// 获取当前日期 String（yyyy_mm-dd）
	public static String getCurrentDated() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		return formatter.format(date);
	}

	public static String getDatedFormat(Date dates) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = dates;
		return formatter.format(date);
	}

	// 获取明天日期 String（yyyy_mm-dd）
	public static String getTomorrowDated() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = getBeginDayOfTomorrow();
		return formatter.format(date);
	}

	// 获取明天的开始时间
	public static Date getBeginDayOfTomorrow() {
		Calendar cal = new GregorianCalendar();
		cal.setTime(getDayBegin());
		cal.add(Calendar.DAY_OF_MONTH, 1);
		return cal.getTime();
	}

	// 获取昨天的开始时间
	public static Date getBeginDayOfYesterday() {
		Calendar cal = new GregorianCalendar();
		cal.setTime(getDayBegin());
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return cal.getTime();
	}
	// 获取前一天的开始时间
	public static Date getBeginDayOfYesterday(Date date) {
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return cal.getTime();
	}
	// 获取后一天的开始时间
	public static Date getBeginDayOfTomorrow(Date date) {
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, +1);
		return cal.getTime();
	}
	// 获取去年同天的开始时间
	public static Date getBeginDayOfYesteryear(Date date) {
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.YEAR, -1);
		return cal.getTime();
	}
	// 获取上月同天的开始时间
	public static Date getBeginDayOfYestermonth(Date date) {
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.MONTH, -1);
		return cal.getTime();
	}

	// 获取当天的开始时间
	public static Date getDayBegin() {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	public static Date getDateDay(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			String dateString = formatter.format(date);
			return formatter.parse(dateString);
		} catch (ParseException e) {
			logger.info("系统异常：" + e);
		}
		return null;
	}

	/**
	 * 获得指定日期的后一天 字符串
	 *
	 * @param specifiedDay
	 * @return String
	 * @Title: getSpecifiedDayAfter
	 *         <p>
	 *         zhangwei 2018年7月23日
	 */
	public static String getSpecifiedDayAfter(String specifiedDay) {
		Calendar c = Calendar.getInstance();
		Date date = null;
		try {
			date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
		} catch (ParseException e) {
			logger.info("系统异常：" + e);
		}
		c.setTime(date);
		int day = c.get(Calendar.DATE);
		c.set(Calendar.DATE, day + 1);

		String dayAfter = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
		return dayAfter;
	}

	/**
	 * 获得指定日期的后一天 日期格式
	 *
	 * @param today
	 * @return Date
	 * @Title: addOneday
	 *         <p>
	 *         zhangwei 2018年7月23日
	 */
	public static Date addOneday(Date today) {
		try {
			Date date = new Date(today.getTime() + 24 * 3600 * 1000);
			return date;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 获得指定日期的后一天 日期格式
	 *
	 * @param today
	 * @return Date
	 * @Title: addOneday
	 *         <p>
	 *         zhangwei 2018年7月23日
	 */
	public static Date addMinute(Date today, int minute) {
		Calendar nowTime = Calendar.getInstance();
		try {
			nowTime.add(Calendar.MINUTE, minute);
			return nowTime.getTime();
		} catch (Exception e) {
			return new Date();
		}
	}

	/**
	 * 当月第一天
	 *
	 * @return
	 */
	public static String getFirstDay() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		Date theDate = calendar.getTime();

		GregorianCalendar gcLast = (GregorianCalendar) Calendar.getInstance();
		gcLast.setTime(theDate);
		gcLast.set(Calendar.DAY_OF_MONTH, 1);
		String day_first = df.format(gcLast.getTime());
		StringBuffer str = new StringBuffer().append(day_first).append(" 00:00:00");
		return str.toString();
	}

	/**
	 * 当月最后一天
	 *
	 * @return
	 */
	public static String getLastDay() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		Date theDate = calendar.getTime();
		String s = df.format(theDate);
		calendar.add(Calendar.MONTH, 1); // 加一个月
		calendar.set(Calendar.DATE, 1); // 设置为该月第一天
		calendar.add(Calendar.DATE, -1); // 再减一天即为上个月最后一天
		String day_last = df.format(calendar.getTime());
		StringBuffer endStr = new StringBuffer().append(day_last);
		day_last = endStr.toString();
		StringBuffer str = new StringBuffer().append(day_last).append(" 23:59:59");
		return str.toString();

	}

	/** 锁对象 */
	private static final Object lockObj = new Object();

	/** 存放不同的日期模板格式的sdf的Map */
	private static Map<String, ThreadLocal<SimpleDateFormat>> sdfMap = new HashMap<String, ThreadLocal<SimpleDateFormat>>();

	/**
	 * 返回一个ThreadLocal的sdf,每个线程只会new一次sdf
	 * 
	 * @param pattern
	 * @return
	 */
	private static SimpleDateFormat getSdf(final String pattern) {
		ThreadLocal<SimpleDateFormat> tl = sdfMap.get(pattern);

		// 此处的双重判断和同步是为了防止sdfMap这个单例被多次put重复的sdf
		if (tl == null) {
			synchronized (lockObj) {
				tl = sdfMap.get(pattern);
				if (tl == null) {
					// 只有Map中还没有这个pattern的sdf才会生成新的sdf并放入map
					// 这里是关键,使用ThreadLocal<SimpleDateFormat>替代原来直接new SimpleDateFormat
					tl = new ThreadLocal<SimpleDateFormat>() {

						@Override
						protected SimpleDateFormat initialValue() {
							return new SimpleDateFormat(pattern);
						}
					};
					sdfMap.put(pattern, tl);
				}
			}
		}

		return tl.get();
	}

	/**
	 * 是用ThreadLocal<SimpleDateFormat>来获取SimpleDateFormat,这样每个线程只会有一个SimpleDateFormat
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String format(Date date, String pattern) {
		return getSdf(pattern).format(date);
	}

	public static Date parse(String dateStr, String pattern) throws ParseException {
		return getSdf(pattern).parse(dateStr);
	}
}
