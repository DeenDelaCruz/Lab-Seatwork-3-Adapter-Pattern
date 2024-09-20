public class Main {
    public static void main(String[] args) {
        
        AttendanceSystem attendanceSystem = new AttendanceSystem();
            SchoolManagementApp attSys = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
            SchoolManagementApp grdSys = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
            SchoolManagementApp libSys = new LibrarySystemAdapter(librarySystem);

        System.out.println("Attendance: "+attSys.integrateSystem());
        System.out.println("Grades: "+grdSys.integrateSystem());
        System.out.println("Books: "+libSys.integrateSystem());
    }
}