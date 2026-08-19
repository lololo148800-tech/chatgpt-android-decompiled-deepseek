package p1143z4;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.net.Uri;
import android.os.Bundle;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p1039ud.C20198o;
import p1070w.C20694c;
import p1091wn.AbstractC21031l;
import p1091wn.C21020a;
import p1113xn.AbstractC21322p;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8634g;
import p544W9.AbstractC8652j;
import p692d0.C12960M;
import p692d0.C12961N;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.C17677k;

/* JADX INFO: renamed from: z4.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21790t {

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ int f69129t0 = 0;

    /* JADX INFO: renamed from: Y */
    public final String f69130Y;

    /* JADX INFO: renamed from: Z */
    public C21792v f69131Z;

    /* JADX INFO: renamed from: o0 */
    public final ArrayList f69132o0;

    /* JADX INFO: renamed from: p0 */
    public final C12960M f69133p0;

    /* JADX INFO: renamed from: q0 */
    public final LinkedHashMap f69134q0;

    /* JADX INFO: renamed from: r0 */
    public int f69135r0;

    /* JADX INFO: renamed from: s0 */
    public String f69136s0;

    static {
        new LinkedHashMap();
    }

    public AbstractC21790t(AbstractC21769K navigator) {
        AbstractC16544l.m18094g(navigator, "navigator");
        LinkedHashMap linkedHashMap = C21770L.f69053b;
        this.f69130Y = AbstractC8652j.m9332e(navigator.getClass());
        this.f69132o0 = new ArrayList();
        this.f69133p0 = new C12960M(0);
        this.f69134q0 = new LinkedHashMap();
    }

    public boolean equals(Object obj) {
        boolean z6;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AbstractC21790t)) {
            return false;
        }
        AbstractC21790t abstractC21790t = (AbstractC21790t) obj;
        boolean zM18089b = AbstractC16544l.m18089b(this.f69132o0, abstractC21790t.f69132o0);
        C12960M c12960m = this.f69133p0;
        int iM14655f = c12960m.m14655f();
        C12960M c12960m2 = abstractC21790t.f69133p0;
        if (iM14655f != c12960m2.m14655f()) {
            z6 = false;
            break;
        }
        Iterator it = ((C21020a) AbstractC21031l.m21483g(new C12961N(c12960m))).iterator();
        while (true) {
            if (!it.hasNext()) {
                z6 = true;
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (!AbstractC16544l.m18089b(c12960m.m14652c(iIntValue), c12960m2.m14652c(iIntValue))) {
                z6 = false;
                break;
            }
        }
        LinkedHashMap linkedHashMap = this.f69134q0;
        int size = linkedHashMap.size();
        LinkedHashMap linkedHashMap2 = abstractC21790t.f69134q0;
        if (size != linkedHashMap2.size()) {
            z10 = false;
            break;
        }
        Iterator it2 = ((Iterable) AbstractC17680n.m19329H(linkedHashMap.entrySet()).f2104b).iterator();
        while (true) {
            if (!it2.hasNext()) {
                z10 = true;
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            if (!linkedHashMap2.containsKey(entry.getKey()) || !AbstractC16544l.m18089b(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                z10 = false;
                break;
            }
        }
        return this.f69135r0 == abstractC21790t.f69135r0 && AbstractC16544l.m18089b(this.f69136s0, abstractC21790t.f69136s0) && zM18089b && z6 && z10;
    }

    /* JADX INFO: renamed from: f */
    public final void m22278f(C21786p navDeepLink) {
        AbstractC16544l.m18094g(navDeepLink, "navDeepLink");
        ArrayList arrayListM8927r = AbstractC8301I.m8927r(this.f69134q0, new C20198o(navDeepLink, 17));
        if (arrayListM8927r.isEmpty()) {
            this.f69132o0.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.f69107a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + arrayListM8927r).toString());
    }

    public int hashCode() {
        int i10 = this.f69135r0 * 31;
        String str = this.f69136s0;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        Iterator it = this.f69132o0.iterator();
        while (it.hasNext()) {
            int i11 = iHashCode * 31;
            String str2 = ((C21786p) it.next()).f69107a;
            iHashCode = (i11 + (str2 != null ? str2.hashCode() : 0)) * 961;
        }
        C12960M c12960m = this.f69133p0;
        AbstractC16544l.m18094g(c12960m, "<this>");
        if (c12960m.m14655f() > 0) {
            c12960m.m14656g(0).getClass();
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMap = this.f69134q0;
        for (String str3 : linkedHashMap.keySet()) {
            int iM527p = AbstractC0168G.m527p(iHashCode * 31, 31, str3);
            Object obj = linkedHashMap.get(str3);
            iHashCode = iM527p + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public final Bundle m22279j(Bundle bundle) {
        LinkedHashMap linkedHashMap = this.f69134q0;
        if (bundle == null && (linkedHashMap == null || linkedHashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            C21776f c21776f = (C21776f) entry.getValue();
            c21776f.getClass();
            AbstractC16544l.m18094g(name, "name");
            if (c21776f.f69069c) {
                c21776f.f69067a.mo5896e(bundle2, name, c21776f.f69070d);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                C21776f c21776f2 = (C21776f) entry2.getValue();
                c21776f2.getClass();
                AbstractC16544l.m18094g(name2, "name");
                AbstractC21767I abstractC21767I = c21776f2.f69067a;
                if (c21776f2.f69068b || !bundle2.containsKey(name2) || bundle2.get(name2) != null) {
                    try {
                        abstractC21767I.mo5893a(name2, bundle2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbM11058p = AbstractC10763a.m11058p("Wrong argument type for '", name2, "' in argument bundle. ");
                sbM11058p.append(abstractC21767I.mo5894b());
                sbM11058p.append(" expected.");
                throw new IllegalArgumentException(sbM11058p.toString().toString());
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX INFO: renamed from: m */
    public final int[] m22280m(AbstractC21790t abstractC21790t) {
        C17677k c17677k = new C17677k();
        AbstractC21790t abstractC21790t2 = this;
        while (true) {
            C21792v c21792v = abstractC21790t2.f69131Z;
            if ((abstractC21790t != null ? abstractC21790t.f69131Z : null) != null) {
                C21792v c21792v2 = abstractC21790t.f69131Z;
                AbstractC16544l.m18091d(c21792v2);
                if (c21792v2.m22284s(abstractC21790t2.f69135r0, true) != abstractC21790t2) {
                    if (c21792v != null || c21792v.f69142v0 != abstractC21790t2.f69135r0) {
                        c17677k.addFirst(abstractC21790t2);
                    }
                    if (!AbstractC16544l.m18089b(c21792v, abstractC21790t) || c21792v == null) {
                        break;
                    }
                    abstractC21790t2 = c21792v;
                } else {
                    c17677k.addFirst(abstractC21790t2);
                    break;
                }
            } else {
                if (c21792v != null) {
                    c17677k.addFirst(abstractC21790t2);
                } else {
                    c17677k.addFirst(abstractC21790t2);
                }
                if (!AbstractC16544l.m18089b(c21792v, abstractC21790t)) {
                    break;
                }
                abstractC21790t2 = c21792v;
            }
        }
        List listM19322C0 = AbstractC17680n.m19322C0(c17677k);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(listM19322C0, 10));
        Iterator it = listM19322C0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((AbstractC21790t) it.next()).f69135r0));
        }
        return AbstractC17680n.m19321B0(arrayList);
    }

    /* JADX INFO: renamed from: p */
    public final C21789s m22281p(String route) {
        AbstractC16544l.m18094g(route, "route");
        Uri uri = Uri.parse(AbstractC8634g.m9293g(route));
        AbstractC16544l.m18090c(uri, "Uri.parse(this)");
        C20694c c20694c = new C20694c(uri, null, null, 2);
        return this instanceof C21792v ? ((C21792v) this).m22286u(c20694c) : mo22282q(c20694c);
    }

    /* JADX INFO: renamed from: r */
    public final void m22283r(String str) {
        if (str == null) {
            this.f69135r0 = 0;
        } else {
            if (AbstractC21322p.m21681O(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strM9293g = AbstractC8634g.m9293g(str);
            this.f69135r0 = strM9293g.hashCode();
            m22278f(new C21786p(strM9293g));
        }
        ArrayList arrayList = this.f69132o0;
        for (Object obj : arrayList) {
            if (AbstractC16544l.m18089b(((C21786p) obj).f69107a, AbstractC8634g.m9293g(this.f69136s0))) {
                AbstractC16529F.m18077a(arrayList);
                arrayList.remove(obj);
                this.f69136s0 = str;
            }
        }
        obj = null;
        AbstractC16529F.m18077a(arrayList);
        arrayList.remove(obj);
        this.f69136s0 = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f69135r0));
        sb2.append(Separators.RPAREN);
        String str = this.f69136s0;
        if (str != null && !AbstractC21322p.m21681O(str)) {
            sb2.append(" route=");
            sb2.append(this.f69136s0);
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "sb.toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:65:0x0142  */
    /* JADX WARN: Code duplicated, block: B:67:0x0147 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0156  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169  */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0185  */
    /* JADX WARN: Code duplicated, block: B:88:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: q */
    public C21789s mo22282q(C20694c c20694c) {
        Bundle bundle;
        int size;
        String str;
        boolean z6;
        C21789s c21789s;
        Bundle bundle2;
        Pattern pattern;
        Matcher matcher;
        Matcher matcher2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        ArrayList<C21786p> arrayList = this.f69132o0;
        Bundle bundle3 = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        C21789s c21789s2 = null;
        for (C21786p c21786p : arrayList) {
            LinkedHashMap arguments = this.f69134q0;
            Uri uri = (Uri) c20694c.f65551b;
            if (uri != null) {
                c21786p.getClass();
                AbstractC16544l.m18094g(arguments, "arguments");
                Pattern pattern2 = (Pattern) c21786p.f69110d.getValue();
                if (pattern2 != null) {
                    matcher6 = pattern2.matcher(uri.toString());
                } else {
                    matcher3 = bundle3;
                }
                if (matcher3 != 0 && matcher3.matches()) {
                    bundle = new Bundle();
                    if (c21786p.m22275b(matcher3, bundle, arguments) && (!((Boolean) c21786p.f69111e.getValue()).booleanValue() || c21786p.m22276c(uri, bundle, arguments))) {
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        String fragment = uri.getFragment();
                        Pattern pattern3 = (Pattern) c21786p.f69117k.getValue();
                        if (pattern3 != null) {
                            matcher5 = pattern3.matcher(String.valueOf(fragment));
                        } else {
                            matcher4 = bundle3;
                        }
                        if (matcher4 != 0 && matcher4.matches()) {
                            matcher4 = matcher5;
                            List list = (List) c21786p.f69115i.getValue();
                            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
                            int i10 = 0;
                            for (Object obj : list) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    AbstractC17681o.m19388q();
                                    throw null;
                                }
                                String str2 = (String) obj;
                                String value = Uri.decode(matcher4.group(i11));
                                C21776f c21776f = (C21776f) arguments.get(str2);
                                try {
                                    AbstractC16544l.m18093f(value, "value");
                                    C21786p.m22274d(bundle, str2, value, c21776f);
                                    arrayList2.add(C17296C.f55119a);
                                    i10 = i11;
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        }
                        matcher4 = matcher5;
                        matcher4 = matcher5;
                        if (!AbstractC8301I.m8927r(arguments, new C21785o(0, bundle)).isEmpty()) {
                            bundle = null;
                        }
                    } else {
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        matcher3 = matcher6;
                        bundle = bundle3;
                    }
                } else {
                    matcher3 = matcher6;
                    matcher3 = matcher6;
                    matcher3 = matcher6;
                    matcher3 = matcher6;
                    bundle = bundle3;
                }
            } else {
                bundle = null;
            }
            if (uri != null) {
                String str3 = c21786p.f69107a;
                if (str3 != null) {
                    List<String> requestedPathSegments = uri.getPathSegments();
                    List<String> pathSegments = Uri.parse(str3).getPathSegments();
                    AbstractC16544l.m18093f(requestedPathSegments, "requestedPathSegments");
                    AbstractC16544l.m18093f(pathSegments, qffLJgOYizGmMj.ERSOTvPNiWiZAz);
                    size = AbstractC17680n.m19346V(requestedPathSegments, pathSegments).size();
                }
                str = (String) c20694c.f65552c;
                if (str != null) {
                    c21786p.getClass();
                    bundle3 = null;
                    z6 = str.equals(null);
                    if (((String) c20694c.f65553d) != null) {
                        c21786p.getClass();
                    }
                    if (bundle != null) {
                        if (!z6) {
                            AbstractC16544l.m18094g(arguments, "arguments");
                            bundle2 = new Bundle();
                            if (uri != null) {
                                pattern = (Pattern) c21786p.f69110d.getValue();
                                if (pattern != null) {
                                    matcher2 = pattern.matcher(uri.toString());
                                } else {
                                    matcher = bundle3;
                                }
                                if (matcher != 0 && matcher.matches()) {
                                    c21786p.m22275b(matcher, bundle2, arguments);
                                    if (((Boolean) c21786p.f69111e.getValue()).booleanValue()) {
                                        matcher = matcher2;
                                        c21786p.m22276c(uri, bundle2, arguments);
                                    }
                                }
                            }
                            matcher = matcher2;
                            matcher = matcher2;
                            matcher = matcher2;
                            if (AbstractC8301I.m8927r(arguments, new C21785o(1, bundle2)).isEmpty()) {
                            }
                        }
                    }
                    c21789s = new C21789s(this, bundle, c21786p.f69118l, size, z6, -1);
                    if (c21789s2 != null || c21789s.compareTo(c21789s2) > 0) {
                        c21789s2 = c21789s;
                    }
                } else {
                    bundle3 = null;
                }
                if (((String) c20694c.f65553d) != null) {
                    c21786p.getClass();
                }
                if (bundle != null) {
                    if (!z6) {
                        AbstractC16544l.m18094g(arguments, "arguments");
                        bundle2 = new Bundle();
                        if (uri != null) {
                            pattern = (Pattern) c21786p.f69110d.getValue();
                            if (pattern != null) {
                                matcher2 = pattern.matcher(uri.toString());
                            } else {
                                matcher = bundle3;
                            }
                            if (matcher != 0) {
                                c21786p.m22275b(matcher, bundle2, arguments);
                                if (((Boolean) c21786p.f69111e.getValue()).booleanValue()) {
                                    matcher = matcher2;
                                    c21786p.m22276c(uri, bundle2, arguments);
                                }
                            }
                        }
                        matcher = matcher2;
                        matcher = matcher2;
                        matcher = matcher2;
                        if (AbstractC8301I.m8927r(arguments, new C21785o(1, bundle2)).isEmpty()) {
                        }
                    }
                }
                c21789s = new C21789s(this, bundle, c21786p.f69118l, size, z6, -1);
                if (c21789s2 != null) {
                }
                c21789s2 = c21789s;
            } else {
                c21786p.getClass();
            }
            size = 0;
            str = (String) c20694c.f65552c;
            if (str != null) {
                c21786p.getClass();
                bundle3 = null;
                if (str.equals(null)) {
                }
                if (((String) c20694c.f65553d) != null) {
                    c21786p.getClass();
                }
                if (bundle != null) {
                    if (!z6) {
                        AbstractC16544l.m18094g(arguments, "arguments");
                        bundle2 = new Bundle();
                        if (uri != null) {
                            pattern = (Pattern) c21786p.f69110d.getValue();
                            if (pattern != null) {
                                matcher2 = pattern.matcher(uri.toString());
                            } else {
                                matcher = bundle3;
                            }
                            if (matcher != 0) {
                                c21786p.m22275b(matcher, bundle2, arguments);
                                if (((Boolean) c21786p.f69111e.getValue()).booleanValue()) {
                                    matcher = matcher2;
                                    c21786p.m22276c(uri, bundle2, arguments);
                                }
                            }
                        }
                        matcher = matcher2;
                        matcher = matcher2;
                        matcher = matcher2;
                        if (AbstractC8301I.m8927r(arguments, new C21785o(1, bundle2)).isEmpty()) {
                        }
                    }
                }
                c21789s = new C21789s(this, bundle, c21786p.f69118l, size, z6, -1);
                if (c21789s2 != null) {
                }
                c21789s2 = c21789s;
            } else {
                bundle3 = null;
            }
            if (((String) c20694c.f65553d) != null) {
                c21786p.getClass();
            }
            if (bundle != null) {
                if (!z6) {
                    AbstractC16544l.m18094g(arguments, "arguments");
                    bundle2 = new Bundle();
                    if (uri != null) {
                        pattern = (Pattern) c21786p.f69110d.getValue();
                        if (pattern != null) {
                            matcher2 = pattern.matcher(uri.toString());
                        } else {
                            matcher = bundle3;
                        }
                        if (matcher != 0) {
                            c21786p.m22275b(matcher, bundle2, arguments);
                            if (((Boolean) c21786p.f69111e.getValue()).booleanValue()) {
                                matcher = matcher2;
                                c21786p.m22276c(uri, bundle2, arguments);
                            }
                        }
                    }
                    matcher = matcher2;
                    matcher = matcher2;
                    matcher = matcher2;
                    if (AbstractC8301I.m8927r(arguments, new C21785o(1, bundle2)).isEmpty()) {
                    }
                }
            }
            c21789s = new C21789s(this, bundle, c21786p.f69118l, size, z6, -1);
            if (c21789s2 != null) {
            }
            c21789s2 = c21789s;
        }
        return c21789s2;
    }
}
