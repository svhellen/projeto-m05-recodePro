<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <div class="row">
          <!-- logo marca -->
          <div class="col-6 col-md-4 mb-3 text-md-start"><!-- ./assets/img/logo.png -->
              <a class="footer-brand " href="#"><img src="<%=request.getParameter("srcLogo")%>" alt="logo" id="footer-logo"></a> 
              <p>Descubra o Mundo, Abrace a Jornada!</p>
          </div>
          <!-- links importantes -->
          <div class="col-6 col-md-8 mb-3 text-md-end">
              <ul id="secoes" class="nav pt-5 flex-column flex-md-row ">
              <li class="nav-item mb-2 col">
                <a href="#" class="nav-link p-0 ">Blog</a></li>
              <li class="nav-item mb-2 col">
                <a href="#" class="nav-link p-0 ">Fale conosco</a></li>
              <li class="nav-item mb-2 col">
                <a href="#" class="nav-link p-0  ">Política de privacidade</a></li>
              <li class="nav-item mb-2 col">
                <a href="#" class="nav-link p-0  ">Termos & Condições</a></li>
              </ul>
          </div>
          <!-- copyright e social medias -->
          <div class="d-flex flex-column flex-sm-row justify-content-between py-4 my-4 border-top">
              <p>© 2023 VivaVia Travel, Inc. All rights reserved.</p>
              <div class="social-media list-inline text-md-end">
                  <a class="icon-link icon-link-hover list-inline-item" style="--bs-icon-link-transform: translate3d(0, -.125rem, 0);" href="#">
                  <i class="bi bi-youtube"></i>
                  </a>
                  <a  class="icon-link icon-link-hover list-inline-item" style="--bs-icon-link-transform: translate3d(0, -.125rem, 0);" href="#">
                  <i class="bi bi-instagram"></i></a>
                  <a  class="icon-link icon-link-hover list-inline-item" style="--bs-icon-link-transform: translate3d(0, -.125rem, 0);" href="#">
                  <i class="bi bi-twitter" aria-hidden="true"></i></a>
                  <a  class="icon-link icon-link-hover list-inline-item" style="--bs-icon-link-transform: translate3d(0, -.125rem, 0);" href="#">
                  <i class="bi bi-facebook" aria-hidden="true"></i></a>
              </div>
          </div>
      </div>