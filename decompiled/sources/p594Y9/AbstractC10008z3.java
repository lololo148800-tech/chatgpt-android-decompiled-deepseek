package p594Y9;

import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.AbstractC10844c;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Iterator;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17632f;
import p033B5.InterfaceC0832p;
import p1113xn.C21307a;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3959O0;
import p229J0.C3949M0;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p374P5.C6351d;
import p374P5.C6354g;
import p404Qe.C6679o;
import p420R5.C6812c;
import p478Tc.AbstractC7312p;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC8126k4;
import p579Xh.InterfaceC9514a;
import p635a1.C10456n;
import p774h1.AbstractC14334L;
import p774h1.C14356l;
import p774h1.C14358n;
import p919o8.C17979i1;

/* JADX INFO: renamed from: Y9.z3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10008z3 {
    /* JADX INFO: renamed from: a */
    public static final void m10646a(String icon, C6021p c6021p, int i10) {
        int i11;
        Object next;
        Object objM19235b;
        InterfaceC0832p interfaceC0832pMo3165c;
        AbstractC16544l.m18094g(icon, "icon");
        c6021p.m6526U(1476560040);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(icon) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6538d(R.drawable.gpt_default) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(-1586515976);
            boolean z6 = (i11 & 14) == 4;
            Object objM6514H = c6021p.m6514H();
            if (z6 || objM6514H == C6013l.f19514a) {
                objM6514H = icon.getBytes(C21307a.f67720a);
                AbstractC16544l.m18093f(objM6514H, "getBytes(...)");
                c6021p.m6537c0(objM6514H);
            }
            c6021p.m6553p(false);
            C6351d c6351d = new C6351d((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b));
            c6351d.f20623c = (byte[]) objM6514H;
            c6351d.f20626f = new C6812c();
            C6354g c6354gM6972a = c6351d.m6972a();
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
            long j10 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s;
            AbstractC7881F0.m8163b(c6354gM6972a, null, interfaceC0832pMo3165c, AbstractC10844c.m11252l(C10456n.f30959Y, AbstractC7312p.f23186c), null, AbstractC8126k4.m8631b(R.drawable.gpt_default, c6021p, (i11 >> 3) & 14), null, null, null, null, null, new C14356l(j10, 5, Build.VERSION.SDK_INT >= 29 ? C14358n.f45047a.m15769a(j10, 5) : new PorterDuffColorFilter(AbstractC14334L.m15617F(j10), AbstractC14334L.m15621J(5))), c6021p, 3120, 0, 57296);
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C6679o(icon, i10, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C17979i1 m10647b(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("referrer");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            String url = c3676s.m4395w("url").mo4384r();
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w(DiagnosticsEntry.NAME_KEY);
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC16544l.m18093f(id2, "id");
            AbstractC16544l.m18093f(url, "url");
            return new C17979i1(id2, strMo4384r, url, strMo4384r2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type ResourceEventView", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type ResourceEventView", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type ResourceEventView", e12);
        }
    }
}
