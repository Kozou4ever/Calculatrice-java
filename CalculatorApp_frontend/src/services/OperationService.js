import axios from "axios";

const OPERATION_API_BASE_URL = "http://localhost:8080/api/v1/operations";

class OperationService {
  getHistory() {
    return axios.get(`${OPERATION_API_BASE_URL}/history`);
  }
  getAddition() {
    return axios.get(`${OPERATION_API_BASE_URL}/additions`);
  }
  getSoustraction() {
    return axios.get(`${OPERATION_API_BASE_URL}/soustractions`);
  }
  getMultiplication() {
    return axios.get(`${OPERATION_API_BASE_URL}/multiplications`);
  }
  getDivision() {
    return axios.get(`${OPERATION_API_BASE_URL}/divisions`);
  }
  setOperation(data) {
    return axios.post(`${OPERATION_API_BASE_URL}/calcule`, data);
  }
}

export default new OperationService();
