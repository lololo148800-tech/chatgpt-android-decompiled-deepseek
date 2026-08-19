package com.withpersona.sdk2.inquiry.internal.network;

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
import p342Nj.EnumC5812f;
import p909nm.C17691y;
import p926of.yRae.sVDIzpC;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequestJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ErrorRequestJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40826a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40827b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f40828c;

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        EnumC5812f enumC5812f = null;
        Object objFromJson = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.f40826a);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                enumC5812f = (EnumC5812f) this.f40827b.fromJson(reader);
                if (enumC5812f == null) {
                    throw AbstractC13178c.m14838l("errorType", "errorType", reader);
                }
            } else if (iMo12819v0 == 1) {
                objFromJson = this.f40828c.fromJson(reader);
            }
        }
        reader.mo12818m();
        if (enumC5812f != null) {
            return new ErrorRequest(enumC5812f, objFromJson);
        }
        throw AbstractC13178c.m14832f("errorType", "errorType", reader);
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        ErrorRequest errorRequest = (ErrorRequest) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (errorRequest == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("errorType");
        this.f40827b.toJson(writer, errorRequest.f40824a);
        writer.mo12827T("debugDescription");
        this.f40828c.toJson(writer, errorRequest.f40825b);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(34, "GeneratedJsonAdapter(ErrorRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }

    public ErrorRequestJsonAdapter(C11447L c11447l) {
        AbstractC16544l.m18094g(c11447l, sVDIzpC.bBndIv);
        this.f40826a = C11475v.m12866a("errorType", "debugDescription");
        C17691y c17691y = C17691y.f56482Y;
        this.f40827b = c11447l.m12850b(EnumC5812f.class, c17691y, "errorType");
        this.f40828c = c11447l.m12850b(Object.class, c17691y, "debugDescription");
    }
}
