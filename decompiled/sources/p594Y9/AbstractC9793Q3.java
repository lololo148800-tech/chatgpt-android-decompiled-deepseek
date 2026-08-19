package p594Y9;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.openai.chatgpt.R;
import com.openai.design.AbstractC12220a;
import java.util.ArrayList;
import java.util.Iterator;
import ki.AbstractC16421b;
import ni.C17632f;
import p025An.C0644w;
import p033B5.InterfaceC0832p;
import p1051v0.AbstractC20417e;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p229J0.AbstractC3959O0;
import p229J0.C3949M0;
import p257K3.C4535c;
import p349O0.C6018n0;
import p349O0.C6021p;
import p523V9.AbstractC7881F0;
import p523V9.AbstractC8079e5;
import p523V9.AbstractC8126k4;
import p523V9.AbstractC8191s5;
import p547Wc.C8799i0;
import p579Xh.InterfaceC9514a;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14341T;
import p774h1.C14356l;
import p774h1.C14358n;
import p774h1.C14365u;
import p882m1.AbstractC17140a;
import p895n1.AbstractC17418F;
import p895n1.AbstractC17421a;
import p895n1.C17424d;
import p895n1.C17425e;
import p919o8.C17881A1;
import p919o8.C17923O1;
import p919o8.C18009s1;
import p919o8.C18030z1;

