package com.blockwit.sb

case class Account(address: String, key: String)

case class Transaction(from: String, to: String, amount: Long, signature: String)

case class Block(id: Long, miner: String, txs: List[Transaction], signature: String)

