package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dj.AbstractC13178c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError_UiInputComponentErrorJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputComponentError;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputComponentError;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/UiComponentError$UiInputComponentError;)V", "Lbj/v;", "options", "Lbj/v;", "stringAdapter", "Lbj/r;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentError_UiInputComponentErrorJsonAdapter extends AbstractC11471r {
    private final C11475v options = C11475v.m12866a(DiagnosticsEntry.NAME_KEY, "type", "message");
    private final AbstractC11471r stringAdapter;

    public UiComponentError_UiInputComponentErrorJsonAdapter(C11447L c11447l) {
        this.stringAdapter = c11447l.m12850b(String.class, C17691y.f56482Y, DiagnosticsEntry.NAME_KEY);
    }

    public String toString() {
        return AbstractC12107L1.m13823n(60, "GeneratedJsonAdapter(UiComponentError.UiInputComponentError)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentError.UiInputComponentError fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw AbstractC13178c.m14838l(DiagnosticsEntry.NAME_KEY, DiagnosticsEntry.NAME_KEY, reader);
                }
            } else if (iMo12819v0 == 1) {
                str2 = (String) this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw AbstractC13178c.m14838l("type", "type", reader);
                }
            } else if (iMo12819v0 == 2 && (str3 = (String) this.stringAdapter.fromJson(reader)) == null) {
                throw AbstractC13178c.m14838l("message", "message", reader);
            }
        }
        reader.mo12818m();
        if (str == null) {
            throw AbstractC13178c.m14832f(DiagnosticsEntry.NAME_KEY, DiagnosticsEntry.NAME_KEY, reader);
        }
        if (str2 == null) {
            throw AbstractC13178c.m14832f("type", "type", reader);
        }
        if (str3 != null) {
            return new UiComponentError.UiInputComponentError(str, str2, str3);
        }
        throw AbstractC13178c.m14832f("message", "message", reader);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentError.UiInputComponentError value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T(DiagnosticsEntry.NAME_KEY);
        this.stringAdapter.toJson(writer, value_.getName());
        writer.mo12827T("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.mo12827T("message");
        this.stringAdapter.toJson(writer, value_.getMessage());
        writer.mo12823E();
    }
}
