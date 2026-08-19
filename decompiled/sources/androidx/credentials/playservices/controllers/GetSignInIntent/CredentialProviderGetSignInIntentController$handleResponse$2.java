package androidx.credentials.playservices.controllers.GetSignInIntent;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p132F2.C2643g;
import p157G2.AbstractC2979e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LG2/e;", "e", "Lmm/C;", "invoke", "(LG2/e;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class CredentialProviderGetSignInIntentController$handleResponse$2 extends AbstractC16546n implements InterfaceC1436k {
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        super(1);
        this.this$0 = credentialProviderGetSignInIntentController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, AbstractC2979e e10) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(e10, "$e");
        ((C2643g) this$0.getCallback()).m3624a(e10);
    }

    @Override // p049Bm.InterfaceC1436k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AbstractC2979e) obj);
        return C17296C.f55119a;
    }

    public final void invoke(final AbstractC2979e e10) {
        AbstractC16544l.m18094g(e10, "e");
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$2.invoke$lambda$0(credentialProviderGetSignInIntentController, e10);
            }
        });
    }
}
