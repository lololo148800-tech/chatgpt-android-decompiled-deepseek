package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p132F2.C2643g;
import p132F2.InterfaceC2644h;
import p181H2.C3198a;
import p205I2.C3611a;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$7 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class C10896xb96e2c3b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: $t */
    final /* synthetic */ Throwable f32936$t;
    final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10896xb96e2c3b(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th2) {
        super(0);
        this.this$0 = credentialProviderCreatePublicKeyCredentialController;
        this.f32936$t = th2;
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
        ((C2643g) interfaceC2644h).m3624a(new C3611a(new C3198a(26), t10.getMessage()));
    }

    @Override // p049Bm.InterfaceC1426a
    public /* bridge */ /* synthetic */ Object invoke() {
        m22444invoke();
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m22444invoke() {
        Executor executor = this.this$0.executor;
        if (executor == null) {
            AbstractC16544l.m18103p("executor");
            throw null;
        }
        final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
        final Throwable th2 = this.f32936$t;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController$handleResponse$7$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C10896xb96e2c3b.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, th2);
            }
        });
    }
}
