<script setup>
    import OperationResult from "./Operations/OperationResult.vue";
    import CurrentOperation from "./Operations/CurrentOperation.vue";
</script>

<template>
    <div class="flex flex-col items-end w-full mt-5">
        <CurrentOperation></CurrentOperation>
        <OperationResult></OperationResult>

    </div>
</template>