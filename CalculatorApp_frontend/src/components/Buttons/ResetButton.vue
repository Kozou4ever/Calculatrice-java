<script setup>
import ReloadIcon from '../Icons/ReloadIcon.vue';
import { useDisplayStore } from '../../stores/displayValue';

const store = useDisplayStore();
const { sliceValue } = store;
</script>

<template>
  <button @click="sliceValue()" class="bg-gray-800 w-10 h-10 p-2.5 rounded hover:bg-gray-400">
    <ReloadIcon></ReloadIcon>
  </button>
</template>

