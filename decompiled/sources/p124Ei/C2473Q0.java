package p124Ei;

import ge.AbstractC14085k0;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7926K5;
import p523V9.AbstractC8063c5;
import p544W9.AbstractC8455C;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ei.Q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2473Q0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7706Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f7707Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f7708o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f7709p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2473Q0(InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f7706Y = i11;
        this.f7707Z = interfaceC1436k;
        this.f7708o0 = interfaceC10459q;
        this.f7709p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7706Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC2511g1.m3593e(C5997d.m6447d0(this.f7709p0 | 1), this.f7707Z, c6021p, this.f7708o0);
                break;
            case 1:
                AbstractC14085k0.m15488c(C5997d.m6447d0(this.f7709p0 | 1), this.f7707Z, c6021p, this.f7708o0);
                break;
            case 2:
                AbstractC8455C.m9069a(C5997d.m6447d0(this.f7709p0 | 1), this.f7707Z, c6021p, this.f7708o0);
                break;
            case 3:
                AbstractC8063c5.m8462e(C5997d.m6447d0(this.f7709p0 | 1), this.f7707Z, c6021p, this.f7708o0);
                break;
            case 4:
                AbstractC8063c5.m8465h(C5997d.m6447d0(this.f7709p0 | 1), this.f7707Z, c6021p, this.f7708o0);
                break;
            default:
                AbstractC7926K5.m8221a(C5997d.m6447d0(this.f7709p0 | 1), this.f7707Z, c6021p, this.f7708o0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2473Q0(InterfaceC10459q interfaceC10459q, InterfaceC1436k interfaceC1436k, int i10) {
        super(2);
        this.f7706Y = 2;
        this.f7708o0 = interfaceC10459q;
        this.f7707Z = interfaceC1436k;
        this.f7709p0 = i10;
    }
}
