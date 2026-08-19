package p005A3;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.File;

/* JADX INFO: renamed from: A3.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0322i implements Comparable {

    /* JADX INFO: renamed from: Y */
    public final String f1121Y;

    /* JADX INFO: renamed from: Z */
    public final long f1122Z;

    /* JADX INFO: renamed from: o0 */
    public final long f1123o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f1124p0;

    /* JADX INFO: renamed from: q0 */
    public final File f1125q0;

    /* JADX INFO: renamed from: r0 */
    public final long f1126r0;

    public AbstractC0322i(String str, long j10, long j11, long j12, File file) {
        this.f1121Y = str;
        this.f1122Z = j10;
        this.f1123o0 = j11;
        this.f1124p0 = file != null;
        this.f1125q0 = file;
        this.f1126r0 = j12;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AbstractC0322i abstractC0322i) {
        String str = abstractC0322i.f1121Y;
        String str2 = this.f1121Y;
        if (!str2.equals(str)) {
            return str2.compareTo(abstractC0322i.f1121Y);
        }
        long j10 = this.f1122Z - abstractC0322i.f1122Z;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f1122Z);
        sb2.append(", ");
        return AbstractC10763a.m11050h(this.f1123o0, "]", sb2);
    }
}
