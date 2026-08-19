package p057C3;

import android.media.AudioManager;
import android.os.Handler;
import p001A.RunnableC0080p;

/* JADX INFO: renamed from: C3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1550b implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final Handler f4273a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1552c f4274b;

    public C1550b(C1552c c1552c, Handler handler) {
        this.f4274b = c1552c;
        this.f4273a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f4273a.post(new RunnableC0080p(this, i10, 2));
    }
}
