package p571X9;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import p003A1.AbstractC0168G;
import p1113xn.AbstractC21322p;
import p195Hh.C3430e;
import p211I8.lPE.sRXLFOsOgS;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p479Td.AbstractC7343b0;
import p479Td.C7315A;
import p479Td.C7320F;
import p479Td.C7323I;
import p479Td.C7326L;
import p479Td.C7345c0;
import p479Td.C7363n;
import p479Td.C7373x;
import p523V9.AbstractC8160o6;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p919o8.C18001q;

/* JADX INFO: renamed from: X9.e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9280e4 {
    /* JADX INFO: renamed from: a */
    public static final List m9849a(AbstractC7343b0 abstractC7343b0) {
        AbstractC16544l.m18094g(abstractC7343b0, "<this>");
        if (!(abstractC7343b0 instanceof C7323I)) {
            return AbstractC9393x3.m9974d(abstractC7343b0);
        }
        List listM9974d = AbstractC9393x3.m9974d(abstractC7343b0);
        List list = ((C7323I) abstractC7343b0).f23229c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(m9849a((AbstractC7343b0) it.next()), arrayList);
        }
        return AbstractC17680n.m19361k0(arrayList, listM9974d);
    }

    /* JADX INFO: renamed from: c */
    public static final List m9851c(AbstractC7343b0 abstractC7343b0) {
        AbstractC16544l.m18094g(abstractC7343b0, "<this>");
        if (abstractC7343b0 instanceof C7373x) {
            return AbstractC9393x3.m9974d(((C7373x) abstractC7343b0).f23373c);
        }
        if (abstractC7343b0 instanceof C7315A) {
            return ((C7315A) abstractC7343b0).f23212c;
        }
        if (!(abstractC7343b0 instanceof C7323I)) {
            return C17689w.f56480Y;
        }
        List list = ((C7323I) abstractC7343b0).f23229c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(m9851c((AbstractC7343b0) it.next()), arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static final String m9852d(AbstractC7343b0 abstractC7343b0) {
        AbstractC16544l.m18094g(abstractC7343b0, "<this>");
        if (abstractC7343b0 instanceof C7326L) {
            return ((C7326L) abstractC7343b0).f23233c;
        }
        if (abstractC7343b0 instanceof C7320F) {
            return ((C7320F) abstractC7343b0).f23219c;
        }
        return abstractC7343b0 instanceof C7323I ? AbstractC17680n.m19349Y(((C7323I) abstractC7343b0).m7779c(), "", null, null, 0, null, C7345c0.f23256Z, 30) : "";
    }

    /* JADX INFO: renamed from: e */
    public static final String m9853e(AbstractC7343b0 abstractC7343b0) {
        AbstractC16544l.m18094g(abstractC7343b0, "<this>");
        if (abstractC7343b0 instanceof C7326L) {
            return ((C7326L) abstractC7343b0).f23233c;
        }
        if (abstractC7343b0 instanceof C7320F) {
            return (String) ((C7320F) abstractC7343b0).f23224h.getValue();
        }
        return abstractC7343b0 instanceof C7323I ? AbstractC17680n.m19349Y(((C7323I) abstractC7343b0).m7779c(), "", null, null, 0, null, C7345c0.f23257o0, 30) : "";
    }

    /* JADX INFO: renamed from: f */
    public static final String m9854f(String str, int i10, int i11, String replacement) {
        AbstractC16544l.m18094g(str, "<this>");
        AbstractC16544l.m18094g(replacement, "replacement");
        C17314q c17314qM9800c = AbstractC9227W.m9800c(C7363n.f23360q0);
        if (i10 < 0) {
            AbstractC8160o6.m8726a((C3430e) c17314qM9800c.getValue(), "Start index must be positive", null, 6);
            return str;
        }
        if (i11 < 0) {
            AbstractC8160o6.m8726a((C3430e) c17314qM9800c.getValue(), "End index must be positive", null, 6);
            return str;
        }
        if (i10 > i11) {
            AbstractC8160o6.m8726a((C3430e) c17314qM9800c.getValue(), "End index must be greater than the start index", null, 6);
            return str;
        }
        int iCodePointCount = str.codePointCount(0, str.length());
        if (i10 > iCodePointCount) {
            AbstractC8160o6.m8726a((C3430e) c17314qM9800c.getValue(), "End index (with code points) must be greater than the the start index", null, 6);
            return str;
        }
        if (i11 <= iCodePointCount) {
            return AbstractC21322p.m21692Z(str, str.offsetByCodePoints(0, i10), str.offsetByCodePoints(0, i11), replacement).toString();
        }
        AbstractC8160o6.m8726a((C3430e) c17314qM9800c.getValue(), AbstractC0168G.m532u("End index is out of range (", i11, " > ", iCodePointCount, Separators.RPAREN), null, 6);
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static C18001q m9850b(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("selector");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w(sRXLFOsOgS.VNcJmBdDpB);
            Long lValueOf = abstractC3673pM4395w2 != null ? Long.valueOf(abstractC3673pM4395w2.mo4382p()) : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("height");
            return new C18001q(strMo4384r, lValueOf, abstractC3673pM4395w3 != null ? Long.valueOf(abstractC3673pM4395w3.mo4382p()) : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type DdActionTarget", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type DdActionTarget", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type DdActionTarget", e12);
        }
    }
}
