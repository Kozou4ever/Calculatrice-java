<script setup>
import NavBar from './components/NavBar.vue';

</script>

<template>
  <div class="flex flex-column justify-center items-center w-full h-full min-h-screen">
    <div class="bg-black flex flex-col justify-center items-center">
      <NavBar></NavBar>
      <router-view></router-view>
    </div>
  </div>

</template>

<style scoped>
.logo {
  height: 6em;
  padding: 1.5em;
  will-change: filter;
}
.logo:hover {
  filter: drop-shadow(0 0 2em #646cffaa);
}
.logo.vue:hover {
  filter: drop-shadow(0 0 2em #42b883aa);
}
</style>
