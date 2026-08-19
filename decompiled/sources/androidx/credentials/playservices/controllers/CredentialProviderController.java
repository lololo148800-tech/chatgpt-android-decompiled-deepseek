package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p132F2.C2643g;
import p132F2.InterfaceC2644h;
import p157G2.C2975a;
import p157G2.C2977c;
import p157G2.C2980f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000 #*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u0001*\b\b\u0004\u0010\u0006*\u00020\u00012\u00020\u0007:\u0001#B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ[\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00028\u00040\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00028\u00032\u0006\u0010 \u001a\u00028\u0002H$¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006$"}, m18067d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController;", "", "T1", "T2", "R2", "R1", "E1", "Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "resultData", "Lkotlin/Function2;", "", "conversionFn", "Ljava/util/concurrent/Executor;", "executor", "LF2/h;", "callback", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "maybeReportErrorFromResultReceiver", "(Landroid/os/Bundle;LBm/n;Ljava/util/concurrent/Executor;LF2/h;Landroid/os/CancellationSignal;)Z", "request", "Lmm/C;", "invokePlayServices", "(Ljava/lang/Object;LF2/h;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Ljava/lang/Object;)Ljava/lang/Object;", "response", "convertResponseToCredentialManager", "Landroid/content/Context;", "Companion", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    private final Context context;

    @Metadata(m18066d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u001a\u0010\u0011J'\u0010\u001c\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m18067d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion;", "", "<init>", "()V", "", "resultCode", "Lkotlin/Function2;", "Landroid/os/CancellationSignal;", "Lkotlin/Function0;", "Lmm/C;", "cancelOnError", "Lkotlin/Function1;", "LG2/b;", "onError", "cancellationSignal", "", "maybeReportErrorResultCodeCreate", "(ILBm/n;LBm/k;Landroid/os/CancellationSignal;)Z", "", "generateErrorStringUnknown$credentials_play_services_auth_release", "(I)Ljava/lang/String;", "generateErrorStringUnknown", "generateErrorStringCanceled$credentials_play_services_auth_release", "()Ljava/lang/String;", "generateErrorStringCanceled", "LG2/e;", "maybeReportErrorResultCodeGet", "onResultOrException", "cancelOrCallbackExceptionOrResult", "(Landroid/os/CancellationSignal;LBm/a;)V", "ERROR_MESSAGE_START_ACTIVITY_FAILED", "Ljava/lang/String;", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, InterfaceC1426a onResultOrException) {
            AbstractC16544l.m18094g(onResultOrException, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        /* JADX INFO: renamed from: generateErrorStringCanceled$credentials_play_services_auth_release */
        public final String m11429x576fb150() {
            return "activity is cancelled by the user.";
        }

        /* JADX INFO: renamed from: generateErrorStringUnknown$credentials_play_services_auth_release */
        public final String m11430x14b42947(int resultCode) {
            return AbstractC0010F.m19c(resultCode, "activity with result code: ", " indicating not RESULT_OK");
        }

        public final boolean maybeReportErrorResultCodeCreate(int resultCode, InterfaceC1439n cancelOnError, InterfaceC1436k onError, CancellationSignal cancellationSignal) {
            AbstractC16544l.m18094g(cancelOnError, "cancelOnError");
            AbstractC16544l.m18094g(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            C16525B c16525b = new C16525B();
            c16525b.f51262Y = new C2975a(m11430x14b42947(resultCode), 2);
            if (resultCode == 0) {
                c16525b.f51262Y = new C2975a(m11429x576fb150(), 0);
            }
            cancelOnError.invoke(cancellationSignal, new C10907x7cfe4d37(onError, c16525b));
            return true;
        }

        public final boolean maybeReportErrorResultCodeGet(int resultCode, InterfaceC1439n cancelOnError, InterfaceC1436k onError, CancellationSignal cancellationSignal) {
            AbstractC16544l.m18094g(cancelOnError, "cancelOnError");
            AbstractC16544l.m18094g(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            C16525B c16525b = new C16525B();
            c16525b.f51262Y = new C2980f(m11430x14b42947(resultCode));
            if (resultCode == 0) {
                c16525b.f51262Y = new C2977c(m11429x576fb150());
            }
            cancelOnError.invoke(cancellationSignal, new C10908x6edb4e75(onError, c16525b));
            return true;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18067d2 = {"", "T1", "T2", "R2", "R1", "E1", "Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C109091 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ InterfaceC2644h $callback;
        final /* synthetic */ E1 $exception;
        final /* synthetic */ Executor $executor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109091(Executor executor, InterfaceC2644h interfaceC2644h, E1 e10) {
            super(0);
            this.$executor = executor;
            this.$callback = interfaceC2644h;
            this.$exception = e10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(InterfaceC2644h callback, Object exception) {
            AbstractC16544l.m18094g(callback, "$callback");
            AbstractC16544l.m18094g(exception, "$exception");
            ((C2643g) callback).m3624a(exception);
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22452invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22452invoke() {
            Executor executor = this.$executor;
            final InterfaceC2644h interfaceC2644h = this.$callback;
            final E1 e10 = this.$exception;
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$maybeReportErrorFromResultReceiver$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderController.C109091.invoke$lambda$0(interfaceC2644h, e10);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        AbstractC16544l.m18094g(context, "context");
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, InterfaceC1426a interfaceC1426a) {
        INSTANCE.cancelOrCallbackExceptionOrResult(cancellationSignal, interfaceC1426a);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i10, InterfaceC1439n interfaceC1439n, InterfaceC1436k interfaceC1436k, CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeCreate(i10, interfaceC1439n, interfaceC1436k, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i10, InterfaceC1439n interfaceC1439n, InterfaceC1436k interfaceC1436k, CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeGet(i10, interfaceC1439n, interfaceC1436k, cancellationSignal);
    }

    public abstract T2 convertRequestToPlayServices(T1 request);

    public abstract R1 convertResponseToCredentialManager(R2 response);

    public abstract void invokePlayServices(T1 request, InterfaceC2644h callback, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle resultData, InterfaceC1439n conversionFn, Executor executor, InterfaceC2644h callback, CancellationSignal cancellationSignal) {
        AbstractC16544l.m18094g(resultData, "resultData");
        AbstractC16544l.m18094g(conversionFn, "conversionFn");
        AbstractC16544l.m18094g(executor, "executor");
        AbstractC16544l.m18094g(callback, "callback");
        if (!resultData.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new C109091(executor, callback, conversionFn.invoke(resultData.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), resultData.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }
}
