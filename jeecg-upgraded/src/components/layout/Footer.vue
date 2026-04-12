<template>
  <div class="footer">
    <div class="footer-content">
      <span>&copy; 2026 JEECG Framework</span>
      <span class="footer-links">
        <a href="http://www.jeecg.com" target="_blank">JEECG官网</a>
        <span> | </span>
        <a href="#">关于我们</a>
        <span> | </span>
        <a href="#">联系我们</a>
      </span>
    </div>
  </div>
</template>

<script setup>
// Footer.vue - 底部栏组件
</script>

<style scoped>
.footer {
  height: 25px;
  background-color: #ffffff;
  border-top: 1px solid #e4e7ed;
  display: flex;
  align-items: center;
  justify-content: center;
}

.footer-content {
  display: flex;
  align-items: center;
  gap: 20px;
  font-size: 12px;
  color: #CC99FF;
}

.footer-links a {
  color: #666666;
  text-decoration: none;
}

.footer-links a:hover {
  color: #409EFF;
}
</style>