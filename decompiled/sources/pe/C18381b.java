package pe;

import androidx.compose.foundation.layout.AbstractC10842a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1439n;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p328N1.C5609y;
import p349O0.C5984W0;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p774h1.C14365u;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;

/* JADX INFO: renamed from: pe.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18381b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final C18381b f58655Y = new C18381b(2);

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C6021p c6021p = (C6021p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            InterfaceC10459q interfaceC10459qM11233k = AbstractC10842a.m11233k(C10456n.f30959Y, AbstractC7313q.f23199d);
            C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p, 0);
            int i10 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459qM11233k);
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
            String strM8676d = AbstractC8142m4.m8676d(R.string.conversation_screenshot_detected_snackbar_title, c6021p);
            C5984W0 c5984w0 = AbstractC3947L4.f12183a;
            AbstractC4124r4.m4768b(strM8676d, null, 0L, 0L, null, C5609y.f18157t0, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12153i, c6021p, 196608, 0, 65502);
            AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_screenshot_detected_snackbar_subtitle, c6021p), null, C14365u.f45053c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(c5984w0)).f12155k, c6021p, 384, 0, 65530);
            c6021p.m6553p(true);
        }
        return C17296C.f55119a;
    }
}
