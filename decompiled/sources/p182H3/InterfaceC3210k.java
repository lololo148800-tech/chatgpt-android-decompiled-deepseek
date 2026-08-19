package p182H3;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p031B3.C0799c;
import p329N3.C5621k;

/* JADX INFO: renamed from: H3.k */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3210k {
    /* JADX INFO: renamed from: c */
    void mo4057c(int i10, C0799c c0799c, long j10, int i11);

    /* JADX INFO: renamed from: e */
    void mo4058e(int i10, int i11, int i12, long j10);

    void flush();

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    /* JADX INFO: renamed from: h */
    void mo4059h(int i10, long j10);

    /* JADX INFO: renamed from: i */
    int mo4060i();

    /* JADX INFO: renamed from: j */
    boolean mo4061j(C3218s c3218s);

    /* JADX INFO: renamed from: k */
    int mo4062k(MediaCodec.BufferInfo bufferInfo);

    /* JADX INFO: renamed from: l */
    void mo4063l(C5621k c5621k, Handler handler);

    /* JADX INFO: renamed from: m */
    void mo4064m(int i10);

    /* JADX INFO: renamed from: p */
    void mo4065p(Surface surface);

    void release();

    void releaseOutputBuffer(int i10, boolean z6);

    void setParameters(Bundle bundle);
}
