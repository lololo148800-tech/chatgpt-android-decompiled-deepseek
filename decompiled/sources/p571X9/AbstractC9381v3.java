package p571X9;

import p001A.AbstractC0010F;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: X9.v3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9381v3 {
    /* JADX INFO: renamed from: a */
    public static void m9953a(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbM21e = AbstractC0010F.m21e("startIndex: ", i10, ", endIndex: ", i11, ", size: ");
            sbM21e.append(i12);
            throw new IndexOutOfBoundsException(sbM21e.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("startIndex: ", i10, i11, " > endIndex: "));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9954b(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbM21e = AbstractC0010F.m21e("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            sbM21e.append(i12);
            throw new IndexOutOfBoundsException(sbM21e.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(AbstractC17792x.m19534q("fromIndex: ", i10, i11, " > toIndex: "));
        }
    }
}
