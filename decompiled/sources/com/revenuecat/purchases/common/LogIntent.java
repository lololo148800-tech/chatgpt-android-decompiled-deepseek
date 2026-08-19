package com.revenuecat.purchases.common;

import com.revenuecat.purchases.strings.Emojis;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m18067d2 = {"Lcom/revenuecat/purchases/common/LogIntent;", "", "emojiList", "", "", "(Ljava/lang/String;ILjava/util/List;)V", "getEmojiList", "()Ljava/util/List;", "DEBUG", "GOOGLE_ERROR", "GOOGLE_WARNING", "INFO", "PURCHASE", "RC_ERROR", "RC_PURCHASE_SUCCESS", "RC_SUCCESS", "USER", "WARNING", "AMAZON_WARNING", "AMAZON_ERROR", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public enum LogIntent {
    DEBUG(AbstractC9393x3.m9974d(Emojis.INFO)),
    GOOGLE_ERROR(AbstractC17681o.m19382k(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    GOOGLE_WARNING(AbstractC17681o.m19382k(Emojis.ROBOT, Emojis.DOUBLE_EXCLAMATION)),
    INFO(AbstractC9393x3.m9974d(Emojis.INFO)),
    PURCHASE(AbstractC9393x3.m9974d(Emojis.MONEY_BAG)),
    RC_ERROR(AbstractC17681o.m19382k(Emojis.SAD_CAT_EYES, Emojis.DOUBLE_EXCLAMATION)),
    RC_PURCHASE_SUCCESS(AbstractC17681o.m19382k(Emojis.HEART_CAT_EYES, Emojis.MONEY_BAG)),
    RC_SUCCESS(AbstractC9393x3.m9974d(Emojis.HEART_CAT_EYES)),
    USER(AbstractC9393x3.m9974d(Emojis.PERSON)),
    WARNING(AbstractC9393x3.m9974d(Emojis.WARNING)),
    AMAZON_WARNING(AbstractC17681o.m19382k(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION)),
    AMAZON_ERROR(AbstractC17681o.m19382k(Emojis.BOX, Emojis.DOUBLE_EXCLAMATION));

    private final List<String> emojiList;

    LogIntent(List list) {
        this.emojiList = list;
    }

    public final List<String> getEmojiList() {
        return this.emojiList;
    }
}
