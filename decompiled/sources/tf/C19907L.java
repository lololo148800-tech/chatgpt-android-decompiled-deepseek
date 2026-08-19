package tf;

import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import cd.C11709i;
import com.openai.chatgpt.R;
import io.sentry.android.replay.capture.C15272c;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p003A1.InterfaceC0172H0;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1440o;
import p1039ud.AbstractC20196m;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p124Ei.C2461K0;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3984T1;
import p229J0.AbstractC4048f0;
import p229J0.AbstractC4101o;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C4042e0;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p349O0.InterfaceC5985X;
import p349O0.InterfaceC6008i0;
import p406Qg.C6690A;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p537W0.C8410b;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p789hg.C14505d;
import p911o0.AbstractC17758g;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17767k0;
import p911o0.C17790w;
import p911o0.C17794y;

/* JADX INFO: renamed from: tf.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C19907L extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63099Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f63100Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f63101o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f63102p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19907L(InterfaceC1426a interfaceC1426a, C11709i c11709i, InterfaceC5985X interfaceC5985X) {
        super(3);
        this.f63100Z = interfaceC1426a;
        this.f63101o0 = c11709i;
        this.f63102p0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C17296C c17296c = C17296C.f55119a;
        Object obj4 = this.f63102p0;
        C5975S c5975s = C6013l.f19514a;
        Object obj5 = this.f63101o0;
        InterfaceC1426a interfaceC1426a = this.f63100Z;
        switch (this.f63099Y) {
            case 0:
                C17794y ModalBottomSheet = (C17794y) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(ModalBottomSheet, "$this$ModalBottomSheet");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C10456n c10456n = C10456n.f30959Y;
                    float f10 = AbstractC7313q.f23201f;
                    InterfaceC10459q interfaceC10459qM11244d = AbstractC10844c.m11244d(AbstractC10842a.m11235m(c10456n, f10, 0.0f, 2), 1.0f);
                    C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
                    int i10 = c6021p.f19564P;
                    InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                    InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11244d);
                    InterfaceC21700k.f68875m0.getClass();
                    C21696i c21696i = C21698j.f68869b;
                    c6021p.m6528W();
                    if (c6021p.f19563O) {
                        c6021p.m6549l(c21696i);
                    } else {
                        c6021p.m6543f0();
                    }
                    C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
                    C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                    C21694h c21694h = C21698j.f68874g;
                    if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i10))) {
                        AbstractC0168G.m537z(i10, c6021p, i10, c21694h);
                    }
                    C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
                    String strM8676d = AbstractC8142m4.m8676d(R.string.conversations_prompt, c6021p);
                    long j10 = C14365u.f45055e;
                    AbstractC4124r4.m4768b(strM8676d, AbstractC10842a.m11237o(c10456n, 0.0f, 0.0f, 0.0f, AbstractC7313q.f23202g, 7), j10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12152h, c6021p, 384, 0, 65528);
                    String str = (String) obj5;
                    AbstractC4124r4.m4768b(str, null, AbstractC19908M.f63103a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 384, 0, 131066);
                    c6021p.m6524S(-524131243);
                    InterfaceC0172H0 interfaceC0172H0 = (InterfaceC0172H0) obj4;
                    boolean zM6545h = c6021p.m6545h(interfaceC0172H0) | c6021p.m6542f(str) | c6021p.m6542f(interfaceC1426a);
                    Object objM6514H = c6021p.m6514H();
                    if (zM6545h || objM6514H == c5975s) {
                        objM6514H = new C15272c(interfaceC0172H0, str, interfaceC1426a, 25);
                        c6021p.m6537c0(objM6514H);
                    }
                    InterfaceC1426a interfaceC1426a2 = (InterfaceC1426a) objM6514H;
                    c6021p.m6553p(false);
                    InterfaceC10459q interfaceC10459qM11244d2 = AbstractC10844c.m11244d(AbstractC10842a.m11235m(c10456n, 0.0f, f10, 1), 1.0f);
                    C17767k0 c17767k0 = AbstractC4048f0.f12769a;
                    C4042e0 c4042e0M4733b = AbstractC4048f0.m4733b(j10, C14365u.f45052b, c6021p, 12);
                    c6021p.m6524S(-524122053);
                    boolean zM6542f = c6021p.m6542f(interfaceC1426a2);
                    Object objM6514H2 = c6021p.m6514H();
                    if (zM6542f || objM6514H2 == c5975s) {
                        objM6514H2 = new C14505d(27, interfaceC1426a2);
                        c6021p.m6537c0(objM6514H2);
                    }
                    c6021p.m6553p(false);
                    AbstractC3984T1.m4685d((InterfaceC1426a) objM6514H2, interfaceC10459qM11244d2, false, null, c4042e0M4733b, null, null, null, null, AbstractC19919d.f63175a, c6021p, 805306368, 492);
                    AbstractC17758g.m19482b(c6021p, AbstractC10844c.m11245e(c10456n, f10));
                    c6021p.m6553p(true);
                }
                break;
            default:
                C17794y DropdownMenuWithTapOffset = (C17794y) obj;
                C6021p c6021p2 = (C6021p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(DropdownMenuWithTapOffset, "$this$DropdownMenuWithTapOffset");
                if ((iIntValue2 & 17) == 16 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C8410b c8410b = AbstractC20196m.f63957a;
                    c6021p2.m6524S(1304462743);
                    C11709i c11709i = (C11709i) obj5;
                    boolean zM6542f2 = c6021p2.m6542f(interfaceC1426a) | c6021p2.m6545h(c11709i);
                    Object objM6514H3 = c6021p2.m6514H();
                    if (zM6542f2 || objM6514H3 == c5975s) {
                        objM6514H3 = new C2461K0(interfaceC1426a, c11709i, 3);
                        c6021p2.m6537c0(objM6514H3);
                    }
                    c6021p2.m6553p(false);
                    AbstractC4101o.m4761b(c8410b, (InterfaceC1426a) objM6514H3, null, AbstractC20196m.f63958b, null, false, null, null, null, c6021p2, 3078, 500);
                    C8410b c8410b2 = AbstractC20196m.f63959c;
                    c6021p2.m6524S(1304476641);
                    InterfaceC5985X interfaceC5985X = (InterfaceC5985X) obj4;
                    boolean zM6542f3 = c6021p2.m6542f(interfaceC5985X) | c6021p2.m6545h(c11709i);
                    Object objM6514H4 = c6021p2.m6514H();
                    if (zM6542f3 || objM6514H4 == c5975s) {
                        objM6514H4 = new C6690A(c11709i, interfaceC5985X, 1);
                        c6021p2.m6537c0(objM6514H4);
                    }
                    c6021p2.m6553p(false);
                    AbstractC4101o.m4761b(c8410b2, (InterfaceC1426a) objM6514H4, null, AbstractC20196m.f63960d, null, false, null, null, null, c6021p2, 3078, 500);
                }
                break;
        }
        return c17296c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19907L(String str, InterfaceC0172H0 interfaceC0172H0, InterfaceC1426a interfaceC1426a) {
        super(3);
        this.f63101o0 = str;
        this.f63102p0 = interfaceC0172H0;
        this.f63100Z = interfaceC1426a;
    }
}
