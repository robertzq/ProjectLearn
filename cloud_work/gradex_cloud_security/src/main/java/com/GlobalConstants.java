package com;

import java.util.HashSet;

public class GlobalConstants {

	public static final String SUCCESS_STATUS_CODE = "200";// 操作成功码
	public static final String FAILURE_STATUS_CODE = "201" ;//操作失败码 
	public static final String ALT_MSG_SUCCESS = "操作成功";// 操作成功提示消息
	public static final String ALT_MSG_FAILURE= "操作失败";// 操作成功提示消息
	public static final String ALT_MSG_004_CODE = "221";

	public static final String ZERO = "0";
	public static final String ONE = "1";
	public static final String TWO = "2";
	public static final String THREE = "3";

	public static final String sysName = "ISS";
	public static final int PAGE_NUM = 5;// 表格每页显示的数量
	public static final int SIZE = 5; // 每页显示几条

	// 判断是否有效
	public static final String IS_ACTIVE = "1";
	public static final String IS_NOT_ACTIVE = "0";

	public static final String TOTAL_PAGE_NUM = "totalPageNum";// 分页总数标示
	public static final String CURRENT_PAGE = "currentPage";// 当前页码
	public static final String SUCCESS = "success";// 成功
	public static final String FAIL = "fail";// 失败
	public static final String ERROR = "error"; // 错误
	// 是否当前月的日期样式ID
	public static final String CSS_IS_SAMEMONTH_Y = "hdp";
	public static final String CSS_IS_SAMEMONTH_N = "finish";
	// 今天的日期样式
	public static final String CSS_IS_TODAY = "";

	public static final String INIT_PWD = "81DC9BDB52D04DC20036DBD8313ED055";

	public static final String AES_KEY = "UNTDXDKE34S#@$DSF";
	// 通用
	public static final String BOOLEAN_Y = "1";// 是
	public static final String BOOLEAN_N = "0";// 否

	public static final String UPLOAD_FAIL_MESSAGE = "上传失败";

	public static final int SOLR_PAGENUM = 8;
	
	public static final String EMAIL_PATTERN= "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
	public static final String MOBILE_PATTERN= "^1(3[0-9]|4[57]|5[0-35-9]|7[0135678]|8[0-9])\\d{8}$";
	
	public static final String CV_TYPE = "原始简历";
	
	public static final String USER_PHOTO="用户照片";
	
	public static final String USER_PHOTO_FLAG = "userPhoto";
	
	public static final HashSet<String> CAREER_LABEL_CATEGORY = new HashSet<String>();
	static {
		CAREER_LABEL_CATEGORY.add("行业");
		CAREER_LABEL_CATEGORY.add("技能");
	}
	
	 
}
