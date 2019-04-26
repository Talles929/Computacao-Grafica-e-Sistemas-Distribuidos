<?php
	
	header("Cache-Control: no-cache, no-store, must-revalidate"); 
	header("Access-Control-Allow-Origin: *");
	header("Content-Type: application/json; charset=utf-8"); 
	
	clearstatcache();
       
	$servidor = 'localhost';
	$usuario  = 'root';
	$senha    = 'Blind929';
	$banco    = 'tb_promocoes';

	try {
		$conecta = new PDO("mysql:host=$servidor;dbname=$banco", $usuario , $senha);
		$conecta->exec("set names utf8"); 
		$consulta = $conecta->prepare('SELECT * FROM tb_promocoes');
		$consulta->execute(array());  
		$resultadoDaConsulta = $consulta->fetchAll();
		
		$StringJson = "[";
		
	if ( count($resultadoDaConsulta) ) {
		foreach($resultadoDaConsulta as $registro) {
			
			if ($StringJson != "[") {$StringJson .= ",";}
			$StringJson .= '{"id_promocao":"' . $registro['id_promocao']  . '",';
			$StringJson .= '"nome_do_mercado":"' . $registro['nome_do_mercado']  . '",';	
			$StringJson .= '"produto":"' . $registro['produto']    . '",';	
			$StringJson .= '"valor":"' . $registro['valor']    . '",';	
			$StringJson .= '"validade_da_promocao":"' . $registro['validade_da_promocao']    . '",';	
			$StringJson .= '"imagem_do_produto":"' . $registro['imagem_do_produto']    . '",';	
			$StringJson .= '"observacao":"' . $registro['observacao'] . '"}';
		}  
		echo $StringJson . "]";
  } 
} catch(PDOException $e) {
    echo 'ERROR: ' . $e->getMessage(); 
}
?>