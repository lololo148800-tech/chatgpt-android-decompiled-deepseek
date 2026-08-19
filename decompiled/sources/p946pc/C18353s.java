package p946pc;

import androidx.compose.foundation.AbstractC10833a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p025An.C0644w;
import p049Bm.InterfaceC1440o;
import p1051v0.AbstractC20417e;
import p204I1.C3582M;
import p349O0.C6013l;
import p349O0.C6021p;
import p544W9.AbstractC8443A;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;

/* JADX INFO: renamed from: pc.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C18353s extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C18353s f58600Z = new C18353s(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18353s f58601o0 = new C18353s(3, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58602Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18353s(int i10, int i11) {
        super(i10);
        this.f58602Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17309l c17309l;
        long jM15626d;
        switch (this.f58602Y) {
            case 0:
                EnumC18356v infoPanelType = (EnumC18356v) obj;
                C6021p c6021p = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(infoPanelType, "infoPanelType");
                c6021p.m6525T(-1998730632);
                c6021p.m6525T(-492369756);
                Object objM6514H = c6021p.m6514H();
                if (objM6514H == C6013l.f19514a) {
                    int iOrdinal = infoPanelType.ordinal();
                    if (iOrdinal == 0) {
                        c17309l = new C17309l(new C14365u(AbstractC14334L.m15626d(4290304767L)), new C14365u(AbstractC14334L.m15626d(4291618303L)));
                    } else if (iOrdinal == 1) {
                        c17309l = new C17309l(new C14365u(AbstractC14334L.m15626d(4292270299L)), new C14365u(AbstractC14334L.m15626d(4293059557L)));
                    } else if (iOrdinal == 2) {
                        c17309l = new C17309l(new C14365u(AbstractC14334L.m15626d(4291028683L)), new C14365u(AbstractC14334L.m15626d(4292144602L)));
                    } else if (iOrdinal == 3) {
                        c17309l = new C17309l(new C14365u(AbstractC14334L.m15626d(4294297291L)), new C14365u(AbstractC14334L.m15626d(4294498266L)));
                    } else {
                        if (iOrdinal != 4) {
                            throw new C0644w();
                        }
                        c17309l = new C17309l(new C14365u(AbstractC14334L.m15626d(4294962874L)), new C14365u(AbstractC14334L.m15626d(4294964173L)));
                    }
                    float f10 = 4;
                    objM6514H = AbstractC10833a.m11207b(AbstractC8443A.m9045a(C10456n.f30959Y, 1, ((C14365u) c17309l.f55136Y).f45062a, AbstractC20417e.m21079a(f10)), ((C14365u) c17309l.f55137Z).f45062a, AbstractC20417e.m21079a(f10));
                    c6021p.m6537c0(objM6514H);
                }
                c6021p.m6553p(false);
                InterfaceC10459q interfaceC10459q = (InterfaceC10459q) objM6514H;
                c6021p.m6553p(false);
                return interfaceC10459q;
            default:
                EnumC18356v infoPanelType2 = (EnumC18356v) obj;
                C6021p c6021p2 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(infoPanelType2, "infoPanelType");
                c6021p2.m6525T(818489191);
                c6021p2.m6525T(-492369756);
                Object objM6514H2 = c6021p2.m6514H();
                if (objM6514H2 == C6013l.f19514a) {
                    int iOrdinal2 = infoPanelType2.ordinal();
                    if (iOrdinal2 == 0) {
                        jM15626d = AbstractC14334L.m15626d(4278206597L);
                    } else if (iOrdinal2 == 1) {
                        jM15626d = AbstractC14334L.m15626d(4281875777L);
                    } else if (iOrdinal2 == 2) {
                        jM15626d = AbstractC14334L.m15626d(4279588644L);
                    } else if (iOrdinal2 == 3) {
                        jM15626d = AbstractC14334L.m15626d(4285668388L);
                    } else {
                        if (iOrdinal2 != 4) {
                            throw new C0644w();
                        }
                        jM15626d = AbstractC14334L.m15626d(4286931972L);
                    }
                    objM6514H2 = new C3582M(jM15626d, 0L, null, null, null, 16777214);
                    c6021p2.m6537c0(objM6514H2);
                }
                c6021p2.m6553p(false);
                C3582M c3582m = (C3582M) objM6514H2;
                c6021p2.m6553p(false);
                return c3582m;
        }
    }
}
