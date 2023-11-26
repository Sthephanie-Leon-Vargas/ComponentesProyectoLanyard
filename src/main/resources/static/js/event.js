/**
* JS encargado de controllar CreateEvent.html
*/

'use strict';

const button_add = document.querySelector('#btn-add');
const button_cancel = document.querySelector('#btn-cancel');
const input_date = document.querySelector('#text_date');
const txt_name = document.querySelector('#name');
const txt_producer = document.querySelector('#producer');
const txt_place = document.querySelector('#venue');
const txt_img = document.querySelector('#picture');

let check = () => {
    let inputs_required = document.querySelectorAll('#form_event:required');
    let error = false;

    for (let i = 0; i < inputs_required.length; i++) {
        if (inputs_required[i].value == '') {
            inputs_required[i].classList.add('input-error');
            error = true;
        } else {
            inputs_required[i].classList.remove('input-error');
        }
    }
    return error;
 };

let clear = () => {
    input_date.value = "";
    txt_name.value = "";
    txt_producer.value = "";
    txt_place.value = "";
    txt_img.value = "";
};

let get_data = () => {
let error_required = check();
    if (!error_required) {
        let date = input_date.value;
        let name = txt_name.value;
        let producer = txt_producer.value;
        let place = txt_place.value;
        let image = txt_img.value;

        testing();

        //create_event (date,name,producer,place,image);

        Swal.fire({
            'title': 'Wahooo!',
            'icon': 'success',
            'text': 'Evento creado correctamente.'
        }).then(() => {
            clear();
        });

    } else {
        Swal.fire({
            'title': 'Verifica la información',
            'icon': 'warning',
            'text': 'Todos deben estar completados.'
        })

    }

};

const testing = () => {
    let date = input_date.value;
    let name = txt_name.value;
    let producer = txt_producer.value;
    let place = txt_place.value;

    console.log(date);
    console.log(name);
    console.log(producer);
    console.log(place);
};

button_add.addEventListener('click', get_data);
button_cancel.addEventListener('click', clear);