public class AttendanceSystemAdapter implements SchoolManagementApp {
    private AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }
    @java.lang.Override
    public String integrateSystem() {
        return attendanceSystem.markAttendance();
    }
}