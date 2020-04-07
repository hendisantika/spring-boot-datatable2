$(document).ready(function () {
    var table = $('#productsTable').DataTable({
        "sAjaxSource": "/api/products",
        "sAjaxDataProp": "",
        "order": [[0, "asc"]],
        "columns": [
            {"data": "id"},
            {"data": "name"},
            {"data": "price"},
            {"data": "productId"},
            {"data": "version"},
            {
                "data": "id",
                "render": function (data, type, full, meta) {
                    return '<a class="btn btn-danger btn-sm" onclick="return confirm(\'Anda yakin menghapus product ini ?\');" href="/product/delete/' + data + '">Delete</a>';
                }
            }
        ]
    });
});