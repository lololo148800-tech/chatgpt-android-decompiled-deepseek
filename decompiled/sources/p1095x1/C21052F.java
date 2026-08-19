package p1095x1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import p045Bj.C1313k;
import p1140z1.AbstractC21661G;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21658D;
import p1140z1.EnumC21705m0;
import p1140z1.InterfaceC21707n0;
import p332N8.C5677a;
import p392Q0.C6543a;
import p392Q0.C6546d;
import p523V9.AbstractC8111i5;
import p635a1.AbstractC10458p;

/* JADX INFO: renamed from: x1.F */
/* JADX INFO: loaded from: classes.dex */
public final class C21052F implements InterfaceC21077c0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C21053G f66951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f66952b;

    public C21052F(C21053G c21053g, Object obj) {
        this.f66951a = c21053g;
        this.f66952b = obj;
    }

    @Override // p1095x1.InterfaceC21077c0
    /* JADX INFO: renamed from: a */
    public final int mo21504a() {
        C21658D c21658d = (C21658D) this.f66951a.f66964v0.get(this.f66952b);
        if (c21658d != null) {
            return ((C6543a) c21658d.m22054p()).f21176Y.f21184o0;
        }
        return 0;
    }

    @Override // p1095x1.InterfaceC21077c0
    /* JADX INFO: renamed from: b */
    public final void mo21505b(int i10, long j10) {
        C21053G c21053g = this.f66951a;
        C21658D c21658d = (C21658D) c21053g.f66964v0.get(this.f66952b);
        if (c21658d == null || !c21658d.m22024V()) {
            return;
        }
        int i11 = ((C6543a) c21658d.m22054p()).f21176Y.f21184o0;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
        if (c21658d.m22025W()) {
            throw new IllegalArgumentException("Pre-measure called on node that is not placed");
        }
        C21658D c21658d2 = c21053g.f66955Y;
        c21658d2.f68661x0 = true;
        ((AndroidComposeView) AbstractC21661G.m22082a(c21658d)).m11346t((C21658D) ((C6543a) c21658d.m22054p()).get(i10), j10);
        c21658d2.f68661x0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [N8.a] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // p1095x1.InterfaceC21077c0
    /* JADX INFO: renamed from: c */
    public final void mo21506c(C5677a c5677a) {
        C1313k c1313k;
        AbstractC10458p abstractC10458p;
        EnumC21705m0 enumC21705m0;
        C21658D c21658d = (C21658D) this.f66951a.f66964v0.get(this.f66952b);
        if (c21658d == null || (c1313k = c21658d.f68638I0) == null || (abstractC10458p = (AbstractC10458p) c1313k.f3471f) == null) {
            return;
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30960Y;
        if (!abstractC10458p2.f30972y0) {
            AbstractC8111i5.m8592c("visitSubtreeIf called on an unattached node");
            throw null;
        }
        C6546d c6546d = new C6546d(new AbstractC10458p[16]);
        AbstractC10458p abstractC10458p3 = abstractC10458p2.f30965r0;
        if (abstractC10458p3 == null) {
            AbstractC21690f.m22197b(c6546d, abstractC10458p2);
        } else {
            c6546d.m7099c(abstractC10458p3);
        }
        while (c6546d.m7109n()) {
            AbstractC10458p abstractC10458p4 = (AbstractC10458p) c6546d.m7111p(c6546d.f21184o0 - 1);
            if ((abstractC10458p4.f30963p0 & 262144) != 0) {
                AbstractC10458p abstractC10458p5 = abstractC10458p4;
                while (true) {
                    if (abstractC10458p5 != null) {
                        if ((abstractC10458p5.f30962o0 & 262144) != 0) {
                            ?? c6546d2 = 0;
                            ?? M22201f = abstractC10458p5;
                            while (M22201f != 0) {
                                if (M22201f instanceof InterfaceC21707n0) {
                                    InterfaceC21707n0 interfaceC21707n0 = (InterfaceC21707n0) M22201f;
                                    boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(interfaceC21707n0.mo14727o());
                                    EnumC21705m0 enumC21705m1 = EnumC21705m0.f68878Z;
                                    if (zEquals) {
                                        c5677a.invoke(interfaceC21707n0);
                                        enumC21705m0 = enumC21705m1;
                                    } else {
                                        enumC21705m0 = EnumC21705m0.f68877Y;
                                    }
                                    if (enumC21705m0 != EnumC21705m0.f68879o0) {
                                        if (enumC21705m0 == enumC21705m1) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((M22201f.f30962o0 & 262144) != 0 && (M22201f instanceof AbstractC21706n)) {
                                    AbstractC10458p abstractC10458p6 = ((AbstractC21706n) M22201f).f68881A0;
                                    int i10 = 0;
                                    while (abstractC10458p6 != null) {
                                        if ((abstractC10458p6.f30962o0 & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                M22201f = M22201f;
                                                c6546d2 = c6546d2;
                                                c6546d2 = c6546d2;
                                                M22201f = abstractC10458p6;
                                            } else {
                                                if (c6546d2 == 0) {
                                                    c6546d2 = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (M22201f != 0) {
                                                    c6546d2.m7099c(M22201f);
                                                    M22201f = 0;
                                                }
                                                c6546d2.m7099c(abstractC10458p6);
                                            }
                                        } else {
                                            M22201f = M22201f;
                                            c6546d2 = c6546d2;
                                        }
                                        abstractC10458p6 = abstractC10458p6.f30965r0;
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    }
                                    if (i10 == 1) {
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    } else {
                                        M22201f = M22201f;
                                        c6546d2 = c6546d2;
                                    }
                                }
                                M22201f = AbstractC21690f.m22201f(c6546d2);
                            }
                        }
                        abstractC10458p5 = abstractC10458p5.f30965r0;
                    }
                }
            }
            AbstractC21690f.m22197b(c6546d, abstractC10458p4);
        }
    }

    @Override // p1095x1.InterfaceC21077c0
    public final void dispose() {
        C21053G c21053g = this.f66951a;
        c21053g.m21509d();
        C21658D c21658d = (C21658D) c21053g.f66964v0.remove(this.f66952b);
        if (c21658d != null) {
            if (c21053g.f66953A0 <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose");
            }
            C21658D c21658d2 = c21053g.f66955Y;
            int iM7107l = ((C6543a) c21658d2.m22057r()).f21176Y.m7107l(c21658d);
            int i10 = ((C6543a) c21658d2.m22057r()).f21176Y.f21184o0;
            int i11 = c21053g.f66953A0;
            if (iM7107l < i10 - i11) {
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            c21053g.f66968z0++;
            c21053g.f66953A0 = i11 - 1;
            int i12 = (((C6543a) c21658d2.m22057r()).f21176Y.f21184o0 - c21053g.f66953A0) - c21053g.f66968z0;
            c21658d2.f68661x0 = true;
            c21658d2.m22039g0(iM7107l, i12, 1);
            c21658d2.f68661x0 = false;
            c21053g.m21508c(i12);
        }
    }
}
