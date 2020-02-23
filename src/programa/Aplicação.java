package programa;

import java.util.Date;

import entidades.Pedido;
import entidades.enums.OrderStatus;

public class Aplicação {

	public static void main(String[] args) {
		
		Pedido pedido= new Pedido (1080, new Date(), OrderStatus.aguardando_pagamento);
		
		System.out.println(pedido);
		
		OrderStatus os1= OrderStatus.entregue;
		OrderStatus os2 = OrderStatus.valueOf("entregue");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
