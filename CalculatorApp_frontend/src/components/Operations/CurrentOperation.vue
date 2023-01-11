<script setup>
import { useDisplayStore } from '../../stores/displayValue';
import { storeToRefs } from 'pinia';

const store = useDisplayStore();
const { firstValue, secondValue, operation } = storeToRefs(store);

</script>

<template>
    <div class="px-4">
        <span class="text-white text-base px-1" v-if="firstValue">{{ firstValue }}</span>
        <span class="text-red-500 text-sm px-1">{{ operation }}</span>
        <span class="text-white text-base px-1" v-if="secondValue">{{ secondValue }}</span>
    </div>
</template>