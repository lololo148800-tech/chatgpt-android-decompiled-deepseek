package p147Fh;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.util.Base64;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16524A;
import mm.C17296C;
import mm.C17309l;
import p001A.AbstractC0010F;
import p045Bj.C1307e;
import p049Bm.InterfaceC1436k;
import p102Dm.AbstractC2119a;
import p1095x1.AbstractC21073a0;
import p1113xn.AbstractC21322p;
import p1113xn.C21307a;
import p1139z0.C21585H;
import p349O0.C6002f0;
import p349O0.InterfaceC5985X;
import p492U1.C7550o;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8215v5;
import p544W9.AbstractC8753z4;
import p647ak.AbstractC10708i1;
import p647ak.C10692d0;
import p647ak.C10696e1;
import p647ak.C10701g0;
import p647ak.C10704h0;
import p647ak.C10730t0;
import p729ej.C13421l;
import p729ej.C13430u;
import p758g0.C13770k;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.C14365u;
import p775h2.AbstractC14376f;
import p858ko.C16484C;
import p858ko.C16499b;
import p858ko.C16501d;
import p858ko.C16503f;
import p878lo.C17097f;
import p949pj.C18428A;
import tj.EnumC19999a;

/* JADX INFO: renamed from: Fh.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C2750g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8431Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f8432Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f8433o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f8434p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f8435q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f8436r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2750g(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i10) {
        super(1);
        this.f8431Y = i10;
        this.f8433o0 = obj;
        this.f8432Z = j10;
        this.f8434p0 = obj2;
        this.f8435q0 = obj3;
        this.f8436r0 = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0194  */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        long j10 = this.f8432Z;
        C17296C c17296c = C17296C.f55119a;
        Object obj2 = this.f8435q0;
        Object obj3 = this.f8434p0;
        Object obj4 = this.f8433o0;
        Object obj5 = this.f8436r0;
        switch (this.f8431Y) {
            case 0:
                C2751h view = (C2751h) obj;
                AbstractC16544l.m18094g(view, "view");
                if (((Boolean) ((InterfaceC5985X) obj3).getValue()).booleanValue()) {
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj2;
                    String str = (String) obj4;
                    InterfaceC5985X interfaceC5985X2 = (InterfaceC5985X) obj5;
                    if (AbstractC16544l.m18089b(str, (String) interfaceC5985X.getValue())) {
                        C14365u c14365u = (C14365u) interfaceC5985X2.getValue();
                        int i10 = C14365u.f45061k;
                        if (!(c14365u instanceof C14365u) || j10 != c14365u.f45062a) {
                            interfaceC5985X.setValue(str);
                            interfaceC5985X2.setValue(new C14365u(j10));
                            byte[] bytes = AbstractC21322p.m21711s0(str).toString().getBytes(C21307a.f67720a);
                            AbstractC16544l.m18093f(bytes, "getBytes(...)");
                            float f10 = 255;
                            view.evaluateJavascript(AbstractC0010F.m20d("renderLatex('", Base64.encodeToString(bytes, 2), "', '", String.format("#%02x%02x%02x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(AbstractC2119a.m3195i(C14365u.m15780h(j10) * f10)), Integer.valueOf(AbstractC2119a.m3195i(C14365u.m15779g(j10) * f10)), Integer.valueOf(AbstractC2119a.m3195i(C14365u.m15777e(j10) * f10)), Integer.valueOf(AbstractC2119a.m3195i(C14365u.m15776d(j10) * f10))}, 4)), "')"), null);
                        }
                    } else {
                        interfaceC5985X.setValue(str);
                        interfaceC5985X2.setValue(new C14365u(j10));
                        byte[] bytes2 = AbstractC21322p.m21711s0(str).toString().getBytes(C21307a.f67720a);
                        AbstractC16544l.m18093f(bytes2, "getBytes(...)");
                        float f11 = 255;
                        view.evaluateJavascript(AbstractC0010F.m20d("renderLatex('", Base64.encodeToString(bytes2, 2), "', '", String.format("#%02x%02x%02x%02x", Arrays.copyOf(new Object[]{Integer.valueOf(AbstractC2119a.m3195i(C14365u.m15780h(j10) * f11)), Integer.valueOf(AbstractC2119a.m3195i(C14365u.m15779g(j10) * f11)), Integer.valueOf(AbstractC2119a.m3195i(C14365u.m15777e(j10) * f11)), Integer.valueOf(AbstractC2119a.m3195i(C14365u.m15776d(j10) * f11))}, 4)), "')"), null);
                    }
                }
                return c17296c;
            case 1:
                C13430u action = (C13430u) obj;
                AbstractC16544l.m18094g(action, "$this$action");
                C10730t0 c10730t0 = (C10730t0) obj3;
                C10701g0 c10701g0 = (C10701g0) obj2;
                if (((C10696e1) obj4).m11025k(c10730t0) == EnumC19999a.f63314Y) {
                    action.f42521b = new C10704h0(this.f8432Z, AbstractC10708i1.m11027a(action, false), c10730t0.f31904v.f40859d, c10701g0.f31804p0, (C18428A) obj5);
                } else {
                    action.f42521b = new C10692d0(19, System.currentTimeMillis(), this.f8432Z, null, AbstractC10708i1.m11027a(action, false), c10701g0.f31804p0, (C18428A) obj5);
                }
                return c17296c;
            case 2:
                C18428A cameraProperties = (C18428A) obj;
                AbstractC16544l.m18094g(cameraProperties, "cameraProperties");
                C10696e1 c10696e1 = (C10696e1) obj3;
                ((C13421l) obj4).f42503Y.mo3400l().mo3393B(AbstractC8215v5.m8839a(c10696e1, new C2750g(c10696e1, (C10730t0) obj2, (C10701g0) obj5, cameraProperties, this.f8432Z, 1)));
                return c17296c;
            case 3:
                C16499b c16499b = (C16499b) obj4;
                return new C13800b(AbstractC8753z4.m9519g(((C13800b) obj).f43584a, AbstractC21073a0.m21558d(-1.0f, c16499b.m18063a()), this.f8432Z, new C1307e((C16484C) obj3, (C13801c) obj2, c16499b, (C16503f) obj5, 26)));
            default:
                C13770k animateDecay = (C13770k) obj;
                AbstractC16544l.m18094g(animateDecay, "$this$animateDecay");
                C16501d c16501d = (C16501d) obj4;
                C6002f0 c6002f0 = animateDecay.f43484e;
                C16524A c16524a = (C16524A) obj3;
                long jM15310k = C13800b.m15310k(((C13800b) c6002f0.getValue()).f43584a, c16524a.f51261Y);
                if (AbstractC8088f6.m8537c(jM15310k)) {
                    AbstractC14376f.m15833L((C17097f) obj2, 0.0f, jM15310k, c16501d.f51186c, 5);
                    c16524a.f51261Y = ((C13800b) c6002f0.getValue()).f43584a;
                    return c17296c;
                }
                C17309l[] c17309lArr = {new C17309l("value", c6002f0.getValue()), new C17309l("previous", new C13800b(c16524a.f51261Y)), new C17309l("velocity", new C7550o(j10))};
                C21585H c21585h = C16484C.f51133q;
                throw new IllegalStateException(AbstractC10763a.m11055m("Can't fling with an invalid pan = ", C13800b.m15313n(jM15310k), ". ", ((C16484C) obj5).m18053f(c17309lArr)).toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2750g(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        super(1);
        this.f8431Y = i10;
        this.f8433o0 = obj;
        this.f8434p0 = obj2;
        this.f8435q0 = obj3;
        this.f8436r0 = obj4;
        this.f8432Z = j10;
    }
}
