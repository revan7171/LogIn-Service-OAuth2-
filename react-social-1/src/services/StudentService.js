// const EMPLOYEE_API_BASE_URL = "http://localhost:8080/api/student/create";

// class StudentService {

//     async getStudent(){
//         try {
//             const response = await fetch(EMPLOYEE_API_BASE_URL);
//             if (!response.ok) {
//                 throw new Error('Failed to fetch data');
//             }
//             return await response.json();
//         } catch (error) {
//             console.error('Error fetching students:', error);
//             throw error;
//         }
//     }

//     async createStudent(student){
//         try {
//             const response = await fetch(EMPLOYEE_API_BASE_URL, {
//                 method: 'POST',
//                 headers: {
//                     'Content-Type': 'student/create'
//                 },
//                 body: JSON.stringify(student)
//             });
//             if (!response.ok) {
//                 throw new Error('Failed to create student');
//             }
//             return await response.json();
//         } catch (error) {
//             console.error('Error creating student:', error);
//             throw error;
//         }
//     }

//     async getStudentById(studentId){
//         try {
//             const response = await fetch(EMPLOYEE_API_BASE_URL + '/' + studentId);
//             if (!response.ok) {
//                 throw new Error('Failed to fetch student');
//             }
//             return await response.json();
//         } catch (error) {
//             console.error('Error fetching student by ID:', error);
//             throw error;
//         }
//     }

//     async updateStudent(student, studentId){
//         try {
//             const response = await fetch(EMPLOYEE_API_BASE_URL + '/' + studentId, {
//                 method: 'PUT',
//                 headers: {
//                     'Content-Type': 'application/json'
//                 },
//                 body: JSON.stringify(student)
//             });
//             if (!response.ok) {
//                 throw new Error('Failed to update student');
//             }
//             return await response.json();
//         } catch (error) {
//             console.error('Error updating student:', error);
//             throw error;
//         }
//     }

//     async deleteStudent(studentId){
//         try {
//             const response = await fetch(EMPLOYEE_API_BASE_URL + '/' + studentId, {
//                 method: 'DELETE'
//             });
//             if (!response.ok) {
//                 throw new Error('Failed to delete student');
//             }
//         } catch (error) {
//             console.error('Error deleting student:', error);
//             throw error;
//         }
//     }
// }

// export default new StudentService();
