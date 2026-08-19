package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import org.json.JSONException;
import org.json.JSONObject;
import p049Bm.InterfaceC1426a;
import p063C9.AbstractC1616b;
import p132F2.AbstractC2639c;
import p132F2.AbstractC2642f;
import p132F2.C2641e;
import p132F2.C2643g;
import p132F2.InterfaceC2644h;
import p157G2.AbstractC2976b;
import p157G2.C2975a;
import p181H2.C3198a;
import p205I2.C3611a;
import p263K9.C4587g;
import p263K9.C4589i;
import p263K9.C4590j;
import p263K9.C4591k;
import p263K9.C4601u;
import p263K9.C4603w;
import p449S9.C7054X;
import p523V9.AbstractC8207u5;
import p582Xk.HXHG.TfazcFv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\b\u0005*\u0001/\b\u0000\u0018\u0000 22 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00012B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0004H\u0017¢\u0006\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00118\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0012\u0010(\u0012\u0004\b)\u0010*R\u001c\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0014\u0010+\u0012\u0004\b,\u0010*R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0016\u0010-\u0012\u0004\b.\u0010*R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m18067d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "LF2/f;", "LK9/w;", "LK9/u;", "LF2/c;", "LG2/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lorg/json/JSONException;", "exception", "LI2/a;", "JSONExceptionToPKCError", "(Lorg/json/JSONException;)LI2/a;", "request", "LF2/h;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lmm/C;", "invokePlayServices", "(LF2/f;LF2/h;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "convertRequestToPlayServices", "(LF2/f;)LK9/w;", "response", "convertResponseToCredentialManager", "(LK9/u;)LF2/c;", "Landroid/content/Context;", "LF2/h;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<AbstractC2642f, C4603w, C4601u, AbstractC2639c, AbstractC2976b> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private InterfaceC2644h callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final ResultReceiverC10904x1c337a18 resultReceiver;

    @Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m18067d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;", "", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            AbstractC16544l.m18094g(context, "context");
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C108981 extends AbstractC16546n implements InterfaceC1426a {

        /* JADX INFO: renamed from: $e */
        final /* synthetic */ JSONException f32937$e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108981(JSONException jSONException) {
            super(0);
            this.f32937$e = jSONException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, JSONException e10) {
            AbstractC16544l.m18094g(this$0, "this$0");
            AbstractC16544l.m18094g(e10, "$e");
            InterfaceC2644h interfaceC2644h = this$0.callback;
            if (interfaceC2644h == null) {
                AbstractC16544l.m18103p("callback");
                throw null;
            }
            ((C2643g) interfaceC2644h).m3624a(this$0.JSONExceptionToPKCError(e10));
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22446invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22446invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                AbstractC16544l.m18103p("executor");
                throw null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final JSONException jSONException = this.f32937$e;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.C108981.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C109002 extends AbstractC16546n implements InterfaceC1426a {

        /* JADX INFO: renamed from: $t */
        final /* synthetic */ Throwable f32938$t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109002(Throwable th2) {
            super(0);
            this.f32938$t = th2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0, Throwable t10) {
            AbstractC16544l.m18094g(this$0, "this$0");
            AbstractC16544l.m18094g(t10, "$t");
            InterfaceC2644h interfaceC2644h = this$0.callback;
            if (interfaceC2644h == null) {
                AbstractC16544l.m18103p("callback");
                throw null;
            }
            ((C2643g) interfaceC2644h).m3624a(new C2975a(t10.getMessage(), 2));
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22447invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22447invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                AbstractC16544l.m18103p("executor");
                throw null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final Throwable th2 = this.f32938$t;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.C109002.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, th2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C109023 extends AbstractC16546n implements InterfaceC1426a {
        public C109023() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
            AbstractC16544l.m18094g(this$0, "this$0");
            InterfaceC2644h interfaceC2644h = this$0.callback;
            if (interfaceC2644h == null) {
                AbstractC16544l.m18103p("callback");
                throw null;
            }
            ((C2643g) interfaceC2644h).m3624a(new C2975a(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED, 2));
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22448invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22448invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                AbstractC16544l.m18103p("executor");
                throw null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.C109023.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        AbstractC16544l.m18094g(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                AbstractC16544l.m18094g(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
                C10905xdfe2be02 c10905xdfe2be02 = new C10905xdfe2be02(CredentialProviderBaseController.INSTANCE);
                Executor executor = this.this$0.executor;
                if (executor == null) {
                    AbstractC16544l.m18103p("executor");
                    throw null;
                }
                InterfaceC2644h interfaceC2644h = this.this$0.callback;
                if (interfaceC2644h == null) {
                    AbstractC16544l.m18103p("callback");
                    throw null;
                }
                if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, c10905xdfe2be02, executor, interfaceC2644h, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3611a JSONExceptionToPKCError(JSONException exception) {
        String message = exception.getMessage();
        return (message == null || message.length() <= 0) ? new C3611a(new C3198a(4), "Unknown error") : new C3611a(new C3198a(4), message);
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    /* JADX INFO: renamed from: convertRequestToPlayServices, reason: avoid collision after fix types in other method */
    public C4603w convertRequestToPlayServices2(AbstractC2642f request) {
        AbstractC16544l.m18094g(request, "request");
        throw null;
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, Intent data) {
        if (uniqueRequestCode != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            AbstractC15256t.m16482t(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, C10887xb96e2c35.INSTANCE, new C10888xb96e2c36(this), this.cancellationSignal)) {
            return;
        }
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor = this.executor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(this.f$0);
                    }
                });
                return;
            } else {
                AbstractC16544l.m18103p("executor");
                throw null;
            }
        }
        C4601u c4601u = (C4601u) AbstractC8207u5.m8830a(byteArrayExtra, C4601u.CREATOR);
        AbstractC16544l.m18093f(c4601u, "deserializeFromBytes(bytes)");
        AbstractC2976b abstractC2976bPublicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.INSTANCE.publicKeyCredentialResponseContainsError(c4601u);
        if (abstractC2976bPublicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C10890xb96e2c38(this, abstractC2976bPublicKeyCredentialResponseContainsError));
            return;
        }
        try {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C10892xb96e2c39(this, convertResponseToCredentialManager(c4601u)));
        } catch (JSONException e10) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C10894xb96e2c3a(this, e10));
        } catch (Throwable th2) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new C10896xb96e2c3b(this, th2));
        }
    }

    /* JADX INFO: renamed from: invokePlayServices, reason: avoid collision after fix types in other method */
    public void invokePlayServices2(AbstractC2642f request, InterfaceC2644h callback, Executor executor, CancellationSignal cancellationSignal) {
        AbstractC16544l.m18094g(request, "request");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController this$0) {
        AbstractC16544l.m18094g(this$0, "this$0");
        InterfaceC2644h interfaceC2644h = this$0.callback;
        if (interfaceC2644h == null) {
            AbstractC16544l.m18103p(TfazcFv.ResJcevpsbV);
            throw null;
        }
        ((C2643g) interfaceC2644h).m3624a(new C3611a(new C3198a(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ C4603w convertRequestToPlayServices(AbstractC2642f abstractC2642f) {
        if (abstractC2642f == null) {
            return convertRequestToPlayServices2((AbstractC2642f) null);
        }
        throw new ClassCastException();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public AbstractC2639c convertResponseToCredentialManager(C4601u response) throws C2975a {
        JSONObject jSONObject;
        String str = "response";
        AbstractC16544l.m18094g(response, "response");
        try {
            try {
                JSONObject jSONObject2 = new JSONObject();
                C7054X c7054x = response.f14990o0;
                if (c7054x != null && c7054x.m7453t().length > 0) {
                    jSONObject2.put("rawId", AbstractC1616b.m2470b(c7054x.m7453t()));
                }
                String str2 = response.f14995t0;
                if (str2 != null) {
                    jSONObject2.put("authenticatorAttachment", str2);
                }
                String str3 = response.f14989Z;
                C4591k c4591k = response.f14993r0;
                if (str3 != null && c4591k == null) {
                    jSONObject2.put("type", str3);
                }
                String str4 = response.f14988Y;
                if (str4 != null) {
                    jSONObject2.put(ParameterNames.f31999ID, str4);
                }
                C4589i c4589i = response.f14992q0;
                boolean z6 = true;
                if (c4589i != null) {
                    jSONObject = c4589i.m5336b();
                } else {
                    C4590j c4590j = response.f14991p0;
                    if (c4590j != null) {
                        jSONObject = c4590j.m5337b();
                    } else {
                        z6 = false;
                        if (c4591k != null) {
                            try {
                                jSONObject = new JSONObject();
                                jSONObject.put("code", c4591k.f14962Y.f14985Y);
                                String str5 = c4591k.f14963Z;
                                if (str5 != null) {
                                    jSONObject.put("message", str5);
                                }
                                str = "error";
                            } catch (JSONException e10) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e10);
                            }
                        } else {
                            jSONObject = null;
                        }
                    }
                }
                if (jSONObject != null) {
                    jSONObject2.put(str, jSONObject);
                }
                C4587g c4587g = response.f14994s0;
                if (c4587g != null) {
                    jSONObject2.put("clientExtensionResults", c4587g.m5335b());
                } else if (z6) {
                    jSONObject2.put("clientExtensionResults", new JSONObject());
                }
                String string = jSONObject2.toString();
                AbstractC16544l.m18093f(string, "response.toJson()");
                new Bundle().putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", string);
                C2641e c2641e = new C2641e();
                if (string.length() != 0) {
                    try {
                        new JSONObject(string);
                        return c2641e;
                    } catch (Exception unused) {
                    }
                }
                throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
            } catch (JSONException e11) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e11);
            }
        } catch (Throwable th2) {
            throw new C2975a("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage(), 2);
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public /* synthetic */ void invokePlayServices(AbstractC2642f abstractC2642f, InterfaceC2644h interfaceC2644h, Executor executor, CancellationSignal cancellationSignal) {
        if (abstractC2642f != null) {
            throw new ClassCastException();
        }
        invokePlayServices2((AbstractC2642f) null, interfaceC2644h, executor, cancellationSignal);
    }
}
