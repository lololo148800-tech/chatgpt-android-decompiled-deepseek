package com.withpersona.sdk2.inquiry.document.network;

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
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequestJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/document/network/SubmitDocumentRequest;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "document_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SubmitDocumentRequestJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40588a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40589b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f40590c;

    /* JADX INFO: renamed from: d */
    public volatile Constructor f40591d;

    public SubmitDocumentRequestJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40588a = C11475v.m12866a("data", "meta");
        C17691y c17691y = C17691y.f56482Y;
        this.f40589b = moshi.m12850b(SubmitDocumentRequest.Data.class, c17691y, "data");
        this.f40590c = moshi.m12850b(SubmitDocumentRequest.Meta.class, c17691y, "meta");
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        SubmitDocumentRequest.Data data = null;
        SubmitDocumentRequest.Meta meta = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.f40588a);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                data = (SubmitDocumentRequest.Data) this.f40589b.fromJson(reader);
                if (data == null) {
                    throw AbstractC13178c.m14838l("data_", "data", reader);
                }
                i10 = -2;
            } else if (iMo12819v0 == 1 && (meta = (SubmitDocumentRequest.Meta) this.f40590c.fromJson(reader)) == null) {
                throw AbstractC13178c.m14838l("meta", "meta", reader);
            }
        }
        reader.mo12818m();
        if (i10 == -2) {
            AbstractC16544l.m18092e(data, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest.Data");
            if (meta != null) {
                return new SubmitDocumentRequest(data, meta);
            }
            throw AbstractC13178c.m14832f("meta", "meta", reader);
        }
        Constructor declaredConstructor = this.f40591d;
        if (declaredConstructor == null) {
            declaredConstructor = SubmitDocumentRequest.class.getDeclaredConstructor(SubmitDocumentRequest.Data.class, SubmitDocumentRequest.Meta.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.f40591d = declaredConstructor;
            AbstractC16544l.m18093f(declaredConstructor, "also(...)");
        }
        if (meta == null) {
            throw AbstractC13178c.m14832f("meta", "meta", reader);
        }
        Object objNewInstance = declaredConstructor.newInstance(data, meta, Integer.valueOf(i10), null);
        AbstractC16544l.m18093f(objNewInstance, "newInstance(...)");
        return (SubmitDocumentRequest) objNewInstance;
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        SubmitDocumentRequest submitDocumentRequest = (SubmitDocumentRequest) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (submitDocumentRequest == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("data");
        this.f40589b.toJson(writer, submitDocumentRequest.f40583a);
        writer.mo12827T("meta");
        this.f40590c.toJson(writer, submitDocumentRequest.f40584b);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(43, "GeneratedJsonAdapter(SubmitDocumentRequest)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
