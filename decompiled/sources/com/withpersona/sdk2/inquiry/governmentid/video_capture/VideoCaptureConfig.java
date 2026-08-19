package com.withpersona.sdk2.inquiry.governmentid.video_capture;

import android.gov.nist.core.Separators;
import bj.InterfaceC11468o;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p011A9.p012Ra.ahZQMZ;
import p775h2.AbstractC14376f;
import tj.EnumC19999a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJP\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "", "", "maxRecordingLengthMs", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "enabledCaptureFileTypes", "Ltj/a;", "videoCaptureMethods", "", "webRtcJwt", "", "recordAudio", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)V", "copy", "(JLjava/util/List;Ljava/util/List;Ljava/lang/String;Z)Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;", "government-id_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class VideoCaptureConfig {

    /* JADX INFO: renamed from: a */
    public final long f40638a;

    /* JADX INFO: renamed from: b */
    public final List f40639b;

    /* JADX INFO: renamed from: c */
    public final List f40640c;

    /* JADX INFO: renamed from: d */
    public final String f40641d;

    /* JADX INFO: renamed from: e */
    public final boolean f40642e;

    public VideoCaptureConfig(long j10, List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, List<? extends EnumC19999a> videoCaptureMethods, @InterfaceC11468o(name = "webRTCJwt") String str, boolean z6) {
        AbstractC16544l.m18094g(enabledCaptureFileTypes, "enabledCaptureFileTypes");
        AbstractC16544l.m18094g(videoCaptureMethods, "videoCaptureMethods");
        this.f40638a = j10;
        this.f40639b = enabledCaptureFileTypes;
        this.f40640c = videoCaptureMethods;
        this.f40641d = str;
        this.f40642e = z6;
    }

    public final VideoCaptureConfig copy(long maxRecordingLengthMs, List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, List<? extends EnumC19999a> videoCaptureMethods, @InterfaceC11468o(name = "webRTCJwt") String webRtcJwt, boolean recordAudio) {
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
        return this.f40638a == videoCaptureConfig.f40638a && AbstractC16544l.m18089b(this.f40639b, videoCaptureConfig.f40639b) && AbstractC16544l.m18089b(this.f40640c, videoCaptureConfig.f40640c) && AbstractC16544l.m18089b(this.f40641d, videoCaptureConfig.f40641d) && this.f40642e == videoCaptureConfig.f40642e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        long j10 = this.f40638a;
        int iM15858x = AbstractC14376f.m15858x(this.f40640c, AbstractC14376f.m15858x(this.f40639b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31), 31);
        String str = this.f40641d;
        int iHashCode = (iM15858x + (str == null ? 0 : str.hashCode())) * 31;
        boolean z6 = this.f40642e;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        return iHashCode + r6;
    }

    public final String toString() {
        return "VideoCaptureConfig(maxRecordingLengthMs=" + this.f40638a + ", enabledCaptureFileTypes=" + this.f40639b + ahZQMZ.tAMnWs + this.f40640c + ", webRtcJwt=" + this.f40641d + ", recordAudio=" + this.f40642e + Separators.RPAREN;
    }
}
