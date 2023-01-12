<script setup>
import { useDisplayStore } from '../../stores/displayValue';
import { storeToRefs } from 'pinia';

const store = useDisplayStore();
var { firstValue, secondValue, operation } = storeToRefs(store);

</script>

<template>
    <div class="px-4" id="input_op">
        <span class="text-white text-base px-1">{{ firstValue }}</span>
        <span class="text-red-500 text-sm px-1">{{ operation }}</span>
        <span class="text-white text-base px-1">{{ secondValue }}</span>
    </div>
</template>