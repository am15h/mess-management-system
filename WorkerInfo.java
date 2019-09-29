import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;
import java.sql.Timestamp;

public class WorkerInfo
{
    private long workerId;
    private String Name;
    private String Hostel;
    private long phoneNo;
    private long salary;
    private LocalTime shiftStart;
    private LocalTime shiftEnd;

    public WorkerInfo(long workerId ,String Name , String Hostel , long phoneNo , long salary , LocalTime shiftStart , LocalTime shiftEnd)
    {
	this.workerId = workerId;
	this.Name = Name;
	this.Hostel = Hostel;
	this.phoneNo = phoneNo;
	this.salary = salary;
	this.shiftStart = shiftStart;
	this.shiftEnd = shiftEnd;
    }

    public void UpdateInfo(String newHostel , long newPhoneNo , long newSalary , LocalTime    newshiftStart , LocalTime newShiftEnd)
    {
	Hostel = newHostel;
	phoneNo = newPhoneNo;
	salary = newSalary;
	shiftStart = newshiftStart;
	shiftEnd = newShiftEnd;
    }
}
