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
import p342Nj.EnumC5810d;
import p342Nj.EnumC5811e;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse_AttributesJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$Attributes;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "inquiry-internal_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CreateInquirySessionResponse_AttributesJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40815a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40816b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f40817c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f40818d;

    public CreateInquirySessionResponse_AttributesJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40815a = C11475v.m12866a("gpsCollectionRequirement", "gpsPrecisionRequirement");
        C17691y c17691y = C17691y.f56482Y;
        this.f40816b = moshi.m12850b(EnumC5810d.class, c17691y, "gpsCollectionRequirement");
        this.f40817c = moshi.m12850b(EnumC5811e.class, c17691y, "gpsPrecisionRequirement");
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        EnumC5810d enumC5810d = null;
        EnumC5811e enumC5811e = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.f40815a);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                enumC5810d = (EnumC5810d) this.f40816b.fromJson(reader);
                i10 &= -2;
            } else if (iMo12819v0 == 1) {
                enumC5811e = (EnumC5811e) this.f40817c.fromJson(reader);
                i10 &= -3;
            }
        }
        reader.mo12818m();
        if (i10 == -4) {
            return new CreateInquirySessionResponse.Attributes(enumC5810d, enumC5811e);
        }
        Constructor declaredConstructor = this.f40818d;
        if (declaredConstructor == null) {
            declaredConstructor = CreateInquirySessionResponse.Attributes.class.getDeclaredConstructor(EnumC5810d.class, EnumC5811e.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.f40818d = declaredConstructor;
            AbstractC16544l.m18093f(declaredConstructor, "also(...)");
        }
        Object objNewInstance = declaredConstructor.newInstance(enumC5810d, enumC5811e, Integer.valueOf(i10), null);
        AbstractC16544l.m18093f(objNewInstance, "newInstance(...)");
        return (CreateInquirySessionResponse.Attributes) objNewInstance;
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        CreateInquirySessionResponse.Attributes attributes = (CreateInquirySessionResponse.Attributes) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (attributes == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("gpsCollectionRequirement");
        this.f40816b.toJson(writer, attributes.f40807a);
        writer.mo12827T("gpsPrecisionRequirement");
        this.f40817c.toJson(writer, attributes.f40808b);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(61, "GeneratedJsonAdapter(CreateInquirySessionResponse.Attributes)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
