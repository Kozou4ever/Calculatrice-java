<script setup>
import { useDisplayStore } from '../../stores/displayValue';

const store = useDisplayStore();
const { addValue } = store;

defineProps({
  digit: String,
});


</script>

<template>
  <button @click="addValue(digit)" class="bg-gray-800 w-10 h-10 p-2.5 text-white rounded hover:bg-gray-400" :value="digit">{{ digit }}</button>
</template>

