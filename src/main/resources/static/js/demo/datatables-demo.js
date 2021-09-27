// Call the dataTables jQuery plugin
$(document).ready(function() {

    CargarUsuarios();
  $('#usuarios').DataTable();
});

async function CargarUsuarios()
{
    const request = await fetch('pruebaget', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }
      });
      const content = await request.json();

      let listadoHtml = '';
      for(let usuario of content)
      {
        let UsuariosHTML = '<tr> <td>'+usuario.id+'</td><td>'+usuario.name+'</td><td>'
        +usuario.email+'</td><td>'
        +usuario.password+'</td><td><a href="#" onclick="EliminarUser('+usuario.id+')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td><td>$320,800</td></tr>';
        listadoHtml += UsuariosHTML;
      }
      
      document.querySelector('#usuarios tbody').outerHTML = listadoHtml;
}


async function EliminarUser(id)
{
    const request = await fetch('prueba02/'+id, {
            method: 'DELETE',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            }
          });
}
