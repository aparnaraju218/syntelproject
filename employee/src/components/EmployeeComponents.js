import React from 'react';
import EmployeeServices from '../services/EmployeeServices';
import './Table.css';

class EmployeeComponents extends React.Component{

    constructor(props){
        super(props)
        this.state = {
            employees:[]
        }
    }


    componentDidMount(){
        EmployeeServices.getEmployees().then((response) => {
            this.setState({employees: response.data})
        });
    }

    render (){
        return (

            <div>
                <h1 id="title"> Employee List</h1>
                <table id="content">

                    <thead>
                        
                        
                            

                            <td>Employee Id</td>
                            <td>Employee Name</td>
                            <td>Employee Designation</td>
                            <td>Employee Email Id</td>
                            
                        
                        
                    </thead>
                    <tbody>
                        {
                            this.state.employees.map(
                                employee =>
                                <tr key ={employee.employeeid} >
                                    <td> {employee.employeeid}</td>
                                    <td> {employee.name}</td>
                                    <td> {employee.designation}</td>
                                    <td> {employee.email}</td>

                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>


        );
        
    }

}

export default EmployeeComponents