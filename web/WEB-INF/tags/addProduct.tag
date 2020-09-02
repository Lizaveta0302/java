<%@tag %>
<h3 style="text-align: center">Add product</h3>
<br>
<form method="post" action="/web/addProduct">
    <label for="name">Input name:</label>
    <input type="text" id="name" name="name">
    <label for="price">Input price:</label>
    <input type="text" id="price" name="price">
    <button type="submit">Save</button>
</form>