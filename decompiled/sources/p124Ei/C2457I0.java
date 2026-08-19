package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16557y;
import mm.C17296C;
import mm.InterfaceC17302e;
import p003A1.C0256i;
import p003A1.InterfaceC0172H0;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1155zi.C22025k2;
import p153Fn.C2925c;
import p179H0.C3195m;
import p179H0.C3196n;
import p204I1.C3590f;
import p349O0.C5994b0;
import p349O0.InterfaceC5985X;
import p507Uh.InterfaceC7678d;
import p571X9.AbstractC9165L2;

/* JADX INFO: renamed from: Ei.I0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2457I0 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7638Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f7639Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f7640o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f7641p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f7642q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2457I0(C3196n c3196n, boolean z6, C16557y c16557y, C16557y c16557y2) {
        super(0);
        this.f7638Y = 1;
        this.f7640o0 = c3196n;
        this.f7639Z = z6;
        this.f7641p0 = c16557y;
        this.f7642q0 = c16557y2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        Object c2522k0;
        switch (this.f7638Y) {
            case 0:
                if (this.f7639Z) {
                    C22025k2 c22025k2 = (C22025k2) this.f7640o0;
                    if (c22025k2 != null) {
                        c2522k0 = new C2522k0(c22025k2);
                    }
                } else {
                    c2522k0 = ((C2532n1) this.f7641p0).f7902i ? C2538q0.f7928a : C2534o0.f7921a;
                }
                ((InterfaceC1436k) this.f7642q0).invoke(c2522k0);
                break;
            case 1:
                C3196n c3196n = (C3196n) this.f7640o0;
                boolean zM4043b = c3196n.m4043b();
                C2925c c2925c = c3196n.f9638a;
                C5994b0 c5994b0 = c3196n.f9645h;
                boolean z6 = this.f7639Z;
                if (zM4043b != z6) {
                    c3196n.f9641d.setValue(Boolean.valueOf(z6));
                    c3196n.f9643f.m6410h(0.0f);
                    AbstractC0575H.m1156D(c2925c, null, null, new C3195m(c3196n, z6 ? c5994b0.m6409g() : 0.0f, null), 3);
                }
                c3196n.f9644g.m6410h(((C16557y) this.f7641p0).f51286Y);
                float f10 = ((C16557y) this.f7642q0).f51286Y;
                if (c5994b0.m6409g() != f10) {
                    c5994b0.m6410h(f10);
                    if (c3196n.m4043b()) {
                        AbstractC0575H.m1156D(c2925c, null, null, new C3195m(c3196n, f10, null), 3);
                    }
                }
                break;
            case 2:
                if (!this.f7639Z) {
                    ((C0256i) ((InterfaceC0172H0) this.f7640o0)).m827c(new C3590f(6, (String) this.f7641p0, null));
                }
                ((InterfaceC1426a) this.f7642q0).invoke();
                break;
            default:
                AbstractC9165L2.m9715b((InterfaceC7678d) this.f7640o0, this.f7639Z, (InterfaceC1436k) this.f7642q0, (InterfaceC5985X) this.f7641p0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2457I0(InterfaceC7678d interfaceC7678d, boolean z6, InterfaceC1436k interfaceC1436k, InterfaceC5985X interfaceC5985X) {
        super(0);
        this.f7638Y = 3;
        this.f7640o0 = interfaceC7678d;
        this.f7639Z = z6;
        this.f7642q0 = interfaceC1436k;
        this.f7641p0 = interfaceC5985X;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2457I0(boolean z6, Object obj, Object obj2, InterfaceC17302e interfaceC17302e, int i10) {
        super(0);
        this.f7638Y = i10;
        this.f7639Z = z6;
        this.f7640o0 = obj;
        this.f7641p0 = obj2;
        this.f7642q0 = interfaceC17302e;
    }
}
