<script setup>
import { storeToRefs } from 'pinia';
import OperationService from '../../services/OperationService.js';
import { useDisplayStore } from '../../stores/displayValue';

const store = useDisplayStore();
const { firstValue, secondValue, operation, showResult } = store;

const submitOperation = () => {
    console.log(typeof firstValue);
    OperationService.setOperation({
        first: parseFloat(firstValue),
        second: parseFloat(secondValue),
        operationType: operation
    }).then((res) => {
        showResult(res.data.toString());
    }).catch(error => console.error("Y'a une erreur", error));
}

defineProps({
    equal: String,
})
</script>

<template>
    <button @click="submitOperation()"
        class="bg-gray-800 w-10 h-10 p-2.5 text-red-500 rounded hover:bg-gray-400">{{ equal }}</button>
</template>

