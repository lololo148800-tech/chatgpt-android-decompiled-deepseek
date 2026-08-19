package p544W9;

import android.content.res.Resources;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.C21307a;
import p523V9.AbstractC7942M5;
import p523V9.AbstractC7958O5;

/* JADX INFO: renamed from: W9.Z2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8595Z2 {
    /* JADX INFO: renamed from: a */
    public static final String m9256a(Resources resources, int i10) {
        InputStream inputStreamOpenRawResource = resources.openRawResource(i10);
        AbstractC16544l.m18093f(inputStreamOpenRawResource, "openRawResource(resource)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, C21307a.f67720a), 8192);
        try {
            String strM8249b = AbstractC7958O5.m8249b(bufferedReader);
            AbstractC7942M5.m8232a(bufferedReader, null);
            return strM8249b;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC7942M5.m8232a(bufferedReader, th2);
                throw th3;
            }
        }
    }
}
