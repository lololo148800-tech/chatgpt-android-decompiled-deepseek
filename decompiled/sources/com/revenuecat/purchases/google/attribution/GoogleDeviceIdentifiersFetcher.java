package com.revenuecat.purchases.google.attribution;

import android.app.Application;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher;
import com.revenuecat.purchases.common.subscriberattributes.SubscriberAttributeKey;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.utils.MapExtensionsKt;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p001A.RunnableC0066i;
import p049Bm.InterfaceC1436k;
import p1009s9.C19504g;
import p110E4.C2313k;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p850k9.C16362a;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m18067d2 = {"Lcom/revenuecat/purchases/google/attribution/GoogleDeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "<init>", "(Lcom/revenuecat/purchases/common/Dispatcher;)V", "Landroid/app/Application;", "applicationContext", "", "getAdvertisingID", "(Landroid/app/Application;)Ljava/lang/String;", "Lkotlin/Function1;", "", "Lmm/C;", "completion", "getDeviceIdentifiers", "(Landroid/app/Application;LBm/k;)V", "Lcom/revenuecat/purchases/common/Dispatcher;", "noPermissionAdvertisingIdValue", "Ljava/lang/String;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GoogleDeviceIdentifiersFetcher implements DeviceIdentifiersFetcher {
    private final Dispatcher dispatcher;
    private final String noPermissionAdvertisingIdValue;

    public GoogleDeviceIdentifiersFetcher(Dispatcher dispatcher) {
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        this.noPermissionAdvertisingIdValue = "00000000-0000-0000-0000-000000000000";
    }

    private final String getAdvertisingID(Application applicationContext) {
        try {
            C2313k c2313kM17965a = C16362a.m17965a(applicationContext);
            String str = c2313kM17965a.f7195c;
            if (!c2313kM17965a.f7194b) {
                if (!AbstractC16544l.m18089b(str, this.noPermissionAdvertisingIdValue)) {
                    return str;
                }
                LogWrapperKt.log(LogIntent.WARNING, tpXhEMGxfXFVSh.FBslKgdPbpxJHr);
            }
        } catch (IOException e10) {
            AbstractC12107L1.m13831v(new Object[]{e10.getLocalizedMessage()}, 1, AttributionStrings.IO_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        } catch (NullPointerException e11) {
            AbstractC12107L1.m13831v(new Object[]{e11.getLocalizedMessage()}, 1, AttributionStrings.NULL_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        } catch (TimeoutException e12) {
            AbstractC12107L1.m13831v(new Object[]{e12.getLocalizedMessage()}, 1, AttributionStrings.TIMEOUT_EXCEPTION_WHEN_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        } catch (C19504g e13) {
            AbstractC12107L1.m13831v(new Object[]{e13.getLocalizedMessage()}, 1, AttributionStrings.GOOGLE_PLAY_SERVICES_NOT_INSTALLED_FETCHING_ADVERTISING_IDENTIFIER, LogIntent.GOOGLE_ERROR);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getDeviceIdentifiers$lambda$0(GoogleDeviceIdentifiersFetcher this$0, Application applicationContext, InterfaceC1436k completion) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(applicationContext, "$applicationContext");
        AbstractC16544l.m18094g(completion, "$completion");
        completion.invoke(MapExtensionsKt.filterNotNullValues(AbstractC17659D.m19244f(new C17309l(SubscriberAttributeKey.DeviceIdentifiers.GPSAdID.INSTANCE.getBackendKey(), this$0.getAdvertisingID(applicationContext)), new C17309l(SubscriberAttributeKey.DeviceIdentifiers.C12711IP.INSTANCE.getBackendKey(), "true"))));
    }

    @Override // com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher
    public void getDeviceIdentifiers(Application applicationContext, InterfaceC1436k completion) {
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        AbstractC16544l.m18094g(completion, "completion");
        Dispatcher.enqueue$default(this.dispatcher, new RunnableC0066i(this, applicationContext, completion, 11), null, 2, null);
    }
}
