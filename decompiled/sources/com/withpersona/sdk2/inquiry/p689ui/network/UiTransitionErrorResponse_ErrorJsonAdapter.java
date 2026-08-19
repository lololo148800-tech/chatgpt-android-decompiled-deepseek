package com.withpersona.sdk2.inquiry.p689ui.network;

import bj.AbstractC11440E;
import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.withpersona.sdk2.inquiry.network.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1071w0.AbstractC20734X;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/ui/network/UiTransitionErrorResponse_ErrorJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/ui/network/UiTransitionErrorResponse$Error;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "ui_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiTransitionErrorResponse_ErrorJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f41055a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f41056b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11471r f41057c;

    public UiTransitionErrorResponse_ErrorJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f41055a = C11475v.m12866a(UiComponentConfig.Title.type, "details");
        C17691y c17691y = C17691y.f56482Y;
        this.f41056b = moshi.m12850b(String.class, c17691y, UiComponentConfig.Title.type);
        this.f41057c = moshi.m12850b(AbstractC11452Q.m12856f(Map.class, String.class, UiComponentError.class), c17691y, "details");
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        String str = null;
        Map map = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.f41055a);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                str = (String) this.f41056b.fromJson(reader);
            } else if (iMo12819v0 == 1) {
                map = (Map) this.f41057c.fromJson(reader);
            }
        }
        reader.mo12818m();
        return new UiTransitionErrorResponse.Error(str, map);
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        UiTransitionErrorResponse.Error error = (UiTransitionErrorResponse.Error) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (error == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T(UiComponentConfig.Title.type);
        this.f41056b.toJson(writer, error.f41051a);
        writer.mo12827T("details");
        this.f41057c.toJson(writer, error.f41052b);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(53, "GeneratedJsonAdapter(UiTransitionErrorResponse.Error)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
