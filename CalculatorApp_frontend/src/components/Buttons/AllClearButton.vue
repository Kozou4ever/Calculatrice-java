<script setup>
import { useDisplayStore } from '../../stores/displayValue';

defineProps({
    content: String
})

const store = useDisplayStore();
const { resetValues } = store;

</script>

<template>
    <button @click="resetValues()" class="bg-gray-800 text-green-300 w-10 h-10 p-2.5 rounded hover:bg-gray-400">
        {{ content }}
    </button>
</template>

