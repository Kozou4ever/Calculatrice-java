import { createRouter, createWebHistory } from "vue-router";
import Calculatrice from '../views/CalculatriceView.vue';
import Historique from '../views/HistoriqueView.vue';

const routes = [
    { path: '/', name: 'calculatrice', component: Calculatrice },
    {path: '/historique', name: 'historique', component: Historique}
] 

const router = createRouter({
    history: createWebHistory(),
    routes,
    linkActiveClass: 'text-white'
})

export default router;