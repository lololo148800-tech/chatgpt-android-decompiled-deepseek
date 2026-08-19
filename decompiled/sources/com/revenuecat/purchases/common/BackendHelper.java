package com.revenuecat.purchases.common;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import org.json.JSONException;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0087\u0001\u0010\u001d\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000e2\u001a\u0010\u0012\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152 \u0010\u001c\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00170\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m18067d2 = {"Lcom/revenuecat/purchases/common/BackendHelper;", "", "", "apiKey", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/HTTPClient;", "httpClient", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/HTTPClient;)V", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "endpoint", "", "body", "", "Lmm/l;", "postFieldsToSign", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lmm/C;", "onError", "Lkotlin/Function3;", "", "Lorg/json/JSONObject;", "onCompleted", "performRequest", "(Lcom/revenuecat/purchases/common/networking/Endpoint;Ljava/util/Map;Ljava/util/List;Lcom/revenuecat/purchases/common/Delay;LBm/k;LBm/o;)V", "Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "call", "enqueue", "(Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/common/Delay;)V", "Ljava/lang/String;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/HTTPClient;", "authenticationHeaders", "Ljava/util/Map;", "getAuthenticationHeaders$purchases_customEntitlementComputationRelease", "()Ljava/util/Map;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BackendHelper {
    private final String apiKey;
    private final AppConfig appConfig;
    private final Map<String, String> authenticationHeaders;
    private final Dispatcher dispatcher;
    private final HTTPClient httpClient;

    public BackendHelper(String apiKey, Dispatcher dispatcher, AppConfig appConfig, HTTPClient httpClient) {
        AbstractC16544l.m18094g(apiKey, "apiKey");
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        AbstractC16544l.m18094g(appConfig, "appConfig");
        AbstractC16544l.m18094g(httpClient, "httpClient");
        this.apiKey = apiKey;
        this.dispatcher = dispatcher;
        this.appConfig = appConfig;
        this.httpClient = httpClient;
        this.authenticationHeaders = AbstractC0168G.m535x(SIPHeaderNames.AUTHORIZATION, AbstractC9306j0.m9889h("Bearer ", apiKey));
    }

    public static /* synthetic */ void enqueue$default(BackendHelper backendHelper, Dispatcher.AsyncCall asyncCall, Dispatcher dispatcher, Delay delay, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            delay = Delay.NONE;
        }
        backendHelper.enqueue(asyncCall, dispatcher, delay);
    }

    public final void enqueue(Dispatcher.AsyncCall call, Dispatcher dispatcher, Delay delay) {
        AbstractC16544l.m18094g(call, "call");
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        AbstractC16544l.m18094g(delay, "delay");
        if (dispatcher.isClosed()) {
            LogUtilsKt.errorLog$default("Enqueuing operation in closed dispatcher.", null, 2, null);
        } else {
            dispatcher.enqueue(call, delay);
        }
    }

    /* JADX INFO: renamed from: getAuthenticationHeaders$purchases_customEntitlementComputationRelease */
    public final Map<String, String> m14451x27ea44c3() {
        return this.authenticationHeaders;
    }

    public final void performRequest(final Endpoint endpoint, final Map<String, ? extends Object> body, final List<C17309l> postFieldsToSign, Delay delay, final InterfaceC1436k onError, final InterfaceC1440o onCompleted) {
        AbstractC16544l.m18094g(endpoint, "endpoint");
        AbstractC16544l.m18094g(delay, "delay");
        AbstractC16544l.m18094g(onError, "onError");
        AbstractC16544l.m18094g(onCompleted, "onCompleted");
        enqueue(new Dispatcher.AsyncCall() { // from class: com.revenuecat.purchases.common.BackendHelper.performRequest.1
            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public HTTPResult call() {
                return HTTPClient.performRequest$default(BackendHelper.this.httpClient, BackendHelper.this.appConfig.getBaseURL(), endpoint, body, postFieldsToSign, BackendHelper.this.m14451x27ea44c3(), false, 32, null);
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onCompletion(HTTPResult result) throws JSONException {
                PurchasesError purchasesError;
                AbstractC16544l.m18094g(result, "result");
                if (BackendHelperKt.isSuccessful(result)) {
                    purchasesError = null;
                } else {
                    purchasesError = ErrorsKt.toPurchasesError(result);
                    LogUtilsKt.errorLog(purchasesError);
                }
                onCompleted.invoke(purchasesError, Integer.valueOf(result.getResponseCode()), result.getBody());
            }

            @Override // com.revenuecat.purchases.common.Dispatcher.AsyncCall
            public void onError(PurchasesError error) {
                AbstractC16544l.m18094g(error, "error");
                onError.invoke(error);
            }
        }, this.dispatcher, delay);
    }
}
