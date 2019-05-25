<?php
//$servidor = "sql109.epizy.com";
//$usuario = "epiz_23931239";
//$senha = "I6sQb6SIOhZP";
//$banco = "epiz_23931239_swagger";
//$port ="3306";

$servidor = "localhost";
$usuario = "root";
$senha = "1q2w3e";
$banco = "swagger";
$port ="3306";

// Linha para conexão ao Banco
$conector = mysqli_connect($servidor, $usuario, $senha, $banco ,$port);
// Verificando a conexão com o banco
if (mysqli_connect_errno())trigger_error(mysqli_connect_errno());



?>