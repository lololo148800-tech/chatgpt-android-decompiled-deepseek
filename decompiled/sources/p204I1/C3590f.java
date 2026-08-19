package p204I1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1139z0.C21585H;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: I1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3590f implements CharSequence {

    /* JADX INFO: renamed from: Y */
    public final String f10934Y;

    /* JADX INFO: renamed from: Z */
    public final List f10935Z;

    /* JADX INFO: renamed from: o0 */
    public final List f10936o0;

    /* JADX INFO: renamed from: p0 */
    public final List f10937p0;

    static {
        C21585H c21585h = AbstractC3572C.f10837a;
    }

    public C3590f(String str, List list, List list2, List list3) {
        this.f10934Y = str;
        this.f10935Z = list;
        this.f10936o0 = list2;
        this.f10937p0 = list3;
        if (list2 != null) {
            List listM19370t0 = AbstractC17680n.m19370t0(list2, new C3589e());
            int size = listM19370t0.size();
            int i10 = -1;
            int i11 = 0;
            while (i11 < size) {
                C3588d c3588d = (C3588d) listM19370t0.get(i11);
                if (c3588d.f10931b < i10) {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
                int length = this.f10934Y.length();
                int i12 = c3588d.f10932c;
                if (i12 > length) {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c3588d.f10931b + ", " + i12 + ") is out of boundary").toString());
                }
                i11++;
                i10 = i12;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final List m4298a(int i10) {
        List list = this.f10937p0;
        if (list == null) {
            return C17689w.f56480Y;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            C3588d c3588d = (C3588d) obj;
            if ((c3588d.f10930a instanceof AbstractC3597m) && AbstractC3591g.m4304c(0, i10, c3588d.f10931b, c3588d.f10932c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List m4299b() {
        List list = this.f10935Z;
        return list == null ? C17689w.f56480Y : list;
    }

    /* JADX INFO: renamed from: c */
    public final List m4300c(int i10, int i11, String str) {
        List list = this.f10937p0;
        if (list == null) {
            return C17689w.f56480Y;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            C3588d c3588d = (C3588d) obj;
            if ((c3588d.f10930a instanceof String) && AbstractC16544l.m18089b(str, c3588d.f10933d) && AbstractC3591g.m4304c(i10, i11, c3588d.f10931b, c3588d.f10932c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f10934Y.charAt(i10);
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C3590f subSequence(int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
        }
        String str = this.f10934Y;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i10, i11);
        AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new C3590f(strSubstring, AbstractC3591g.m4302a(this.f10935Z, i10, i11), AbstractC3591g.m4302a(this.f10936o0, i10, i11), AbstractC3591g.m4302a(this.f10937p0, i10, i11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3590f)) {
            return false;
        }
        C3590f c3590f = (C3590f) obj;
        return AbstractC16544l.m18089b(this.f10934Y, c3590f.f10934Y) && AbstractC16544l.m18089b(this.f10935Z, c3590f.f10935Z) && AbstractC16544l.m18089b(this.f10936o0, c3590f.f10936o0) && AbstractC16544l.m18089b(this.f10937p0, c3590f.f10937p0);
    }

    public final int hashCode() {
        int iHashCode = this.f10934Y.hashCode() * 31;
        List list = this.f10935Z;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f10936o0;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f10937p0;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f10934Y.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f10934Y;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3590f(int i10, String str, ArrayList arrayList) {
        Collection collection = (i10 & 2) != 0 ? C17689w.f56480Y : arrayList;
        this(str, (List) (collection.isEmpty() ? null : collection), null, null);
    }
}
