package p870le;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1440o;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.AbstractC4141u3;
import p229J0.AbstractC4160x4;
import p229J0.C4135t3;
import p229J0.C4172z4;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.InterfaceC13499q;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17780r;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: le.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C16871b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C16871b f54145Z = new C16871b(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C16871b f54146o0 = new C16871b(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C16871b f54147p0 = new C16871b(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C16871b f54148q0 = new C16871b(3, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C16871b f54149r0 = new C16871b(3, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C16871b f54150s0 = new C16871b(3, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54151Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16871b(int i10, int i11) {
        super(i10);
        this.f54151Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f54151Y) {
            case 0:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b("Toggle web", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 6, 0, 131070);
                }
                break;
            case 1:
                InterfaceC17783s0 Button2 = (InterfaceC17783s0) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button2, "$this$Button");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b("Toggle editing", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 6, 0, 131070);
                }
                break;
            case 2:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                AbstractC17758g.m19482b((C6021p) obj2, AbstractC10844c.m11256p(C10456n.f30959Y, AbstractC7313q.f23199d));
                break;
            case 3:
                InterfaceC17783s0 Button3 = (InterfaceC17783s0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button3, "$this$Button");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b("Toggle web", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 6, 0, 131070);
                }
                break;
            case 4:
                InterfaceC17783s0 Button4 = (InterfaceC17783s0) obj;
                C6021p c6021p4 = (C6021p) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button4, "$this$Button");
                if ((iIntValue4 & 17) == 16 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC4124r4.m4768b("Toggle editing", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p4, 6, 0, 131070);
                }
                break;
            default:
                C4172z4 TooltipBox = (C4172z4) obj;
                C6021p c6021p5 = (C6021p) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(TooltipBox, "$this$TooltipBox");
                InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(C10456n.f30959Y, AbstractC7313q.f23198c);
                InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
                int i10 = c6021p5.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p5.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p5, interfaceC10459qM11233k);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i = C21698j.f68869b;
                c6021p5.m6528W();
                if (c6021p5.f19563O) {
                    c6021p5.m6549l(c21696i);
                } else {
                    c6021p5.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p5, interfaceC21057KM19511e);
                C5997d.m6439Z(C21698j.f68872e, c6021p5, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p5.f19563O || !AbstractC16544l.m18089b(c6021p5.m6514H(), Integer.valueOf(i10))) {
                    AbstractC0168G.m537z(i10, c6021p5, i10, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p5, interfaceC10459qM10923d);
                AbstractC3984T1.m4698q(TooltipBox, null, AbstractC4160x4.f13485a, ((C4135t3) c6021p5.m6548k(AbstractC4141u3.f13417a)).f13379c, 0L, 0L, 0.0f, 0.0f, AbstractC16879f.f54173a, c6021p5, (iIntValue5 & 14) | 100663296, 121);
                c6021p5.m6553p(true);
                break;
        }
        return C17296C.f55119a;
    }
}
