package p523V9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.net.Uri;
import com.openai.chatgpt.R;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import ni.C17632f;
import p025An.C0644w;
import p033B5.InterfaceC0832p;
import p1095x1.C21089j;
import p1113xn.AbstractC21322p;
import p257K3.C4535c;
import p349O0.C6018n0;
import p349O0.C6021p;
import p482Tg.C7444b;
import p571X9.AbstractC9233X;
import p579Xh.InterfaceC9514a;
import p635a1.InterfaceC10459q;
import p774h1.C14341T;
import p774h1.C14365u;
import p882m1.AbstractC17140a;
import p895n1.AbstractC17418F;
import p895n1.C17424d;
import p895n1.C17425e;

/* JADX INFO: renamed from: V9.D5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7870D5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f24776a;

    /* JADX INFO: renamed from: a */
    public static final void m8147a(String str, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        Object objM9806b;
        Object objM19235b;
        InterfaceC0832p interfaceC0832pMo3165c;
        c6021p.m6526U(-321590011);
        int i11 = (i10 & 6) == 0 ? (c6021p.m6542f(str) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (str == null) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C7444b(str, interfaceC10459q, i10, 1);
                    return;
                }
                return;
            }
            try {
                objM9806b = Uri.parse(m8149c(str)).getHost();
            } catch (Throwable th2) {
                objM9806b = AbstractC9233X.m9806b(th2);
            }
            Object obj = null;
            if (objM9806b instanceof C17311n) {
                objM9806b = null;
            }
            String str2 = (String) objM9806b;
            String strM11054l = AbstractC10763a.m11054l("https://www.google.com/s2/favicons?domain=", str2, "&sz=128");
            if (str2 == null) {
                strM11054l = null;
            }
            AbstractC17140a abstractC17140aM8631b = AbstractC8126k4.m8631b(R.drawable.explore, c6021p, 0);
            AbstractC17140a abstractC17140aM8631b2 = AbstractC8126k4.m8631b(R.drawable.explore, c6021p, 0);
            c6021p.m6524S(617413469);
            for (Object obj2 : (Iterable) c6021p.m6548k(AbstractC16421b.f50950a)) {
                if (obj2 instanceof InterfaceC9514a) {
                    obj = obj2;
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
            AbstractC7881F0.m8163b(strM11054l, null, interfaceC0832pMo3165c, interfaceC10459q, null, abstractC17140aM8631b, abstractC17140aM8631b2, null, null, null, C21089j.f67012o0, null, c6021p, ((i12 << 6) & 7168) | 48, 48, 63376);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C7444b(str, interfaceC10459q, i10, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C17425e m8148b() {
        C17425e c17425e = f24776a;
        if (c17425e != null) {
            return c17425e;
        }
        C17424d c17424d = new C17424d("Outlined.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = AbstractC17418F.f55636a;
        C14341T c14341t = new C14341T(C14365u.f45052b);
        C4535c c4535c = new C4535c(3);
        c4535c.m5290p(17.65f, 6.35f);
        c4535c.m5283i(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        c4535c.m5284j(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        c4535c.m5292r(3.57f, 8.0f, 7.99f, 8.0f);
        c4535c.m5284j(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        c4535c.m5287m(-2.08f);
        c4535c.m5284j(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        c4535c.m5284j(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        c4535c.m5292r(2.69f, -6.0f, 6.0f, -6.0f);
        c4535c.m5284j(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        c4535c.m5288n(13.0f, 11.0f);
        c4535c.m5287m(7.0f);
        c4535c.m5293s(4.0f);
        c4535c.m5289o(-2.35f, 2.35f);
        c4535c.m5282h();
        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, null, 1.0f, 0, 2, 1.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f24776a = c17425eM19122b;
        return c17425eM19122b;
    }

    /* JADX INFO: renamed from: c */
    public static final String m8149c(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        boolean zM21667A = AbstractC21322p.m21667A(str, "://", false);
        if (zM21667A) {
            return str;
        }
        if (zM21667A) {
            throw new C0644w();
        }
        return "https://".concat(str);
    }
}
