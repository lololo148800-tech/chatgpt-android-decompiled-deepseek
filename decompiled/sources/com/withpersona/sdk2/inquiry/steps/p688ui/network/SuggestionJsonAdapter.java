package com.withpersona.sdk2.inquiry.steps.p688ui.network;

import android.gov.nist.javax.sip.header.ParameterNames;
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
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/SuggestionJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/steps/ui/network/Suggestion;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SuggestionJsonAdapter extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final C11475v f40995a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11471r f40996b;

    public SuggestionJsonAdapter(C11447L moshi) {
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f40995a = C11475v.m12866a(ParameterNames.f31999ID, "address");
        this.f40996b = moshi.m12850b(String.class, C17691y.f56482Y, ParameterNames.f31999ID);
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        reader.mo12814e();
        String str = null;
        String str2 = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.f40995a);
            if (iMo12819v0 != -1) {
                AbstractC11471r abstractC11471r = this.f40996b;
                if (iMo12819v0 == 0) {
                    str = (String) abstractC11471r.fromJson(reader);
                    if (str == null) {
                        throw AbstractC13178c.m14838l(ParameterNames.f31999ID, ParameterNames.f31999ID, reader);
                    }
                } else if (iMo12819v0 == 1 && (str2 = (String) abstractC11471r.fromJson(reader)) == null) {
                    throw AbstractC13178c.m14838l("address", "address", reader);
                }
            } else {
                reader.mo12802H0();
                reader.mo12800D();
            }
        }
        reader.mo12818m();
        if (str == null) {
            throw AbstractC13178c.m14832f(ParameterNames.f31999ID, ParameterNames.f31999ID, reader);
        }
        if (str2 != null) {
            return new Suggestion(str, str2);
        }
        throw AbstractC13178c.m14832f("address", "address", reader);
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E writer, Object obj) {
        Suggestion suggestion = (Suggestion) obj;
        AbstractC16544l.m18094g(writer, "writer");
        if (suggestion == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T(ParameterNames.f31999ID);
        AbstractC11471r abstractC11471r = this.f40996b;
        abstractC11471r.toJson(writer, suggestion.f40993Y);
        writer.mo12827T("address");
        abstractC11471r.toJson(writer, suggestion.f40994Z);
        writer.mo12823E();
    }

    public final String toString() {
        return AbstractC20734X.m21255z(32, "GeneratedJsonAdapter(Suggestion)", "StringBuilder(capacity).…builderAction).toString()");
    }
}
