package p968qi;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p283L5.AbstractC4941g;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8231x5;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: qi.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C18730m extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59573Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f59574Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f59575o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f59576p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f59577q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f59578r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f59579s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Object f59580t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18730m(int i10, InterfaceC10459q interfaceC10459q, Integer num, Integer num2, InterfaceC1426a interfaceC1426a, int i11, int i12) {
        super(2);
        this.f59574Z = i10;
        this.f59578r0 = interfaceC10459q;
        this.f59579s0 = num;
        this.f59580t0 = num2;
        this.f59575o0 = interfaceC1426a;
        this.f59576p0 = i11;
        this.f59577q0 = i12;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f59573Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f59577q0 | 1);
                AbstractC4941g.m5551J((AbstractC18724g) this.f59578r0, (EnumC18738u) this.f59579s0, this.f59574Z, this.f59576p0, (C18739v) this.f59580t0, this.f59575o0, c6021p, iM6447d0);
                break;
            default:
                int iM6447d1 = C5997d.m6447d0(this.f59576p0 | 1);
                AbstractC8231x5.m8866b(this.f59574Z, (InterfaceC10459q) this.f59578r0, (Integer) this.f59579s0, (Integer) this.f59580t0, this.f59575o0, c6021p, iM6447d1, this.f59577q0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18730m(AbstractC18724g abstractC18724g, EnumC18738u enumC18738u, int i10, int i11, C18739v c18739v, InterfaceC1426a interfaceC1426a, int i12) {
        super(2);
        this.f59578r0 = abstractC18724g;
        this.f59579s0 = enumC18738u;
        this.f59574Z = i10;
        this.f59576p0 = i11;
        this.f59580t0 = c18739v;
        this.f59575o0 = interfaceC1426a;
        this.f59577q0 = i12;
    }
}
