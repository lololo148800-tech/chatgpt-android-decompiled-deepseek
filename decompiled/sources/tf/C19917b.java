package tf;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10842a;
import androidx.compose.foundation.layout.AbstractC10844c;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1440o;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p328N1.C5609y;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p478Tc.AbstractC7302f;
import p478Tc.AbstractC7313q;
import p523V9.AbstractC8142m4;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p736f0.InterfaceC13499q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p911o0.AbstractC17770m;
import p911o0.AbstractC17788v;
import p911o0.C17790w;
import p911o0.InterfaceC17783s0;

/* JADX INFO: renamed from: tf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C19917b extends AbstractC16546n implements InterfaceC1440o {

    /* JADX INFO: renamed from: Z */
    public static final C19917b f63156Z = new C19917b(3, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19917b f63157o0 = new C19917b(3, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C19917b f63158p0 = new C19917b(3, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C19917b f63159q0 = new C19917b(3, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63160Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19917b(int i10, int i11) {
        super(i10);
        this.f63160Y = i11;
    }

    @Override // p049Bm.InterfaceC1440o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f63160Y) {
            case 0:
                InterfaceC17783s0 Button = (InterfaceC17783s0) obj;
                C6021p c6021p = (C6021p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button, "$this$Button");
                if ((iIntValue & 17) == 16 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_cancel_button, c6021p), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12159o, c6021p, 0, 0, 65534);
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
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversation_image_edit_next, c6021p2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12159o, c6021p2, 0, 0, 65534);
                }
                break;
            case 2:
                InterfaceC17783s0 Button3 = (InterfaceC17783s0) obj;
                C6021p c6021p3 = (C6021p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC16544l.m18094g(Button3, "$this$Button");
                if ((iIntValue3 & 17) == 16 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.conversations_copy_prompt, c6021p3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p3, 0, 0, 131070);
                }
                break;
            default:
                InterfaceC13499q AnimatedVisibility = (InterfaceC13499q) obj;
                C6021p c6021p4 = (C6021p) obj2;
                ((Number) obj3).intValue();
                AbstractC16544l.m18094g(AnimatedVisibility, "$this$AnimatedVisibility");
                InterfaceC10459q interfaceC10459qM11234l = AbstractC10842a.m11234l(AbstractC10833a.m11207b(AbstractC10844c.m11244d(C10456n.f30959Y, 1.0f), C14365u.f45055e, AbstractC14334L.f44973a), AbstractC7313q.f23201f, AbstractC7313q.f23199d);
                C17790w c17790wM19515a = AbstractC17788v.m19515a(AbstractC17770m.f56726c, C10444b.f30946y0, c6021p4, 0);
                int i10 = c6021p4.f19564P;
                InterfaceC6008i0 interfaceC6008i0M6550m = c6021p4.m6550m();
                InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p4, interfaceC10459qM11234l);
                InterfaceC21700k.f68875m0.getClass();
                C21696i c21696i = C21698j.f68869b;
                c6021p4.m6528W();
                if (c6021p4.f19563O) {
                    c6021p4.m6549l(c21696i);
                } else {
                    c6021p4.m6543f0();
                }
                C5997d.m6439Z(C21698j.f68873f, c6021p4, c17790wM19515a);
                C5997d.m6439Z(C21698j.f68872e, c6021p4, interfaceC6008i0M6550m);
                C21694h c21694h = C21698j.f68874g;
                if (c6021p4.f19563O || !AbstractC16544l.m18089b(c6021p4.m6514H(), Integer.valueOf(i10))) {
                    AbstractC0168G.m537z(i10, c6021p4, i10, c21694h);
                }
                C5997d.m6439Z(C21698j.f68871d, c6021p4, interfaceC10459qM10923d);
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.image_share_modal_link_preview_title, c6021p4), null, 0L, 0L, null, C5609y.f18157t0, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p4, 196608, 0, 131038);
                AbstractC4124r4.m4768b(AbstractC8142m4.m8676d(R.string.image_share_modal_link_preview_subtitle, c6021p4), null, AbstractC7302f.m7772a(c6021p4), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p4, 0, 0, 131066);
                c6021p4.m6553p(true);
                break;
        }
        return C17296C.f55119a;
    }
}
