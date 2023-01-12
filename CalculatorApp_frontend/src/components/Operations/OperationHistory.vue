<script setup>
defineProps({
    firstNumber: String,
    secondNumber: String,
    operation: String,
    result: String
})
</script>

<template>
    <div class="flex flex-col items-end border-t-2 border-gray-500 py-1 pr-1">
        <p class="text-sm text-gray-600">{{ firstNumber + operation + secondNumber }}</p>
        <p class="text-xl text-white">{{  result  }}</p>
    </div>
</template>

