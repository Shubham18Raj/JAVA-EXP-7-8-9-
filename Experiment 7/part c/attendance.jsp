<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Student Attendance</title>
</head>
<body>
  <h2>Attendance Submission</h2>
  <form action="AttendanceServlet" method="post">
    Student ID: <input type="text" name="studentId"><br><br>
    Date: <input type="date" name="date"><br><br>
    Status:
    <select name="status">
      <option>Present</option>
      <option>Absent</option>
    </select><br><br>
    <input type="submit" value="Submit Attendance">
  </form>
</body>
</html>

