<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- MODAL -->
<div class="modal fade" id="exampleModalReserva" tabindex="-1"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">

			<div class="modal-header">
				<h1 class="modal-title fs-5" id="exampleModalLabel">Atualizar
					reserva</h1>
				<button type="button" class="btn-close" data-bs-dismiss="modal"
					aria-label="Close"></button>
			</div>

			<div class="container-fluid py-5" id="div-form-contato">
				<form action="./reserva-update"
					class="form-control d-grid gap-4 mx-auto p-3">
					<div class="modal-body">
						<input type="hidden" id="id" name="id"
							value="${reserva.idReserva}">
						<div class="">
							<label for="f-id-cliente">Cliente</label> <select
								class="form-control" id="f-id-cliente" name="id-cliente"
								required>
								<option value="DEFAULT">Selecione o cliente</option>
								<jstl:forEach items="${listaClientes}" var="cliente">
									<option value="${cliente.idCliente}">
										${cliente.nomeCliente}</option>
								</jstl:forEach>
							</select>
						</div>
						<div class="">
							<label for="f-id-passagem">Passagem</label> <select
								class="form-control" id="f-id-passagem" name="id-passagem"
								required>
								<option value="DEFAULT">Selecione a passagem</option>
								<jstl:forEach items="${listaPassagens}" var="passagem">
									<option value="${passagem.idPassagem}">${passagem.destinoPassagem}</option>
								</jstl:forEach>
							</select>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-bs-dismiss="modal">Close</button>
						<!--  <button type="button" class="btn btn-primary">Send message</button> -->
						<button type="submit" class="btn btn-primary">Enviar</button>
						<!-- <input type="button" value="Cancelar" class="btn" onclick="../../reserva"> -->
						<button type="submit" class="btn btn-primary">Enviar</button>
						<input type="button" value="Cancelar" class="btn"
							onclick="../../reserva">
				</form>
			</div>
		</div>
	</div>
</div>
<!-- MODAL -->




