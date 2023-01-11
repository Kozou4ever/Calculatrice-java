<script setup>
import { ref, onMounted } from 'vue';
import OperationService from '../services/OperationService.js';
import AnOperation from './Operations/AnOperation.vue';

const operations = ref([])

const getHistory = () => {
    OperationService.getHistory().then((res) => {
        operations.value = res.data;
    })
}

onMounted(() => {
    getHistory();
})
</script>

<template>
    <div class="flex flex-col w-full h-96 overflow-y-scroll" id="scroll">
        <div v-for="operation in operations" :key="operation.id">
            <AnOperation :firstNumber="operation.first" :secondNumber="operation.second" :operation="operation.operation" :result="operation.result"></AnOperation>
        </div>
    </div>
</template>

<style scoped>
#scroll::-webkit-scrollbar {
    display: none;
}
</style>