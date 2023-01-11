<script setup>
import { useDisplayStore } from '../../stores/displayValue';
import { storeToRefs } from 'pinia';

const store = useDisplayStore();
const { result } = storeToRefs(store);

</script>

<template>
    <div class="text-white text-3xl px-4">{{ result }}</div>
</template>