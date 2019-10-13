public class Student  {

    private long enrollNo;
    private String name;
    private String hostel;
    private long phoneNo;
    private String email;

    public Student(long mEnrollNo, String mName, String mHostel, long mPhoneNo, String mEmail)  {
        this.enrollNo = mEnrollNo;
        this.hostel = mHostel;
        this.name = mName;
        this.phoneNo = mPhoneNo;
        this.email = mEmail;
    }

        this.enrollNo = enrollNo;
        this.name = name;
        this.hostel = hostel;
    }

    public void updateStudentInfo(String newHostel, long newPhoneNo, String newEmail) {
        hostel = newHostel; 
        email = newEmail;
        phoneNo = newPhoneNo;
    }

    public long getEnrollNo() {
        return enrollNo;
    }

    public void setEnrollNo(long enrollNo) {
        this.enrollNo = enrollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" + "enrollNo=" + enrollNo + ", name='" + name + '\'' + ", hostel='" + hostel + '\''
                + ", phoneN   
                   