<script setup>
defineProps({
  content: String,
  disabled: Boolean
})
</script>

<template>
  <button class="bg-gray-800 w-10 h-10 p-2.5 text-green-300 rounded" :class="disabled ? '' : 'hover:bg-gray-400'" :disabled="disabled">{{ content }}</button>
</template>

