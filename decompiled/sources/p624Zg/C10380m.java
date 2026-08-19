package p624Zg;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p204I1.C3582M;
import p225Im.AbstractC3751J;
import p229J0.AbstractC3878A1;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p257K3.C4535c;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7312p;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC7973Q4;
import p523V9.AbstractC8142m4;
import p523V9.AbstractC8199t5;
import p523V9.AbstractC8207u5;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p705dd.EnumC13068a;
import p774h1.AbstractC14334L;
import p774h1.C14341T;
import p774h1.C14365u;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17777p0;
import p911o0.AbstractC17788v;
import p911o0.C17781r0;
import p911o0.C17790w;

/* JADX INFO: renamed from: Zg.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C10380m extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public static final C10380m f30757Z = new C10380m(2, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10380m f30758o0 = new C10380m(2, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10380m f30759p0 = new C10380m(2, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C10380m f30760q0 = new C10380m(2, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C10380m f30761r0 = new C10380m(2, 4);

    /* JADX INFO: renamed from: s0 */
    public static final C10380m f30762s0 = new C10380m(2, 5);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30763Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10380m(int i10, int i11) {
        super(i10);
        this.f30763Y = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C10456n c10456n = C10456n.f30959Y;
        C17296C c17296c = C17296C.f55119a;
        switch (this.f30763Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.subscriptions_choose_plan_screen_title, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC7973Q4.m8271a(EnumC13068a.Short, null, c6021p2, 6);
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23198c));
                    AbstractC7973Q4.m8271a(EnumC13068a.Long, null, c6021p2, 6);
                    float f10 = AbstractC7313q.f23201f;
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11245e(c10456n, f10));
                    AbstractC3984T1.m4685d(C10372i.f30733o0, AbstractC10844c.m11244d(c10456n, 1.0f), false, null, null, null, null, null, null, AbstractC10383o.f30771b, c6021p2, 805306806, 504);
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11245e(c10456n, f10));
                    AbstractC3984T1.m4695n(C10372i.f30734p0, AbstractC10844c.m11244d(c10456n, 1.0f), false, null, null, null, null, null, null, AbstractC10383o.f30772c, c6021p2, 805306422, 508);
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11245e(c10456n, f10));
                    c6021p2.m6524S(-761190967);
                    for (int i10 = 0; i10 < 5; i10++) {
                        C17781r0 c17781r0M19506b = AbstractC17777p0.m19506b(AbstractC17770m.f56724a, C10444b.f30944w0, c6021p2, 48);
                        int i11 = c6021p2.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p2.m6550m();
                        InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p2, c10456n);
                        InterfaceC21700k.f68875m0.getClass();
                        C21696i c21696i = C21698j.f68869b;
                        c6021p2.m6528W();
                        if (c6021p2.f19563O) {
                            c6021p2.m6549l(c21696i);
                        } else {
                            c6021p2.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p2, c17781r0M19506b);
                        C5997d.m6439Z(C21698j.f68872e, c6021p2, interfaceC6008i0M6550m);
                        C21694h c21694h = C21698j.f68874g;
                        if (c6021p2.f19563O || !AbstractC16544l.m18089b(c6021p2.m6514H(), Integer.valueOf(i11))) {
                            AbstractC0168G.m537z(i11, c6021p2, i11, c21694h);
                        }
                        C5997d.m6439Z(C21698j.f68871d, c6021p2, interfaceC10459qM10923d);
                        AbstractC3878A1.m4597b(AbstractC8207u5.m8831b(), null, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23185b), 0L, c6021p2, 48, 8);
                        AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11256p(c10456n, AbstractC7313q.f23199d));
                        AbstractC7973Q4.m8271a(EnumC13068a.Medium, null, c6021p2, 6);
                        c6021p2.m6553p(true);
                        AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23198c));
                    }
                    c6021p2.m6553p(false);
                    AbstractC17758g.m19482b(c6021p2, AbstractC10844c.m11245e(c10456n, AbstractC7313q.f23199d));
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                }
                break;
            case 3:
                C6021p c6021p4 = (C6021p) obj;
                if ((3 & ((Number) obj2).intValue()) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    C10456n c10456n2 = C10456n.f30959Y;
                    InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(c10456n2, AbstractC7313q.f23199d, AbstractC7313q.f23201f);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p4, 0);
                    int i12 = c6021p4.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m2 = c6021p4.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d2 = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11234l);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i2 = C21698j.f68869b;
                    c6021p4.m6528W();
                    if (c6021p4.f19563O) {
                        c6021p4.m6549l(c21696i2);
                    } else {
                        c6021p4.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p4, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p4, interfaceC6008i0M6550m2);
                    C21694h c21694h2 = C21698j.f68874g;
                    if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i12))) {
                        AbstractC0168G.m537z(i12, c6021p4, i12, c21694h2);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p4, interfaceC10459qM10923d2);
                    c6021p4.m6524S(553242620);
                    Iterator it = AbstractC10391w.f30799a.iterator();
                    while (it.hasNext()) {
                        AbstractC3751J.m4438c(((Number) it.next()).intValue(), c6021p4, 0);
                    }
                    c6021p4.m6553p(false);
                    AbstractC17758g.m19482b(c6021p4, AbstractC10842a.m11233k(c10456n2, AbstractC7313q.f23199d));
                    String strM8676d = AbstractC8142m4.m8676d(R.string.subscriptions_pro_terms_disclaimer, c6021p4);
                    C3582M c3582m = ((C3941K4) c6021p4.m6548k(AbstractC3947L4.f12183a)).f12155k;
                    AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11237o(c10456n2, AbstractC7313q.f23201f, 0.0f, 0.0f, 0.0f, 14), ((C3949M0) c6021p4.m6548k(AbstractC3959O0.f12302a)).f12237s, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c3582m, c6021p4, 0, 0, 65528);
                    c6021p4.m6553p(true);
                }
                break;
            case 4:
                C6021p c6021p5 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p5.m6562y()) {
                    c6021p5.m6517L();
                } else {
                    C17425e c17425eM19122b = AbstractC8199t5.f25643a;
                    if (c17425eM19122b == null) {
                        C17424d c17424d = new C17424d("Outlined.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = AbstractC17418F.f55636a;
                        C14341T c14341t = new C14341T(C14365u.f45052b);
                        C4535c c4535c = new C4535c(3);
                        c4535c.m5290p(12.0f, 2.0f);
                        c4535c.m5283i(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        c4535c.m5292r(4.48f, 10.0f, 10.0f, 10.0f);
                        c4535c.m5292r(10.0f, -4.48f, 10.0f, -10.0f);
                        c4535c.m5291q(17.52f, 2.0f, 12.0f, 2.0f);
                        c4535c.m5282h();
                        c4535c.m5290p(12.0f, 20.0f);
                        c4535c.m5284j(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
                        c4535c.m5292r(3.59f, -8.0f, 8.0f, -8.0f);
                        c4535c.m5292r(8.0f, 3.59f, 8.0f, 8.0f);
                        c4535c.m5292r(-3.59f, 8.0f, -8.0f, 8.0f);
                        c4535c.m5282h();
                        c4535c.m5290p(16.59f, 7.58f);
                        c4535c.m5288n(10.0f, 14.17f);
                        c4535c.m5289o(-2.59f, -2.58f);
                        c4535c.m5288n(6.0f, 13.0f);
                        c4535c.m5289o(4.0f, 4.0f);
                        c4535c.m5289o(8.0f, -8.0f);
                        c4535c.m5282h();
                        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                        c17425eM19122b = c17424d.m19122b();
                        AbstractC8199t5.f25643a = c17425eM19122b;
                    }
                    C17425e c17425e = c17425eM19122b;
                    AbstractC3878A1.m4597b(c17425e, null, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23186c), ((C3949M0) c6021p5.m6548k(AbstractC3959O0.f12302a)).f12213a, c6021p5, 48, 0);
                }
                break;
            default:
                C6021p c6021p6 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p6.m6562y()) {
                    c6021p6.m6517L();
                } else {
                    AbstractC3878A1.m4597b(AbstractC8207u5.m8831b(), null, AbstractC10844c.m11252l(c10456n, AbstractC7312p.f23186c), AbstractC14334L.m15626d(4282622080L), c6021p6, 3120, 0);
                }
                break;
        }
        return c17296c;
    }
}
