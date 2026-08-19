package p334Na;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: Na.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5701h {

    /* JADX INFO: renamed from: a */
    public final Context f18484a;

    public C5701h(Context context) {
        this.f18484a = context;
    }

    /* JADX INFO: renamed from: a */
    public static long m6142a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jM6142a = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jM6142a += m6142a(file2);
            }
        }
        return jM6142a;
    }
}
