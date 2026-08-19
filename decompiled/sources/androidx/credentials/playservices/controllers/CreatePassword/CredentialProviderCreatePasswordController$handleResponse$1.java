package androidx.credentials.playservices.controllers.CreatePassword;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"Landroid/os/CancellationSignal;", "s", "Lkotlin/Function0;", "Lmm/C;", "f", "invoke", "(Landroid/os/CancellationSignal;LBm/a;)V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class CredentialProviderCreatePasswordController$handleResponse$1 extends AbstractC16546n implements InterfaceC1439n {
    public static final CredentialProviderCreatePasswordController$handleResponse$1 INSTANCE = new CredentialProviderCreatePasswordController$handleResponse$1();

    public CredentialProviderCreatePasswordController$handleResponse$1() {
        super(2);
    }

    @Override // p049Bm.InterfaceC1439n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CancellationSignal) obj, (InterfaceC1426a) obj2);
        return C17296C.f55119a;
    }

    public final void invoke(CancellationSignal cancellationSignal, InterfaceC1426a f10) {
        AbstractC16544l.m18094g(f10, "f");
        CredentialProviderController.Companion companion = CredentialProviderController.INSTANCE;
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, f10);
    }
}
