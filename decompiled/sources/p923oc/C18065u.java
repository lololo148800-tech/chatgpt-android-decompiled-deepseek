package p923oc;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: oc.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C18065u {

    /* JADX INFO: renamed from: a */
    public C18064t f57622a;

    /* JADX INFO: renamed from: b */
    public C18064t f57623b;

    /* JADX INFO: renamed from: c */
    public C18064t f57624c;

    /* JADX INFO: renamed from: d */
    public C18064t f57625d;

    /* JADX INFO: renamed from: e */
    public C18064t f57626e;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18065u)) {
            return false;
        }
        C18065u c18065u = (C18065u) obj;
        return AbstractC16544l.m18089b(this.f57623b, c18065u.f57623b) && AbstractC16544l.m18089b(this.f57626e, c18065u.f57626e);
    }

    public final int hashCode() {
        Object obj = this.f57623b;
        Object obj2 = 0;
        if (obj == null) {
            obj = obj2;
        }
        int iHashCode = obj.hashCode() * 11;
        C18064t c18064t = this.f57626e;
        return ((c18064t != null ? c18064t : 0).hashCode() * 7) + iHashCode;
    }

    public final String toString() {
        return "AstNodeLinks(parent=" + this.f57622a + ", firstChild=" + this.f57623b + ", lastChild=" + this.f57624c + ", previous=" + this.f57625d + ", next=" + this.f57626e + Separators.RPAREN;
    }
}
