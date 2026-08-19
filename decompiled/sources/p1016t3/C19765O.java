package p1016t3;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import p003A1.AbstractC0168G;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: t3.O */
/* JADX INFO: loaded from: classes.dex */
public final class C19765O {

    /* JADX INFO: renamed from: a */
    public final int f62602a;

    /* JADX INFO: renamed from: b */
    public final String f62603b;

    /* JADX INFO: renamed from: c */
    public final int f62604c;

    /* JADX INFO: renamed from: d */
    public final C19788o[] f62605d;

    /* JADX INFO: renamed from: e */
    public int f62606e;

    static {
        AbstractC20817s.m21425z(0);
        AbstractC20817s.m21425z(1);
    }

    public C19765O(String str, C19788o... c19788oArr) {
        AbstractC20800b.m21316d(c19788oArr.length > 0);
        this.f62603b = str;
        this.f62605d = c19788oArr;
        this.f62602a = c19788oArr.length;
        int iM20707e = AbstractC19754D.m20707e(c19788oArr[0].f62752m);
        this.f62604c = iM20707e == -1 ? AbstractC19754D.m20707e(c19788oArr[0].f62751l) : iM20707e;
        String str2 = c19788oArr[0].f62743d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i10 = c19788oArr[0].f62745f | 16384;
        for (int i11 = 1; i11 < c19788oArr.length; i11++) {
            String str3 = c19788oArr[i11].f62743d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m20729a(i11, "languages", c19788oArr[0].f62743d, c19788oArr[i11].f62743d);
                return;
            } else {
                if (i10 != (c19788oArr[i11].f62745f | 16384)) {
                    m20729a(i11, "role flags", Integer.toBinaryString(c19788oArr[0].f62745f), Integer.toBinaryString(c19788oArr[i11].f62745f));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20729a(int i10, String str, String str2, String str3) {
        StringBuilder sbM9896o = AbstractC9306j0.m9896o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM9896o.append(str3);
        sbM9896o.append("' (track ");
        sbM9896o.append(i10);
        sbM9896o.append(Separators.RPAREN);
        AbstractC20800b.m21325m("TrackGroup", "", new IllegalStateException(sbM9896o.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19765O.class != obj.getClass()) {
            return false;
        }
        C19765O c19765o = (C19765O) obj;
        return this.f62603b.equals(c19765o.f62603b) && Arrays.equals(this.f62605d, c19765o.f62605d);
    }

    public final int hashCode() {
        if (this.f62606e == 0) {
            this.f62606e = Arrays.hashCode(this.f62605d) + AbstractC0168G.m527p(527, 31, this.f62603b);
        }
        return this.f62606e;
    }
}
