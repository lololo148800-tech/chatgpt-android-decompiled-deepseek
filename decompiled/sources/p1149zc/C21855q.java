package p1149zc;

import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.AbstractC22014i;
import p1155zi.EnumC22000e1;

/* JADX INFO: renamed from: zc.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C21855q implements InterfaceC21856r {

    /* JADX INFO: renamed from: a */
    public final EnumC22000e1 f69323a;

    /* JADX INFO: renamed from: b */
    public final String f69324b;

    /* JADX INFO: renamed from: c */
    public final AbstractC22014i f69325c;

    /* JADX INFO: renamed from: d */
    public final String f69326d;

    public C21855q(EnumC22000e1 enumC22000e1, String str, AbstractC22014i abstractC22014i, String str2) {
        this.f69323a = enumC22000e1;
        this.f69324b = str;
        this.f69325c = abstractC22014i;
        this.f69326d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21855q)) {
            return false;
        }
        C21855q c21855q = (C21855q) obj;
        if (this.f69323a != c21855q.f69323a || !AbstractC16544l.m18089b(this.f69324b, c21855q.f69324b) || !AbstractC16544l.m18089b(this.f69325c, c21855q.f69325c)) {
            return false;
        }
        String str = this.f69326d;
        String str2 = c21855q.f69326d;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b;
    }

    public final int hashCode() {
        int iHashCode = this.f69323a.hashCode() * 31;
        String str = this.f69324b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AbstractC22014i abstractC22014i = this.f69325c;
        int iHashCode3 = (iHashCode2 + (abstractC22014i == null ? 0 : abstractC22014i.hashCode())) * 31;
        String str2 = this.f69326d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
