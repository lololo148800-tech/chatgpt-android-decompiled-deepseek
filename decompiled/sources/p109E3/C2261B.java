package p109E3;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import p1016t3.C19778e;
import p1016t3.C19788o;
import p1031u3.C20098a;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: E3.B */
/* JADX INFO: loaded from: classes.dex */
public final class C2261B {

    /* JADX INFO: renamed from: a */
    public final C19788o f6913a;

    /* JADX INFO: renamed from: b */
    public final int f6914b;

    /* JADX INFO: renamed from: c */
    public final int f6915c;

    /* JADX INFO: renamed from: d */
    public final int f6916d;

    /* JADX INFO: renamed from: e */
    public final int f6917e;

    /* JADX INFO: renamed from: f */
    public final int f6918f;

    /* JADX INFO: renamed from: g */
    public final int f6919g;

    /* JADX INFO: renamed from: h */
    public final int f6920h;

    /* JADX INFO: renamed from: i */
    public final C20098a f6921i;

    /* JADX INFO: renamed from: j */
    public final boolean f6922j;

    /* JADX INFO: renamed from: k */
    public final boolean f6923k;

    /* JADX INFO: renamed from: l */
    public final boolean f6924l;

    public C2261B(C19788o c19788o, int i10, int i11, int i12, int i13, int i14, int i15, int i16, C20098a c20098a, boolean z6, boolean z10, boolean z11) {
        this.f6913a = c19788o;
        this.f6914b = i10;
        this.f6915c = i11;
        this.f6916d = i12;
        this.f6917e = i13;
        this.f6918f = i14;
        this.f6919g = i15;
        this.f6920h = i16;
        this.f6921i = c20098a;
        this.f6922j = z6;
        this.f6923k = z10;
        this.f6924l = z11;
    }

    /* JADX INFO: renamed from: c */
    public static AudioAttributes m3301c(C19778e c19778e, boolean z6) {
        return z6 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) c19778e.m20736a().f45413Y;
    }

    /* JADX INFO: renamed from: a */
    public final AudioTrack m3302a(C19778e c19778e, int i10) {
        int i11 = this.f6915c;
        try {
            AudioTrack audioTrackM3303b = m3303b(c19778e, i10);
            int state = audioTrackM3303b.getState();
            if (state == 1) {
                return audioTrackM3303b;
            }
            try {
                audioTrackM3303b.release();
            } catch (Exception unused) {
            }
            throw new C2291o(state, this.f6917e, this.f6918f, this.f6920h, this.f6913a, i11 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new C2291o(0, this.f6917e, this.f6918f, this.f6920h, this.f6913a, i11 == 1, e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final AudioTrack m3303b(C19778e c19778e, int i10) {
        int i11 = AbstractC20817s.f66106a;
        int i12 = 0;
        boolean z6 = this.f6924l;
        int i13 = this.f6917e;
        int i14 = this.f6919g;
        int i15 = this.f6918f;
        if (i11 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(m3301c(c19778e, z6)).setAudioFormat(AbstractC20817s.m21414o(i13, i15, i14)).setTransferMode(1).setBufferSizeInBytes(this.f6920h).setSessionId(i10).setOffloadedPlayback(this.f6915c == 1).build();
        }
        if (i11 >= 21) {
            return new AudioTrack(m3301c(c19778e, z6), AbstractC20817s.m21414o(i13, i15, i14), this.f6920h, 1, i10);
        }
        int i16 = c19778e.f62667b;
        if (i16 == 13) {
            i12 = 1;
        } else if (i16 != 2) {
            i12 = i16 != 3 ? 3 : 8;
        }
        if (i10 == 0) {
            return new AudioTrack(i12, this.f6917e, this.f6918f, this.f6919g, this.f6920h, 1);
        }
        return new AudioTrack(i12, this.f6917e, this.f6918f, this.f6919g, this.f6920h, 1, i10);
    }
}
