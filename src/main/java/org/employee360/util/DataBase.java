package org.employee360.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.employee360.bo.Bill;
import org.employee360.bo.BillType;
import org.employee360.bo.Employee;
import org.employee360.bo.Event;
import org.employee360.bo.Feedback;
import org.employee360.bo.FeedbackType;
import org.employee360.bo.Form16;
import org.employee360.bo.LeaveBalance;
import org.employee360.bo.LeaveRequest;

public class DataBase {

	public static Map<Integer, Event> eventMap = new HashMap<>();
	public static Map<String, LeaveBalance> leaveBalanceMap = new HashMap<>();
	public static Map<Integer, LeaveRequest> leaveRequestMap = new HashMap<>();
	public static Map<String, Form16> Form16Map = new HashMap<>();
	public static Map<String, Employee> employeMap = new HashMap<>();
	public static Map<Integer, Bill> billMap = new HashMap<>();
	public static List<BillType> billTypeList = new ArrayList<>();
	public static List<FeedbackType> feedbackTypeList = new ArrayList<>();
	public static Map<Integer, Feedback> feedbackMap = new HashMap<>();
	

}
