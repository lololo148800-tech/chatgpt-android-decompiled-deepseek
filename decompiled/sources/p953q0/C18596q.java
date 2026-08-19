package p953q0;

import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1095x1.AbstractC21075b0;
import p1095x1.AbstractC21082f;
import p1117y1.C21368h;
import p1117y1.InterfaceC21366f;
import p492U1.EnumC7546k;
import p571X9.AbstractC9306j0;
import p635a1.InterfaceC10459q;
import p784hb.C14438g;
import p860l0.EnumC16673F0;

/* JADX INFO: renamed from: q0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C18596q implements InterfaceC21366f {

    /* JADX INFO: renamed from: r0 */
    public static final C18594o f59238r0 = new C18594o();

    /* JADX INFO: renamed from: Y */
    public final InterfaceC18597r f59239Y;

    /* JADX INFO: renamed from: Z */
    public final C14438g f59240Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f59241o0;

    /* JADX INFO: renamed from: p0 */
    public final EnumC7546k f59242p0;

    /* JADX INFO: renamed from: q0 */
    public final EnumC16673F0 f59243q0;

    public C18596q(InterfaceC18597r interfaceC18597r, C14438g c14438g, boolean z6, EnumC7546k enumC7546k, EnumC16673F0 enumC16673F0) {
        this.f59239Y = interfaceC18597r;
        this.f59240Z = c14438g;
        this.f59241o0 = z6;
        this.f59242p0 = enumC7546k;
        this.f59243q0 = enumC16673F0;
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: G */
    public final boolean mo426G(InterfaceC1436k interfaceC1436k) {
        return ((Boolean) interfaceC1436k.invoke(this)).booleanValue();
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC10459q mo428M(InterfaceC10459q interfaceC10459q) {
        return AbstractC9306j0.m9882a(this, interfaceC10459q);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX INFO: renamed from: a */
    public final boolean m19953a(C18593n c18593n, int i10) {
        boolean z6;
        boolean zM21567h = AbstractC21075b0.m21567h(i10, 5) ? true : AbstractC21075b0.m21567h(i10, 6);
        EnumC16673F0 enumC16673F0 = this.f59243q0;
        if (!zM21567h) {
            if (!(AbstractC21075b0.m21567h(i10, 3) ? true : AbstractC21075b0.m21567h(i10, 4))) {
                if (!(AbstractC21075b0.m21567h(i10, 1) ? true : AbstractC21075b0.m21567h(i10, 2))) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
            } else if (enumC16673F0 == EnumC16673F0.f53401Y) {
                z6 = true;
            }
            z6 = false;
        } else if (enumC16673F0 == EnumC16673F0.f53402Z) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            return false;
        }
        if (m19954i(i10)) {
            if (c18593n.f59234b < this.f59239Y.mo19797b() - 1) {
                return true;
            }
        } else if (c18593n.f59233a > 0) {
            return true;
        }
        return false;
    }

    @Override // p1117y1.InterfaceC21366f
    public final C21368h getKey() {
        return AbstractC21082f.f67006a;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m19954i(int i10) {
        if (!AbstractC21075b0.m21567h(i10, 1)) {
            if (AbstractC21075b0.m21567h(i10, 2)) {
                return true;
            }
            boolean zM21567h = AbstractC21075b0.m21567h(i10, 5);
            boolean z6 = this.f59241o0;
            if (!zM21567h) {
                if (!AbstractC21075b0.m21567h(i10, 6)) {
                    boolean zM21567h2 = AbstractC21075b0.m21567h(i10, 3);
                    EnumC7546k enumC7546k = this.f59242p0;
                    if (zM21567h2) {
                        int iOrdinal = enumC7546k.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw new C0644w();
                            }
                            if (!z6) {
                                return true;
                            }
                        }
                    } else {
                        if (!AbstractC21075b0.m21567h(i10, 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int iOrdinal2 = enumC7546k.ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                throw new C0644w();
                            }
                        } else if (!z6) {
                            return true;
                        }
                    }
                } else if (!z6) {
                    return true;
                }
            }
            return z6;
        }
        return false;
    }

    @Override // p635a1.InterfaceC10459q
    /* JADX INFO: renamed from: j */
    public final Object mo431j(Object obj, InterfaceC1439n interfaceC1439n) {
        return interfaceC1439n.invoke(obj, this);
    }

    @Override // p1117y1.InterfaceC21366f
    public final Object getValue() {
        return this;
    }
}
