$(document).ready(function() {

});

async function RegistrarUsuarios()
{
    const request = await fetch('pruebaget', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        }
        body: JSON.stringify({a: 1, b: 'Textual content'})
      });
      const content = await request.json();

}



