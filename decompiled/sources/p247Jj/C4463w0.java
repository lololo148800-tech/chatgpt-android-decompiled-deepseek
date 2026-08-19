package p247Jj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p729ej.C13430u;

/* JADX INFO: renamed from: Jj.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4463w0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4417Z f14599Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4463w0(C4417Z c4417z) {
        super(1);
        this.f14599Y = c4417z;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13430u action = (C13430u) obj;
        AbstractC16544l.m18094g(action, "$this$action");
        action.f42521b = C4417Z.m5193g(this.f14599Y, C4411U0.f14312Y);
        return C17296C.f55119a;
    }
}
