package p764g6;

import io.sentry.internal.debugmeta.C15384c;
import java.io.Closeable;
import java.util.Arrays;
import p025An.C0644w;
import p174Gk.uSfJ.HpucjswO;
import p232J3.C4206F;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: g6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13821a implements Closeable {

    /* JADX INFO: renamed from: q0 */
    public static final String[] f43825q0 = new String[128];

    /* JADX INFO: renamed from: Y */
    public int f43826Y;

    /* JADX INFO: renamed from: Z */
    public int[] f43827Z;

    /* JADX INFO: renamed from: o0 */
    public String[] f43828o0;

    /* JADX INFO: renamed from: p0 */
    public int[] f43829p0;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f43825q0[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f43825q0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = HpucjswO.jGVnwXiIVfNB;
        strArr[12] = "\\f";
    }

    /* JADX INFO: renamed from: D */
    public abstract void mo15421D();

    /* JADX INFO: renamed from: E */
    public final String m15422E() {
        int i10 = this.f43826Y;
        int[] iArr = this.f43827Z;
        String[] strArr = this.f43828o0;
        int[] iArr2 = this.f43829p0;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append('[');
                sb2.append(iArr2[i11]);
                sb2.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append('.');
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: O */
    public abstract double mo15423O();

    /* JADX INFO: renamed from: P */
    public abstract int mo15424P();

    /* JADX INFO: renamed from: S */
    public final void m15425S(int i10) {
        int i11 = this.f43826Y;
        int[] iArr = this.f43827Z;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new C0644w("Nesting too deep at " + m15422E());
            }
            this.f43827Z = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f43828o0;
            this.f43828o0 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f43829p0;
            this.f43829p0 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f43827Z;
        int i12 = this.f43826Y;
        this.f43826Y = i12 + 1;
        iArr3[i12] = i10;
    }

    /* JADX INFO: renamed from: S0 */
    public abstract boolean mo15426S0();

    /* JADX INFO: renamed from: T */
    public abstract int mo15427T(C15384c c15384c);

    /* JADX INFO: renamed from: W */
    public abstract void mo15428W();

    /* JADX INFO: renamed from: a */
    public abstract void mo15429a();

    /* JADX INFO: renamed from: e */
    public abstract void mo15430e();

    /* JADX INFO: renamed from: g0 */
    public abstract int mo15431g0();

    public abstract boolean hasNext();

    /* JADX INFO: renamed from: j0 */
    public final void m15432j0(String str) throws C4206F {
        StringBuilder sbM9895n = AbstractC9306j0.m9895n(str, " at path ");
        sbM9895n.append(m15422E());
        throw new C4206F(sbM9895n.toString());
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo15433k();

    /* JADX INFO: renamed from: m */
    public abstract void mo15434m();

    /* JADX INFO: renamed from: x */
    public abstract String mo15435x();
}
