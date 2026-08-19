package p671c2;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: c2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C11561a {

    /* JADX INFO: renamed from: a */
    public String f34955a;

    /* JADX INFO: renamed from: b */
    public int f34956b;

    /* JADX INFO: renamed from: c */
    public int f34957c;

    /* JADX INFO: renamed from: d */
    public float f34958d;

    public final String toString() {
        String strM9892k = AbstractC9306j0.m9892k(new StringBuilder(), this.f34955a, ':');
        switch (this.f34956b) {
            case 900:
                StringBuilder sbM9893l = AbstractC9306j0.m9893l(strM9892k);
                sbM9893l.append(this.f34957c);
                return sbM9893l.toString();
            case 901:
                StringBuilder sbM9893l2 = AbstractC9306j0.m9893l(strM9892k);
                sbM9893l2.append(this.f34958d);
                return sbM9893l2.toString();
            case 902:
                StringBuilder sbM9893l3 = AbstractC9306j0.m9893l(strM9892k);
                String str = "00000000" + Integer.toHexString(this.f34957c);
                sbM9893l3.append(Separators.POUND + str.substring(str.length() - 8));
                return sbM9893l3.toString();
            case 903:
                return AbstractC10763a.m11052j(strM9892k, null);
            default:
                return AbstractC10763a.m11052j(strM9892k, "????");
        }
    }
}
