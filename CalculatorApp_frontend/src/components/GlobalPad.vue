<script setup>
    import OtherButton from './Buttons/OtherButton.vue';
    import OperationButton from './Buttons/OperationButton.vue';
    import DigitButton from './Buttons/DigitButton.vue';
    import ResetButton from './Buttons/ResetButton.vue';
    import OperationSubmit from './Buttons/OperationSubmit.vue';
    import AllClearButton from './Buttons/AllClearButton.vue';
</script>

<template>
<div class="grid grid-cols-4 gap-3 justify-items-center bg-gray-800/80 w-full h-auto rounded-t-lg py-6 px-4 mt-3">
    <AllClearButton content="AC"></AllClearButton>
    <OtherButton content="±" disabled></OtherButton>
    <OtherButton content="%" disabled></OtherButton>
    <OperationButton operation="÷"></OperationButton>

    <DigitButton digit="7"></DigitButton>
    <DigitButton digit="8"></DigitButton>
    <DigitButton digit="9"></DigitButton>
    <OperationButton operation="x"></OperationButton>

    <DigitButton digit="4"></DigitButton>
    <DigitButton digit="5"></DigitButton>
    <DigitButton digit="6"></DigitButton>
    <OperationButton operation="-"></OperationButton>

    <DigitButton digit="1"></DigitButton>
    <DigitButton digit="2"></DigitButton>
    <DigitButton digit="3"></DigitButton>
    <OperationButton operation="+"></OperationButton>
    
    <ResetButton></ResetButton>
    <DigitButton digit="0"></DigitButton>
    <DigitButton digit="."></DigitButton>
    <OperationSubmit equal="="></OperationSubmit>
  </div>
</template>