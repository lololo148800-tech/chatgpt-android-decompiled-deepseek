package p1027tp;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import cn.UfGr.EhBykzn;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17327D;
import mo.C17348o;
import mo.C17349p;
import mo.C17352s;
import mo.C17353t;
import mo.InterfaceC17337d;
import p1069vp.InterfaceC20666a;
import p1069vp.InterfaceC20667b;
import p1069vp.InterfaceC20668c;
import p1069vp.InterfaceC20669d;
import p1069vp.InterfaceC20670e;
import p1069vp.InterfaceC20671f;
import p1069vp.InterfaceC20672g;
import p1069vp.InterfaceC20673h;
import p1069vp.InterfaceC20674i;
import p1069vp.InterfaceC20675j;
import p1069vp.InterfaceC20676k;
import p1069vp.InterfaceC20677l;
import p1069vp.InterfaceC20678m;
import p1069vp.InterfaceC20679n;
import p1069vp.InterfaceC20680o;
import p1069vp.InterfaceC20681p;
import p1069vp.InterfaceC20682q;
import p1069vp.InterfaceC20683r;
import p1069vp.InterfaceC20684s;
import p1069vp.InterfaceC20685t;
import p1069vp.InterfaceC20686u;
import p1069vp.InterfaceC20687v;
import p1069vp.InterfaceC20689x;
import p1069vp.InterfaceC20690y;
import p1113xn.AbstractC21322p;
import p571X9.AbstractC9276e0;
import p571X9.AbstractC9282f0;
import p972qm.InterfaceC18770c;

