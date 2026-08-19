package p124Ei;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7941M4;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ei.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C2440A extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7580Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2532n1 f7581Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f7582o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f7583p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f7584q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2440A(C2532n1 c2532n1, InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f7580Y = i11;
        this.f7581Z = c2532n1;
        this.f7582o0 = interfaceC1436k;
        this.f7583p0 = interfaceC10459q;
        this.f7584q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7580Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC7941M4.m8229a(this.f7581Z, this.f7582o0, this.f7583p0, c6021p, C5997d.m6447d0(this.f7584q0 | 1));
                break;
            case 1:
                AbstractC7941M4.m8229a(this.f7581Z, this.f7582o0, this.f7583p0, c6021p, C5997d.m6447d0(this.f7584q0 | 1));
                break;
            case 2:
                AbstractC7941M4.m8229a(this.f7581Z, this.f7582o0, this.f7583p0, c6021p, C5997d.m6447d0(this.f7584q0 | 1));
                break;
            case 3:
                AbstractC7941M4.m8229a(this.f7581Z, this.f7582o0, this.f7583p0, c6021p, C5997d.m6447d0(this.f7584q0 | 1));
                break;
            case 4:
                AbstractC2511g1.m3603o(this.f7581Z, this.f7582o0, this.f7583p0, c6021p, C5997d.m6447d0(this.f7584q0 | 1));
                break;
            default:
                AbstractC2511g1.m3604p(this.f7581Z, this.f7582o0, this.f7583p0, c6021p, C5997d.m6447d0(this.f7584q0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
