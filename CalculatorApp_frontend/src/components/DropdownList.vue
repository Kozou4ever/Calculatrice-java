<script setup>
import { ref } from 'vue';
import FilterIcon from './Icons/FilterIcon.vue';
import TriangleIcon from './Icons/TriangleIcon.vue';
import { useHistoryStore } from '../stores/displayHistory';

const store = useHistoryStore();
const { getAddition, getSoustraction, getMultiplication, getDivision, getHistory } = store

var hidden = ref(true);
const toggleHidden = () => {
    hidden.value = !hidden.value;
}
</script>

<template>
    <div class="flex flex-col items-end w-full pr-4 mb-4">
        <div>
            <button @click="toggleHidden()"
                class="text-white bg-gray-800 hover:bg-gray-900 focus:ring-4 focus:outline-none focus:ring-gray-700 font-medium rounded-lg px-4 py-2.5 text-center inline-flex items-center text-xs w-24"
                type="button">
                <FilterIcon class="mr-2"></FilterIcon> Filtrer <TriangleIcon :class="hidden ? '' : 'rotate-180'">
                </TriangleIcon>
            </button>
            <!-- Dropdown menu -->
            <div class="z-10 rounded absolute shadow w-24 bg-gray-700" :class="hidden ? 'hidden' : ''">
                <ul class="py-1 text-xs text text-gray-200 text-center">
                    <li>
                        <button @click="getAddition()" class="block px-4 py-2 hover:bg-gray-800 w-full">Addition</button>
                    </li>
                    <li>
                        <button @click="getSoustraction()" class="block px-4 py-2 hover:bg-gray-800 w-full">Soustraction</button>
                    </li>
                    <li>
                        <button @click="getMultiplication()" class="block px-4 py-2 hover:bg-gray-800 w-full">Multiplication</button>
                    </li>
                    <li>
                        <button @click="getDivision()" class="block px-4 py-2 hover:bg-gray-800 w-full">Division</button>
                    </li>
                    <li>
                        <button @click="getHistory()" class="block px-4 py-2 hover:bg-gray-800 w-full">Tous</button>
                    </li>
                </ul>
            </div>
        </div>
    </div>


</template>