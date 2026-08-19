package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8086f4;
import p523V9.AbstractC8206u4;
import p571X9.AbstractC9100A3;
import p594Y9.AbstractC9697A3;
import p635a1.InterfaceC10459q;
import pf.AbstractC18397m;

/* JADX INFO: renamed from: Ei.M0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2465M0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7670Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f7671Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f7672o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f7673p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2465M0(InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f7670Y = i11;
        this.f7671Z = interfaceC1426a;
        this.f7672o0 = interfaceC10459q;
        this.f7673p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7670Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC2511g1.m3601m(C5997d.m6447d0(this.f7673p0 | 1), this.f7671Z, c6021p, this.f7672o0);
                break;
            case 1:
                AbstractC9100A3.m9628b(C5997d.m6447d0(this.f7673p0 | 1), this.f7671Z, c6021p, this.f7672o0);
                break;
            case 2:
                AbstractC9697A3.m10286a(C5997d.m6447d0(this.f7673p0 | 1), this.f7671Z, c6021p, this.f7672o0);
                break;
            case 3:
                AbstractC9697A3.m10287b(C5997d.m6447d0(this.f7673p0 | 1), this.f7671Z, c6021p, this.f7672o0);
                break;
            case 4:
                AbstractC8206u4.m8820b(C5997d.m6447d0(this.f7673p0 | 1), this.f7671Z, c6021p, this.f7672o0);
                break;
            case 5:
                AbstractC8206u4.m8821c(C5997d.m6447d0(this.f7673p0 | 1), this.f7671Z, c6021p, this.f7672o0);
                break;
            case 6:
                AbstractC18397m.m19866b(C5997d.m6447d0(this.f7673p0 | 1), this.f7671Z, c6021p, this.f7672o0);
                break;
            default:
                AbstractC8086f4.m8514a(C5997d.m6447d0(this.f7673p0 | 1), this.f7671Z, c6021p, this.f7672o0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2465M0(InterfaceC10459q interfaceC10459q, InterfaceC1426a interfaceC1426a, int i10, int i11) {
        super(2);
        this.f7670Y = i11;
        this.f7672o0 = interfaceC10459q;
        this.f7671Z = interfaceC1426a;
        this.f7673p0 = i10;
    }
}
