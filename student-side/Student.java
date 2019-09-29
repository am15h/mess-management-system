public class Student{
    
    private long mEnrollNo;
    private String mName;
    private String mHostel;
    private long mPhoneNo;
    private String mEmail;

    public Student(long mEnrollNo, String mName, String mHostel, long mPhoneNo, String mEmail){
        this.mEnrollNo = mEnrollNo;
        this.mHostel = mHostel;
        this.mName = mName;
        this.mPhoneNo = mPhoneNo;
        this.mEmail = mEmail;
    }

    public updateStudentInfo(String newHostel, long newPhoneNo, String newEmail){
        mHostel = newHostel;
        mEmail = newEmail;
        mPhoneNo = newPhoneNo;
    }
}