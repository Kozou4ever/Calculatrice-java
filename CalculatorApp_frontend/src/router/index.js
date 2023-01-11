import { createRouter, createWebHistory } from "vue-router";
import Calculatrice from '../components/Calculatrice.vue';
import OperationHistory from '../components/OperationHistory.vue';

const routes = [
    { path: '/', name: 'calculatrice', component: Calculatrice },
    {path: '/historique', name: 'historique', component: OperationHistory}
] 

const router = createRouter({
    history: createWebHistory(),
    routes,
    linkActiveClass: 'text-white'
})

export default router;