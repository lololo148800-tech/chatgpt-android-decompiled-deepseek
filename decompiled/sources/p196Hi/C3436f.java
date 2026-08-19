package p196Hi;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p537W0.C8410b;
import p547Wc.AbstractC8757A;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Hi.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3436f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10461Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f10462Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f10463o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C8410b f10464p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f10465q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3436f(InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C8410b c8410b, int i10, int i11) {
        super(2);
        this.f10461Y = i11;
        this.f10462Z = interfaceC1426a;
        this.f10463o0 = interfaceC10459q;
        this.f10464p0 = c8410b;
        this.f10465q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10461Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f10465q0 | 1);
                AbstractC3437g.m4191b(this.f10462Z, this.f10463o0, this.f10464p0, c6021p, iM6447d0);
                break;
            default:
                int iM6447d1 = C5997d.m6447d0(this.f10465q0 | 1);
                AbstractC8757A.m9523d(this.f10462Z, this.f10463o0, this.f10464p0, c6021p, iM6447d1);
                break;
        }
        return C17296C.f55119a;
    }
}
