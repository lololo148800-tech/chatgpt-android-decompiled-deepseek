package pf;

import android.app.Application;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p1061vb.C20513d;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;

/* JADX INFO: renamed from: pf.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C18407w {

    /* JADX INFO: renamed from: a */
    public final Application f58711a;

    /* JADX INFO: renamed from: b */
    public final C3430e f58712b;

    /* JADX INFO: renamed from: c */
    public MediaCodec f58713c;

    /* JADX INFO: renamed from: d */
    public MediaExtractor f58714d;

    /* JADX INFO: renamed from: e */
    public float f58715e;

    /* JADX INFO: renamed from: f */
    public float f58716f;

    /* JADX INFO: renamed from: g */
    public String f58717g;

    /* JADX INFO: renamed from: h */
    public int f58718h;

    /* JADX INFO: renamed from: i */
    public long f58719i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f58720j;

    /* JADX INFO: renamed from: k */
    public long f58721k;

    /* JADX INFO: renamed from: l */
    public float f58722l;

    public C18407w(Application context, C20513d dispatcherProvider) {
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(dispatcherProvider, "dispatcherProvider");
        this.f58711a = context;
        this.f58712b = AbstractC8168p6.m8749b("WaveformExtractor", null);
        this.f58718h = 1;
        this.f58720j = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m19868a(float f10) {
        long j10 = this.f58721k;
        long j11 = this.f58719i;
        if (j10 == j11) {
            float f11 = this.f58716f + 1.0f;
            this.f58716f = f11;
            if (f11 / 100 > 1.0f) {
                m19869b();
                return;
            }
            this.f58720j.add(Float.valueOf((float) Math.sqrt(this.f58722l / j11)));
            this.f58721k = 0L;
            this.f58722l = 0.0f;
        }
        this.f58721k++;
        this.f58722l += (float) Math.pow(f10, 2.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m19869b() {
        if (this.f58717g == null) {
            return;
        }
        this.f58717g = null;
        MediaCodec mediaCodec = this.f58713c;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        MediaCodec mediaCodec2 = this.f58713c;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        MediaExtractor mediaExtractor = this.f58714d;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
    }
}
