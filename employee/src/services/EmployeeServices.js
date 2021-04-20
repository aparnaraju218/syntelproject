import axios from 'axios'

const EMPLOYEE_REST_API_URL ="http://localhost:9090/api/employee";

class EmployeeServices{
getEmployees(){
    return axios.get(EMPLOYEE_REST_API_URL);
}

}
export default new EmployeeServices();