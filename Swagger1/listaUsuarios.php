<!DOCTYPE html>
<html lang="en">
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
                  
                  
                  
				  <li>
                      <a class="" href="admOpcoes.php">
                          <span>Admistradores</span>
                      </a>
                  </li>

				  
                  <li class="active">
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
				    <div class="col-md-12">
						<h2>Usuarios</h2> <br>
					</div>
 
				  <div class="col-md-3">
					<div class="input-group">
					  <input type="text" class="form-control" placeholder="Pesquisar...">
					  <span class="input-group-btn">
						<button class="btn btn-default" type="button">Pesquisar!</button>
					  </span>
					</div><!-- /input-group -->
				  </div><!-- /.col-lg-3 -->
				 
				  <div class="col-md-6">				 
						<a href = "cadastroUsuarios.php" class="btn btn-primary">Adicionar Usuarios</a>
				  </div> <br> <br><br> 
				  
				</div><!-- /.row -->
							  
			  
			  <div class="row">
				<div class="col-lg-12">
				
				
					
					<section class="">
              
                          <table class="table table-hover">
                              <thead>
                              <tr>
                                  <th>Código</th>
                                  <th>Nome</th>
                                  <th>Cidade</th>
                                  <th>E-mail</th>
								  <th />
								  <th />
								  <th />
                              </tr>
                              </thead>
                              <tbody>
                              <tr>
                                 <?php  
                              include 'ConexaoBanco.php';
                              $sql = "SELECT * FROM usuarios where tipo='usuario'";
                              $consulta = $conector->query($sql);
                              while ($dados = $consulta->fetch_array()){
                               
                                 echo "<tr>"."<td>" .$dados['id'] . "</td>";
                                 echo "<td>" .$dados['nome']."</td>";
                                 echo "<td>" .$dados['cidade']."</td>";
                                 echo "<td>" .$dados['email']."</td>" ;
								 echo "<td> <button class='btn btn-success btn-sm' >Visualizar</a> </button>";
								 echo "<td> <button class='btn btn-info btn-sm' >Alterar</a> </button>";
								 echo "<td> <button class='btn btn-danger btn-sm' >Excluir</a> </button>"."</tr>";
								 
                              }
								  ?>
                              </tr>
                              </tbody>
                          </table>
                      </section>
					
				</div>
			</div>
              
			  
			 
			<div id="bottom" class="row">
				<div class="col-md-12 centralizado">
         
					<ul class="pagination">
						<li class="disabled"><a>&lt; Anterior</a></li>
						<li class="disabled"><a>1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li class="next"><a href="#" rel="next">Próximo &gt;</a></li>
					</ul><!-- /.pagination -->
			 
				</div>
			</div> <!-- /#bottom -->
    	 
          </section>
          
      </section>
      <!--main content end-->
	  
	  
  </section>
  
    
  </body>
</html>
