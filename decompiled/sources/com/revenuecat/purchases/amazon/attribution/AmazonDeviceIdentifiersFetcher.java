package com.revenuecat.purchases.amazon.attribution;

import android.app.Application;
import android.content.ContentResolver;
import android.provider.Settings;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"Lcom/revenuecat/purchases/amazon/attribution/AmazonDeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "<init>", "()V", "Landroid/app/Application;", "applicationContext", "Lkotlin/Function1;", "", "", "Lmm/C;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;LBm/k;)V", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AmazonDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(Application applicationContext, InterfaceC1436k completion) {
        String string;
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        AbstractC16544l.m18094g(completion, "completion");
        try {
            ContentResolver contentResolver = applicationContext.getContentResolver();
            string = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0 ? Settings.Secure.getString(contentResolver, "advertising_id") : null;
        } catch (Settings.SettingNotFoundException e10) {
            AbstractC12107L1.m13831v(new Object[]{e10.getLocalizedMessage()}, 1, AttributionStrings.AMAZON_COULD_NOT_GET_ADID, LogIntent.AMAZON_ERROR);
        }
        completion.invoke(MapExtensionsKt.filterNotNullValues(AbstractC17659D.m19244f(new C17309l(SubscriberAttributeKey.DeviceIdentifiers.AmazonAdID.INSTANCE.getBackendKey(), string), new C17309l(SubscriberAttributeKey.DeviceIdentifiers.C12711IP.INSTANCE.getBackendKey(), "true"))));
    }
}
