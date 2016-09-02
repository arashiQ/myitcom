const React = require('react');
const client = require('./client');

class App extends React.Component {

    constructor(props) {
        super(props);
        this.state = {employees: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/state'}).done(response => {
            this.setState(state);
    });
    }

    render() {
        return (
            <ProjectKPIList projectKPIs={this.state.projectKPIs}/>
    )
    }
}

class ProjectKPIList extends React.Component{
    render() {
        var projectKPIs = this.props.projectKPIs.map(kpi =>
            <projectKPI key={employee._links.self.href} employee={employee}/>
        );
        return (
            <table>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Description</th>
                </tr>
                {employees}
            </table>
        )
    }
}

class projectKPI extends React.Component{
    render() {
        return (
            <tr>
                <td>{this.props.employee.firstName}</td>
                <td>{this.props.employee.lastName}</td>
                <td>{this.props.employee.description}</td>
            </tr>
        )
    }
}