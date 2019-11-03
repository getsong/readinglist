<template>
  <v-container>
    <v-layout wrap>
      <v-flex v-for="(item, index) in list" :key="index">
        <a :href="item.url">
          {{ item.url }}
        </a>
      </v-flex>
    </v-layout>
  </v-container>
</template>

<script>
import base from "@/services/baseService";
// get("http://localhost:5678/items")

export default {
  data() {
    return {
      list: "hi"
    };
  },
  created() {
    let element = this;
    base.get("/items").then(data => element.list = data);
  }
};
</script>
