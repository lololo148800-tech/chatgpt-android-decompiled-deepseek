package p666bl;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import io.ktor.utils.p815io.C15085k;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import ml.AbstractC17288f;
import mm.C17296C;
import p008A6.C0383c;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0613g0;
import p103Dn.C2210v;
import p1111xl.C21296a;
import p1113xn.C21307a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p251Jn.C4485a;
import p457Sh.C7136d;
import p523V9.AbstractC7995T3;
import p523V9.AbstractC8003U3;
import p544W9.AbstractC8627e4;
import p544W9.AbstractC8699q4;
import p582Xk.C9526c;
import p594Y9.AbstractC9949p4;
import p754fl.C13693c;
import p754fl.InterfaceC13692b;
import p857kl.AbstractC16435B;
import p857kl.C16460h;
import sl.C19666a;

/* JADX INFO: renamed from: bl.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11497m {

    /* JADX INFO: renamed from: a */
    public static final C19666a f34800a;

    /* JADX INFO: renamed from: b */
    public static final C19666a f34801b;

    /* JADX INFO: renamed from: c */
    public static final C9526c f34802c;

    static {
        InterfaceC3777y interfaceC3777yM18075c;
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C11488d.class);
        InterfaceC3777y interfaceC3777yM18075c2 = null;
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C11488d.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        f34800a = new C19666a("CallLogger", new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c));
        InterfaceC3756d interfaceC3756dMo5693b2 = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c2 = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused2) {
        }
        f34801b = new C19666a("DisableLogging", new C21296a(interfaceC3756dMo5693b2, interfaceC3777yM18075c2));
        f34802c = AbstractC9949p4.m10607a("Logging", C11494j.f34789Y, new C0383c(25));
    }

    /* JADX INFO: renamed from: a */
    public static final Object m12894a(InterfaceC11491g interfaceC11491g, EnumC11489e enumC11489e, ArrayList arrayList, C13693c c13693c, C2210v c2210v) {
        Charset charsetM9277a;
        C7136d c7136d;
        Object next;
        Object next2;
        Object obj = c13693c.f43198d;
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
        AbstractC17288f abstractC17288f = (AbstractC17288f) obj;
        C11488d c11488d = new C11488d(interfaceC11491g);
        c13693c.f43200f.m20652f(f34800a, c11488d);
        StringBuilder sb2 = new StringBuilder();
        if (enumC11489e.f34776Y) {
            sb2.append("REQUEST: " + AbstractC8699q4.m9402b(c13693c.f43195a));
            sb2.append('\n');
            sb2.append("METHOD: " + c13693c.f43196b);
            sb2.append('\n');
        }
        if (enumC11489e.f34777Z) {
            sb2.append("COMMON HEADERS\n");
            AbstractC7995T3.m8297c(sb2, c13693c.f43197c.mo4526a(), arrayList);
            sb2.append("CONTENT HEADERS");
            sb2.append('\n');
            Iterator it = arrayList.iterator();
            do {
                boolean zHasNext = it.hasNext();
                c7136d = C7136d.f22700o0;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                ((C11506v) next).getClass();
                List list = AbstractC16435B.f50983a;
            } while (!((Boolean) c7136d.invoke(SIPHeaderNames.CONTENT_LENGTH)).booleanValue());
            C11506v c11506v = (C11506v) next;
            String strValueOf = c11506v != null ? c11506v.f34824a : null;
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                ((C11506v) next2).getClass();
                List list2 = AbstractC16435B.f50983a;
            } while (!((Boolean) c7136d.invoke(SIPHeaderNames.CONTENT_TYPE)).booleanValue());
            C11506v c11506v2 = (C11506v) next2;
            String string = c11506v2 != null ? c11506v2.f34824a : null;
            Long lMo7529a = abstractC17288f.mo7529a();
            if (lMo7529a != null) {
                long jLongValue = lMo7529a.longValue();
                List list3 = AbstractC16435B.f50983a;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(jLongValue);
                }
                AbstractC7995T3.m8296b(SIPHeaderNames.CONTENT_LENGTH, strValueOf, sb2);
            }
            C16460h c16460hMo7530b = abstractC17288f.mo7530b();
            if (c16460hMo7530b != null) {
                List list4 = AbstractC16435B.f50983a;
                if (string == null) {
                    string = c16460hMo7530b.toString();
                }
                AbstractC7995T3.m8296b(SIPHeaderNames.CONTENT_TYPE, string, sb2);
            }
            AbstractC7995T3.m8297c(sb2, abstractC17288f.mo7531c().mo7977a(), arrayList);
        }
        String string2 = sb2.toString();
        AbstractC16544l.m18093f(string2, "toString(...)");
        if (string2.length() > 0) {
            c11488d.m12890c(string2);
        }
        if (string2.length() == 0 || !enumC11489e.f34778o0) {
            c11488d.m12888a();
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("BODY Content-Type: " + abstractC17288f.mo7530b());
        sb3.append('\n');
        C16460h c16460hMo7530b2 = abstractC17288f.mo7530b();
        if (c16460hMo7530b2 == null || (charsetM9277a = AbstractC8627e4.m9277a(c16460hMo7530b2)) == null) {
            charsetM9277a = C21307a.f67720a;
        }
        Charset charset = charsetM9277a;
        C15085k c15085k = new C15085k(false);
        AbstractC0575H.m1156D(C0613g0.f1858Y, AbstractC0593T.f1824a.plus(new C4485a()), null, new C11495k(c15085k, charset, sb3, c11488d, null), 2);
        return AbstractC8003U3.m8309e(abstractC17288f, c15085k, c2210v);
    }

    /* JADX INFO: renamed from: b */
    public static final void m12895b(EnumC11489e enumC11489e, StringBuilder sb2, InterfaceC13692b interfaceC13692b, Throwable th2) {
        if (enumC11489e.f34776Y) {
            sb2.append("RESPONSE " + interfaceC13692b.mo7300S() + " failed with exception: " + th2);
        }
    }
}
