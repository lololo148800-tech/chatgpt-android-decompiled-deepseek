package p523V9;

import android.content.res.Configuration;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Typeface;
import android.os.Build;
import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.InterfaceC15088n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p1008s8.C19488q;
import p1113xn.C21307a;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p457Sh.C7136d;
import p488Tn.InterfaceC7526i;
import p544W9.AbstractC8627e4;
import p544W9.AbstractC8700r;
import p571X9.AbstractC9233X;
import p666bl.C11498n;
import p666bl.C11499o;
import p666bl.C11506v;
import p666bl.EnumC11489e;
import p792hl.AbstractC14527b;
import p857kl.C16460h;
import p909nm.AbstractC17680n;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: V9.T3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7995T3 {
    /* JADX INFO: renamed from: a */
    public static C19488q m8295a(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C19488q(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type View", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type View", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type View", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8296b(String key, String value, StringBuilder sb2) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(value, "value");
        Appendable appendableAppend = sb2.append((CharSequence) ("-> " + key + ": " + value));
        AbstractC16544l.m18093f(appendableAppend, "append(...)");
        AbstractC16544l.m18093f(appendableAppend.append('\n'), "append(...)");
    }

    /* JADX INFO: renamed from: c */
    public static final void m8297c(StringBuilder sb2, Set headers, ArrayList sanitizedHeaders) {
        Object next;
        AbstractC16544l.m18094g(headers, "headers");
        AbstractC16544l.m18094g(sanitizedHeaders, "sanitizedHeaders");
        for (Map.Entry entry : AbstractC17680n.m19370t0(AbstractC17680n.m19322C0(headers), new C11498n())) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Iterator it = sanitizedHeaders.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    ((C11506v) next).getClass();
                }
            } while (!((Boolean) C7136d.f22700o0.invoke(str)).booleanValue());
            C11506v c11506v = (C11506v) next;
            String strM19349Y = c11506v != null ? c11506v.f34824a : null;
            if (strM19349Y == null) {
                strM19349Y = AbstractC17680n.m19349Y(list, "; ", null, null, 0, null, null, 62);
            }
            m8296b(str, strM19349Y, sb2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m8298d(StringBuilder sb2, C16460h c16460h, InterfaceC15088n interfaceC15088n, AbstractC19687c abstractC19687c) {
        C11499o c11499o;
        Charset charsetM9277a;
        StringBuilder sb3;
        Charset charset;
        String strM9407c;
        if (abstractC19687c instanceof C11499o) {
            c11499o = (C11499o) abstractC19687c;
            int i10 = c11499o.f34806p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c11499o.f34806p0 = i10 - Integer.MIN_VALUE;
            } else {
                c11499o = new C11499o(abstractC19687c);
            }
        } else {
            c11499o = new C11499o(abstractC19687c);
        }
        Object objM16186n = c11499o.f34805o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c11499o.f34806p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM16186n);
            sb2.append("BODY Content-Type: " + c16460h);
            sb2.append('\n');
            sb2.append("BODY START");
            sb2.append('\n');
            if (c16460h == null || (charsetM9277a = AbstractC8627e4.m9277a(c16460h)) == null) {
                charsetM9277a = C21307a.f67720a;
            }
            try {
                c11499o.f34803Y = sb2;
                c11499o.f34804Z = charsetM9277a;
                c11499o.f34806p0 = 1;
                objM16186n = AbstractC15070F.m16186n(interfaceC15088n, c11499o);
                if (objM16186n == enumC19250a) {
                    return enumC19250a;
                }
                Charset charset2 = charsetM9277a;
                sb3 = sb2;
                charset = charset2;
            } catch (Throwable unused) {
                sb3 = sb2;
                strM9407c = null;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            charset = c11499o.f34804Z;
            sb3 = c11499o.f34803Y;
            try {
                AbstractC9233X.m9807c(objM16186n);
            } catch (Throwable unused2) {
                sb2 = sb3;
                sb3 = sb2;
                strM9407c = null;
            }
        }
        strM9407c = AbstractC8700r.m9407c((InterfaceC7526i) objM16186n, charset, 2);
        if (strM9407c == null) {
            strM9407c = "[response body omitted]";
        }
        sb3.append(strM9407c);
        sb3.append("\nBODY END");
        return C17296C.f55119a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m8299e(StringBuilder sb2, AbstractC14527b abstractC14527b, EnumC11489e level, ArrayList sanitizedHeaders) {
        AbstractC16544l.m18094g(level, "level");
        AbstractC16544l.m18094g(sanitizedHeaders, "sanitizedHeaders");
        if (level.f34776Y) {
            sb2.append("RESPONSE: " + abstractC14527b.mo7307f());
            sb2.append('\n');
            sb2.append("METHOD: " + abstractC14527b.mo7303b().m7296c().getMethod());
            sb2.append('\n');
            sb2.append("FROM: " + abstractC14527b.mo7303b().m7296c().mo7300S());
            sb2.append('\n');
        }
        if (level.f34777Z) {
            sb2.append("COMMON HEADERS");
            sb2.append('\n');
            m8297c(sb2, abstractC14527b.mo7301a().mo7977a(), sanitizedHeaders);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Typeface m8300f(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, AbstractC7925K4.m8214e(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }
}
