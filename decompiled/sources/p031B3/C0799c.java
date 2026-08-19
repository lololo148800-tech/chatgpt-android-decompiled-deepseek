package p031B3;

import android.media.MediaCodec;
import io.sentry.C15358g1;
import p003A1.AbstractC0224Z;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: B3.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0799c {

    /* JADX INFO: renamed from: a */
    public byte[] f2214a;

    /* JADX INFO: renamed from: b */
    public byte[] f2215b;

    /* JADX INFO: renamed from: c */
    public int f2216c;

    /* JADX INFO: renamed from: d */
    public int[] f2217d;

    /* JADX INFO: renamed from: e */
    public int[] f2218e;

    /* JADX INFO: renamed from: f */
    public int f2219f;

    /* JADX INFO: renamed from: g */
    public int f2220g;

    /* JADX INFO: renamed from: h */
    public int f2221h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f2222i;

    /* JADX INFO: renamed from: j */
    public final C15358g1 f2223j;

    public C0799c() {
        C15358g1 c15358g1;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f2222i = cryptoInfo;
        if (AbstractC20817s.f66106a >= 24) {
            c15358g1 = new C15358g1();
            c15358g1.f47945Y = cryptoInfo;
            c15358g1.f47946Z = AbstractC0224Z.m704f();
        } else {
            c15358g1 = null;
        }
        this.f2223j = c15358g1;
    }
}
