package p531Vj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p193Hf.C3330S;
import p523V9.AbstractC8215v5;
import p729ej.C13421l;
import p729ej.C13430u;

/* JADX INFO: renamed from: Vj.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8355Z extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26027Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C13421l f26028Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C8361c0 f26029o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8355Z(C13421l c13421l, C8361c0 c8361c0, int i10) {
        super(1);
        this.f26027Y = i10;
        this.f26028Z = c13421l;
        this.f26029o0 = c8361c0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f26027Y) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.f26028Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f26029o0, new C3330S(zBooleanValue, 1)));
                break;
            default:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                this.f26028Z.f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(this.f26029o0, C8385x.f26097s0));
                break;
        }
        return C17296C.f55119a;
    }
}
