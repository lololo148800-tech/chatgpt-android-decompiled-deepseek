package p109E3;

import android.media.AudioTrack;

/* JADX INFO: renamed from: E3.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2296t {

    /* JADX INFO: renamed from: a */
    public final C2295s f7092a;

    /* JADX INFO: renamed from: b */
    public int f7093b;

    /* JADX INFO: renamed from: c */
    public long f7094c;

    /* JADX INFO: renamed from: d */
    public long f7095d;

    /* JADX INFO: renamed from: e */
    public long f7096e;

    /* JADX INFO: renamed from: f */
    public long f7097f;

    public C2296t(AudioTrack audioTrack) {
        this.f7092a = new C2295s(audioTrack);
        m3381a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3381a() {
        if (this.f7092a != null) {
            m3382b(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3382b(int i10) {
        this.f7093b = i10;
        if (i10 == 0) {
            this.f7096e = 0L;
            this.f7097f = -1L;
            this.f7094c = System.nanoTime() / 1000;
            this.f7095d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f7095d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f7095d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f7095d = 500000L;
        }
    }
}
