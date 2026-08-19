package p1027tp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mo.C17348o;
import mo.C17352s;

/* JADX INFO: renamed from: tp.K */
/* JADX INFO: loaded from: classes2.dex */
public final class C20046K {

    /* JADX INFO: renamed from: x */
    public static final Pattern f63489x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: y */
    public static final Pattern f63490y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: a */
    public final C20050O f63491a;

    /* JADX INFO: renamed from: b */
    public final Method f63492b;

    /* JADX INFO: renamed from: c */
    public final Annotation[] f63493c;

    /* JADX INFO: renamed from: d */
    public final Annotation[][] f63494d;

    /* JADX INFO: renamed from: e */
    public final Type[] f63495e;

    /* JADX INFO: renamed from: f */
    public boolean f63496f;

    /* JADX INFO: renamed from: g */
    public boolean f63497g;

    /* JADX INFO: renamed from: h */
    public boolean f63498h;

    /* JADX INFO: renamed from: i */
    public boolean f63499i;

    /* JADX INFO: renamed from: j */
    public boolean f63500j;

    /* JADX INFO: renamed from: k */
    public boolean f63501k;

    /* JADX INFO: renamed from: l */
    public boolean f63502l;

    /* JADX INFO: renamed from: m */
    public boolean f63503m;

    /* JADX INFO: renamed from: n */
    public String f63504n;

    /* JADX INFO: renamed from: o */
    public boolean f63505o;

    /* JADX INFO: renamed from: p */
    public boolean f63506p;

    /* JADX INFO: renamed from: q */
    public boolean f63507q;

    /* JADX INFO: renamed from: r */
    public String f63508r;

    /* JADX INFO: renamed from: s */
    public C17348o f63509s;

    /* JADX INFO: renamed from: t */
    public C17352s f63510t;

    /* JADX INFO: renamed from: u */
    public LinkedHashSet f63511u;

    /* JADX INFO: renamed from: v */
    public AbstractC20056V[] f63512v;

    /* JADX INFO: renamed from: w */
    public boolean f63513w;

    public C20046K(C20050O c20050o, Method method) {
        this.f63491a = c20050o;
        this.f63492b = method;
        this.f63493c = method.getAnnotations();
        this.f63495e = method.getGenericParameterTypes();
        this.f63494d = method.getParameterAnnotations();
    }

    /* JADX INFO: renamed from: a */
    public static Class m20865a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }

    /* JADX INFO: renamed from: b */
    public final void m20866b(String str, String str2, boolean z6) {
        String str3 = this.f63504n;
        Method method = this.f63492b;
        if (str3 != null) {
            throw AbstractC20056V.m20884j(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f63504n = str;
        this.f63505o = z6;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f63489x;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw AbstractC20056V.m20884j(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f63508r = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f63511u = linkedHashSet;
    }

    /* JADX INFO: renamed from: c */
    public final void m20867c(int i10, Type type) {
        if (AbstractC20056V.m20882h(type)) {
            throw AbstractC20056V.m20885k(this.f63492b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
