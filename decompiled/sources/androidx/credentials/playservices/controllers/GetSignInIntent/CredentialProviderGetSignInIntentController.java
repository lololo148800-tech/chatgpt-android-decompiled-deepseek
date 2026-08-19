package androidx.credentials.playservices.controllers.GetSignInIntent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.common.api.Status;
import ga.C13834b;
import io.sentry.android.core.AbstractC15256t;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p1022t9.C19819d;
import p1060v9.AbstractC20502t;
import p132F2.C2643g;
import p132F2.C2650n;
import p132F2.C2651o;
import p132F2.InterfaceC2644h;
import p157G2.AbstractC2979e;
import p157G2.C2977c;
import p157G2.C2978d;
import p157G2.C2980f;
import p157G2.C2981g;
import p333N9.C5682c;
import p903n9.C17533g;
import p903n9.C17536j;
import p903n9.C17539m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\b\u0005*\u00015\b\u0000\u0018\u0000 82 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00018B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010$\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\r\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u000f\u0010-\u0012\u0004\b2\u0010,\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u00103\u0012\u0004\b4\u0010,R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, m18067d2 = {"Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "LF2/n;", "Ln9/g;", "Ln9/j;", "LF2/o;", "LG2/e;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "LF2/h;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lmm/C;", "invokePlayServices", "(LF2/n;LF2/h;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(LF2/n;)Ln9/g;", "response", "convertResponseToCredentialManager", "(Ln9/j;)LF2/o;", "Lga/b;", "createGoogleIdCredential", "(Ln9/j;)Lga/b;", "", "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "Landroid/content/Context;", "LF2/h;", "getCallback", "()LF2/h;", "setCallback", "(LF2/h;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController<C2650n, C17533g, C17536j, C2651o, AbstractC2979e> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "GetSignInIntent";
    public InterfaceC2644h callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    @Metadata(m18066d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m18067d2 = {"Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController$Companion;", "", "()V", "TAG", "", "getInstance", "Landroidx/credentials/playservices/controllers/GetSignInIntent/CredentialProviderGetSignInIntentController;", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            AbstractC16544l.m18094g(context, "context");
            return new CredentialProviderGetSignInIntentController(context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C109161 extends AbstractC16546n implements InterfaceC1426a {

        /* JADX INFO: renamed from: $e */
        final /* synthetic */ Exception f32941$e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109161(Exception exc) {
            super(0);
            this.f32941$e = exc;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, Exception e10) {
            AbstractC16544l.m18094g(this$0, "this$0");
            AbstractC16544l.m18094g(e10, "$e");
            ((C2643g) this$0.getCallback()).m3624a(e10);
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22459invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22459invoke() {
            Executor executor = CredentialProviderGetSignInIntentController.this.getExecutor();
            final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.this;
            final Exception exc = this.f32941$e;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderGetSignInIntentController.C109161.invoke$lambda$0(credentialProviderGetSignInIntentController, exc);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C109182 extends AbstractC16546n implements InterfaceC1426a {
        public C109182() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0) {
            AbstractC16544l.m18094g(this$0, "this$0");
            ((C2643g) this$0.getCallback()).m3624a(new C2980f(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22461invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22461invoke() {
            Executor executor = CredentialProviderGetSignInIntentController.this.getExecutor();
            final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.this;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$invokePlayServices$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderGetSignInIntentController.C109182.invoke$lambda$0(credentialProviderGetSignInIntentController);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(Context context) {
        super(context);
        AbstractC16544l.m18094g(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int resultCode, Bundle resultData) {
                AbstractC16544l.m18094g(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new C10920xf12f72ff(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderGetSignInIntentController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    public final C13834b createGoogleIdCredential(C17536j response) throws C2980f {
        AbstractC16544l.m18094g(response, "response");
        String str = response.f56089Y;
        AbstractC16544l.m18093f(str, "response.id");
        try {
            String str2 = response.f56095s0;
            AbstractC16544l.m18091d(str2);
            String str3 = response.f56090Z;
            String str4 = str3 != null ? str3 : null;
            String str5 = response.f56091o0;
            String str6 = str5 != null ? str5 : null;
            String str7 = response.f56092p0;
            String str8 = str7 != null ? str7 : null;
            String str9 = response.f56096t0;
            String str10 = str9 != null ? str9 : null;
            Uri uri = response.f56093q0;
            return new C13834b(str, str2, str4, str8, str6, uri != null ? uri : null, str10);
        } catch (Exception unused) {
            throw new C2980f("When attempting to convert get response, null Google ID Token found");
        }
    }

    public final InterfaceC2644h getCallback() {
        InterfaceC2644h interfaceC2644h = this.callback;
        if (interfaceC2644h != null) {
            return interfaceC2644h;
        }
        AbstractC16544l.m18103p("callback");
        throw null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        AbstractC16544l.m18103p("executor");
        throw null;
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, Intent data) {
        if (uniqueRequestCode != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            AbstractC15256t.m16482t(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeGet(resultCode, CredentialProviderGetSignInIntentController$handleResponse$1.INSTANCE, new CredentialProviderGetSignInIntentController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        try {
            Context context = this.context;
            AbstractC20502t.m21157h(context);
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$3(this, convertResponseToCredentialManager(new C5682c(context, new C17539m()).m6124c(data))));
        } catch (AbstractC2979e e10) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$5(this, e10));
        } catch (C19819d e11) {
            C16525B c16525b = new C16525B();
            c16525b.f51262Y = new C2980f(e11.getMessage());
            Status status = e11.f62870Y;
            if (status.f36052Y == 16) {
                c16525b.f51262Y = new C2977c(e11.getMessage());
            } else if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(status.f36052Y))) {
                c16525b.f51262Y = new C2978d(e11.getMessage(), 1);
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$4(this, c16525b));
        } catch (Throwable th2) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetSignInIntentController$handleResponse$6(this, new C2980f(th2.getMessage())));
        }
    }

    public final void setCallback(InterfaceC2644h interfaceC2644h) {
        AbstractC16544l.m18094g(interfaceC2644h, "<set-?>");
        this.callback = interfaceC2644h;
    }

    public final void setExecutor(Executor executor) {
        AbstractC16544l.m18094g(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public C17533g convertRequestToPlayServices(C2650n request) throws C2981g {
        AbstractC16544l.m18094g(request, "request");
        List list = request.f8164a;
        if (list.size() != 1) {
            throw new C2981g("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        AbstractC16544l.m18092e(list.get(0), "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        throw new ClassCastException();
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public C2651o convertResponseToCredentialManager(C17536j response) throws C2980f {
        C13834b c13834bCreateGoogleIdCredential;
        AbstractC16544l.m18094g(response, "response");
        if (response.f56095s0 != null) {
            c13834bCreateGoogleIdCredential = createGoogleIdCredential(response);
        } else {
            AbstractC15256t.m16482t(TAG, "Credential returned but no google Id found");
            c13834bCreateGoogleIdCredential = null;
        }
        if (c13834bCreateGoogleIdCredential != null) {
            return new C2651o(c13834bCreateGoogleIdCredential);
        }
        throw new C2980f("When attempting to convert get response, null credential found");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(C2650n request, InterfaceC2644h callback, Executor executor, CancellationSignal cancellationSignal) {
        AbstractC16544l.m18094g(request, "request");
        AbstractC16544l.m18094g(callback, "callback");
        AbstractC16544l.m18094g(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        try {
            C17533g c17533gConvertRequestToPlayServices = convertRequestToPlayServices(request);
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, c17533gConvertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.SIGN_IN_INTENT_TAG);
            this.context.startActivity(intent);
        } catch (Exception e10) {
            if (e10 instanceof C2981g) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C109161(e10));
            } else {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new C109182());
            }
        }
    }
}
