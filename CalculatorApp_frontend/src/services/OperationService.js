import axios from "axios";

const OPERATION_API_BASE_URL = 'http://localhost:8080/api/v1/operations';

class OperationService {
    getHistory() {
        return axios.get(`${OPERATION_API_BASE_URL}/history`);
    }
    setOperation(data) {
        console.log(data);
        return axios.post(`${OPERATION_API_BASE_URL}/calcule`, data);
    }
}

export default new OperationService();