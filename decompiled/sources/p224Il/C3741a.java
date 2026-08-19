package p224Il;

import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import livekit.org.webrtc.VideoTrack;
import p112E6.C2343b;

/* JADX INFO: renamed from: Il.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3741a implements Closeable {

    /* JADX INFO: renamed from: Y */
    public boolean f11388Y;

    /* JADX INFO: renamed from: Z */
    public final LinkedHashMap f11389Z = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized void m4434a(Closeable closeable) {
        if (this.f11388Y) {
            closeable.close();
        } else {
            this.f11389Z.put(closeable, closeable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f11388Y = true;
            Iterator it = this.f11389Z.values().iterator();
            while (it.hasNext()) {
                ((Closeable) it.next()).close();
            }
            this.f11389Z.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m4435e(VideoTrack videoTrack, C2343b c2343b) {
        if (this.f11388Y) {
            c2343b.close();
        } else {
            this.f11389Z.put(videoTrack, c2343b);
        }
    }
}
