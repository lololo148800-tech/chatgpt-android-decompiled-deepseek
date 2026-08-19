package p057C3;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import cn.UfGr.EhBykzn;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import p1016t3.AbstractC19756F;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p232J3.C4253y;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: C3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1567l extends AbstractC19756F {

    /* JADX INFO: renamed from: o0 */
    public final int f4383o0;

    /* JADX INFO: renamed from: p0 */
    public final String f4384p0;

    /* JADX INFO: renamed from: q0 */
    public final int f4385q0;

    /* JADX INFO: renamed from: r0 */
    public final C19788o f4386r0;

    /* JADX INFO: renamed from: s0 */
    public final int f4387s0;

    /* JADX INFO: renamed from: t0 */
    public final C4253y f4388t0;

    /* JADX INFO: renamed from: u0 */
    public final boolean f4389u0;

    static {
        AbstractC17792x.m19540w(1001, 1002, 1003, 1004, 1005);
        AbstractC20817s.m21425z(1006);
    }

    public C1567l(int i10, int i11, Exception exc) {
        this(i10, exc, i11, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1567l(String str, Throwable th2, int i10, int i11, String str2, int i12, C19788o c19788o, int i13, C4253y c4253y, long j10, boolean z6) {
        super(str, th2, i10, j10);
        Bundle bundle = Bundle.EMPTY;
        AbstractC20800b.m21316d(!z6 || i11 == 1);
        AbstractC20800b.m21316d(th2 != null || i11 == 3);
        this.f4383o0 = i11;
        this.f4384p0 = str2;
        this.f4385q0 = i12;
        this.f4386r0 = c19788o;
        this.f4387s0 = i13;
        this.f4388t0 = c4253y;
        this.f4389u0 = z6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1567l(int i10, Exception exc, int i11, String str, int i12, C19788o c19788o, int i13, boolean z6) {
        String string;
        String str2;
        if (i10 == 0) {
            string = lZYtIbClQJm.cGXL;
        } else if (i10 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" error, index=");
            sb2.append(i12);
            sb2.append(", format=");
            sb2.append(c19788o);
            sb2.append(", format_supported=");
            int i14 = AbstractC20817s.f66106a;
            if (i13 == 0) {
                str2 = "NO";
            } else if (i13 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str2 = EhBykzn.pMhur;
            } else if (i13 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i13 == 4) {
                str2 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb2.append(str2);
            string = sb2.toString();
        } else if (i10 != 3) {
            string = "Unexpected runtime error";
        } else {
            string = "Remote error";
        }
        this(TextUtils.isEmpty(null) ? string : AbstractC10763a.m11052j(string, ": null"), exc, i11, i10, str, i12, c19788o, i13, null, SystemClock.elapsedRealtime(), z6);
    }
}
