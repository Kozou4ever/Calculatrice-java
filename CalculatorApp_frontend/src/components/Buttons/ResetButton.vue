<script setup>
import ReloadIcon from '../Icons/ReloadIcon.vue';
import { useDisplayStore } from '../../stores/displayValue';

const store = useDisplayStore();
const { resetValues } = store;

</script>

<template>
  <button @click="resetValues()" class="bg-gray-800 w-10 h-10 p-2.5 rounded hover:bg-gray-400">
    <ReloadIcon></ReloadIcon>
  </button>
</template>

