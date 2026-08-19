package androidx.credentials.playservices;

import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p109E3.C2292p;
import p132F2.C2643g;
import p132F2.InterfaceC2644h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class CredentialProviderPlayServicesImpl$onClearCredential$2$1$1 extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ InterfaceC2644h $callback;

    /* JADX INFO: renamed from: $e */
    final /* synthetic */ Exception f32932$e;
    final /* synthetic */ Executor $executor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(Exception exc, Executor executor, InterfaceC2644h interfaceC2644h) {
        super(0);
        this.f32932$e = exc;
        this.$executor = executor;
        this.$callback = interfaceC2644h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(InterfaceC2644h callback, Exception e10) {
        AbstractC16544l.m18094g(callback, "$callback");
        AbstractC16544l.m18094g(e10, "$e");
        String message = e10.getMessage();
        ((C2643g) callback).m3624a(new C2292p(message != null ? message.toString() : null));
    }

    @Override // p049Bm.InterfaceC1426a
    public /* bridge */ /* synthetic */ Object invoke() {
        m22428invoke();
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m22428invoke() {
        AbstractC15256t.m16482t("PlayServicesImpl", "During clear credential sign out failed with " + this.f32932$e);
        Executor executor = this.$executor;
        final InterfaceC2644h interfaceC2644h = this.$callback;
        final Exception exc = this.f32932$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$onClearCredential$2$1$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl$onClearCredential$2$1$1.invoke$lambda$0(interfaceC2644h, exc);
            }
        });
    }
}
