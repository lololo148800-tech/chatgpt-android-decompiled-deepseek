package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7965P4;

/* JADX INFO: renamed from: Ei.y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2554y0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ boolean f7974Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f7975Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2554y0(boolean z6, int i10) {
        super(2);
        this.f7974Y = z6;
        this.f7975Z = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        AbstractC7965P4.m8250a(C5997d.m6447d0(this.f7975Z | 1), (C6021p) obj, this.f7974Y);
        return C17296C.f55119a;
    }
}
