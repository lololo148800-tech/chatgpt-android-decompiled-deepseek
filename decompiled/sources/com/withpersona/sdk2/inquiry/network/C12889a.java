package com.withpersona.sdk2.inquiry.network;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mo.AbstractC17325B;
import mo.C17348o;
import mo.C17352s;
import mo.C17353t;
import mo.C17354u;
import mo.C17358y;
import org.json.JSONArray;
import org.json.JSONObject;
import p001A.AbstractC0010F;
import p026Ao.C0675i;
import p1113xn.AbstractC21311e;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p1113xn.C21307a;
import p1113xn.C21312f;
import p1113xn.C21314h;
import p1134ym.C21552c;
import p165G9.AbstractC3021g;
import p571X9.AbstractC9381v3;
import p571X9.AbstractC9393x3;
import p791hj.C14522e;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12889a {

    /* JADX INFO: renamed from: a */
    public static final C12889a f40850a = new C12889a();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f40851a;

        /* JADX INFO: renamed from: b */
        public final String f40852b;

        /* JADX INFO: renamed from: c */
        public final String f40853c;

        public a(String str, String str2, String str3) {
            this.f40851a = str;
            this.f40852b = str2;
            this.f40853c = str3;
        }

        /* JADX INFO: renamed from: a */
        public final String m14557a() {
            return this.f40851a;
        }

        /* JADX INFO: renamed from: b */
        public final String m14558b() {
            return this.f40853c;
        }

        /* JADX INFO: renamed from: c */
        public final String m14559c() {
            return this.f40852b;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.a$b */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            C17309l c17309l = (C17309l) t10;
            C17309l c17309l2 = (C17309l) t11;
            return AbstractC3021g.m3873a(AbstractC17680n.m19349Y(AbstractC17681o.m19382k(c17309l.f55136Y, c17309l.f55137Z), null, null, null, 0, null, null, 63), AbstractC17680n.m19349Y(AbstractC17681o.m19382k(c17309l2.f55136Y, c17309l2.f55137Z), null, null, null, 0, null, null, 63));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C17358y m14544a(C12889a c12889a, C17358y c17358y, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        return c12889a.m14551a(c17358y, j10);
    }

    /* JADX INFO: renamed from: b */
    public final String m14553b(AbstractC17325B abstractC17325B) {
        C0675i c0675i = new C0675i();
        abstractC17325B.mo4145d(c0675i);
        return AbstractC21322p.m21711s0(c0675i.m1428Z0()).toString();
    }

    /* JADX INFO: renamed from: c */
    public final JSONArray m14556c(AbstractC17325B abstractC17325B) {
        C17309l c17309l;
        List<C17309l> listM14555c = f40850a.m14555c(m14550a(abstractC17325B));
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM14555c, 10));
        for (C17309l c17309l2 : listM14555c) {
            String str = (String) c17309l2.f55136Y;
            String input = c17309l2.f55137Z.toString();
            Pattern patternCompile = Pattern.compile("^[+-]?\\d+(\\.\\d+)?$");
            AbstractC16544l.m18093f(patternCompile, "compile(...)");
            AbstractC16544l.m18094g(input, "input");
            if (patternCompile.matcher(input).matches()) {
                c17309l = new C17309l(str, AbstractC21322p.m21709q0(10, input));
            } else {
                Pattern patternCompile2 = Pattern.compile("\\s");
                AbstractC16544l.m18093f(patternCompile2, "compile(...)");
                String strReplaceAll = patternCompile2.matcher(input).replaceAll("");
                AbstractC16544l.m18093f(strReplaceAll, "replaceAll(...)");
                c17309l = new C17309l(str, strReplaceAll);
            }
            arrayList.add(c17309l);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) ((C17309l) obj).f55137Z).length() > 0) {
                arrayList2.add(obj);
            }
        }
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList2, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj2 : arrayList2) {
            linkedHashMap.put((String) ((C17309l) obj2).f55136Y, obj2);
        }
        List<C17309l> listM19370t0 = AbstractC17680n.m19370t0(linkedHashMap.values(), new b());
        JSONArray jSONArray = new JSONArray();
        for (C17309l c17309l3 : listM19370t0) {
            String str2 = (String) c17309l3.f55136Y;
            String str3 = (String) c17309l3.f55137Z;
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONArray.put(jSONArray2);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public final a m14546a(String str, long j10, AbstractC17325B abstractC17325B, String str2) {
        if (str == null || abstractC17325B == null || str2 == null) {
            return null;
        }
        try {
            String str3 = (String) AbstractC17680n.m19353c0(AbstractC21322p.m21697e0(str, new String[]{Separators.f31991SP}, 0, 6));
            if (str3 == null) {
                return null;
            }
            String str4 = (String) AbstractC21322p.m21697e0(str3, new String[]{Separators.DOT}, 0, 6).get(1);
            C21552c.f68250c.getClass();
            String strOptString = new JSONObject(new String(C21552c.m21829a(C21552c.f68253f, str4), C21307a.f67720a)).optString("sub");
            if (strOptString != null && !AbstractC21322p.m21681O(strOptString)) {
                String strValueOf = String.valueOf(j10 / ((long) 1000));
                return new a(m14547a(AbstractC17680n.m19349Y(AbstractC17681o.m19382k(strOptString, strValueOf, AbstractC21329w.m21731r(m14556c(abstractC17325B).toString(), "\\/", Separators.SLASH)), ":", null, null, 0, null, null, 62)), strValueOf, m14547a(AbstractC17680n.m19349Y(AbstractC17681o.m19382k(str2, strValueOf, AbstractC21329w.m21731r(m14556c(abstractC17325B).toString(), "\\/", Separators.SLASH)), ":", null, null, 0, null, null, 62)));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14554b(List<String> list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC21329w.m21734u((String) it.next(), "filename=", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final C17358y m14551a(C17358y c17358y, long j10) {
        a aVarM14546a = m14546a(c17358y.f55381c.m19012f(SIPHeaderNames.AUTHORIZATION), j10, c17358y.f55382d, c17358y.f55381c.m19012f(SIPHeaderNames.USER_AGENT));
        if (aVarM14546a == null) {
            return c17358y;
        }
        C14522e c14522eM19038b = c17358y.m19038b();
        c14522eM19038b.m16012b("NHMJLNRS", aVarM14546a.m14559c());
        c14522eM19038b.m16012b("STPBWSBB", aVarM14546a.m14557a());
        c14522eM19038b.m16012b("DNLGNZLZ", aVarM14546a.m14558b());
        return c14522eM19038b.m16017i();
    }

    /* JADX INFO: renamed from: a */
    public final String m14547a(String str) {
        String str2;
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(C21307a.f67720a));
        int[] iArr = AbstractC21311e.f67734a;
        C21314h format = C21314h.f67742d;
        AbstractC16544l.m18094g(bArrDigest, "<this>");
        AbstractC16544l.m18094g(format, "format");
        int length = bArrDigest.length;
        AbstractC9381v3.m9953a(0, length, bArrDigest.length);
        if (length == 0) {
            return "";
        }
        int[] iArr2 = format.f67743a ? AbstractC21311e.f67735b : AbstractC21311e.f67734a;
        C21312f c21312f = format.f67744b;
        if (c21312f.f67738a) {
            if (c21312f.f67739b) {
                char[] cArr = new char[AbstractC21311e.m21649a(((long) length) * 2)];
                int iM21651c = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    iM21651c = AbstractC21311e.m21651c(bArrDigest, i10, iArr2, cArr, iM21651c);
                }
                str2 = new String(cArr);
            } else if (length > 0) {
                long j10 = 0;
                char[] cArr2 = new char[AbstractC21311e.m21649a((((long) length) * (((2 + j10) + j10) + j10)) - j10)];
                int iM21654f = AbstractC21311e.m21654f("", cArr2, AbstractC21311e.m21651c(bArrDigest, 0, iArr2, cArr2, AbstractC21311e.m21654f("", cArr2, 0)));
                for (int i11 = 1; i11 < length; i11++) {
                    iM21654f = AbstractC21311e.m21654f("", cArr2, AbstractC21311e.m21651c(bArrDigest, i11, iArr2, cArr2, AbstractC21311e.m21654f("", cArr2, AbstractC21311e.m21654f("", cArr2, iM21654f))));
                }
                str2 = new String(cArr2);
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
            return str2;
        }
        if (length > 0) {
            int i12 = length - 1;
            int i13 = i12 / Integer.MAX_VALUE;
            int i14 = length % Integer.MAX_VALUE;
            if (i14 == 0) {
                i14 = Integer.MAX_VALUE;
            }
            int i15 = (i14 - 1) / Integer.MAX_VALUE;
            byte[] bArr = bArrDigest;
            long j11 = 0;
            int iM21649a = AbstractC21311e.m21649a(((2 + j11 + j11) * ((long) length)) + (((long) ((i12 - i13) - i15)) * j11) + (((long) i15) * ((long) 2)) + ((long) i13));
            char[] cArr3 = new char[iM21649a];
            int i16 = 0;
            int iM21654f2 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i16 < length) {
                if (i17 == Integer.MAX_VALUE) {
                    cArr3[iM21654f2] = '\n';
                    i18 = 0;
                    iM21654f2++;
                    i17 = 0;
                } else if (i18 == Integer.MAX_VALUE) {
                    iM21654f2 = AbstractC21311e.m21654f("  ", cArr3, iM21654f2);
                    i18 = 0;
                }
                if (i18 != 0) {
                    iM21654f2 = AbstractC21311e.m21654f("", cArr3, iM21654f2);
                }
                byte[] bArr2 = bArr;
                iM21654f2 = AbstractC21311e.m21654f("", cArr3, AbstractC21311e.m21651c(bArr2, i16, iArr2, cArr3, AbstractC21311e.m21654f("", cArr3, iM21654f2)));
                i18++;
                i17++;
                i16++;
                bArr = bArr2;
            }
            if (iM21654f2 == iM21649a) {
                return new String(cArr3);
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: renamed from: c */
    public final List<C17309l> m14555c(List<? extends C17309l> list) {
        while (true) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z6 = false;
            for (C17309l c17309l : list) {
                String str = (String) c17309l.f55136Y;
                List listM21697e0 = AbstractC21322p.m21697e0(str, new String[]{"[]"}, 2, 2);
                int size = listM21697e0.size();
                Object obj = c17309l.f55137Z;
                if (size == 1) {
                    arrayList.add(new C17309l(str, obj));
                } else {
                    String str2 = (String) listM21697e0.get(0);
                    String str3 = (String) listM21697e0.get(1);
                    if (linkedHashMap.get(str2) == null) {
                        linkedHashMap.put(str2, 0);
                    }
                    if (!linkedHashSet.add(str) && !AbstractC21322p.m21667A(str3, "[]", false)) {
                        Object obj2 = linkedHashMap.get(str2);
                        if (obj2 != null) {
                            linkedHashMap.put(str2, Integer.valueOf(((Number) obj2).intValue() + 1));
                            linkedHashSet.clear();
                            linkedHashSet.add(str);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    arrayList.add(new C17309l(str2 + "[" + linkedHashMap.get(str2) + "]" + str3, obj));
                    z6 = true;
                }
            }
            if (!z6) {
                return arrayList;
            }
            list = arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.withpersona.sdk2.inquiry.network.a] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final List<C17309l> m14550a(AbstractC17325B abstractC17325B) {
        ?? arrayList;
        Object obj;
        Object jSONArray;
        C17352s c17352sMo4143b = abstractC17325B.mo4143b();
        if (c17352sMo4143b == null) {
            return AbstractC9393x3.m9974d(new C17309l("", m14553b(abstractC17325B)));
        }
        if (c17352sMo4143b.f55300c.equals("json")) {
            String strM14553b = m14553b(abstractC17325B);
            if (!AbstractC16544l.m18089b(strM14553b, "{}") && !AbstractC16544l.m18089b(strM14553b, "[]")) {
                if (AbstractC21329w.m21734u(strM14553b, "{", false)) {
                    obj = strM14553b;
                    obj = strM14553b;
                    jSONArray = new JSONObject(strM14553b);
                } else if (AbstractC21329w.m21734u(strM14553b, "[", false)) {
                    obj = strM14553b;
                    obj = strM14553b;
                    obj = strM14553b;
                    jSONArray = new JSONArray(strM14553b);
                }
                obj = jSONArray;
            }
            obj = strM14553b;
            obj = strM14553b;
            obj = strM14553b;
            obj = strM14553b;
            obj = strM14553b;
            obj = strM14553b;
            if (obj instanceof String) {
                return AbstractC9393x3.m9974d(new C17309l("", obj));
            }
            return m14549a(obj);
        }
        String str = c17352sMo4143b.f55299b;
        if (str.equals("multipart")) {
            ArrayList arrayList2 = new ArrayList();
            for (C17353t c17353t : ((C17354u) abstractC17325B).f55310b) {
                C17348o c17348o = c17353t.f55302a;
                Iterable iterableM9974d = C17689w.f56480Y;
                String strM19012f = c17348o.m19012f(SIPHeaderNames.CONTENT_DISPOSITION);
                if (strM19012f != null) {
                    List listM21697e0 = AbstractC21322p.m21697e0(strM19012f, new String[]{Separators.SEMICOLON}, 0, 6);
                    arrayList = new ArrayList(AbstractC17682p.m19389r(listM21697e0, 10));
                    Iterator it = listM21697e0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC21322p.m21711s0((String) it.next()).toString());
                    }
                } else {
                    arrayList = iterableM9974d;
                }
                ?? r6 = f40850a;
                String strM14548a = r6.m14548a(arrayList);
                if (strM14548a != null) {
                    boolean zM14554b = r6.m14554b(arrayList);
                    AbstractC17325B abstractC17325B2 = c17353t.f55303b;
                    if (zM14554b) {
                        iterableM9974d = AbstractC9393x3.m9974d(new C17309l(strM14548a, Long.valueOf(abstractC17325B2.mo4142a())));
                    } else {
                        List<C17309l> listM14550a = r6.m14550a(abstractC17325B2);
                        if (listM14550a.isEmpty()) {
                            continue;
                        } else if (listM14550a.size() == 1) {
                            iterableM9974d = AbstractC9393x3.m9974d(new C17309l(strM14548a, listM14550a.get(0).f55137Z));
                        } else {
                            throw new IllegalArgumentException("Request body parts must contain a single value. Instead got: " + listM14550a + ". Part name: " + strM14548a);
                        }
                    }
                    AbstractC17686t.m19398v(iterableM9974d, arrayList2);
                } else {
                    throw new IllegalArgumentException("Request body parts must have names.");
                }
            }
            return AbstractC17680n.m19322C0(arrayList2);
        }
        if (str.equals("image")) {
            return AbstractC9393x3.m9974d(new C17309l("", Long.valueOf(abstractC17325B.mo4142a())));
        }
        throw new RuntimeException("Unsupported type: " + c17352sMo4143b);
    }

    /* JADX INFO: renamed from: a */
    public final List<C17309l> m14549a(Object obj) {
        ArrayList arrayList = new ArrayList();
        m14545a(this, obj, null, arrayList, 2, null);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14545a(C12889a c12889a, Object obj, String str, List list, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        c12889a.m14552a(obj, str, list);
    }

    /* JADX INFO: renamed from: a */
    public final void m14552a(Object obj, String str, List<C17309l> list) {
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C12889a c12889a = f40850a;
                Object objOpt = jSONObject.opt(next);
                if (str != null) {
                    next = str + "[" + next + "]";
                }
                c12889a.m14552a(objOpt, next, list);
            }
            return;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                m14552a(jSONArray.opt(i10), str == null ? AbstractC0010F.m19c(i10, "[", "]") : str + "[" + i10 + "]", list);
            }
            return;
        }
        if (str == null) {
            str = "";
        }
        list.add(new C17309l(str, obj));
    }

    /* JADX INFO: renamed from: a */
    public final String m14548a(List<String> list) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC21329w.m21734u((String) next, "name=", false));
        String str = (String) next;
        if (str != null) {
            return str.substring(6, str.length() - 1);
        }
        return null;
    }
}
