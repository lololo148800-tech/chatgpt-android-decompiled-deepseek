package p544W9;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: W9.X3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8584X3 {
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0012, code lost:
    
        if (r5 == false) goto L14;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m9249a(int i10, int i11, int i12, boolean z6) {
        if (i11 < i12) {
            if (z6) {
                if (z6) {
                    if (!z6) {
                        return 0;
                    }
                } else if (!z6) {
                    return 0;
                }
            } else if (z6 ? i12 - i11 <= i10 : i11 > i10) {
                if (!z6) {
                    return 0;
                }
            } else if (z6) {
                i10 -= i11;
            }
            return i10;
        }
        if (z6) {
            return 0;
        }
        return i12 - i11;
    }

    /* JADX INFO: renamed from: b */
    public static final File m9250b(Context context, String fileName) {
        AbstractC16544l.m18094g(context, "<this>");
        AbstractC16544l.m18094g(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), AbstractC16544l.m18100m(fileName, "datastore/"));
    }
}
