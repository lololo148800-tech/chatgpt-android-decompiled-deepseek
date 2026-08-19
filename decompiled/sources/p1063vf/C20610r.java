package p1063vf;

import android.app.Application;
import java.io.File;
import ni.C17628b;
import p005A3.C0331r;
import p005A3.C0334u;
import p1112xm.AbstractC21304h;
import p1119y3.C21372a;
import p948pi.C18418a;

/* JADX INFO: renamed from: vf.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C20610r {

    /* JADX INFO: renamed from: a */
    public final C0334u f65403a;

    public C20610r(Application application, C18418a c18418a, C17628b c17628b) {
        File file = new File(application.getCacheDir(), "text-to-speech/" + c18418a.f58775c);
        AbstractC21304h.m21640c(file);
        file.mkdirs();
        this.f65403a = new C0334u(file, new C0331r(), new C21372a(application.getApplicationContext(), "exoplayer_internal.db", null, 1));
        c17628b.m19237b(new C20609q(this, file, null));
    }
}
