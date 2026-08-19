package p057C3;

import java.util.Locale;
import p001A.AbstractC0010F;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: C3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1556e {

    /* JADX INFO: renamed from: a */
    public int f4311a;

    /* JADX INFO: renamed from: b */
    public int f4312b;

    /* JADX INFO: renamed from: c */
    public int f4313c;

    /* JADX INFO: renamed from: d */
    public int f4314d;

    /* JADX INFO: renamed from: e */
    public int f4315e;

    /* JADX INFO: renamed from: f */
    public int f4316f;

    /* JADX INFO: renamed from: g */
    public int f4317g;

    /* JADX INFO: renamed from: h */
    public int f4318h;

    /* JADX INFO: renamed from: i */
    public int f4319i;

    /* JADX INFO: renamed from: j */
    public int f4320j;

    /* JADX INFO: renamed from: k */
    public long f4321k;

    /* JADX INFO: renamed from: l */
    public int f4322l;

    public final String toString() {
        int i10 = this.f4311a;
        int i11 = this.f4312b;
        int i12 = this.f4313c;
        int i13 = this.f4314d;
        int i14 = this.f4315e;
        int i15 = this.f4316f;
        int i16 = this.f4317g;
        int i17 = this.f4318h;
        int i18 = this.f4319i;
        int i19 = this.f4320j;
        long j10 = this.f4321k;
        int i20 = this.f4322l;
        int i21 = AbstractC20817s.f66106a;
        Locale locale = Locale.US;
        StringBuilder sbM21e = AbstractC0010F.m21e("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        sbM21e.append(i12);
        sbM21e.append("\n skippedInputBuffers=");
        sbM21e.append(i13);
        sbM21e.append("\n renderedOutputBuffers=");
        sbM21e.append(i14);
        sbM21e.append("\n skippedOutputBuffers=");
        sbM21e.append(i15);
        sbM21e.append("\n droppedBuffers=");
        sbM21e.append(i16);
        sbM21e.append("\n droppedInputBuffers=");
        sbM21e.append(i17);
        sbM21e.append("\n maxConsecutiveDroppedBuffers=");
        sbM21e.append(i18);
        sbM21e.append("\n droppedToKeyframeEvents=");
        sbM21e.append(i19);
        sbM21e.append("\n totalVideoFrameProcessingOffsetUs=");
        sbM21e.append(j10);
        sbM21e.append("\n videoFrameProcessingOffsetCount=");
        sbM21e.append(i20);
        sbM21e.append("\n}");
        return sbM21e.toString();
    }
}
