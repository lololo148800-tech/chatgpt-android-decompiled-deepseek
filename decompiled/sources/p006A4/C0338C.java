package p006A4;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1143z4.AbstractC21790t;
import p1143z4.C21778h;
import p318Mh.C5391c;
import p544W9.AbstractC8634g;
import p736f0.C13467E;
import p736f0.C13468F;
import p736f0.C13493k;

/* JADX INFO: renamed from: A4.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0338C extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1188Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0347h f1189Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f1190o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC1436k f1191p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0338C(C0347h c0347h, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10) {
        super(1);
        this.f1188Y = i10;
        this.f1189Z = c0347h;
        this.f1190o0 = interfaceC1436k;
        this.f1191p0 = interfaceC1436k2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:74:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:? A[LOOP:0: B:7:0x0035->B:78:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:1: B:23:0x0075->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[LOOP:2: B:42:0x00d2->B:88:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[LOOP:3: B:58:0x0112->B:93:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13467E c13467e;
        C13467E c13467e2;
        C13468F c13468f;
        C13468F c13468f2;
        InterfaceC1436k interfaceC1436k = this.f1191p0;
        InterfaceC1436k interfaceC1436k2 = this.f1190o0;
        Object obj2 = null;
        C0347h c0347h = this.f1189Z;
        switch (this.f1188Y) {
            case 0:
                C13493k c13493k = (C13493k) obj;
                AbstractC21790t abstractC21790t = ((C21778h) c13493k.mo15006c()).f69074Z;
                AbstractC16544l.m18092e(abstractC21790t, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                C0346g c0346g = (C0346g) abstractC21790t;
                if (((Boolean) c0347h.f1203c.getValue()).booleanValue()) {
                    int i10 = AbstractC21790t.f69129t0;
                    for (AbstractC21790t abstractC21790t2 : AbstractC8634g.m9295i(c0346g)) {
                        if (abstractC21790t2 instanceof C0346g) {
                            C5391c c5391c = ((C0346g) abstractC21790t2).f1201x0;
                            c13467e2 = c5391c != null ? (C13467E) c5391c.invoke(c13493k) : null;
                            if (c13467e2 != null) {
                                obj2 = c13467e2;
                                if (obj2 == null) {
                                    return (C13467E) interfaceC1436k2.invoke(c13493k);
                                }
                                return obj2;
                            }
                        } else if (abstractC21790t2 instanceof C0344e) {
                            ((C0344e) abstractC21790t2).getClass();
                        }
                        if (c13467e2 != null) {
                            obj2 = c13467e2;
                            if (obj2 == null) {
                                return (C13467E) interfaceC1436k2.invoke(c13493k);
                            }
                            return obj2;
                        }
                    }
                    if (obj2 == null) {
                        return (C13467E) interfaceC1436k2.invoke(c13493k);
                    }
                    return obj2;
                }
                int i11 = AbstractC21790t.f69129t0;
                for (AbstractC21790t abstractC21790t3 : AbstractC8634g.m9295i(c0346g)) {
                    if (abstractC21790t3 instanceof C0346g) {
                        C5391c c5391c2 = ((C0346g) abstractC21790t3).f1199v0;
                        c13467e = c5391c2 != null ? (C13467E) c5391c2.invoke(c13493k) : null;
                        if (c13467e != null) {
                            obj2 = c13467e;
                            if (obj2 == null) {
                                return (C13467E) interfaceC1436k.invoke(c13493k);
                            }
                            return obj2;
                        }
                    } else if (abstractC21790t3 instanceof C0344e) {
                        ((C0344e) abstractC21790t3).getClass();
                    }
                    if (c13467e != null) {
                        obj2 = c13467e;
                        if (obj2 == null) {
                            return (C13467E) interfaceC1436k.invoke(c13493k);
                        }
                        return obj2;
                    }
                }
                if (obj2 == null) {
                    return (C13467E) interfaceC1436k.invoke(c13493k);
                }
                return obj2;
            default:
                C13493k c13493k2 = (C13493k) obj;
                AbstractC21790t abstractC21790t4 = ((C21778h) c13493k2.mo15004a()).f69074Z;
                AbstractC16544l.m18092e(abstractC21790t4, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                C0346g c0346g2 = (C0346g) abstractC21790t4;
                if (((Boolean) c0347h.f1203c.getValue()).booleanValue()) {
                    int i12 = AbstractC21790t.f69129t0;
                    for (AbstractC21790t abstractC21790t5 : AbstractC8634g.m9295i(c0346g2)) {
                        if (abstractC21790t5 instanceof C0346g) {
                            C5391c c5391c3 = ((C0346g) abstractC21790t5).f1202y0;
                            c13468f2 = c5391c3 != null ? (C13468F) c5391c3.invoke(c13493k2) : null;
                            if (c13468f2 != null) {
                                obj2 = c13468f2;
                                if (obj2 == null) {
                                    return (C13468F) interfaceC1436k2.invoke(c13493k2);
                                }
                                return obj2;
                            }
                        } else if (abstractC21790t5 instanceof C0344e) {
                            ((C0344e) abstractC21790t5).getClass();
                        }
                        if (c13468f2 != null) {
                            obj2 = c13468f2;
                            if (obj2 == null) {
                                return (C13468F) interfaceC1436k2.invoke(c13493k2);
                            }
                            return obj2;
                        }
                    }
                    if (obj2 == null) {
                        return (C13468F) interfaceC1436k2.invoke(c13493k2);
                    }
                    return obj2;
                }
                int i13 = AbstractC21790t.f69129t0;
                for (AbstractC21790t abstractC21790t6 : AbstractC8634g.m9295i(c0346g2)) {
                    if (abstractC21790t6 instanceof C0346g) {
                        C5391c c5391c4 = ((C0346g) abstractC21790t6).f1200w0;
                        c13468f = c5391c4 != null ? (C13468F) c5391c4.invoke(c13493k2) : null;
                        if (c13468f != null) {
                            obj2 = c13468f;
                            if (obj2 == null) {
                                return (C13468F) interfaceC1436k.invoke(c13493k2);
                            }
                            return obj2;
                        }
                    } else if (abstractC21790t6 instanceof C0344e) {
                        ((C0344e) abstractC21790t6).getClass();
                    }
                    if (c13468f != null) {
                        obj2 = c13468f;
                        if (obj2 == null) {
                            return (C13468F) interfaceC1436k.invoke(c13493k2);
                        }
                        return obj2;
                    }
                }
                if (obj2 == null) {
                    return (C13468F) interfaceC1436k.invoke(c13493k2);
                }
                return obj2;
        }
    }
}
