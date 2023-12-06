<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<nav class="navbar navbar-expand-md navbar-dark" id="menu">
	<div class="container-fluid">
		<a class="navbar-brand " href="#" style="color: #FFF;"><img
			src="<%=request.getParameter("logo")%>" alt="logo" id="logo">VivaVia
			Travel</a>
		<!-- botao menu telas pequenas -->

		<button class="btn d-lg-none navbar-dark" type="button"
			data-bs-toggle="offcanvas" data-bs-target="#offcanvasResponsive"
			aria-controls="offcanvasResponsive" id="offcanvas-btn">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="offcanvas-lg offcanvas-end " tabindex="-1"
			id="offcanvasResponsive" aria-labelledby="offcanvasResponsiveLabel">
			<div class="offcanvas-header">
				<h5 class="offcanvas-title login " id="offcanvasResponsiveLabel">
					<ul class=" ">
						<li class="nav-item"><a class="btn nav-link "
							href="<%=request.getParameter("btnCrud")%>">Crud</a></li>
					</ul>
				</h5>
				<button type="button" class="btn-close" data-bs-dismiss="offcanvas"
					data-bs-target="#offcanvasResponsive" aria-label="Close"></button>
			</div>
			<!-- <div class=" "> -->
			<!-- navbar links -->
			<%-- 			<ul class="navbar-nav offcanvas-body off col-lg-8">
				<li class="nav-item"><%=request.getParameter("home")%></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getParameter("hospedagens")%>">Hospedagens</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getParameter("passagens")%>">Passagens</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getParameter("destinos")%>">Destinos</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getParameter("promocoes")%>">Promoções</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<%=request.getParameter("contato")%>">Contato</a></li>
			</ul> --%>
			<ul class="navbar-nav offcanvas-body off col-lg-8">
				<li class="nav-item"><a 
					class="<%=request.getParameter("homeClass")%>"
					href="<%=request.getParameter("home")%>">Home</a></li>
				<li class="nav-item"><a
					class="<%=request.getParameter("hospedagensClass")%>"
					href="<%=request.getParameter("hospedagens")%>">Hospedagens</a></li>
				<li class="nav-item"><a
					class="<%=request.getParameter("passagensClass")%>"
					href="<%=request.getParameter("passagens")%>">Passagens</a></li>
				<li class="nav-item"><a
				class="<%=request.getParameter("promocoesClass")%>"
					href="<%=request.getParameter("promocoes")%>">Promocoes</a></li>
				<li class="nav-item"><a
					class="<%=request.getParameter("destinosClass")%>"
					href="<%=request.getParameter("destinos")%>">Destinos</a></li>
				<li class="nav-item"><a
					class="<%=request.getParameter("contatoClass")%>"
					href="<%=request.getParameter("contato")%>">Contato</a></li>
			</ul>
			<!-- </div> -->
		</div>
		<div class=" d-none d-lg-block  login">
			<ul class="">
				<li class="nav-item"><a class="btn nav-link "
					href="<%=request.getParameter("btnCrud")%>">Crud</a></li>
			</ul>
		</div>
	</div>
	<hr>
</nav>

<%-- 		<jsp:include page="./components/nav.jsp">
				<jsp:param name="logo" value="assets/img/teste-logo.png"/>
				<jsp:param name="home" value="./index.jsp"/>
				<jsp:param name="hospedagens" value="views/_pages/hospedagens.html"/>
				<jsp:param name="passagens" value="views/_pages/passagens.html"/>
				<jsp:param name="destinos" value="views/_pages/destinos.html"/>
				<jsp:param name="promocoes" value="views/_pages/promocoes.html"/>
				<jsp:param name="contato" value="views/_pages/contato.html"/>
				<jsp:param name="btnCrud" value="cliente"/>
			</jsp:include> --%>