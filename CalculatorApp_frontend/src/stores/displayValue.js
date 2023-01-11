import { defineStore } from 'pinia'

export const useDisplayStore = defineStore('displayValue', {
  state: () => ({
    firstValue: '',
    secondValue: '',
    operation: '',
    result: 0,
    writeToSecond: false
  }),
  actions: {
    addValue(value) {
        this.writeToSecond ? this.secondValue += value : this.firstValue += value;
    },
      
    addOperator(value) {
        this.operation += value;
        this.writeToSecond = true;
    },
    showResult(value) {
        this.result = value;
    },
    resetValues() {
        this.firstValue = '';
        this.operation = '';
        this.secondValue = '';
        this.writeToSecond = false;
    }
  }
})