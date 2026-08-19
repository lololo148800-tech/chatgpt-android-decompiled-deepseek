package com.revenuecat.purchases.common.subscriberattributes;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m18067d2 = {"getSubscriberAttributeKey", "Lcom/revenuecat/purchases/common/subscriberattributes/SubscriberAttributeKey;", "", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SpecialSubscriberAttributesKt {
    public static final SubscriberAttributeKey getSubscriberAttributeKey(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        if (str.equals(ReservedSubscriberAttribute.EMAIL.getValue())) {
            return SubscriberAttributeKey.Email.INSTANCE;
        }
        if (str.equals(ReservedSubscriberAttribute.DISPLAY_NAME.getValue())) {
            return SubscriberAttributeKey.DisplayName.INSTANCE;
        }
        if (str.equals(ReservedSubscriberAttribute.PHONE_NUMBER.getValue())) {
            return SubscriberAttributeKey.PhoneNumber.INSTANCE;
        }
        return str.equals(ReservedSubscriberAttribute.FCM_TOKENS.getValue()) ? SubscriberAttributeKey.FCMTokens.INSTANCE : new SubscriberAttributeKey.Custom(str);
    }
}
