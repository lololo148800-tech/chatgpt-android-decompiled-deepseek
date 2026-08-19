package pf;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16524A;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.C16558z;
import p025An.C0624m;
import p571X9.AbstractC9233X;

/* JADX INFO: renamed from: pf.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C18405u extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C16556x f58702a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C18407w f58703b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0624m f58704c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C16558z f58705d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C16558z f58706e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C16524A f58707f;

    public C18405u(C16556x c16556x, C18407w c18407w, C0624m c0624m, C16558z c16558z, C16558z c16558z2, C16524A c16524a) {
        this.f58702a = c16556x;
        this.f58703b = c18407w;
        this.f58704c = c0624m;
        this.f58705d = c16558z;
        this.f58706e = c16558z2;
        this.f58707f = c16524a;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec codec, MediaCodec.CodecException e10) {
        AbstractC16544l.m18094g(codec, "codec");
        AbstractC16544l.m18094g(e10, "e");
        this.f58703b.m19869b();
        this.f58704c.resumeWith(AbstractC9233X.m9806b(e10));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec codec, int i10) {
        MediaExtractor mediaExtractor;
        AbstractC16544l.m18094g(codec, "codec");
        C16556x c16556x = this.f58702a;
        if (c16556x.f51285Y || (mediaExtractor = this.f58703b.f58714d) == null) {
            return;
        }
        try {
            ByteBuffer inputBuffer = codec.getInputBuffer(i10);
            if (inputBuffer != null) {
                int sampleData = mediaExtractor.readSampleData(inputBuffer, 0);
                if (sampleData > 0) {
                    codec.queueInputBuffer(i10, 0, sampleData, mediaExtractor.getSampleTime(), 0);
                    mediaExtractor.advance();
                } else {
                    codec.queueInputBuffer(i10, 0, 0, 0L, 4);
                    c16556x.f51285Y = true;
                }
            }
        } catch (Exception e10) {
            C0624m c0624m = this.f58704c;
            if (c0624m.m1266w()) {
                c0624m.resumeWith(AbstractC9233X.m9806b(e10));
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec codec, int i10, MediaCodec.BufferInfo info) {
        AbstractC16544l.m18094g(codec, "codec");
        AbstractC16544l.m18094g(info, "info");
        int i11 = info.size;
        C0624m c0624m = this.f58704c;
        C18407w c18407w = this.f58703b;
        if (i11 > 0) {
            try {
                ByteBuffer outputBuffer = codec.getOutputBuffer(i10);
                if (outputBuffer == null) {
                    return;
                }
                int i12 = info.size;
                outputBuffer.position(info.offset);
                int i13 = this.f58706e.f51287Y;
                char c9 = '\b';
                if (i13 == 8) {
                    int i14 = i12 / (c18407w.f58718h == 2 ? 2 : 1);
                    for (int i15 = 0; i15 < i14; i15++) {
                        float f10 = outputBuffer.get() / 127.0f;
                        if (c18407w.f58718h == 2) {
                            outputBuffer.get();
                        }
                        c18407w.m19868a(f10);
                    }
                } else if (i13 == 16) {
                    int i16 = i12 / (c18407w.f58718h == 2 ? 4 : 2);
                    for (int i17 = 0; i17 < i16; i17++) {
                        float f11 = (outputBuffer.get() | (outputBuffer.get() << 8)) / 32767.0f;
                        if (c18407w.f58718h == 2) {
                            outputBuffer.get();
                            outputBuffer.get();
                        }
                        c18407w.m19868a(f11);
                    }
                } else if (i13 == 32) {
                    int i18 = i12 / (c18407w.f58718h == 2 ? 8 : 4);
                    int i19 = 0;
                    while (i19 < i18) {
                        int i20 = i18;
                        float f12 = ((((((long) outputBuffer.get()) << c9) | outputBuffer.get()) | (((long) outputBuffer.get()) << 16)) | (((long) outputBuffer.get()) << 24)) / 2.1474836E9f;
                        if (c18407w.f58718h == 2) {
                            outputBuffer.get();
                            outputBuffer.get();
                            outputBuffer.get();
                            outputBuffer.get();
                        }
                        c18407w.m19868a(f12);
                        i19++;
                        i18 = i20;
                        c9 = '\b';
                    }
                }
                codec.releaseOutputBuffer(i10, false);
            } catch (Exception e10) {
                c18407w.m19869b();
                c0624m.resumeWith(AbstractC9233X.m9806b(e10));
            }
        }
        if ((info.flags & 4) != 0) {
            c18407w.m19869b();
            c0624m.resumeWith(c18407w.f58720j);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec codec, MediaFormat format) {
        int integer;
        AbstractC16544l.m18094g(codec, "codec");
        AbstractC16544l.m18094g(format, "format");
        int integer2 = format.getInteger("sample-rate");
        C16558z c16558z = this.f58705d;
        c16558z.f51287Y = integer2;
        int integer3 = format.getInteger("channel-count");
        C18407w c18407w = this.f58703b;
        c18407w.f58718h = integer3;
        int i10 = 16;
        if (Build.VERSION.SDK_INT >= 24 && format.containsKey("pcm-encoding") && (integer = format.getInteger("pcm-encoding")) != 2) {
            if (integer == 3) {
                i10 = 8;
            } else if (integer == 4) {
                i10 = 32;
            }
        }
        this.f58706e.f51287Y = i10;
        long j10 = (long) (c16558z.f51287Y * c18407w.f58715e);
        this.f58707f.f51261Y = j10;
        c18407w.f58719i = j10 / ((long) 100);
    }
}
