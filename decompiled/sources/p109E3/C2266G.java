package p109E3;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import p057C3.C1527E;
import p720e6.C13288c;

/* JADX INFO: renamed from: E3.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2266G extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2267H f6934a;

    public C2266G(C2267H c2267h) {
        this.f6934a = c2267h;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        C2268I c2268i;
        C13288c c13288c;
        C1527E c1527e;
        if (audioTrack.equals(this.f6934a.f6937c.f7001w) && (c13288c = (c2268i = this.f6934a.f6937c).f6997s) != null && c2268i.f6965Y && (c1527e = ((C2271L) c13288c.f42001Y).f9751R0) != null) {
            c1527e.m2257a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f6934a.f6937c.f7001w)) {
            this.f6934a.f6937c.f6964X = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C2268I c2268i;
        C13288c c13288c;
        C1527E c1527e;
        if (audioTrack.equals(this.f6934a.f6937c.f7001w) && (c13288c = (c2268i = this.f6934a.f6937c).f6997s) != null && c2268i.f6965Y && (c1527e = ((C2271L) c13288c.f42001Y).f9751R0) != null) {
            c1527e.m2257a();
        }
    }
}
