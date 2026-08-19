package p229J0;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.C0185L1;
import p003A1.InterfaceC0182K1;
import p049Bm.InterfaceC1436k;
import p080D0.AbstractC1807h0;
import p080D0.C1837w0;
import p1071w0.AbstractC20740b0;
import p1071w0.C20710G0;
import p1071w0.C20750g0;
import p1071w0.EnumC20730T;
import p1095x1.InterfaceC21098s;
import p153Fn.C2925c;
import p156G1.AbstractC2962i;
import p156G1.AbstractC2973t;
import p156G1.C2954a;
import p156G1.C2963j;
import p204I1.C3581L;
import p225Im.InterfaceC3776x;
import p349O0.C6002f0;
import p350O1.C6045C;
import p350O1.C6049G;
import p350O1.InterfaceC6073v;
import p547Wc.C8795g0;
import p658b5.C11246q;
import p759g1.C13801c;

/* JADX INFO: renamed from: J0.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4018a0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f12602Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f12603Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f12604o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f12605p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f12606q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f12607r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ Object f12608s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4018a0(Object obj, boolean z6, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        super(1);
        this.f12602Y = i10;
        this.f12604o0 = obj;
        this.f12603Z = z6;
        this.f12605p0 = obj2;
        this.f12606q0 = obj3;
        this.f12607r0 = obj4;
        this.f12608s0 = obj5;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C6049G c6049g;
        InterfaceC21098s interfaceC21098s;
        InterfaceC21098s interfaceC21098s2;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f12608s0;
        Object obj3 = this.f12605p0;
        Object obj4 = this.f12606q0;
        boolean z6 = this.f12603Z;
        Object obj5 = this.f12604o0;
        Object obj6 = this.f12607r0;
        switch (this.f12602Y) {
            case 0:
                C2963j c2963j = (C2963j) obj;
                C3880A3 c3880a3 = (C3880A3) obj5;
                if (c3880a3.f11737c.m12638h().f15815a.size() > 1 && z6) {
                    EnumC3886B3 enumC3886B3M4602b = c3880a3.m4602b();
                    EnumC3886B3 enumC3886B3 = EnumC3886B3.f11779o0;
                    C2925c c2925c = (C2925c) obj2;
                    C11246q c11246q = c3880a3.f11737c;
                    if (enumC3886B3M4602b == enumC3886B3) {
                        if (((Boolean) ((InterfaceC1436k) c11246q.f34067d).invoke(EnumC3886B3.f11778Z)).booleanValue()) {
                            C4002X c4002x = new C4002X(c2925c, c3880a3, 0);
                            InterfaceC3776x[] interfaceC3776xArr = AbstractC2973t.f8942a;
                            c2963j.m3787m(AbstractC2962i.f8871r, new C2954a((String) obj3, c4002x));
                        }
                    } else if (((Boolean) ((InterfaceC1436k) c11246q.f34067d).invoke(enumC3886B3)).booleanValue()) {
                        C4002X c4002x2 = new C4002X(c2925c, c3880a3, 1);
                        InterfaceC3776x[] interfaceC3776xArr2 = AbstractC2973t.f8942a;
                        c2963j.m3787m(AbstractC2962i.f8872s, new C2954a((String) obj4, c4002x2));
                    }
                    if (!c3880a3.f11736b) {
                        C4002X c4002x3 = new C4002X(c2925c, c3880a3, 2);
                        InterfaceC3776x[] interfaceC3776xArr3 = AbstractC2973t.f8942a;
                        c2963j.m3787m(AbstractC2962i.f8873t, new C2954a((String) obj6, c4002x3));
                    }
                }
                break;
            default:
                InterfaceC21098s interfaceC21098s3 = (InterfaceC21098s) obj;
                C20750g0 c20750g0 = (C20750g0) obj5;
                c20750g0.f65817h = interfaceC21098s3;
                C20710G0 c20710g0M21294d = c20750g0.m21294d();
                if (c20710g0M21294d != null) {
                    c20710g0M21294d.f65651b = interfaceC21098s3;
                }
                if (z6) {
                    EnumC20730T enumC20730TM21291a = c20750g0.m21291a();
                    EnumC20730T enumC20730T = EnumC20730T.f65729Z;
                    C1837w0 c1837w0 = (C1837w0) obj4;
                    C6002f0 c6002f0 = c20750g0.f65824o;
                    C6045C c6045c = (C6045C) obj6;
                    if (enumC20730TM21291a == enumC20730T) {
                        if (((Boolean) c20750g0.f65821l.getValue()).booleanValue() && ((C0185L1) ((InterfaceC0182K1) obj3)).m565a()) {
                            c1837w0.m2691o();
                        } else {
                            c1837w0.m2687k();
                        }
                        c20750g0.f65822m.setValue(Boolean.valueOf(AbstractC1807h0.m2609D(c1837w0, true)));
                        c20750g0.f65823n.setValue(Boolean.valueOf(AbstractC1807h0.m2609D(c1837w0, false)));
                        c6002f0.setValue(Boolean.valueOf(C3581L.m4267c(c6045c.f19683b)));
                    } else if (c20750g0.m21291a() == EnumC20730T.f65730o0) {
                        c6002f0.setValue(Boolean.valueOf(AbstractC1807h0.m2609D(c1837w0, true)));
                    }
                    InterfaceC6073v interfaceC6073v = (InterfaceC6073v) obj2;
                    AbstractC20740b0.m21282w(c20750g0, c6045c, interfaceC6073v);
                    C20710G0 c20710g0M21294d2 = c20750g0.m21294d();
                    if (c20710g0M21294d2 != null && (c6049g = c20750g0.f65814e) != null && c20750g0.m21292b() && (interfaceC21098s = c20710g0M21294d2.f65651b) != null && interfaceC21098s.mo21522h() && (interfaceC21098s2 = c20710g0M21294d2.f65652c) != null) {
                        C8795g0 c8795g0 = new C8795g0(interfaceC21098s, 1);
                        C13801c c13801cM2611F = AbstractC1807h0.m2611F(interfaceC21098s);
                        C13801c c13801cMo21528y = interfaceC21098s.mo21528y(interfaceC21098s2, false);
                        if (AbstractC16544l.m18089b((C6049G) c6049g.f19706a.f19686b.get(), c6049g)) {
                            c6049g.f19707b.mo6614a((C6045C) obj6, interfaceC6073v, c20710g0M21294d2.f65650a, c8795g0, c13801cM2611F, c13801cMo21528y);
                        }
                    }
                }
                break;
        }
        return c17296c;
    }
}
