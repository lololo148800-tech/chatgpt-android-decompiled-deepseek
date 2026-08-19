package p339Nf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p544W9.AbstractC8577W2;

/* JADX INFO: renamed from: Nf.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C5740v extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f18685Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f18686Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f18687o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f18688p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f18689q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5740v(int i10, boolean z6, InterfaceC1426a interfaceC1426a, int i11) {
        super(2);
        this.f18688p0 = i10;
        this.f18686Z = z6;
        this.f18687o0 = interfaceC1426a;
        this.f18689q0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f18685Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC5741w.m6159b(this.f18688p0, C5997d.m6447d0(this.f18689q0 | 1), this.f18687o0, c6021p, this.f18686Z);
                break;
            default:
                AbstractC8577W2.m9239a(this.f18688p0 | 1, this.f18689q0, this.f18687o0, c6021p, this.f18686Z);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5740v(boolean z6, InterfaceC1426a interfaceC1426a, int i10, int i11) {
        super(2);
        this.f18686Z = z6;
        this.f18687o0 = interfaceC1426a;
        this.f18688p0 = i10;
        this.f18689q0 = i11;
    }
}
