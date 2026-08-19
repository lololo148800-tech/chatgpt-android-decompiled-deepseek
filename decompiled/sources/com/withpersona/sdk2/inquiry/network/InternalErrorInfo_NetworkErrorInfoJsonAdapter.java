package com.withpersona.sdk2.inquiry.network;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import dj.AbstractC13178c;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo_NetworkErrorInfoJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo$NetworkErrorInfo;)V", "Lbj/v;", "options", "Lbj/v;", "", "intAdapter", "Lbj/r;", "nullableStringAdapter", "", "booleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/ErrorResponse$Error;", "nullableErrorAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class InternalErrorInfo_NetworkErrorInfoJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r booleanAdapter;
    private volatile Constructor<InternalErrorInfo.NetworkErrorInfo> constructorRef;
    private final AbstractC11471r intAdapter;
    private final AbstractC11471r nullableErrorAdapter;
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("code", "message", "isRecoverable", "responseError");

    public InternalErrorInfo_NetworkErrorInfoJsonAdapter(C11447L c11447l) {
        Class cls = Integer.TYPE;
        C17691y c17691y = C17691y.f56482Y;
        this.intAdapter = c11447l.m12850b(cls, c17691y, "code");
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "message");
        this.booleanAdapter = c11447l.m12850b(Boolean.TYPE, c17691y, "isRecoverable");
        this.nullableErrorAdapter = c11447l.m12850b(ErrorResponse.Error.class, c17691y, "responseError");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(56, "GeneratedJsonAdapter(InternalErrorInfo.NetworkErrorInfo)");
    }

    @Override // bj.AbstractC11471r
    public InternalErrorInfo.NetworkErrorInfo fromJson(AbstractC11477x reader) throws NoSuchMethodException {
        reader.mo12814e();
        int i10 = -1;
        Integer num = null;
        Boolean bool = null;
        String str = null;
        ErrorResponse.Error error = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                num = (Integer) this.intAdapter.fromJson(reader);
                if (num == null) {
                    throw AbstractC13178c.m14838l("code", "code", reader);
                }
            } else if (iMo12819v0 == 1) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (iMo12819v0 == 2) {
                bool = (Boolean) this.booleanAdapter.fromJson(reader);
                if (bool == null) {
                    throw AbstractC13178c.m14838l("isRecoverable", "isRecoverable", reader);
                }
            } else if (iMo12819v0 == 3) {
                error = (ErrorResponse.Error) this.nullableErrorAdapter.fromJson(reader);
                i10 = -9;
            }
        }
        reader.mo12818m();
        if (i10 == -9) {
            if (num == null) {
                throw AbstractC13178c.m14832f("code", "code", reader);
            }
            int iIntValue = num.intValue();
            if (bool != null) {
                return new InternalErrorInfo.NetworkErrorInfo(iIntValue, str, bool.booleanValue(), error);
            }
            throw AbstractC13178c.m14832f("isRecoverable", "isRecoverable", reader);
        }
        Constructor<InternalErrorInfo.NetworkErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Integer.TYPE;
            declaredConstructor = InternalErrorInfo.NetworkErrorInfo.class.getDeclaredConstructor(cls, String.class, Boolean.TYPE, ErrorResponse.Error.class, cls, AbstractC13178c.f41822c);
            this.constructorRef = declaredConstructor;
        }
        if (num == null) {
            throw AbstractC13178c.m14832f("code", "code", reader);
        }
        if (bool != null) {
            return declaredConstructor.newInstance(num, str, bool, error, Integer.valueOf(i10), null);
        }
        throw AbstractC13178c.m14832f("isRecoverable", "isRecoverable", reader);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, InternalErrorInfo.NetworkErrorInfo value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("code");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getCode()));
        writer.mo12827T("message");
        this.nullableStringAdapter.toJson(writer, value_.getMessage());
        writer.mo12827T("isRecoverable");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isRecoverable()));
        writer.mo12827T("responseError");
        this.nullableErrorAdapter.toJson(writer, value_.getResponseError());
        writer.mo12823E();
    }
}
