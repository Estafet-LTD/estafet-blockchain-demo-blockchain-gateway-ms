package com.estafet.blockchain.demo.bank.ms.container.tests;

import com.estafet.blockchain.demo.messages.lib.wallet.UpdateWalletBalanceMessage;
import com.estafet.openshift.boost.commons.lib.jms.TopicConsumer;

public class UpdateWalletBalanceTopicConsumer extends TopicConsumer {

	public UpdateWalletBalanceTopicConsumer() {
		super("update.wallet.balance.topic");
	}

	public UpdateWalletBalanceMessage consume() {
		return super.consume(UpdateWalletBalanceMessage.class);
	}

}
