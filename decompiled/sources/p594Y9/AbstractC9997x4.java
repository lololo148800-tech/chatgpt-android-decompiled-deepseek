package p594Y9;

import androidx.compose.foundation.AbstractC10833a;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.foundation.layout.FillElement;
import com.openai.chatgpt.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17632f;
import p003A1.AbstractC0168G;
import p033B5.InterfaceC0832p;
import p042Bf.C1262d;
import p1016t3.C19753C;
import p1073w3.AbstractC20800b;
import p1095x1.C21088i;
import p1095x1.C21089j;
import p1095x1.InterfaceC21057K;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21965U0;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p479Td.AbstractC7343b0;
import p479Td.C7315A;
import p479Td.C7373x;
import p482Tg.C7444b;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC8087f5;
import p523V9.AbstractC8142m4;
import p571X9.AbstractC9393x3;
import p579Xh.InterfaceC9514a;
import p589Y3.C9643a;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p911o0.AbstractC17780r;

/* JADX INFO: renamed from: Y9.x4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9997x4 {
    /* JADX INFO: renamed from: a */
    public static final void m10638a(String str, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        Object next;
        Object objM19235b;
        InterfaceC0832p interfaceC0832pMo3165c;
        c6021p.m6526U(1547446248);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            String strM8676d = AbstractC8142m4.m8676d(R.string.voice_images_attachment_icon_description, c6021p);
            C21088i c21088i = C21089j.f67011Z;
            c6021p.m6524S(617413469);
            Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof InterfaceC9514a));
            if (next != null) {
                objM19235b = (InterfaceC9514a) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                c6021p.m6553p(false);
            }
            InterfaceC9514a interfaceC9514a = (InterfaceC9514a) objM19235b;
            if (interfaceC9514a == null || (interfaceC0832pMo3165c = interfaceC9514a.mo3165c()) == null) {
                throw new IllegalStateException("No ImageLoader");
            }
            AbstractC7881F0.m8164c(str, strM8676d, interfaceC0832pMo3165c, interfaceC10459q, c21088i, c6021p, ((i11 << 6) & 7168) | 12582912, 3952);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C7444b(str, interfaceC10459q, i10, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10639b(int i10, C6021p c6021p, InterfaceC10459q interfaceC10459q, List list) {
        c6021p.m6526U(-1231236942);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6542f(interfaceC10459q) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6545h(list) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            C17689w c17689w = C17689w.f56480Y;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC7343b0 abstractC7343b0 = (AbstractC7343b0) it.next();
                AbstractC17686t.m19398v(abstractC7343b0 instanceof C7315A ? ((C7315A) abstractC7343b0).f23212c : abstractC7343b0 instanceof C7373x ? AbstractC9393x3.m9974d(((C7373x) abstractC7343b0).f23373c) : c17689w, arrayList);
            }
            float f10 = arrayList.size() >= 2 ? -10.0f : 0.0f;
            InterfaceC21057K interfaceC21057KM19511e = AbstractC17780r.m19511e(C10444b.f30934Y, false);
            int i12 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, interfaceC21057KM19511e);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i12))) {
                AbstractC0168G.m537z(i12, c6021p, i12, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            c6021p.m6524S(-229466651);
            for (int i13 = 0; i13 < 2; i13++) {
                C21965U0 c21965u0 = (C21965U0) AbstractC17680n.m19344T(i13, arrayList);
                String str = c21965u0 != null ? c21965u0.f69534a : null;
                if (i13 == 0) {
                    c6021p.m6524S(1476595978);
                    if (str != null) {
                        FillElement fillElement = AbstractC10844c.f32512c;
                        m10638a(str, AbstractC8087f5.m8534c(fillElement, f10), c6021p, 0);
                        if (arrayList.size() >= 2) {
                            AbstractC17780r.m19507a(AbstractC10833a.m11207b(AbstractC8087f5.m8534c(fillElement, f10), C14365u.m15774b(0.5f, C14365u.f45052b), AbstractC14334L.f44973a), c6021p, 0);
                        }
                    }
                    c6021p.m6553p(false);
                } else if (i13 != 1) {
                    c6021p.m6524S(1477707793);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(1477344101);
                    if (str != null) {
                        m10638a(str, AbstractC8087f5.m8534c(AbstractC10844c.f32512c, 10.0f), c6021p, 48);
                    }
                    c6021p.m6553p(false);
                }
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C1262d(interfaceC10459q, list, i10);
        }
    }

    /* JADX INFO: renamed from: c */
    public C19753C m10640c(C9643a c9643a) {
        ByteBuffer byteBuffer = c9643a.f2226q0;
        byteBuffer.getClass();
        AbstractC20800b.m21316d(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo10641d(c9643a, byteBuffer);
    }

    /* JADX INFO: renamed from: d */
    public abstract C19753C mo10641d(C9643a c9643a, ByteBuffer byteBuffer);
}
