package com.withpersona.sdk2.inquiry.network.dto.government_id;

import android.gov.nist.javax.sip.header.ParameterNames;
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
@Metadata(m18066d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/IdJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;)V", "Lbj/v;", "options", "Lbj/v;", "stringAdapter", "Lbj/r;", "", "listOfStringAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "nullableIdIconAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "nullableListOfCapturePageConfigAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class IdJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r listOfStringAdapter;
    private final AbstractC11471r nullableIdIconAdapter;
    private final AbstractC11471r nullableListOfCapturePageConfigAdapter;
    private final C11475v options = C11475v.m12866a("class", "requiresSides", ParameterNames.ICON, "capturePageConfigs");
    private final AbstractC11471r stringAdapter;

    public IdJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, "class");
        this.listOfStringAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, String.class), c17691y, "requiresSides");
        this.nullableIdIconAdapter = c11447l.m12850b(C12893Id.IdIcon.class, c17691y, ParameterNames.ICON);
        this.nullableListOfCapturePageConfigAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, CapturePageConfig.class), c17691y, "capturePageConfigs");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(24, "GeneratedJsonAdapter(Id)");
    }

    @Override // bj.AbstractC11471r
    public C12893Id fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        String str = null;
        List list = null;
        C12893Id.IdIcon idIcon = null;
        List list2 = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw AbstractC13178c.m14838l("class_", "class", reader);
                }
            } else if (iMo12819v0 == 1) {
                list = (List) this.listOfStringAdapter.fromJson(reader);
                if (list == null) {
                    throw AbstractC13178c.m14838l("requiresSides", "requiresSides", reader);
                }
            } else if (iMo12819v0 == 2) {
                idIcon = (C12893Id.IdIcon) this.nullableIdIconAdapter.fromJson(reader);
            } else if (iMo12819v0 == 3) {
                list2 = (List) this.nullableListOfCapturePageConfigAdapter.fromJson(reader);
            }
        }
        reader.mo12818m();
        if (str == null) {
            throw AbstractC13178c.m14832f("class_", "class", reader);
        }
        if (list != null) {
            return new C12893Id(str, list, idIcon, list2);
        }
        throw AbstractC13178c.m14832f("requiresSides", "requiresSides", reader);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, C12893Id value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("class");
        this.stringAdapter.toJson(writer, value_.getClass());
        writer.mo12827T("requiresSides");
        this.listOfStringAdapter.toJson(writer, value_.getRequiresSides());
        writer.mo12827T(ParameterNames.ICON);
        this.nullableIdIconAdapter.toJson(writer, value_.getIcon());
        writer.mo12827T("capturePageConfigs");
        this.nullableListOfCapturePageConfigAdapter.toJson(writer, value_.getCapturePageConfigs());
        writer.mo12823E();
    }
}
