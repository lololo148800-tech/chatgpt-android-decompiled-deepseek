package p977r0;

import mm.C17296C;
import p003A1.C0295v;
import p003A1.C0307z;
import p032B4.C0806a;
import p049Bm.InterfaceC1439n;
import p1140z1.C21658D;
import p349O0.C5996c0;
import p571X9.AbstractC9233X;
import p860l0.EnumC16673F0;
import p860l0.InterfaceC16694M0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p953q0.C18561T;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: r0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C18851w extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C18852x f60038Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f60039Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f60040o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18851w(C18852x c18852x, int i10, int i11, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f60038Y = c18852x;
        this.f60039Z = i10;
        this.f60040o0 = i11;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C18851w(this.f60038Y, this.f60039Z, this.f60040o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18851w c18851w = (C18851w) create((InterfaceC16694M0) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c18851w.invokeSuspend(c17296c);
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.List] */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C18845q c18845q;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C18852x c18852x = this.f60038Y;
        C0806a c0806a = c18852x.f60042a;
        int iM6412g = ((C5996c0) c0806a.f2238d).m6412g();
        int i10 = this.f60040o0;
        int i11 = this.f60039Z;
        C5996c0 c5996c0 = (C5996c0) c0806a.f2240f;
        int i12 = 0;
        boolean z6 = (iM6412g == i11 && c5996c0.m6412g() == i10) ? false : true;
        if (z6) {
            c18852x.f60059r.m11268f();
        }
        C18842n c18842n = (C18842n) c18852x.f60043b.getValue();
        C18842n c18842n2 = AbstractC18844p.f60005a;
        if (c18842n.f59998j.isEmpty()) {
            c18845q = null;
        } else {
            ?? r10 = c18842n.f59998j;
            int i13 = ((C18845q) AbstractC17680n.m19341Q(r10)).f60006a;
            if (i11 > ((C18845q) AbstractC17680n.m19351a0(r10)).f60006a || i13 > i11) {
                c18845q = null;
            } else {
                c18845q = (C18845q) AbstractC17680n.m19344T(AbstractC17681o.m19378g(r10, 0, r10.size(), new C0307z(i11, 6)), r10);
            }
        }
        if (c18845q == null || !z6) {
            int[] iArr = (int[]) ((C0295v) c0806a.f2236b).invoke(Integer.valueOf(i11), Integer.valueOf(((int[]) c0806a.f2237c).length));
            int length = iArr.length;
            int[] iArr2 = new int[length];
            while (i12 < length) {
                iArr2[i12] = i10;
                i12++;
            }
            c0806a.f2237c = iArr;
            ((C5996c0) c0806a.f2238d).m6413h(C0806a.m1840c(iArr));
            c0806a.f2239e = iArr2;
            c5996c0.m6413h(C0806a.m1841d(iArr, iArr2));
            ((C18561T) c0806a.f2242h).m19939c(i11);
            c0806a.f2241g = null;
        } else {
            int i14 = ((int) (c18842n.f60004p == EnumC16673F0.f53401Y ? c18845q.f60023r & 4294967295L : c18845q.f60023r >> 32)) + i10;
            int length2 = c18842n.f59990b.length;
            int[] iArr3 = new int[length2];
            while (i12 < length2) {
                iArr3[i12] = c18842n.f59990b[i12] + i14;
                i12++;
            }
            c0806a.f2239e = iArr3;
            c5996c0.m6413h(C0806a.m1841d((int[]) c0806a.f2237c, iArr3));
        }
        C21658D c21658d = c18852x.f60047f;
        if (c21658d != null) {
            c21658d.m22047l();
        }
        return C17296C.f55119a;
    }
}
