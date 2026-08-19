package androidx.credentials.playservices.controllers.GetSignInIntent;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p132F2.C2643g;
import p132F2.C2651o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class CredentialProviderGetSignInIntentController$handleResponse$3 extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ C2651o $response;
    final /* synthetic */ CredentialProviderGetSignInIntentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetSignInIntentController$handleResponse$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, C2651o c2651o) {
        super(0);
        this.this$0 = credentialProviderGetSignInIntentController;
        this.$response = c2651o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(CredentialProviderGetSignInIntentController this$0, C2651o response) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(response, "$response");
        ((C2643g) this$0.getCallback()).m3625b(response);
    }

    @Override // p049Bm.InterfaceC1426a
    public /* bridge */ /* synthetic */ Object invoke() {
        m22453invoke();
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m22453invoke() {
        Executor executor = this.this$0.getExecutor();
        final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = this.this$0;
        final C2651o c2651o = this.$response;
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController$handleResponse$3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(credentialProviderGetSignInIntentController, c2651o);
            }
        });
    }
}
