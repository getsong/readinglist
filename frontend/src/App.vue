<template>
  <v-app>
    <v-app-bar app color="amber">
      <v-toolbar-title class="headline">
        <span>ReadingList </span>
        <span class="font-weight-light">alpha</span>
      </v-toolbar-title>
      <v-spacer></v-spacer>
      <v-text-field
        label="Solo"
        v-model="newUrl"
        placeholder="Add URL"
        solo
        hide-details
      />
      <v-btn outlined @click="addItem()">Add</v-btn>

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
      {{ newUrl }}
      <Readinglist />
    </v-content>
  </v-app>
</template>

<script>
import Readinglist from "./components/Readinglist";
import baseService from "@/services/baseService";

export default {
  name: "App",
  components: {
    Readinglist
  },
  data: () => ({
    newUrl: null
  }),
  methods: {
    addItem() {
      console.log("add item");
      baseService.post(this.newUrl);
    }
  }
};
</script>
