package com.withpersona.sdk2.inquiry.internal.network;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import dj.AbstractC13178c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest_AttributesJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$Attributes;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UpdateInquirySessionRequest_AttributesJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40842a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40843b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f40844c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f40845d;

    public UpdateInquirySessionRequest_AttributesJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40842a = C11475v.m12866a("gpsLongitude", "gpsLatitude", "gpsPrecision");
        C17691y c17691y = C17691y.f56482Y;
        this.f40843b = moshi.m12850b(Double.class, c17691y, "gpsLongitude");
        this.f40844c = moshi.m12850b(String.class, c17691y, "gpsPrecision");
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        Double d10 = null;
        Double d11 = null;
        String str = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.f40842a);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                d10 = (Double) this.f40843b.fromJson(reader);
                i10 &= -2;
            } else if (iMo12819v0 == 1) {
                d11 = (Double) this.f40843b.fromJson(reader);
                i10 &= -3;
            } else if (iMo12819v0 == 2) {
                str = (String) this.f40844c.fromJson(reader);
                i10 &= -5;
            }
        }
        reader.mo12818m();
        if (i10 == -8) {
            return new UpdateInquirySessionRequest.Attributes(d10, d11, str);
        }
        Constructor declaredConstructor = this.f40845d;
        if (declaredConstructor == null) {
            declaredConstructor = UpdateInquirySessionRequest.Attributes.class.getDeclaredConstructor(Double.class, Double.class, String.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.f40845d = declaredConstructor;
            AbstractC16544l.m18093f(declaredConstructor, "also(...)");
        }
        Object objNewInstance = declaredConstructor.newInstance(d10, d11, str, Integer.valueOf(i10), null);
        AbstractC16544l.m18093f(objNewInstance, "newInstance(...)");
        return (UpdateInquirySessionRequest.Attributes) objNewInstance;
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        UpdateInquirySessionRequest.Attributes attributes = (UpdateInquirySessionRequest.Attributes) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("gpsLongitude");
        AbstractC11471r abstractC11471r = this.f40843b;
        abstractC11471r.toJson(writer, attributes.f40836a);
        writer.mo12827T("gpsLatitude");
        abstractC11471r.toJson(writer, attributes.f40837b);
        writer.mo12827T("gpsPrecision");
        this.f40844c.toJson(writer, attributes.f40838c);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(60, "GeneratedJsonAdapter(UpdateInquirySessionRequest.Attributes)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
