package androidx.credentials.playservices.controllers;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m18067d2 = {"", "T1", "T2", "R2", "R1", "E1", "Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 8, 0})
public final class C10908x6edb4e75 extends AbstractC16546n implements InterfaceC1426a {
    final /* synthetic */ C16525B $exception;
    final /* synthetic */ InterfaceC1436k $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10908x6edb4e75(InterfaceC1436k interfaceC1436k, C16525B c16525b) {
        super(0);
        this.$onError = interfaceC1436k;
        this.$exception = c16525b;
    }

    @Override // p049Bm.InterfaceC1426a
    public /* bridge */ /* synthetic */ Object invoke() {
        m22450invoke();
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m22450invoke() {
        this.$onError.invoke(this.$exception.f51262Y);
    }
}
