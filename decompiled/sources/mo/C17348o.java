package mo;

import android.gov.nist.core.Separators;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import no.AbstractC17708b;
import p003A1.AbstractC0168G;
import p003A1.C0284r0;
import p076Cm.InterfaceC1723a;
import p228J.C3847l0;
import p523V9.AbstractC7965P4;
import p817j$.util.DesugarCollections;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import ro.AbstractC19258b;

/* JADX INFO: renamed from: mo.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C17348o implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final String[] f55284Y;

    public C17348o(String[] strArr) {
        this.f55284Y = strArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17348o) {
            if (Arrays.equals(this.f55284Y, ((C17348o) obj).f55284Y)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final String m19012f(String name) {
        AbstractC16544l.m18094g(name, "name");
        String[] strArr = this.f55284Y;
        int length = strArr.length - 2;
        int iM8252c = AbstractC7965P4.m8252c(length, 0, -2);
        if (iM8252c <= length) {
            while (!name.equalsIgnoreCase(strArr[length])) {
                if (length != iM8252c) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f55284Y);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C17309l[] c17309lArr = new C17309l[size];
        for (int i10 = 0; i10 < size; i10++) {
            c17309lArr[i10] = new C17309l(m19014m(i10), m19018s(i10));
        }
        return AbstractC16544l.m18098k(c17309lArr);
    }

    /* JADX INFO: renamed from: j */
    public final Date m19013j(String str) {
        String strM19012f = m19012f(str);
        if (strM19012f == null) {
            return null;
        }
        C0284r0 c0284r0 = AbstractC19258b.f61050a;
        if (strM19012f.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) AbstractC19258b.f61050a.get()).parse(strM19012f, parsePosition);
        if (parsePosition.getIndex() == strM19012f.length()) {
            return date;
        }
        String[] strArr = AbstractC19258b.f61051b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    DateFormat[] dateFormatArr = AbstractC19258b.f61052c;
                    DateFormat simpleDateFormat = dateFormatArr[i10];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(AbstractC19258b.f61051b[i10], Locale.US);
                        simpleDateFormat.setTimeZone(AbstractC17708b.f56540e);
                        dateFormatArr[i10] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(strM19012f, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final String m19014m(int i10) {
        return this.f55284Y[i10 * 2];
    }

    /* JADX INFO: renamed from: p */
    public final Set m19015p() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC16544l.m18093f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            treeSet.add(m19014m(i10));
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(treeSet);
        AbstractC16544l.m18093f(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    /* JADX INFO: renamed from: q */
    public final C3847l0 m19016q() {
        C3847l0 c3847l0 = new C3847l0(3);
        AbstractC17686t.m19399w(c3847l0.f11629a, this.f55284Y);
        return c3847l0;
    }

    /* JADX INFO: renamed from: r */
    public final TreeMap m19017r() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC16544l.m18093f(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM19014m = m19014m(i10);
            Locale locale = Locale.US;
            String strM534w = AbstractC0168G.m534w(locale, "US", strM19014m, locale, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(strM534w);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strM534w, arrayList);
            }
            arrayList.add(m19018s(i10));
        }
        return treeMap;
    }

    /* JADX INFO: renamed from: s */
    public final String m19018s(int i10) {
        return this.f55284Y[(i10 * 2) + 1];
    }

    public final int size() {
        return this.f55284Y.length / 2;
    }

    /* JADX INFO: renamed from: t */
    public final List m19019t(String name) {
        AbstractC16544l.m18094g(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (name.equalsIgnoreCase(m19014m(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(m19018s(i10));
            }
        }
        if (arrayList == null) {
            return C17689w.f56480Y;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        AbstractC16544l.m18093f(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM19014m = m19014m(i10);
            String strM19018s = m19018s(i10);
            sb2.append(strM19014m);
            sb2.append(": ");
            if (AbstractC17708b.m19426r(strM19014m)) {
                strM19018s = "██";
            }
            sb2.append(strM19018s);
            sb2.append(Separators.RETURN);
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
