<script setup>
import AnOperation from '../components/Operations/OperationHistory.vue';
import DropdownList from '../components/DropdownList.vue';
import { useHistoryStore } from '../stores/displayHistory';
import { storeToRefs } from 'pinia';
import { onMounted } from 'vue';

const store = useHistoryStore();
const { getHistory } = store;

onMounted(() => {
    getHistory();
});

var { typeHistory } = storeToRefs(store);
</script>

<template>
    <DropdownList></DropdownList>
    <div class="flex flex-col w-full h-96 overflow-y-scroll" id="scroll">
        <div v-for="operation in typeHistory" :key="operation.id">
            <AnOperation :firstNumber="operation.first" :secondNumber="operation.second"
                :operation="operation.operation" :result="operation.result"></AnOperation>
        </div>
    </div>
</template>

<style scoped>
#scroll::-webkit-scrollbar {
    display: none;
}
</style>