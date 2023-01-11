<script setup>
import { useDisplayStore } from '../../stores/displayValue';

const store = useDisplayStore();
const { addOperator } = store;

defineProps({
  operation: String,
})
</script>

<template>
  <button @click="addOperator(operation)" class="bg-gray-800 w-10 h-10 p-2.5 text-red-500 rounded hover:bg-gray-400">{{ operation }}</button>
</template>

