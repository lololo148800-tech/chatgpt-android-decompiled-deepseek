package p057C3;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import livekit.org.webrtc.MediaStreamTrack;
import p003A1.AbstractC0232b0;
import p1016t3.C19778e;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: C3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1552c {

    /* JADX INFO: renamed from: a */
    public final AudioManager f4275a;

    /* JADX INFO: renamed from: b */
    public final C1550b f4276b;

    /* JADX INFO: renamed from: c */
    public SurfaceHolderCallbackC1523A f4277c;

    /* JADX INFO: renamed from: d */
    public C19778e f4278d;

    /* JADX INFO: renamed from: e */
    public int f4279e;

    /* JADX INFO: renamed from: f */
    public int f4280f;

    /* JADX INFO: renamed from: g */
    public float f4281g = 1.0f;

    /* JADX INFO: renamed from: h */
    public AudioFocusRequest f4282h;

    public C1552c(Context context, Handler handler, SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.f4275a = audioManager;
        this.f4277c = surfaceHolderCallbackC1523A;
        this.f4276b = new C1550b(this, handler);
        this.f4279e = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m2382a() {
        int i10 = this.f4279e;
        if (i10 == 1 || i10 == 0) {
            return;
        }
        int i11 = AbstractC20817s.f66106a;
        AudioManager audioManager = this.f4275a;
        if (i11 < 26) {
            audioManager.abandonAudioFocus(this.f4276b);
            return;
        }
        AudioFocusRequest audioFocusRequest = this.f4282h;
        if (audioFocusRequest != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2383b(int i10) {
        if (this.f4279e == i10) {
            return;
        }
        this.f4279e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f4281g == f10) {
            return;
        }
        this.f4281g = f10;
        SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A = this.f4277c;
        if (surfaceHolderCallbackC1523A != null) {
            C1526D c1526d = surfaceHolderCallbackC1523A.f4046Y;
            c1526d.m2249j0(1, Float.valueOf(c1526d.f4081e1 * c1526d.f4062L0.f4281g), 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m2384c(int i10, boolean z6) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderM753k;
        int i11 = 0;
        z = false;
        boolean z10 = false;
        if (i10 == 1 || this.f4280f != 1) {
            m2382a();
            m2383b(0);
            return 1;
        }
        if (!z6) {
            int i12 = this.f4279e;
            if (i12 != 1) {
                return i12 != 3 ? 1 : 0;
            }
            return -1;
        }
        if (this.f4279e == 2) {
            return 1;
        }
        int i13 = AbstractC20817s.f66106a;
        AudioManager audioManager = this.f4275a;
        C1550b c1550b = this.f4276b;
        if (i13 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f4282h;
            if (audioFocusRequest == null) {
                if (audioFocusRequest == null) {
                    AbstractC0232b0.m758p();
                    builderM753k = AbstractC0232b0.m749g(this.f4280f);
                } else {
                    AbstractC0232b0.m758p();
                    builderM753k = AbstractC0232b0.m753k(this.f4282h);
                }
                C19778e c19778e = this.f4278d;
                if (c19778e != null && c19778e.f62666a == 1) {
                    z10 = true;
                }
                c19778e.getClass();
                this.f4282h = builderM753k.setAudioAttributes((AudioAttributes) c19778e.m20736a().f45413Y).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(c1550b).build();
            }
            iRequestAudioFocus = audioManager.requestAudioFocus(this.f4282h);
        } else {
            C19778e c19778e2 = this.f4278d;
            c19778e2.getClass();
            int i14 = c19778e2.f62667b;
            if (i14 == 13) {
                i11 = 1;
            } else if (i14 != 2) {
                i11 = i14 != 3 ? 3 : 8;
            }
            iRequestAudioFocus = audioManager.requestAudioFocus(c1550b, i11, this.f4280f);
        }
        if (iRequestAudioFocus == 1) {
            m2383b(2);
            return 1;
        }
        m2383b(1);
        return -1;
    }
}
