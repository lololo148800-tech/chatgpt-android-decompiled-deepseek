package mo;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: mo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C17340g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a10 = (String) obj;
        String b = (String) obj2;
        AbstractC16544l.m18094g(a10, "a");
        AbstractC16544l.m18094g(b, "b");
        int iMin = Math.min(a10.length(), b.length());
        for (int i10 = 4; i10 < iMin; i10++) {
            char cCharAt = a10.charAt(i10);
            char cCharAt2 = b.charAt(i10);
            if (cCharAt != cCharAt2) {
                if (AbstractC16544l.m18096i(cCharAt, cCharAt2) >= 0) {
                    return 1;
                }
                return -1;
            }
        }
        int length = a10.length();
        int length2 = b.length();
        if (length == length2) {
            return 0;
        }
        if (length >= length2) {
            return 1;
        }
        return -1;
    }
}
