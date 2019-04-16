/*
 * Created by Eduard Zaydel on 1/4/2019
 * Copyright © 2019 Waves Platform. All rights reserved.
 */

package com.wavesplatform.wallet.v2.data.model.local

import com.chad.library.adapter.base.entity.MultiItemEntity
import com.wavesplatform.sdk.net.model.response.TransactionResponse

class HistoryItem : MultiItemEntity {
    private var itemType: Int = 0
    var header: String = ""
    var data: TransactionResponse = TransactionResponse()

    constructor(itemType: Int, header: String) {
        this.itemType = itemType
        this.header = header
    }

    constructor(itemType: Int, transaction: TransactionResponse) {
        this.itemType = itemType
        this.data = transaction
    }

    override fun getItemType(): Int {
        return itemType
    }

    companion object {
        const val TYPE_EMPTY = 0
        const val TYPE_HEADER = 1
        const val TYPE_DATA = 2
    }
}