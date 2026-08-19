package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import org.json.JSONException;
import org.json.JSONObject;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p909nm.AbstractC17660E;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jk\u0010\u0013\u001a\u00020\u000b2 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, m18067d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/BackendHelper;)V", "", "", "attributes", "appUserID", "Lkotlin/Function0;", "Lmm/C;", "onSuccessHandler", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/PurchasesError;", "", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "onErrorHandler", "postSubscriberAttributes", "(Ljava/util/Map;Ljava/lang/String;LBm/a;LBm/o;)V", "Lcom/revenuecat/purchases/common/BackendHelper;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubscriberAttributesPoster {
    private final BackendHelper backendHelper;

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$1 */
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127661 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC1440o $onErrorHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127661(InterfaceC1440o interfaceC1440o) {
            super(1);
            this.$onErrorHandler = interfaceC1440o;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC16544l.m18094g(error, "error");
            this.$onErrorHandler.invoke(error, Boolean.FALSE, C17689w.f56480Y);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.subscriberattributes.SubscriberAttributesPoster$postSubscriberAttributes$2 */
    @Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18067d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "responseCode", "Lorg/json/JSONObject;", "body", "Lmm/C;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ILorg/json/JSONObject;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C127672 extends AbstractC16546n implements InterfaceC1440o {
        final /* synthetic */ InterfaceC1440o $onErrorHandler;
        final /* synthetic */ InterfaceC1426a $onSuccessHandler;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127672(InterfaceC1426a interfaceC1426a, InterfaceC1440o interfaceC1440o) {
            super(3);
            this.$onSuccessHandler = interfaceC1426a;
            this.$onErrorHandler = interfaceC1440o;
        }

        @Override // p049Bm.InterfaceC1440o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws JSONException {
            invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
            return C17296C.f55119a;
        }

        public final void invoke(PurchasesError purchasesError, int i10, JSONObject body) throws JSONException {
            C17296C c17296c;
            AbstractC16544l.m18094g(body, "body");
            if (purchasesError != null) {
                InterfaceC1440o interfaceC1440o = this.$onErrorHandler;
                boolean zIsServerError = RCHTTPStatusCodes.INSTANCE.isServerError(i10);
                boolean z6 = false;
                boolean z10 = i10 == 404;
                if (!zIsServerError && !z10) {
                    z6 = true;
                }
                Object attributeErrors = C17689w.f56480Y;
                if (purchasesError.getCode() == PurchasesErrorCode.InvalidSubscriberAttributesError) {
                    attributeErrors = BackendHelpersKt.getAttributeErrors(body);
                }
                interfaceC1440o.invoke(purchasesError, Boolean.valueOf(z6), attributeErrors);
                c17296c = C17296C.f55119a;
            } else {
                c17296c = null;
            }
            if (c17296c == null) {
                this.$onSuccessHandler.invoke();
            }
        }
    }

    public SubscriberAttributesPoster(BackendHelper backendHelper) {
        AbstractC16544l.m18094g(backendHelper, "backendHelper");
        this.backendHelper = backendHelper;
    }

    public final void postSubscriberAttributes(Map<String, ? extends Map<String, ? extends Object>> attributes, String appUserID, InterfaceC1426a onSuccessHandler, InterfaceC1440o onErrorHandler) {
        AbstractC16544l.m18094g(attributes, "attributes");
        AbstractC16544l.m18094g(appUserID, "appUserID");
        AbstractC16544l.m18094g(onSuccessHandler, "onSuccessHandler");
        AbstractC16544l.m18094g(onErrorHandler, "onErrorHandler");
        this.backendHelper.performRequest(new Endpoint.PostAttributes(appUserID), AbstractC17660E.m19258c(new C17309l("attributes", attributes)), null, Delay.DEFAULT, new C127661(onErrorHandler), new C127672(onSuccessHandler, onErrorHandler));
    }
}
