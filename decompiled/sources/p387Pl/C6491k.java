package p387Pl;

import android.media.projection.MediaProjection;
import p197Hj.C3457c;

/* JADX INFO: renamed from: Pl.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C6491k extends MediaProjection.Callback {

    /* JADX INFO: renamed from: a */
    public C3457c f21058a;

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() throws Throwable {
        C3457c c3457c = this.f21058a;
        if (c3457c != null) {
            c3457c.invoke();
        }
    }
}
