<script setup>
import OperationService from '../../services/OperationService.js';
import { useDisplayStore } from '../../stores/displayValue';

const store = useDisplayStore();
const { resetValues } = store;

const submitOperation = () => {
    var { getFirst, getSecond, getOperation, showResult } = store;
    OperationService.setOperation({
        first: getFirst,
        second: getSecond,
        operationType: getOperation
    }).then((res) => {
        showResult(res.data);
    }).catch(error => console.error("Y'a une erreur", error));
    resetValues();
}

defineProps({
    equal: String,
})
</script>

<template>
    <button @click="submitOperation()" class="bg-gray-800 w-10 h-10 p-2.5 text-red-500 rounded hover:bg-gray-400">{{
        equal
    }}</button>
</template>