/* JADX INFO: renamed from: tp.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C20071o {

    /* JADX INFO: renamed from: a */
    public final C20047L f63563a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17337d f63564b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC20067k f63565c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f63566d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC20061e f63567e;

    public C20071o(C20047L c20047l, InterfaceC17337d interfaceC17337d, InterfaceC20067k interfaceC20067k, InterfaceC20061e interfaceC20061e, int i10) {
        this.f63566d = i10;
        this.f63563a = c20047l;
        this.f63564b = interfaceC17337d;
        this.f63565c = interfaceC20067k;
        this.f63567e = interfaceC20061e;
    }

    /* JADX WARN: Code duplicated, block: B:387:0x08f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:388:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:573:0x0911 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public static C20071o m20912a(C20050O c20050o, Method method) {
        Type genericReturnType;
        boolean z6;
        Annotation[][] annotationArr;
        int i10;
        int i11;
        String str;
        AbstractC20056V[] abstractC20056VArr;
        int i12;
        AbstractC20056V abstractC20056V;
        String str2;
        AbstractC20056V[] abstractC20056VArr2;
        int i13;
        AbstractC20056V c20042g;
        AbstractC20056V c20038c;
        C20079w c20079w;
        C20079w c20079w2;
        int i14 = -1;
        int i15 = 0;
        int i16 = 1;
        C20046K c20046k = new C20046K(c20050o, method);
        Annotation[] annotationArr2 = c20046k.f63493c;
        int length = annotationArr2.length;
        int i17 = 0;
        while (true) {
            Method method2 = c20046k.f63492b;
            String str3 = "HEAD";
            if (i17 >= length) {
                if (c20046k.f63504n == null) {
                    throw AbstractC20056V.m20884j(method2, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!c20046k.f63505o) {
                    if (c20046k.f63507q) {
                        throw AbstractC20056V.m20884j(method2, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (c20046k.f63506p) {
                        throw AbstractC20056V.m20884j(method2, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = c20046k.f63494d;
                int length2 = annotationArr3.length;
                c20046k.f63512v = new AbstractC20056V[length2];
                int i18 = length2 - 1;
                int i19 = 0;
                while (i19 < length2) {
                    AbstractC20056V[] abstractC20056VArr3 = c20046k.f63512v;
                    Type type = c20046k.f63495e[i19];
                    Annotation[] annotationArr4 = annotationArr3[i19];
                    int i20 = i19 == i18 ? i16 : i15;
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        int i21 = 0;
                        abstractC20056V = null;
                        while (true) {
                            annotationArr = annotationArr3;
                            if (i21 >= length3) {
                                i10 = length2;
                                i11 = i18;
                                str = str3;
                                abstractC20056VArr = abstractC20056VArr3;
                                i12 = i20;
                                break;
                            }
                            Annotation annotation = annotationArr4[i21];
                            int i22 = length2;
                            int i23 = length3;
                            int i24 = i18;
                            if (annotation instanceof InterfaceC20690y) {
                                c20046k.m20867c(i19, type);
                                if (c20046k.f63503m) {
                                    throw AbstractC20056V.m20885k(method2, i19, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (c20046k.f63499i) {
                                    throw AbstractC20056V.m20885k(method2, i19, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (c20046k.f63500j) {
                                    throw AbstractC20056V.m20885k(method2, i19, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (c20046k.f63501k) {
                                    throw AbstractC20056V.m20885k(method2, i19, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (c20046k.f63502l) {
                                    throw AbstractC20056V.m20885k(method2, i19, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (c20046k.f63508r != null) {
                                    throw AbstractC20056V.m20885k(method2, i19, "@Url cannot be used with @%s URL", c20046k.f63504n);
                                }
                                c20046k.f63503m = true;
                                if (type != C17349p.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw AbstractC20056V.m20885k(method2, i19, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                c20042g = new C20037B(method2, i19, 2);
                            } else {
                                boolean z10 = annotation instanceof InterfaceC20684s;
                                C20050O c20050o2 = c20046k.f63491a;
                                if (z10) {
                                    c20046k.m20867c(i19, type);
                                    if (c20046k.f63500j) {
                                        throw AbstractC20056V.m20885k(method2, i19, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (c20046k.f63501k) {
                                        throw AbstractC20056V.m20885k(method2, i19, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (c20046k.f63502l) {
                                        throw AbstractC20056V.m20885k(method2, i19, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (c20046k.f63503m) {
                                        throw AbstractC20056V.m20885k(method2, i19, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (c20046k.f63508r == null) {
                                        throw AbstractC20056V.m20885k(method2, i19, "@Path can only be used with relative url on @%s", c20046k.f63504n);
                                    }
                                    c20046k.f63499i = true;
                                    InterfaceC20684s interfaceC20684s = (InterfaceC20684s) annotation;
                                    String strValue = interfaceC20684s.value();
                                    if (!C20046K.f63490y.matcher(strValue).matches()) {
                                        throw AbstractC20056V.m20885k(method2, i19, "@Path parameter name must match %s. Found: %s", C20046K.f63489x.pattern(), strValue);
                                    }
                                    if (!c20046k.f63511u.contains(strValue)) {
                                        throw AbstractC20056V.m20885k(method2, i19, "URL \"%s\" does not contain \"{%s}\".", c20046k.f63508r, strValue);
                                    }
                                    c20050o2.m20875e(type, annotationArr4);
                                    c20042g = new C20039D(method2, i19, strValue, interfaceC20684s.encoded());
                                } else {
                                    str2 = str3;
                                    if (annotation instanceof InterfaceC20685t) {
                                        c20046k.m20867c(i19, type);
                                        InterfaceC20685t interfaceC20685t = (InterfaceC20685t) annotation;
                                        String strValue2 = interfaceC20685t.value();
                                        boolean zEncoded = interfaceC20685t.encoded();
                                        Class clsM20880f = AbstractC20056V.m20880f(type);
                                        abstractC20056VArr2 = abstractC20056VArr3;
                                        c20046k.f63500j = true;
                                        if (!Iterable.class.isAssignableFrom(clsM20880f)) {
                                            if (clsM20880f.isArray()) {
                                                c20050o2.m20875e(C20046K.m20865a(clsM20880f.getComponentType()), annotationArr4);
                                                c20079w2 = new C20079w(new C20081y(strValue2, zEncoded, 1), 1);
                                            } else {
                                                c20050o2.m20875e(type, annotationArr4);
                                                c20042g = new C20081y(strValue2, zEncoded, 1);
                                            }
                                            i13 = i20;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw AbstractC20056V.m20885k(method2, i19, clsM20880f.getSimpleName() + " must include generic type (e.g., " + clsM20880f.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            c20050o2.m20875e(AbstractC20056V.m20879e(0, (ParameterizedType) type), annotationArr4);
                                            c20079w2 = new C20079w(new C20081y(strValue2, zEncoded, 1), 0);
                                        }
                                        c20042g = c20079w2;
                                        i13 = i20;
                                    } else {
                                        abstractC20056VArr2 = abstractC20056VArr3;
                                        if (annotation instanceof InterfaceC20687v) {
                                            c20046k.m20867c(i19, type);
                                            boolean zEncoded2 = ((InterfaceC20687v) annotation).encoded();
                                            Class clsM20880f2 = AbstractC20056V.m20880f(type);
                                            c20046k.f63501k = true;
                                            if (!Iterable.class.isAssignableFrom(clsM20880f2)) {
                                                if (clsM20880f2.isArray()) {
                                                    c20050o2.m20875e(C20046K.m20865a(clsM20880f2.getComponentType()), annotationArr4);
                                                    c20079w2 = new C20079w(new C20040E(zEncoded2), 1);
                                                } else {
                                                    c20050o2.m20875e(type, annotationArr4);
                                                    c20042g = new C20040E(zEncoded2);
                                                }
                                                i13 = i20;
                                            } else {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw AbstractC20056V.m20885k(method2, i19, clsM20880f2.getSimpleName() + " must include generic type (e.g., " + clsM20880f2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                c20050o2.m20875e(AbstractC20056V.m20879e(0, (ParameterizedType) type), annotationArr4);
                                                c20079w2 = new C20079w(new C20040E(zEncoded2), 0);
                                            }
                                            c20042g = c20079w2;
                                            i13 = i20;
                                        } else {
                                            i13 = i20;
                                            if (annotation instanceof InterfaceC20686u) {
                                                c20046k.m20867c(i19, type);
                                                Class clsM20880f3 = AbstractC20056V.m20880f(type);
                                                c20046k.f63502l = true;
                                                if (!Map.class.isAssignableFrom(clsM20880f3)) {
                                                    throw AbstractC20056V.m20885k(method2, i19, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM20881g = AbstractC20056V.m20881g(type, clsM20880f3);
                                                if (!(typeM20881g instanceof ParameterizedType)) {
                                                    throw AbstractC20056V.m20885k(method2, i19, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeM20881g;
                                                Type typeM20879e = AbstractC20056V.m20879e(0, parameterizedType);
                                                if (String.class != typeM20879e) {
                                                    throw AbstractC20056V.m20885k(method2, i19, "@QueryMap keys must be of type String: " + typeM20879e, new Object[0]);
                                                }
                                                c20050o2.m20875e(AbstractC20056V.m20879e(1, parameterizedType), annotationArr4);
                                                c20042g = new C20082z(method2, i19, ((InterfaceC20686u) annotation).encoded(), 1);
                                            } else if (annotation instanceof InterfaceC20674i) {
                                                c20046k.m20867c(i19, type);
                                                String strValue3 = ((InterfaceC20674i) annotation).value();
                                                Class clsM20880f4 = AbstractC20056V.m20880f(type);
                                                if (Iterable.class.isAssignableFrom(clsM20880f4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw AbstractC20056V.m20885k(method2, i19, clsM20880f4.getSimpleName() + " must include generic type (e.g., " + clsM20880f4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c20050o2.m20875e(AbstractC20056V.m20879e(0, (ParameterizedType) type), annotationArr4);
                                                    c20079w = new C20079w(new C20036A(strValue3), 0);
                                                } else if (clsM20880f4.isArray()) {
                                                    c20050o2.m20875e(C20046K.m20865a(clsM20880f4.getComponentType()), annotationArr4);
                                                    c20079w = new C20079w(new C20036A(strValue3), 1);
                                                } else {
                                                    c20050o2.m20875e(type, annotationArr4);
                                                    c20042g = new C20036A(strValue3);
                                                }
                                                c20042g = c20079w;
                                            } else if (annotation instanceof InterfaceC20675j) {
                                                if (type == C17348o.class) {
                                                    c20042g = new C20037B(method2, i19, 1);
                                                } else {
                                                    c20046k.m20867c(i19, type);
                                                    Class clsM20880f5 = AbstractC20056V.m20880f(type);
                                                    if (!Map.class.isAssignableFrom(clsM20880f5)) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type typeM20881g2 = AbstractC20056V.m20881g(type, clsM20880f5);
                                                    if (!(typeM20881g2 instanceof ParameterizedType)) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeM20881g2;
                                                    Type typeM20879e2 = AbstractC20056V.m20879e(0, parameterizedType2);
                                                    if (String.class != typeM20879e2) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "@HeaderMap keys must be of type String: " + typeM20879e2, new Object[0]);
                                                    }
                                                    c20050o2.m20875e(AbstractC20056V.m20879e(1, parameterizedType2), annotationArr4);
                                                    c20042g = new C20037B(method2, i19, 0);
                                                }
                                            } else if (annotation instanceof InterfaceC20668c) {
                                                c20046k.m20867c(i19, type);
                                                if (!c20046k.f63506p) {
                                                    throw AbstractC20056V.m20885k(method2, i19, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                InterfaceC20668c interfaceC20668c = (InterfaceC20668c) annotation;
                                                String strValue4 = interfaceC20668c.value();
                                                boolean zEncoded3 = interfaceC20668c.encoded();
                                                c20046k.f63496f = true;
                                                Class clsM20880f6 = AbstractC20056V.m20880f(type);
                                                if (Iterable.class.isAssignableFrom(clsM20880f6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw AbstractC20056V.m20885k(method2, i19, clsM20880f6.getSimpleName() + " must include generic type (e.g., " + clsM20880f6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c20050o2.m20875e(AbstractC20056V.m20879e(0, (ParameterizedType) type), annotationArr4);
                                                    c20079w = new C20079w(new C20081y(strValue4, zEncoded3, 0), 0);
                                                } else if (clsM20880f6.isArray()) {
                                                    c20050o2.m20875e(C20046K.m20865a(clsM20880f6.getComponentType()), annotationArr4);
                                                    c20079w = new C20079w(new C20081y(strValue4, zEncoded3, 0), 1);
                                                } else {
                                                    c20050o2.m20875e(type, annotationArr4);
                                                    c20042g = new C20081y(strValue4, zEncoded3, 0);
                                                }
                                                c20042g = c20079w;
                                            } else if (annotation instanceof InterfaceC20669d) {
                                                c20046k.m20867c(i19, type);
                                                if (!c20046k.f63506p) {
                                                    throw AbstractC20056V.m20885k(method2, i19, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsM20880f7 = AbstractC20056V.m20880f(type);
                                                if (!Map.class.isAssignableFrom(clsM20880f7)) {
                                                    throw AbstractC20056V.m20885k(method2, i19, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM20881g3 = AbstractC20056V.m20881g(type, clsM20880f7);
                                                if (!(typeM20881g3 instanceof ParameterizedType)) {
                                                    throw AbstractC20056V.m20885k(method2, i19, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeM20881g3;
                                                Type typeM20879e3 = AbstractC20056V.m20879e(0, parameterizedType3);
                                                if (String.class != typeM20879e3) {
                                                    throw AbstractC20056V.m20885k(method2, i19, "@FieldMap keys must be of type String: " + typeM20879e3, new Object[0]);
                                                }
                                                c20050o2.m20875e(AbstractC20056V.m20879e(1, parameterizedType3), annotationArr4);
                                                c20046k.f63496f = true;
                                                c20042g = new C20082z(method2, i19, ((InterfaceC20669d) annotation).encoded(), 0);
                                            } else {
                                                i21 = i21;
                                                if (annotation instanceof InterfaceC20682q) {
                                                    c20046k.m20867c(i19, type);
                                                    if (!c20046k.f63507q) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    InterfaceC20682q interfaceC20682q = (InterfaceC20682q) annotation;
                                                    c20046k.f63497g = true;
                                                    String strValue5 = interfaceC20682q.value();
                                                    Class clsM20880f8 = AbstractC20056V.m20880f(type);
                                                    if (strValue5.isEmpty()) {
                                                        boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsM20880f8);
                                                        c20038c = C20041F.f63471b;
                                                        if (zIsAssignableFrom) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw AbstractC20056V.m20885k(method2, i19, clsM20880f8.getSimpleName() + " must include generic type (e.g., " + clsM20880f8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            if (!C17353t.class.isAssignableFrom(AbstractC20056V.m20880f(AbstractC20056V.m20879e(0, (ParameterizedType) type)))) {
                                                                throw AbstractC20056V.m20885k(method2, i19, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            c20042g = new C20079w(c20038c, 0);
                                                        } else if (!clsM20880f8.isArray()) {
                                                            if (!C17353t.class.isAssignableFrom(clsM20880f8)) {
                                                                throw AbstractC20056V.m20885k(method2, i19, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            c20042g = c20038c;
                                                        } else {
                                                            if (!C17353t.class.isAssignableFrom(clsM20880f8.getComponentType())) {
                                                                throw AbstractC20056V.m20885k(method2, i19, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                            }
                                                            c20042g = new C20079w(c20038c, 1);
                                                        }
                                                    } else {
                                                        C17348o c17348oM9847d = AbstractC9276e0.m9847d(SIPHeaderNames.CONTENT_DISPOSITION, AbstractC10763a.m11054l("form-data; name=\"", strValue5, Separators.DOUBLE_QUOTE), "Content-Transfer-Encoding", interfaceC20682q.encoding());
                                                        if (Iterable.class.isAssignableFrom(clsM20880f8)) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw AbstractC20056V.m20885k(method2, i19, clsM20880f8.getSimpleName() + " must include generic type (e.g., " + clsM20880f8.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            Type typeM20879e4 = AbstractC20056V.m20879e(0, (ParameterizedType) type);
                                                            if (C17353t.class.isAssignableFrom(AbstractC20056V.m20880f(typeM20879e4))) {
                                                                throw AbstractC20056V.m20885k(method2, i19, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            c20042g = new C20079w(new C20038C(method2, i19, c17348oM9847d, c20050o2.m20873c(typeM20879e4, annotationArr4, annotationArr2)), 0);
                                                        } else if (clsM20880f8.isArray()) {
                                                            Class clsM20865a = C20046K.m20865a(clsM20880f8.getComponentType());
                                                            if (C17353t.class.isAssignableFrom(clsM20865a)) {
                                                                throw AbstractC20056V.m20885k(method2, i19, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            c20042g = new C20079w(new C20038C(method2, i19, c17348oM9847d, c20050o2.m20873c(clsM20865a, annotationArr4, annotationArr2)), 1);
                                                        } else {
                                                            if (C17353t.class.isAssignableFrom(clsM20880f8)) {
                                                                throw AbstractC20056V.m20885k(method2, i19, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                            c20038c = new C20038C(method2, i19, c17348oM9847d, c20050o2.m20873c(type, annotationArr4, annotationArr2));
                                                            c20042g = c20038c;
                                                        }
                                                    }
                                                } else if (annotation instanceof InterfaceC20683r) {
                                                    c20046k.m20867c(i19, type);
                                                    if (!c20046k.f63507q) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                    c20046k.f63497g = true;
                                                    Class clsM20880f9 = AbstractC20056V.m20880f(type);
                                                    if (!Map.class.isAssignableFrom(clsM20880f9)) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "@PartMap parameter type must be Map.", new Object[0]);
                                                    }
                                                    Type typeM20881g4 = AbstractC20056V.m20881g(type, clsM20880f9);
                                                    if (!(typeM20881g4 instanceof ParameterizedType)) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType4 = (ParameterizedType) typeM20881g4;
                                                    Type typeM20879e5 = AbstractC20056V.m20879e(0, parameterizedType4);
                                                    if (String.class != typeM20879e5) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "@PartMap keys must be of type String: " + typeM20879e5, new Object[0]);
                                                    }
                                                    Type typeM20879e6 = AbstractC20056V.m20879e(1, parameterizedType4);
                                                    if (C17353t.class.isAssignableFrom(AbstractC20056V.m20880f(typeM20879e6))) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                    }
                                                    c20038c = new C20038C(method2, i19, c20050o2.m20873c(typeM20879e6, annotationArr4, annotationArr2), ((InterfaceC20683r) annotation).encoding());
                                                    c20042g = c20038c;
                                                } else if (annotation instanceof InterfaceC20666a) {
                                                    c20046k.m20867c(i19, type);
                                                    if (c20046k.f63506p || c20046k.f63507q) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                    }
                                                    if (c20046k.f63498h) {
                                                        throw AbstractC20056V.m20885k(method2, i19, "Multiple @Body method annotations found.", new Object[0]);
                                                    }
                                                    try {
                                                        InterfaceC20067k interfaceC20067kM20873c = c20050o2.m20873c(type, annotationArr4, annotationArr2);
                                                        c20046k.f63498h = true;
                                                        c20042g = new C20080x(method2, i19, interfaceC20067kM20873c);
                                                    } catch (RuntimeException e10) {
                                                        throw AbstractC20056V.m20886l(method2, e10, i19, "Unable to create @Body converter for %s", type);
                                                    }
                                                } else if (annotation instanceof InterfaceC20689x) {
                                                    c20046k.m20867c(i19, type);
                                                    Class clsM20880f10 = AbstractC20056V.m20880f(type);
                                                    for (int i25 = i19 - 1; i25 >= 0; i25--) {
                                                        AbstractC20056V abstractC20056V2 = c20046k.f63512v[i25];
                                                        if ((abstractC20056V2 instanceof C20042G) && ((C20042G) abstractC20056V2).f63472b.equals(clsM20880f10)) {
                                                            throw AbstractC20056V.m20885k(method2, i19, "@Tag type " + clsM20880f10.getName() + " is duplicate of parameter #" + (i25 + 1) + " and would always overwrite its value.", new Object[0]);
                                                        }
                                                    }
                                                    c20042g = new C20042G(clsM20880f10);
                                                } else {
                                                    c20042g = null;
                                                }
                                            }
                                            i21 = i21;
                                        }
                                    }
                                }
                                if (c20042g != null) {
                                    if (abstractC20056V == null) {
                                        throw AbstractC20056V.m20885k(method2, i19, EhBykzn.WxkEyHbzvytOP, new Object[0]);
                                    }
                                    abstractC20056V = c20042g;
                                }
                                i21++;
                                annotationArr3 = annotationArr;
                                length2 = i22;
                                length3 = i23;
                                i18 = i24;
                                str3 = str2;
                                abstractC20056VArr3 = abstractC20056VArr2;
                                i20 = i13;
                            }
                            str2 = str3;
                            abstractC20056VArr2 = abstractC20056VArr3;
                            i13 = i20;
                            if (c20042g != null) {
                                if (abstractC20056V == null) {
                                    throw AbstractC20056V.m20885k(method2, i19, EhBykzn.WxkEyHbzvytOP, new Object[0]);
                                }
                                abstractC20056V = c20042g;
                            }
                            i21++;
                            annotationArr3 = annotationArr;
                            length2 = i22;
                            length3 = i23;
                            i18 = i24;
                            str3 = str2;
                            abstractC20056VArr3 = abstractC20056VArr2;
                            i20 = i13;
                        }
                    } else {
                        annotationArr = annotationArr3;
                        i10 = length2;
                        i11 = i18;
                        str = str3;
                        abstractC20056VArr = abstractC20056VArr3;
                        i12 = i20;
                        abstractC20056V = null;
                    }
                    if (abstractC20056V == null) {
                        if (i12 != 0) {
                            try {
                                if (AbstractC20056V.m20880f(type) == InterfaceC18770c.class) {
                                    c20046k.f63513w = true;
                                    abstractC20056V = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw AbstractC20056V.m20885k(method2, i19, "No Retrofit annotation found.", new Object[0]);
                    }
                    abstractC20056VArr[i19] = abstractC20056V;
                    i19++;
                    i16 = 1;
                    annotationArr3 = annotationArr;
                    length2 = i10;
                    i18 = i11;
                    str3 = str;
                    i15 = 0;
                }
                int i26 = i16;
                String str4 = str3;
                if (c20046k.f63508r == null && !c20046k.f63503m) {
                    Object[] objArr = new Object[i26];
                    objArr[0] = c20046k.f63504n;
                    throw AbstractC20056V.m20884j(method2, null, "Missing either @%s URL or @Url parameter.", objArr);
                }
                boolean z11 = c20046k.f63506p;
                if (!z11 && !c20046k.f63507q && !c20046k.f63505o && c20046k.f63498h) {
                    throw AbstractC20056V.m20884j(method2, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z11 && !c20046k.f63496f) {
                    throw AbstractC20056V.m20884j(method2, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (c20046k.f63507q && !c20046k.f63497g) {
                    throw AbstractC20056V.m20884j(method2, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                C20047L c20047l = new C20047L(c20046k);
                Type genericReturnType2 = method.getGenericReturnType();
                if (AbstractC20056V.m20882h(genericReturnType2)) {
                    throw AbstractC20056V.m20884j(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw AbstractC20056V.m20884j(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z12 = c20047l.f63524k;
                if (z12) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeM20879e7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeM20879e7 instanceof WildcardType) {
                        typeM20879e7 = ((WildcardType) typeM20879e7).getLowerBounds()[0];
                    }
                    if (AbstractC20056V.m20880f(typeM20879e7) == C20048M.class && (typeM20879e7 instanceof ParameterizedType)) {
                        typeM20879e7 = AbstractC20056V.m20879e(0, (ParameterizedType) typeM20879e7);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    genericReturnType = new C20054T(null, InterfaceC20059c.class, typeM20879e7);
                    if (!AbstractC20056V.m20883i(annotations, InterfaceC20051P.class)) {
                        Annotation[] annotationArr5 = new Annotation[annotations.length + 1];
                        annotationArr5[0] = C20052Q.f63538a;
                        System.arraycopy(annotations, 0, annotationArr5, 1, annotations.length);
                        annotations = annotationArr5;
                    }
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z6 = false;
                }
                try {
                    InterfaceC20061e interfaceC20061eM20871a = c20050o.m20871a(genericReturnType, annotations);
                    Type typeMo10217m = interfaceC20061eM20871a.mo10217m();
                    if (typeMo10217m == C17327D.class) {
                        throw AbstractC20056V.m20884j(method, null, Separators.QUOTE + AbstractC20056V.m20880f(typeMo10217m).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeMo10217m == C20048M.class) {
                        throw AbstractC20056V.m20884j(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (c20047l.f63516c.equals(str4) && !Void.class.equals(typeMo10217m)) {
                        throw AbstractC20056V.m20884j(method, null, "HEAD method must use Void as response type.", new Object[0]);
                    }
                    try {
                        InterfaceC20067k interfaceC20067kM20874d = c20050o.m20874d(typeMo10217m, method.getAnnotations());
                        InterfaceC17337d interfaceC17337d = c20050o.f63533b;
                        if (z12) {
                            return z6 ? new C20071o(c20047l, interfaceC17337d, interfaceC20067kM20874d, interfaceC20061eM20871a, 2) : new C20071o(c20047l, interfaceC17337d, interfaceC20067kM20874d, interfaceC20061eM20871a, 1);
                        }
                        return new C20071o(c20047l, interfaceC17337d, interfaceC20067kM20874d, interfaceC20061eM20871a, 0);
                    } catch (RuntimeException e11) {
                        throw AbstractC20056V.m20884j(method, e11, "Unable to create converter for %s", typeMo10217m);
                    }
                } catch (RuntimeException e12) {
                    throw AbstractC20056V.m20884j(method, e12, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i17];
            if (annotation2 instanceof InterfaceC20667b) {
                c20046k.m20866b("DELETE", ((InterfaceC20667b) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC20671f) {
                c20046k.m20866b("GET", ((InterfaceC20671f) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC20672g) {
                c20046k.m20866b("HEAD", ((InterfaceC20672g) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC20679n) {
                c20046k.m20866b("PATCH", ((InterfaceC20679n) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC20680o) {
                c20046k.m20866b("POST", ((InterfaceC20680o) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC20681p) {
                c20046k.m20866b("PUT", ((InterfaceC20681p) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC20678m) {
                c20046k.m20866b(TokenNames.OPTIONS, ((InterfaceC20678m) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC20673h) {
                InterfaceC20673h interfaceC20673h = (InterfaceC20673h) annotation2;
                c20046k.m20866b(interfaceC20673h.method(), interfaceC20673h.path(), interfaceC20673h.hasBody());
            } else if (annotation2 instanceof InterfaceC20676k) {
                String[] strArrValue = ((InterfaceC20676k) annotation2).value();
                if (strArrValue.length == 0) {
                    throw AbstractC20056V.m20884j(method2, null, "@Headers annotation is empty.", new Object[0]);
                }
                ArrayList arrayList = new ArrayList(20);
                int length4 = strArrValue.length;
                int i27 = 0;
                while (i27 < length4) {
                    String str5 = strArrValue[i27];
                    int iIndexOf = str5.indexOf(58);
                    if (iIndexOf == i14 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                        throw AbstractC20056V.m20884j(method2, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                    }
                    String name = str5.substring(0, iIndexOf);
                    String value = str5.substring(iIndexOf + 1).trim();
                    if (SIPHeaderNames.CONTENT_TYPE.equalsIgnoreCase(name)) {
                        try {
                            Pattern pattern = C17352s.f55296e;
                            c20046k.f63510t = AbstractC9282f0.m9857c(value);
                        } catch (IllegalArgumentException e13) {
                            throw AbstractC20056V.m20884j(method2, e13, "Malformed content type: %s", value);
                        }
                    } else {
                        AbstractC16544l.m18094g(name, "name");
                        AbstractC16544l.m18094g(value, "value");
                        AbstractC9276e0.m9845b(name);
                        AbstractC9276e0.m9846c(value, name);
                        arrayList.add(name);
                        arrayList.add(AbstractC21322p.m21711s0(value).toString());
                    }
                    i27++;
                    i14 = -1;
                }
                c20046k.f63509s = new C17348o((String[]) arrayList.toArray(new String[0]));
            } else if (annotation2 instanceof InterfaceC20677l) {
                if (c20046k.f63506p) {
                    throw AbstractC20056V.m20884j(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                c20046k.f63507q = true;
            } else if (!(annotation2 instanceof InterfaceC20670e)) {
                continue;
            } else {
                if (c20046k.f63507q) {
                    throw AbstractC20056V.m20884j(method2, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                c20046k.f63506p = true;
            }
            i17++;
            i14 = -1;
        }
    }
}
