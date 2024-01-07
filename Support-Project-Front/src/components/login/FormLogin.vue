<script setup></script>

<template>
  <div class="FormContainer">
    <h2>CONEXIÓN</h2>
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
      <button class="btnFormLogin" type="submit">Conectar</button>
    </form>
  </div>
</template>

<style scoped>

.FormContainer {
  border: solid 1px #0b9d3d;
  border-radius: 10px;
  margin: 5%;
  padding: 12% 5%;
  background-color: #0b9d3d;
}

.FormLogin {
  display: flex;
  flex-direction: column;
  align-items: center;
  border: 3px #0b9d3d;
}

input, button {
  border-radius: 5px;
  margin: 1rem;
  border: solid 2px #0b9d3d;
  padding: 2%;
  color: #0b9d3d;
}

h2 {
  text-align: center;
}
</style>
