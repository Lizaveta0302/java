<%@tag %>
<h3 style="text-align: center">Add product</h3>
<br>
<form method="post" action="/products/addProduct">
    <label for="name">Input name:</label>
    <input type="text" id="name" name="name">
    <br>
    <label for="price">Input price:</label>
    <input type="text" id="price" name="price">
    <br>
    <label for="fatContent">Input fatContent:</label>
    <input type="text" id="fatContent" name="fatContent">
    <br>
    <button type="submit">Save</button>
</form>