package com.estafet.blockchain.demo.bank.ms.container.tests;

import com.estafet.boostcd.jms.TopicProducer;

public class WalletPaymentTopicProducer extends TopicProducer {

	public WalletPaymentTopicProducer() {
		super("wallet.payment.topic");
	}
	
	public static void send(String message) {
		new WalletPaymentTopicProducer().sendMessage(message);
	}

}
