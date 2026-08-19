package com.withpersona.sdk2.inquiry.network;

import bj.AbstractC11440E;
import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import dj.AbstractC13178c;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponseJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse;)V", "Lbj/v;", "options", "Lbj/v;", "", "Lcom/withpersona/sdk2/inquiry/network/GenericFileUploadErrorResponse$DocumentErrorResponse;", "listOfDocumentErrorResponseAdapter", "Lbj/r;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class GenericFileUploadErrorResponseJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r listOfDocumentErrorResponseAdapter;
    private final C11475v options = C11475v.m12866a("errors");

    public GenericFileUploadErrorResponseJsonAdapter(C11447L c11447l) {
        this.listOfDocumentErrorResponseAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, GenericFileUploadErrorResponse.DocumentErrorResponse.class), C17691y.f56482Y, "errors");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(52, "GeneratedJsonAdapter(GenericFileUploadErrorResponse)");
    }

    @Override // bj.AbstractC11471r
    public GenericFileUploadErrorResponse fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        List list = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0 && (list = (List) this.listOfDocumentErrorResponseAdapter.fromJson(reader)) == null) {
                throw AbstractC13178c.m14838l("errors", "errors", reader);
            }
        }
        reader.mo12818m();
        if (list != null) {
            return new GenericFileUploadErrorResponse(list);
        }
        throw AbstractC13178c.m14832f("errors", "errors", reader);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, GenericFileUploadErrorResponse value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("errors");
        this.listOfDocumentErrorResponseAdapter.toJson(writer, value_.getErrors());
        writer.mo12823E();
    }
}
