package androidx.credentials.playservices.controllers.BeginSignIn;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p132F2.C2643g;
import p157G2.AbstractC2979e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class CredentialProviderBeginSignInController$handleResponse$5 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: $e */
    final /* synthetic */ AbstractC2979e f32933$e;
    final /* synthetic */ CredentialProviderBeginSignInController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderBeginSignInController$handleResponse$5(CredentialProviderBeginSignInController credentialProviderBeginSignInController, AbstractC2979e abstractC2979e) {
        super(0);
        this.this$0 = credentialProviderBeginSignInController;
        this.f32933$e = abstractC2979e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderBeginSignInController this$0, AbstractC2979e e10) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(e10, "$e");
        ((C2643g) this$0.getCallback()).m3624a(e10);
    }

    @Override // p049Bm.InterfaceC1426a
    public /* bridge */ /* synthetic */ Object invoke() {
        m22435invoke();
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m22435invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderBeginSignInController credentialProviderBeginSignInController = this.this$0;
        final AbstractC2979e abstractC2979e = this.f32933$e;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController$handleResponse$5$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController$handleResponse$5.invoke$lambda$0(credentialProviderBeginSignInController, abstractC2979e);
            }
        });
    }
}
