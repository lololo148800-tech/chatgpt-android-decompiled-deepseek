package bo;

import ao.AbstractC11153a0;
import ao.C11181o0;
import co.AbstractC11809J;
import co.C11807H;
import co.C11823m;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: renamed from: bo.k */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11523k {

    /* JADX INFO: renamed from: a */
    public static final InlineClassDescriptor f34886a = AbstractC11153a0.m12378a("kotlinx.serialization.json.JsonUnquotedLiteral", C11181o0.f33827a);

    /* JADX INFO: renamed from: a */
    public static final AbstractC16645d m12908a(Boolean bool) {
        return new C11528p(bool, false, null);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC16645d m12909b(Number number) {
        return number == null ? JsonNull.INSTANCE : new C11528p(number, false, null);
    }

    /* JADX INFO: renamed from: c */
    public static final AbstractC16645d m12910c(String str) {
        return str == null ? JsonNull.INSTANCE : new C11528p(str, true, null);
    }

    /* JADX INFO: renamed from: d */
    public static final void m12911d(String str, AbstractC16643b abstractC16643b) {
        throw new IllegalArgumentException("Element " + AbstractC16526C.f51263a.mo5693b(abstractC16643b.getClass()) + " is not a " + str);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m12912e(AbstractC16645d abstractC16645d) {
        Boolean bool;
        String strMo12922f = abstractC16645d.mo12922f();
        String[] strArr = AbstractC11809J.f35796a;
        AbstractC16544l.m18094g(strMo12922f, "<this>");
        if (strMo12922f.equalsIgnoreCase("true")) {
            bool = Boolean.TRUE;
        } else {
            bool = strMo12922f.equalsIgnoreCase("false") ? Boolean.FALSE : null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException(abstractC16645d + " does not represent a Boolean");
    }

    /* JADX INFO: renamed from: f */
    public static final String m12913f(AbstractC16645d abstractC16645d) {
        AbstractC16544l.m18094g(abstractC16645d, "<this>");
        if (abstractC16645d instanceof JsonNull) {
            return null;
        }
        return abstractC16645d.mo12922f();
    }

    /* JADX INFO: renamed from: g */
    public static final int m12914g(AbstractC16645d abstractC16645d) {
        AbstractC16544l.m18094g(abstractC16645d, "<this>");
        try {
            long jM6925i = new C11807H(abstractC16645d.mo12922f()).m6925i();
            if (-2147483648L <= jM6925i && jM6925i <= 2147483647L) {
                return (int) jM6925i;
            }
            throw new NumberFormatException(abstractC16645d.mo12922f() + " is not an Int");
        } catch (C11823m e10) {
            throw new NumberFormatException(e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Integer m12915h(AbstractC16645d abstractC16645d) {
        Long lValueOf;
        try {
            lValueOf = Long.valueOf(new C11807H(abstractC16645d.mo12922f()).m6925i());
        } catch (C11823m unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final C16642a m12916i(AbstractC16643b abstractC16643b) {
        AbstractC16544l.m18094g(abstractC16643b, "<this>");
        C16642a c16642a = abstractC16643b instanceof C16642a ? (C16642a) abstractC16643b : null;
        if (c16642a != null) {
            return c16642a;
        }
        m12911d("JsonArray", abstractC16643b);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static final C16644c m12917j(AbstractC16643b abstractC16643b) {
        AbstractC16544l.m18094g(abstractC16643b, "<this>");
        C16644c c16644c = abstractC16643b instanceof C16644c ? (C16644c) abstractC16643b : null;
        if (c16644c != null) {
            return c16644c;
        }
        m12911d("JsonObject", abstractC16643b);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static final AbstractC16645d m12918k(AbstractC16643b abstractC16643b) {
        AbstractC16544l.m18094g(abstractC16643b, "<this>");
        AbstractC16645d abstractC16645d = abstractC16643b instanceof AbstractC16645d ? (AbstractC16645d) abstractC16643b : null;
        if (abstractC16645d != null) {
            return abstractC16645d;
        }
        m12911d(VjclRfeKsMflo.IiLImX, abstractC16643b);
        throw null;
    }
}
