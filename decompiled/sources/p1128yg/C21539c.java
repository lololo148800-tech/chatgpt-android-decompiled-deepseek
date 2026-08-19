package p1128yg;

import android.os.Build;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.jvm.internal.AbstractC16544l;
import p077Cn.EnumC1733a;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p893n.AbstractActivityC17375g;

/* JADX INFO: renamed from: yg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C21539c {

    /* JADX INFO: renamed from: a */
    public final C3430e f68222a = AbstractC8168p6.m8749b("ScreenshotObserver", null);

    /* JADX INFO: renamed from: b */
    public C21538b f68223b;

    /* JADX INFO: renamed from: c */
    public final C2127D0 f68224c;

    /* JADX INFO: renamed from: d */
    public final C2127D0 f68225d;

    public C21539c() {
        C2127D0 c2127d0M3203b = AbstractC2124C.m3203b(0, 1, EnumC1733a.f4962Z, 1);
        this.f68224c = c2127d0M3203b;
        this.f68225d = c2127d0M3203b;
    }

    /* JADX INFO: renamed from: a */
    public final void m21826a(InterfaceC11112u owner) {
        AbstractC16544l.m18094g(owner, "owner");
        if (Build.VERSION.SDK_INT < 34 || !(owner instanceof AbstractActivityC17375g)) {
            return;
        }
        C21538b c21538b = this.f68223b;
        if (c21538b != null) {
            try {
                ((AbstractActivityC17375g) owner).unregisterScreenCaptureCallback(c21538b);
            } catch (IllegalStateException e10) {
                AbstractC8160o6.m8727b(this.f68222a, "Failed to unregister screen capture callback", e10, 4);
            }
        }
        this.f68223b = null;
    }
}
