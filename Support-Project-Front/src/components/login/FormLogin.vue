<script setup></script>

<template>
  <div class="FormContainer">
    <form class="FormLogin">
      <input
        class="inputFormLogin"
        type="text"
        name="username"
        id="username"
        placeholder="Username"
        v-model.trim="username"
      />
      <input
        class="inputFormLogin"
        type="password"
        name="password"
        id="password"
        placeholder="Password"
        v-model.trim="password"
      />
      <button type="submit">Login</button>
    </form>
  </div>
</template>

<style scoped>

.FormContainer {
  border: 2px #0b9d3d;
}

.FormLogin {
  display: flex;
  flex-direction: column;
  align-items: center;
  border: 3px #0b9d3d;
}

input {
  border-radius: 5px;
  margin: 1rem;
}


</style>