/* JADX INFO: renamed from: Y9.Q3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9793Q3 {
    /* JADX INFO: renamed from: a */
    public static final void m10411a(String str, boolean z6, InterfaceC10459q interfaceC10459q, String str2, long j10, C6021p c6021p, int i10) {
        int i11;
        int i12;
        long j11;
        String str3;
        AbstractC17140a abstractC17140aM19116c;
        Object obj;
        Object objM19235b;
        InterfaceC0832p interfaceC0832pMo3165c;
        String str4;
        long j12;
        c6021p.m6526U(205188364);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6544g(z6) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 256 : 128;
        }
        int i13 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i13 = i11 | 11264;
        }
        if ((i13 & 9363) == 9362 && c6021p.m6562y()) {
            c6021p.m6517L();
            str4 = str2;
            j12 = j10;
        } else {
            c6021p.m6519N();
            if ((i10 & 1) == 0 || c6021p.m6561x()) {
                i12 = i13 & (-57345);
                j11 = ((C3949M0) c6021p.m6548k(AbstractC3959O0.f12302a)).f12237s;
                str3 = null;
            } else {
                c6021p.m6517L();
                i12 = i13 & (-57345);
                str3 = str2;
                j11 = j10;
            }
            c6021p.m6554q();
            if (z6) {
                c6021p.m6524S(1790559240);
                abstractC17140aM19116c = AbstractC8126k4.m8631b(R.drawable.suitcase_outlined, c6021p, 0);
                c6021p.m6553p(false);
            } else {
                if (z6) {
                    c6021p.m6524S(1790523702);
                    c6021p.m6553p(false);
                    throw new C0644w();
                }
                c6021p.m6524S(1790561545);
                C17425e c17425eM19122b = AbstractC8191s5.f25637a;
                if (c17425eM19122b == null) {
                    C17424d c17424d = new C17424d("Outlined.AccountCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i14 = AbstractC17418F.f55636a;
                    long j13 = C14365u.f45052b;
                    C14341T c14341t = new C14341T(j13);
                    C4535c c4535c = new C4535c(3);
                    c4535c.m5290p(12.0f, 2.0f);
                    c4535c.m5283i(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                    c4535c.m5292r(4.48f, 10.0f, 10.0f, 10.0f);
                    c4535c.m5292r(10.0f, -4.48f, 10.0f, -10.0f);
                    c4535c.m5291q(17.52f, 2.0f, 12.0f, 2.0f);
                    c4535c.m5282h();
                    c4535c.m5290p(7.35f, 18.5f);
                    c4535c.m5283i(8.66f, 17.56f, 10.26f, 17.0f, 12.0f, 17.0f);
                    c4535c.m5292r(3.34f, 0.56f, 4.65f, 1.5f);
                    c4535c.m5283i(15.34f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f);
                    c4535c.m5291q(8.66f, 19.44f, 7.35f, 18.5f);
                    c4535c.m5282h();
                    c4535c.m5290p(18.14f, 17.12f);
                    c4535c.m5288n(18.14f, 17.12f);
                    c4535c.m5283i(16.45f, 15.8f, 14.32f, 15.0f, 12.0f, 15.0f);
                    c4535c.m5292r(-4.45f, 0.8f, -6.14f, 2.12f);
                    c4535c.m5289o(0.0f, 0.0f);
                    c4535c.m5283i(4.7f, 15.73f, 4.0f, 13.95f, 4.0f, 12.0f);
                    c4535c.m5284j(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
                    c4535c.m5292r(8.0f, 3.58f, 8.0f, 8.0f);
                    c4535c.m5283i(20.0f, 13.95f, 19.3f, 15.73f, 18.14f, 17.12f);
                    c4535c.m5282h();
                    C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
                    C14341T c14341t2 = new C14341T(j13);
                    C4535c c4535c2 = new C4535c(3);
                    c4535c2.m5290p(12.0f, 6.0f);
                    c4535c2.m5284j(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
                    c4535c2.m5291q(10.07f, 13.0f, 12.0f, 13.0f);
                    c4535c2.m5292r(3.5f, -1.57f, 3.5f, -3.5f);
                    c4535c2.m5291q(13.93f, 6.0f, 12.0f, 6.0f);
                    c4535c2.m5282h();
                    c4535c2.m5290p(12.0f, 11.0f);
                    c4535c2.m5284j(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
                    c4535c2.m5291q(11.17f, 8.0f, 12.0f, 8.0f);
                    c4535c2.m5292r(1.5f, 0.67f, 1.5f, 1.5f);
                    c4535c2.m5291q(12.83f, 11.0f, 12.0f, 11.0f);
                    c4535c2.m5282h();
                    C17424d.m19121a(c17424d, c4535c2.f14813Z, 0, c14341t2, null, 1.0f, 0, 2, 1.0f);
                    c17425eM19122b = c17424d.m19122b();
                    AbstractC8191s5.f25637a = c17425eM19122b;
                }
                abstractC17140aM19116c = AbstractC17421a.m19116c(c17425eM19122b, c6021p);
                c6021p.m6553p(false);
            }
            AbstractC17140a abstractC17140aM14230a = AbstractC12220a.m14230a(abstractC17140aM19116c, new C14356l(j11, 5, Build.VERSION.SDK_INT >= 29 ? C14358n.f45047a.m15769a(j11, 5) : new PorterDuffColorFilter(AbstractC14334L.m15617F(j11), AbstractC14334L.m15621J(5))));
            c6021p.m6524S(617413469);
            Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it.next();
                if (next instanceof InterfaceC9514a) {
                    obj = next;
                    break;
                }
            }
            if (obj != null) {
                objM19235b = (InterfaceC9514a) obj;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(InterfaceC9514a.class);
                c6021p.m6553p(false);
            }
            InterfaceC9514a interfaceC9514a = (InterfaceC9514a) objM19235b;
            if (interfaceC9514a == null || (interfaceC0832pMo3165c = interfaceC9514a.mo3165c()) == null) {
                throw new IllegalStateException("No ImageLoader");
            }
            AbstractC7881F0.m8163b(str, str3, interfaceC0832pMo3165c, AbstractC8079e5.m8501a(interfaceC10459q, AbstractC20417e.f64539a), abstractC17140aM14230a, abstractC17140aM14230a, null, null, null, null, null, null, c6021p, (i12 & 14) | ((i12 >> 6) & 112), 0, 65472);
            str4 = str3;
            j12 = j11;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C8799i0(str, z6, interfaceC10459q, str4, j12, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C18030z1 m10412b(C3676s c3676s) {
        ArrayList arrayList;
        try {
            long jMo4382p = c3676s.m4395w("format_version").mo4382p();
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w(ParameterNames.SESSION);
            C17881A1 c17881a1M10418d = abstractC3673pM4395w != null ? AbstractC9798R3.m10418d(abstractC3673pM4395w.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("configuration");
            C18009s1 c18009s1M10351d = abstractC3673pM4395w2 != null ? AbstractC9751J3.m10351d(abstractC3673pM4395w2.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("browser_sdk_version");
            String strMo4384r = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            long jMo4382p2 = c3676s.m4395w("document_version").mo4382p();
            AbstractC3673p abstractC3673pM4395w4 = c3676s.m4395w("page_states");
            if (abstractC3673pM4395w4 != null) {
                ArrayList arrayList2 = abstractC3673pM4395w4.m4389j().f11172Y;
                arrayList = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC9860b4.m10512a(((AbstractC3673p) it.next()).m4390m()));
                }
            } else {
                arrayList = null;
            }
            AbstractC3673p abstractC3673pM4395w5 = c3676s.m4395w("replay_stats");
            C17923O1 c17923o1M10530a = abstractC3673pM4395w5 != null ? AbstractC9874d4.m10530a(abstractC3673pM4395w5.m4390m()) : null;
            if (jMo4382p == 2) {
                return new C18030z1(c17881a1M10418d, c18009s1M10351d, strMo4384r, jMo4382p2, arrayList, c17923o1M10530a);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Dd", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Dd", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Dd", e12);
        }
    }
}
