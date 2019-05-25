<?php 
include 'ConexaoBanco.php';
session_start();

if(isset($_POST["nome"])){
    $nome = $_POST["nome"];
    $rua= $_POST["rua"];
    $numero= $_POST["numero"];
    $complemento= $_POST["complemento"];
    $bairro= $_POST["bairro"];
    $cidade= $_POST["cidade"];
    $cep= $_POST["cep"];
    $cpf = $_POST["cpf"];
    $rg = $_POST["rg"];
    $telefone = $_POST["telefone"];
    $email= $_POST["email"];
    $login= $_POST["login"];
    $senha =$_POST["senha"];
    
    $estado = $_POST["estado"];
    
    $sql= "SELECT * FROM usuarios" ;
    $consulta = $conector->prepare($sql);
    $numerosUsuarios=1;
    $sql = "SELECT * FROM usuarios";
    $consulta = $conector->query($sql);
    while ($dados = $consulta->fetch_array()){
      $numerosUsuarios++;
    }
    //echo "$numerosUsuarios";
    if($rg==""||$estado==""||$nome==""||$rua==""||$numero==""||$complemento==""||$bairro==""||$cidade==""||$cep==""||$cpf==""||$telefone==""||$email==""||$login==""||$senha==""||$estado==""){
        echo "<script>alert('Preencher todo os campos')</script>";
    }
    else{
        
        $sql= "insert into usuarios(id, login,senha,nome,rua,numero,complemento,cidade,estado,cep,telefone,email,rg,cpf,tipo) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        //mysqli_query($conector, $sql);
        
        $tipo="usuario";
        $consulta = $conector->prepare($sql);
        $consulta->bind_param('sssssssssssssss', $numerosUsuarios,$login,$senha,$nome,$rua,$numero,$complemento,$cidade,$estado,$cep,$telefone,$email,$rg,$cpf,$tipo);
        $consulta->execute();
        
        echo "<script>alert('Usuario Cadastrado')</script>";
        
    }
    
}



?>

<!DOCTYPE html>
<html >
  <head>
    <meta charset="utf-8">    
    <title>Swagger - UIT</title>  
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap-theme.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">
    <link href="css/style-responsive.css" rel="stylesheet" />
	<!-- =======================================================
        Theme Name: NiceAdmin
        Theme URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
        Author: BootstrapMade
        Author URL: https://bootstrapmade.com
    ======================================================= -->
  </head>

  
  <body>
  <!-- container section start -->
  <section id="container" >
     
      
      <header class="header dark-bg">
            
            <!--logo start-->
            <a href="bemVindo.php" class="logo">Swagger <span class="lite">Universidade de Itaúna</span></a>
            <!--logo end-->

            
            <div class="top-nav nav navbar-nav navbar-right">                
                <!-- notificatoin dropdown start-->
                <ul class="nav pull-right top-menu">

                    <li> <a href="#"> <span class="username">Alterar dados cadastrais</span>  </a>	</li>
                    <li> <a href="#"> <span class="username">Ajuda</span>  </a>	</li>
                    <li> <a href="index.php"> <span class="username">Sair</span>  </a>	</li>
					

                </ul>
                <!-- notificatoin dropdown end-->
            </div>
      </header>      
      <!--header end-->

      <!--sidebar start-->
     <aside>
          <div id="sidebar"  class="nav">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu">                
                  
				  <li class="active">
                      <a href="admOpcoes.php">
                          <span>Administradores</span>
                      </a>
                  </li>

				  
                  <li>
                      <a class="" href="listaUsuarios.php">
                          <span>Usuarios</span>
                      </a>
                  </li>
                  
                  
              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
       <!--sidebar end-->
      
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">            
              <!--overview start-->
			  <div class="row">
				<div class="col-lg-12">
					
