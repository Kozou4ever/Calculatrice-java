/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    "./index.html",
    "./src/**/*.{vue,js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      colors: {
        'primary-button': '#272b34',
        'pad-color': '#292d36',
      }
    },
  },
  plugins: [],
}
