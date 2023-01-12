import { defineStore } from "pinia";

export const useDisplayStore = defineStore("displayValue", {
  state: () => ({
    firstValue: "",
    secondValue: "",
    operation: "",
    result: "",
    writeToSecond: false,
  }),
  getters: {
    getFirst: (state) => parseFloat(state.firstValue),
    getSecond: (state) => parseFloat(state.secondValue),
    getOperation: (state) => state.operation,
    getResult: (state) => parseFloat(state.result),
  },
  actions: {
    addValue(value) {
      this.writeToSecond
        ? (this.secondValue += value)
        : (this.firstValue += value);
    },

    addOperator(value) {
      this.operation += value;
      this.writeToSecond = true;
    },
    showResult(value) {
      this.result = value;
    },
    resetValues() {
      this.firstValue = "";
      this.operation = "";
      this.secondValue = "";
      this.result = "";
      this.writeToSecond = false;
    },
    sliceValue() {
      if (this.secondValue === "" && this.operation === "" && this.firstValue != "") {
        this.firstValue = this.firstValue.slice(0, -1);
        this.writeToSecond = false;
      }
      else if (this.secondValue != "") {
        this.secondValue = this.secondValue.slice(0, -1);
      } 
      else if (this.secondValue === "" && this.operation != "") {
        this.operation = this.operation.slice(0, -1);
      }
    }
  },
});
