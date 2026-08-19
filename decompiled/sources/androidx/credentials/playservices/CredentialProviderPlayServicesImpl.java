package androidx.credentials.playservices;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import io.sentry.android.core.AbstractC15256t;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1009s9.C19499b;
import p1009s9.C19501d;
import p1009s9.C19502e;
import p1022t9.AbstractC19824i;
import p1036u9.C20159e;
import p1060v9.AbstractC20502t;
import p132F2.AbstractC2637a;
import p132F2.AbstractC2638b;
import p132F2.AbstractC2645i;
import p132F2.AbstractC2654r;
import p132F2.C2643g;
import p132F2.C2650n;
import p132F2.InterfaceC2644h;
import p132F2.InterfaceC2646j;
import p166Ga.C3029c;
import p333N9.AbstractC5685f;
import p333N9.C5682c;
import p477Tb.C7296c;
import p746fa.AbstractC13600i;
import p746fa.C13606o;
import p746fa.InterfaceC13595d;
import p746fa.InterfaceC13596e;
import p903n9.C17539m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, m18067d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "LF2/j;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isGooglePlayServicesAvailable", "(Landroid/content/Context;)I", "LF2/n;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "LF2/h;", "LF2/o;", "LG2/e;", "callback", "Lmm/C;", "onGetCredential", "(Landroid/content/Context;LF2/n;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LF2/h;)V", "LF2/b;", "LF2/c;", "LG2/b;", "onCreateCredential", "(Landroid/content/Context;LF2/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LF2/h;)V", "", "isAvailableOnDevice", "()Z", "LF2/a;", "Ljava/lang/Void;", "LE3/p;", "onClearCredential", "(LF2/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LF2/h;)V", "Landroid/content/Context;", "Ls9/e;", "googleApiAvailability", "Ls9/e;", "getGoogleApiAvailability", "()Ls9/e;", "setGoogleApiAvailability", "(Ls9/e;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CredentialProviderPlayServicesImpl implements InterfaceC2646j {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private C19502e googleApiAvailability;

    @Metadata(m18066d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m18067d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", "Lmm/C;", "callback", "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;LBm/a;)V", "cancellationReviewerWithCallback", "", "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "LF2/n;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(LF2/n;)Z", "isGetSignInIntentRequest", "", "MIN_GMS_APK_VERSION", TokenNames.f32012I, "", "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        /* JADX INFO: renamed from: cancellationReviewerWithCallback$credentials_play_services_auth_release */
        public final void m11407xee23955a(CancellationSignal cancellationSignal, InterfaceC1426a callback) {
            AbstractC16544l.m18094g(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(C2650n request) {
            AbstractC16544l.m18094g(request, "request");
            for (AbstractC2645i abstractC2645i : request.f8164a) {
            }
            return false;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", "Lmm/C;", "invoke", "(Ljava/lang/Void;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
    public static final class C108701 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ InterfaceC2644h $callback;
        final /* synthetic */ CancellationSignal $cancellationSignal;
        final /* synthetic */ Executor $executor;

        /* JADX INFO: renamed from: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
        public static final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1426a {
            final /* synthetic */ InterfaceC2644h $callback;
            final /* synthetic */ Executor $executor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Executor executor, InterfaceC2644h interfaceC2644h) {
                super(0);
                this.$executor = executor;
                this.$callback = interfaceC2644h;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invoke$lambda$0(InterfaceC2644h callback) {
                AbstractC16544l.m18094g(callback, "$callback");
                ((C2643g) callback).m3625b(null);
            }

            @Override // p049Bm.InterfaceC1426a
            public /* bridge */ /* synthetic */ Object invoke() {
                m22427invoke();
                return C17296C.f55119a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22427invoke() {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "During clear credential, signed out successfully!");
                Executor executor = this.$executor;
                final InterfaceC2644h interfaceC2644h = this.$callback;
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$1$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        CredentialProviderPlayServicesImpl.C108701.AnonymousClass1.invoke$lambda$0(interfaceC2644h);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108701(CancellationSignal cancellationSignal, Executor executor, InterfaceC2644h interfaceC2644h) {
            super(1);
            this.$cancellationSignal = cancellationSignal;
            this.$executor = executor;
            this.$callback = interfaceC2644h;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Void) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Void r6) {
            CredentialProviderPlayServicesImpl.INSTANCE.m11407xee23955a(this.$cancellationSignal, new AnonymousClass1(this.$executor, this.$callback));
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        AbstractC16544l.m18094g(context, "context");
        this.context = context;
        this.googleApiAvailability = C19502e.f61950d;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.m20602c(context, MIN_GMS_APK_VERSION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0(InterfaceC1436k tmp0, Object obj) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl this$0, CancellationSignal cancellationSignal, Executor executor, InterfaceC2644h callback, Exception e10) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(executor, "$executor");
        AbstractC16544l.m18094g(callback, "$callback");
        AbstractC16544l.m18094g(e10, "e");
        INSTANCE.m11407xee23955a(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(e10, executor, callback));
    }

    public final C19502e getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // p132F2.InterfaceC2646j
    public boolean isAvailableOnDevice() {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z6 = iIsGooglePlayServicesAvailable == 0;
        if (!z6) {
            AbstractC15256t.m16482t(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new C19499b(iIsGooglePlayServicesAvailable));
        }
        return z6;
    }

    public void onClearCredential(AbstractC2637a request, final CancellationSignal cancellationSignal, final Executor executor, final InterfaceC2644h callback) {
        AbstractC16544l.m18094g(request, "request");
        AbstractC16544l.m18094g(executor, "executor");
        AbstractC16544l.m18094g(callback, "callback");
        if (INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Context context = this.context;
        AbstractC20502t.m21157h(context);
        C5682c c5682c = new C5682c(context, new C17539m());
        c5682c.f62874a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = AbstractC19824i.f62884a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((AbstractC19824i) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C20159e.m20977a();
        C3029c c3029cM3900d = C3029c.m3900d();
        c3029cM3900d.f9120e = new C19501d[]{AbstractC5685f.f18454a};
        c3029cM3900d.f9119d = new C7296c(c5682c, 19);
        c3029cM3900d.f9118c = false;
        c3029cM3900d.f9117b = 1554;
        C13606o c13606oM20770b = c5682c.m20770b(1, c3029cM3900d.m3904c());
        final C108701 c108701 = new C108701(cancellationSignal, executor, callback);
        InterfaceC13596e interfaceC13596e = new InterfaceC13596e() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
            @Override // p746fa.InterfaceC13596e
            public final void onSuccess(Object obj) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(c108701, obj);
            }
        };
        c13606oM20770b.getClass();
        c13606oM20770b.m15126e(AbstractC13600i.f42962a, interfaceC13596e);
        c13606oM20770b.m15124c(new InterfaceC13595d() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
            @Override // p746fa.InterfaceC13595d
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(this.f$0, cancellationSignal, executor, callback, exc);
            }
        });
    }

    public void onCreateCredential(Context context, AbstractC2638b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC2644h callback) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(request, "request");
        throw null;
    }

    public void onGetCredential(Context context, AbstractC2654r pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, InterfaceC2644h callback) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        AbstractC16544l.m18094g(executor, "executor");
        AbstractC16544l.m18094g(callback, "callback");
    }

    public void onPrepareCredential(C2650n request, CancellationSignal cancellationSignal, Executor executor, InterfaceC2644h callback) {
        AbstractC16544l.m18094g(request, "request");
        AbstractC16544l.m18094g(executor, "executor");
        AbstractC16544l.m18094g(callback, "callback");
    }

    public final void setGoogleApiAvailability(C19502e c19502e) {
        AbstractC16544l.m18094g(c19502e, "<set-?>");
        this.googleApiAvailability = c19502e;
    }

    @Override // p132F2.InterfaceC2646j
    public void onGetCredential(Context context, C2650n request, CancellationSignal cancellationSignal, Executor executor, InterfaceC2644h callback) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(request, "request");
        AbstractC16544l.m18094g(executor, "executor");
        AbstractC16544l.m18094g(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }
}
