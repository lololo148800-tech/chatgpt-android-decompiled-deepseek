package p371P1;

import android.os.Build;
import io.sentry.hints.C15370i;
import p310M9.C5311e;

/* JADX INFO: renamed from: P1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6308d {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6307c f20440a;

    static {
        f20440a = Build.VERSION.SDK_INT >= 24 ? new C5311e(8) : new C15370i(13);
    }
}
