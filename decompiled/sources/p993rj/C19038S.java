package p993rj;

import android.content.Context;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p523V9.AbstractC8012V5;
import p670c1.AbstractC11557a;
import p949pj.AbstractC18459d;
import p949pj.C18457c;

/* JADX INFO: renamed from: rj.S */
/* JADX INFO: loaded from: classes3.dex */
public final class C19038S {

    /* JADX INFO: renamed from: a */
    public final Context f60686a;

    /* JADX INFO: renamed from: b */
    public final C19032L f60687b;

    /* JADX INFO: renamed from: c */
    public final int f60688c;

    /* JADX INFO: renamed from: d */
    public final int f60689d;

    /* JADX INFO: renamed from: e */
    public final boolean f60690e;

    /* JADX INFO: renamed from: f */
    public final Surface f60691f;

    /* JADX INFO: renamed from: g */
    public File f60692g;

    /* JADX INFO: renamed from: h */
    public MediaRecorder f60693h;

    /* JADX INFO: renamed from: i */
    public boolean f60694i;

    public C19038S(Context context, C19032L cameraChoice, int i10, int i11, boolean z6) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(cameraChoice, "cameraChoice");
        this.f60686a = context;
        this.f60687b = cameraChoice;
        this.f60688c = i10;
        this.f60689d = i11;
        this.f60690e = z6;
        this.f60691f = MediaCodec.createPersistentInputSurface();
        this.f60692g = m20295b();
        this.f60693h = Build.VERSION.SDK_INT >= 31 ? AbstractC11557a.m12938c(context) : new MediaRecorder();
    }

    /* JADX INFO: renamed from: a */
    public final Surface m20294a() {
        Surface surface = this.f60691f;
        if (surface != null) {
            return surface;
        }
        Surface surface2 = this.f60693h.getSurface();
        AbstractC16544l.m18093f(surface2, "getSurface(...)");
        return surface2;
    }

    /* JADX INFO: renamed from: b */
    public final File m20295b() {
        return new File(this.f60686a.getCacheDir(), AbstractC0168G.m533v("video_recording_", System.currentTimeMillis(), ".mp4"));
    }

    /* JADX INFO: renamed from: c */
    public final void m20296c(boolean z6) throws Throwable {
        int i10;
        C18457c c18457c;
        if (!z6) {
            this.f60692g = m20295b();
        }
        boolean z10 = AbstractC8012V5.m8333f(this.f60686a) && this.f60690e;
        this.f60693h.setVideoSource(2);
        if (z10) {
            this.f60693h.setAudioSource(1);
        }
        this.f60693h.setOutputFormat(2);
        this.f60693h.setVideoFrameRate(this.f60688c);
        MediaRecorder mediaRecorder = this.f60693h;
        C19032L c19032l = this.f60687b;
        int width = c19032l.f60670b.getWidth();
        Size size = c19032l.f60670b;
        mediaRecorder.setVideoSize(width, size.getHeight());
        this.f60693h.setVideoEncoder(2);
        MediaRecorder mediaRecorder2 = this.f60693h;
        int height = size.getHeight() * size.getWidth();
        if (height <= 172800) {
            i10 = 400000;
        } else if (height <= 409920) {
            i10 = 500000;
        } else if (height <= 921600) {
            i10 = 1500000;
        } else if (height <= 2073600) {
            i10 = 3000000;
        } else {
            i10 = height <= 3686400 ? 6000000 : 10000000;
        }
        mediaRecorder2.setVideoEncodingBitRate(i10);
        if (z10) {
            Iterator it = AbstractC18459d.f58901a.iterator();
            while (true) {
                c18457c = null;
                audioRecord = null;
                AudioRecord audioRecord = null;
                AudioRecord audioRecord2 = null;
                if (!it.hasNext()) {
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                try {
                    int minBufferSize = AudioRecord.getMinBufferSize(iIntValue, 16, 2);
                    if (minBufferSize != -2) {
                        AudioRecord audioRecord3 = new AudioRecord(1, iIntValue, 16, 2, minBufferSize);
                        try {
                            if (audioRecord3.getState() == 1) {
                                audioRecord3.release();
                                c18457c = new C18457c(iIntValue, minBufferSize);
                                audioRecord3.release();
                                break;
                            }
                            audioRecord3.release();
                        } catch (IllegalArgumentException unused) {
                            audioRecord = audioRecord3;
                            if (audioRecord != null) {
                                audioRecord.release();
                            }
                        } catch (SecurityException unused2) {
                            audioRecord = audioRecord3;
                            if (audioRecord != null) {
                                audioRecord.release();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            audioRecord2 = audioRecord3;
                            if (audioRecord2 != null) {
                                audioRecord2.release();
                            }
                            throw th;
                        }
                    }
                } catch (IllegalArgumentException unused3) {
                } catch (SecurityException unused4) {
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (c18457c != null) {
                this.f60693h.setAudioSamplingRate(c18457c.f58899a);
                this.f60693h.setAudioChannels(1);
            }
            this.f60693h.setAudioEncoder(3);
        }
        this.f60693h.setOrientationHint(this.f60689d);
        this.f60693h.setInputSurface(m20294a());
        this.f60693h.setOutputFile(this.f60692g.getAbsolutePath());
        this.f60693h.prepare();
    }
}