<!-- Basic Forms & Horizontal Forms-->
              
              <div class="row">
                  
                  <div class="col-lg-12">
                      <section class="">
                          <header class="panel-heading">
                              Cadastro de Usuário
                          </header>
                          <div class="panel-body">
                              <form class="form-horizontal" role="form" action="cadastroUsuarios.php" method="post">
                                  <div class="form-group">
                                      <label for="txtNome" class="col-lg-1 control-label">Nome: </label>
                                      <div class="col-lg-8">
                                          <input type="text" class="form-control" id="txtNome" name="nome">
                                      </div>
                                      <label for="txtCEP" class="col-lg-1 control-label">Estado: </label>
                                      <div class="col-lg-2">
                                          <input type="text" class="form-control" id="txtCEP" name="estado">
                                      </div>	
								  </div>
								  

								  <div class="form-group">                                  	  
                                      <label for="txtEndereco" class="col-lg-1 control-label">Rua: </label>
                                      <div class="col-lg-7">
                                          <input type="text" class="form-control" id="txtEndereco" name="rua">
                                      </div>
									  
									  <label for="txtNro" class="col-lg-1 control-label">Nro.: </label>
                                      <div class="col-lg-1">
                                          <input type="text" class="form-control" id="txtNro" name="numero">
                                      </div>
									  
									  <label for="txtComplemento" class="col-lg-1 control-label">Compl.: </label>
                                      <div class="col-lg-1">
                                          <input type="text" class="form-control" id="txtComplemento" name="complemento">
                                      </div>									  
									  
								  </div>
								  
								  <div class="form-group">  								  
                                      <label for="txtBairro" class="col-lg-1 control-label">Bairro: </label>
                                      <div class="col-lg-4">
                                          <input type="text" class="form-control" id="txtBairro" name="bairro">
                                      </div>	

                                      <label for="txtCidade" class="col-lg-1 control-label">Cidade: </label>
                                      <div class="col-lg-3">
                                          <input type="text" class="form-control" id="txtCidade" name="cidade">
                                      </div>	


                                      <label for="txtCEP" class="col-lg-1 control-label">CEP: </label>
                                      <div class="col-lg-2">
                                          <input type="text" class="form-control" id="txtCEP" name="cep">
                                      </div>	

									  
								  </div>
									  
                                  <div class="form-group">                         
                                      <label for="txtCPF" class="col-lg-1 control-label">CPF: </label>
                                      <div class="col-lg-2">
                                          <input type="text" class="form-control" id="txtCPF" name="cpf">
                                      </div>
                                      
                                      <label for="txtCPF" class="col-lg-1 control-label">RG: </label>
                                      <div class="col-lg-2">
                                          <input type="text" class="form-control" id="txtCPF" name="rg">
                                      </div>				
                                  
								  
								                                      
                                      <label for="txtTelefone" class="col-lg-1 control-label">Telefone: </label>
                                      <div class="col-lg-2">
                                          <input type="text" class="form-control" id="txtTelefone" name="telefone">
                                      </div>	

                                      <label for="txtEmail" class="col-lg-1 control-label">Email: </label>
                                      <div class="col-lg-2">
                                          <input type="email" class="form-control" id="txtEmail" name="email">
                                      </div>
								  </div>	  

								  <div class="form-group">
									  <label for="txtLogin" class="col-lg-1 control-label">Login: </label>
                                      <div class="col-lg-3">
                                          <input type="text" class="form-control" id="txtLogin" name="login">
                                      </div>	

                                      <label for="txtSenha" class="col-lg-1 control-label">Senha: </label>
                                      <div class="col-lg-3">
                                          <input type="password" class="form-control" id="txtSenha" name="senha" name="senha">
                                      </div>
                                      
								  </div>
								  </div>
								 
								  <div class="form-group">
                                      <div class="col-lg-offset-1 col-lg-10">
                                          <input type="submit" class="btn btn-primary">
                                      
                                          <a href = "admOpcoes.php" class="btn btn-danger">Cancelar</a>
                                      </div>								  
									  
                                  </div>
                              </form>>
                          </div>
                      </section>
                      
                  </div>
              </div>
					
				</div>
			</div>
              
    	 
          </section>
          
      </section>
      <!--main content end-->
  </section>
  
    
  </body>
</html>
