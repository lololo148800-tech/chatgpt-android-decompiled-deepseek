package com.withpersona.sdk2.inquiry.selfie.video_capture;

import android.content.Context;
import android.gov.nist.core.Separators;
import bj.InterfaceC11468o;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17312o;
import p523V9.AbstractC8012V5;
import p571X9.AbstractC9233X;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17680n;
import tj.EnumC19999a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "", "", "maxRecordingLengthMs", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "enabledCaptureFileTypes", "Ltj/a;", "videoCaptureMethods", "", "webRtcJwt", "", "recordAudio", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;", "selfie_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class VideoCaptureConfig {

    /* JADX INFO: renamed from: a */
    public final long f40856a;

    /* JADX INFO: renamed from: b */
    public final List f40857b;

    /* JADX INFO: renamed from: c */
    public final List f40858c;

    /* JADX INFO: renamed from: d */
    public final String f40859d;

    /* JADX INFO: renamed from: e */
    public final boolean f40860e;

    public VideoCaptureConfig(long j10, List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, List<? extends EnumC19999a> videoCaptureMethods, @InterfaceC11468o(name = "webRTCJwt") String str, boolean z6) {
        AbstractC16544l.m18094g(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        AbstractC16544l.m18094g(videoCaptureMethods, "videoCaptureMethods");
        this.f40856a = j10;
        this.f40857b = enabledCaptureFileTypes;
        this.f40858c = videoCaptureMethods;
        this.f40859d = str;
        this.f40860e = z6;
    }

    /* JADX INFO: renamed from: a */
    public final Serializable m14562a(Context context) {
        if (!this.f40857b.contains(NextStep.Selfie.CaptureFileType.Video)) {
            return Boolean.FALSE;
        }
        Serializable serializableM14563b = m14563b(context);
        Throwable thM18979a = C17312o.m18979a(serializableM14563b);
        if (thM18979a != null) {
            return AbstractC9233X.m9806b(thM18979a);
        }
        EnumC19999a enumC19999a = (EnumC19999a) serializableM14563b;
        return Boolean.valueOf(enumC19999a == EnumC19999a.f63314Y || enumC19999a == EnumC19999a.f63315Z);
    }

    /* JADX INFO: renamed from: b */
    public final Serializable m14563b(Context context) {
        NextStep.Selfie.CaptureFileType captureFileType = NextStep.Selfie.CaptureFileType.Video;
        List list = this.f40857b;
        if (!list.contains(captureFileType)) {
            return EnumC19999a.f63316o0;
        }
        boolean zContains = list.contains(captureFileType);
        List list2 = this.f40858c;
        if (!zContains || AbstractC17680n.m19343S(list2) != EnumC19999a.f63314Y) {
            EnumC19999a enumC19999a = EnumC19999a.f63315Z;
            if (!list2.contains(enumC19999a) && (enumC19999a = (EnumC19999a) AbstractC17680n.m19343S(list2)) == null) {
                enumC19999a = EnumC19999a.f63316o0;
            }
            return enumC19999a;
        }
        EnumC19999a enumC19999a2 = EnumC19999a.f63315Z;
        if (list2.contains(enumC19999a2)) {
            return AbstractC8012V5.m8332e(context) ? AbstractC9233X.m9806b(new RuntimeException()) : enumC19999a2;
        }
        List<NextStep.Selfie.CaptureFileType> list3 = list;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            for (NextStep.Selfie.CaptureFileType captureFileType2 : list3) {
                if (captureFileType2 != NextStep.Selfie.CaptureFileType.Video && captureFileType2 != NextStep.Selfie.CaptureFileType.Unknown) {
                    return AbstractC8012V5.m8332e(context) ? AbstractC9233X.m9806b(new RuntimeException()) : EnumC19999a.f63316o0;
                }
            }
        }
        return AbstractC9233X.m9806b(new RuntimeException());
    }

    public final VideoCaptureConfig copy(long maxRecordingLengthMs, List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, List<? extends EnumC19999a> videoCaptureMethods, @InterfaceC11468o(name = "webRTCJwt") String webRtcJwt, boolean recordAudio) {
        AbstractC16544l.m18094g(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        AbstractC16544l.m18094g(videoCaptureMethods, "videoCaptureMethods");
        return new VideoCaptureConfig(maxRecordingLengthMs, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, recordAudio);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoCaptureConfig)) {
            return false;
        }
        VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) obj;
        return this.f40856a == videoCaptureConfig.f40856a && AbstractC16544l.m18089b(this.f40857b, videoCaptureConfig.f40857b) && AbstractC16544l.m18089b(this.f40858c, videoCaptureConfig.f40858c) && AbstractC16544l.m18089b(this.f40859d, videoCaptureConfig.f40859d) && this.f40860e == videoCaptureConfig.f40860e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        long j10 = this.f40856a;
        int iM15858x = AbstractC14376f.m15858x(this.f40858c, AbstractC14376f.m15858x(this.f40857b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31), 31);
        String str = this.f40859d;
        int iHashCode = (iM15858x + (str == null ? 0 : str.hashCode())) * 31;
        boolean z6 = this.f40860e;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode + r6;
    }

    public final String toString() {
        return "VideoCaptureConfig(maxRecordingLengthMs=" + this.f40856a + ", enabledCaptureFileTypes=" + this.f40857b + ", videoCaptureMethods=" + this.f40858c + ", webRtcJwt=" + this.f40859d + ", recordAudio=" + this.f40860e + Separators.RPAREN;
    }
}
