<template>
  <v-app>
    <v-app-bar app>
      <v-toolbar-title class="headline">
        <span>ReadingList </span>
        <span class="font-weight-light">alpha</span>
      </v-toolbar-title>
      <v-spacer></v-spacer>
      <v-btn
        text
        href="https://github.com/vuetifyjs/vuetify/releases/latest"
        target="_blank"
      >
        <span class="mr-2">Latest Release</span>
      </v-btn>
    </v-app-bar>

    <v-content>
      <Readinglist />
    </v-content>
  </v-app>
</template>

<script>
import Readinglist from "./components/Readinglist";

export default {
  name: "App",
  components: {
    Readinglist
  },
  data: () => ({
    //
  })
};
</script>
