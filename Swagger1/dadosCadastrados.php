<?php 
session_start();
$logado = $_SESSION['login'];


?>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">    
    <title>TelaClass - UIT</title>  
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
            <a href="indexUsuario.php" class="logo">Swagger <span class="lite">Universidade de Itaúna</span></a>
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
                  
				  <li>
                      <a class="" href="dadosCadastrados.php">
                          <span>Dados Cadastrados</span>
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
                              Dados do Usuario
                          </header>
                         <section class="">
              
                          <table class="table table-hover">
                              <thead>
                              <tr>
                                  <th>Código</th>
                                  <th>Nome</th>
                                  <th>Rua</th>
                                  <th>Numero</th>
                                  <th>Complemento</th>
                                  <th>Cidade</th>
                                  <th>Estado</th>
                                  <th>CEP</th>
                                  <th>TELEFONE</th>
                                  <th>EMAIL</th>
                                  <th>RG</th>
                                  <th>CPF</th>
								  <th />
								  <th />
								  <th />
                              </tr>
                              </thead>
                              <tbody>
                              <tr>
                              <?php  
                              
                             
                              include 'ConexaoBanco.php';
                              $sql = "SELECT nome FROM usuarios where login='$logado'";
                              $consulta = $conector->query($sql);
                              $dados =$consulta->fetch_array();
                              $logado = $dados['nome'];
                              
                              $sql = "SELECT * FROM usuarios where nome='$logado'";
                              $consulta = $conector->query($sql);
                              while ($dados = $consulta->fetch_array()){
                               
                                 echo "<tr>"."<td>" .$dados['id'] . "</td>";
                                 echo "<td>" .$dados['nome']."</td>";
                                 echo "<td>" .$dados['rua']."</td>";
                                 echo "<td>" .$dados['numero']."</td>" ;
                                 echo "<td>" .$dados['complemento']."</td>" ;
                                 echo "<td>" .$dados['cidade']."</td>" ;
                                 echo "<td>" .$dados['cidade']."</td>" ;
                                 echo "<td>" .$dados['cep']."</td>" ;
                                 echo "<td>" .$dados['telefone']."</td>" ;
                                 echo "<td>" .$dados['email']."</td>" ;
                                 echo "<td>" .$dados['rg']."</td>" ;
                                 echo "<td>" .$dados['cpf']."</td>" ;
								
								 
                              }
								  ?>
                              </tr>
                            
                              </tbody>
                          </table>
                      </section>
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
