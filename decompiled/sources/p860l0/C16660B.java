package p860l0;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0569E;
import p025An.C0624m;
import p1013t0.C19717e;
import p523V9.AbstractC7966P5;

/* JADX INFO: renamed from: l0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C16660B {

    /* JADX INFO: renamed from: a */
    public final C19717e f53358a;

    /* JADX INFO: renamed from: b */
    public final C0624m f53359b;

    public C16660B(C19717e c19717e, C0624m c0624m) {
        this.f53358a = c19717e;
        this.f53359b = c0624m;
    }

    public final String toString() {
        String strM11054l;
        C0624m c0624m = this.f53359b;
        C0569E c0569e = (C0569E) c0624m.f1874q0.get(C0569E.f1784Z);
        String str = c0569e != null ? c0569e.f1785Y : null;
        StringBuilder sb2 = new StringBuilder("Request@");
        int iHashCode = hashCode();
        AbstractC7966P5.m8254b(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC16544l.m18093f(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        if (str == null || (strM11054l = AbstractC10763a.m11054l("[", str, "](")) == null) {
            strM11054l = Separators.LPAREN;
        }
        sb2.append(strM11054l);
        sb2.append("currentBounds()=");
        sb2.append(this.f53358a.invoke());
        sb2.append(", continuation=");
        sb2.append(c0624m);
        sb2.append(')');
        return sb2.toString();
    }
}
