function modifyDiscipline() {

    var checkedBoxes = document.querySelectorAll('input[type = checkbox]:checked');
    if (checkedBoxes.length == 0) {
        alert("Выберите хотя бы одну дисциплину")
        return;
    }

    if (checkedBoxes.length > 1) {
        alert("Выберите только одну дисциплину")
        return;
    }
    var id = checkedBoxes[0].getAttribute("value");
    var hidden = document.getElementById("hiddenModify")
    hidden.setAttribute("value", id)

    var form = document.getElementById("formModify");
    form.submit();
}

function deleteDisciplines() {

    var checkedBoxes = document.querySelectorAll('input[type = checkbox]:checked');
    if (checkedBoxes.length == 0) {
        alert("Выберите хотя бы одну дисциплину")
        return;
    }
    var ids = "";
    for (var i = 0; i < checkedBoxes.length; i++) {
        ids = ids + checkedBoxes[i].getAttribute("value") + "-";
    }
    var hidden = document.getElementById("hiddenDelete")
    hidden.setAttribute("value", ids)

    var form = document.getElementById("formDelete");
    form.submit();
}

function deleteStudents() {

    var checkedBoxes = document.querySelectorAll('input[type = checkbox]:checked');
    if (checkedBoxes.length == 0) {
        alert("Выберите хотя бы одного студента")
        return;
    }
    var ids = "";
    for (var i = 0; i < checkedBoxes.length; i++) {
        ids = ids + checkedBoxes[i].getAttribute("value") + "-";
    }
    var hidden = document.getElementById("hiddenDelete")
    hidden.setAttribute("value", ids)

    var form = document.getElementById("formDelete");
    form.submit();
}