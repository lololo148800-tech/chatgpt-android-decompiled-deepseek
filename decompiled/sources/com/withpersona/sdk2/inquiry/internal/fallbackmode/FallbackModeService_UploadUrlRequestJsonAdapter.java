package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import dj.AbstractC13178c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService_UploadUrlRequestJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/FallbackModeService$UploadUrlRequest;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class FallbackModeService_UploadUrlRequestJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40762a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40763b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f40764c;

    public FallbackModeService_UploadUrlRequestJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40762a = C11475v.m12866a("expected-content-length", "expected-content-type");
        Class cls = Long.TYPE;
        C17691y c17691y = C17691y.f56482Y;
        this.f40763b = moshi.m12850b(cls, c17691y, "expectedContentLength");
        this.f40764c = moshi.m12850b(String.class, c17691y, "expectedContentType");
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        Long l4 = null;
        String str = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.f40762a);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                l4 = (Long) this.f40763b.fromJson(reader);
                if (l4 == null) {
                    throw AbstractC13178c.m14838l("expectedContentLength", "expected-content-length", reader);
                }
            } else if (iMo12819v0 == 1 && (str = (String) this.f40764c.fromJson(reader)) == null) {
                throw AbstractC13178c.m14838l("expectedContentType", "expected-content-type", reader);
            }
        }
        reader.mo12818m();
        if (l4 == null) {
            throw AbstractC13178c.m14832f("expectedContentLength", "expected-content-length", reader);
        }
        long jLongValue = l4.longValue();
        if (str != null) {
            return new FallbackModeService.UploadUrlRequest(jLongValue, str);
        }
        throw AbstractC13178c.m14832f("expectedContentType", "expected-content-type", reader);
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        FallbackModeService.UploadUrlRequest uploadUrlRequest = (FallbackModeService.UploadUrlRequest) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (uploadUrlRequest == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("expected-content-length");
        this.f40763b.toJson(writer, Long.valueOf(uploadUrlRequest.f40747a));
        writer.mo12827T("expected-content-type");
        this.f40764c.toJson(writer, uploadUrlRequest.f40748b);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(58, "GeneratedJsonAdapter(FallbackModeService.UploadUrlRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
