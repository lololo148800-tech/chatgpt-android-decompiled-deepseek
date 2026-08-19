package p594Y9;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p595Ya.AbstractC10010a;
import p909nm.AbstractC17673g;

/* JADX INFO: renamed from: Y9.G4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9734G4 {
    /* JADX INFO: renamed from: a */
    public static final boolean m10322a(Object[] objArr, int i10, int i11, List list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!AbstractC16544l.m18089b(objArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final String m10323b(Object[] objArr, int i10, int i11, AbstractC17673g abstractC17673g) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == abstractC17673g) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static final void m10324c(Object[] objArr, int i10, int i11) {
        AbstractC16544l.m18094g(objArr, "<this>");
        while (i10 < i11) {
            objArr[i10] = null;
            i10++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m10325d(Bitmap bitmap) {
        int i10 = AbstractC10010a.f29696a[bitmap.getConfig().ordinal()];
        if (i10 == 1) {
            return 4;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
    }
}
