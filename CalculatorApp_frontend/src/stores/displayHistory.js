import { defineStore } from "pinia";
import OperationService from '../services/OperationService'

export const useHistoryStore = defineStore("displayHistory", {
  state: () => ({
    typeHistory: []
  }),
  getters: {
  },
  actions: {
    getHistory() {
      OperationService.getHistory().then((res) => {
        this.typeHistory = res.data;
      })
    },
    getAddition() {
      OperationService.getAddition().then((res) => {
        this.typeHistory = res.data;
      })
    },
    getSoustraction() {
      OperationService.getSoustraction().then((res) => {
        this.typeHistory = res.data;
      })
    },
    getMultiplication() {
      OperationService.getMultiplication().then((res) => {
        this.typeHistory = res.data;
      })
    },
    getDivision() {
      OperationService.getDivision().then((res) => {
        this.typeHistory = res.data;
      })
    }
  },
});
