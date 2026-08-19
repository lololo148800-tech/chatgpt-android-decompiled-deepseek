package com.withpersona.sdk2.inquiry.internal;

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
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/internal/InquiryField_StringFieldJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryField$StringField;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "inquiry-dynamic-feature_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InquiryField_StringFieldJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40704a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40705b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f40706c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f40707d;

    public InquiryField_StringFieldJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40704a = C11475v.m12866a("value", "type");
        C17691y c17691y = C17691y.f56482Y;
        this.f40705b = moshi.m12850b(String.class, c17691y, "value");
        this.f40706c = moshi.m12850b(String.class, c17691y, "type");
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        String str = null;
        String str2 = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.f40704a);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                str = (String) this.f40705b.fromJson(reader);
            } else if (iMo12819v0 == 1) {
                str2 = (String) this.f40706c.fromJson(reader);
                if (str2 == null) {
                    throw AbstractC13178c.m14838l("type", "type", reader);
                }
                i10 = -3;
            } else {
                continue;
            }
        }
        reader.mo12818m();
        if (i10 == -3) {
            AbstractC16544l.m18092e(str2, "null cannot be cast to non-null type kotlin.String");
            return new InquiryField$StringField(str, str2);
        }
        Constructor declaredConstructor = this.f40707d;
        if (declaredConstructor == null) {
            declaredConstructor = InquiryField$StringField.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.f40707d = declaredConstructor;
            AbstractC16544l.m18093f(declaredConstructor, "also(...)");
        }
        Object objNewInstance = declaredConstructor.newInstance(str, str2, Integer.valueOf(i10), null);
        AbstractC16544l.m18093f(objNewInstance, "newInstance(...)");
        return (InquiryField$StringField) objNewInstance;
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        InquiryField$StringField inquiryField$StringField = (InquiryField$StringField) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (inquiryField$StringField == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("value");
        this.f40705b.toJson(writer, inquiryField$StringField.f40674Y);
        writer.mo12827T("type");
        this.f40706c.toJson(writer, inquiryField$StringField.f40675Z);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(46, "GeneratedJsonAdapter(InquiryField.StringField)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
