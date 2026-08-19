package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Ui_PromptPageJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$PromptPage;)V", "Lbj/v;", "options", "Lbj/v;", "nullableStringAdapter", "Lbj/r;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_Ui_PromptPageJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("gpsPermissionsBtnCancel", "gpsPermissionsBtnContinueMobile", "gpsDeviceFeatureBtnContinueMobile", "gpsPermissionsPrompt", "gpsPermissionsTitle", "gpsFeaturePrompt", "gpsFeatureTitle");

    public NextStep_Ui_PromptPageJsonAdapter(C11447L c11447l) {
        this.nullableStringAdapter = c11447l.m12850b(String.class, C17691y.f56482Y, "gpsPermissionsBtnCancel");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(44, "GeneratedJsonAdapter(NextStep.Ui.PromptPage)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.C12890Ui.PromptPage fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.mo12818m();
        return new NextStep.C12890Ui.PromptPage(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.C12890Ui.PromptPage value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("gpsPermissionsBtnCancel");
        this.nullableStringAdapter.toJson(writer, value_.getGpsPermissionsBtnCancel());
        writer.mo12827T("gpsPermissionsBtnContinueMobile");
        this.nullableStringAdapter.toJson(writer, value_.getGpsPermissionsAllowButtonText());
        writer.mo12827T("gpsDeviceFeatureBtnContinueMobile");
        this.nullableStringAdapter.toJson(writer, value_.getGpsFeatureTurnOnText());
        writer.mo12827T("gpsPermissionsPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getGpsPermissionsPrompt());
        writer.mo12827T("gpsPermissionsTitle");
        this.nullableStringAdapter.toJson(writer, value_.getGpsPermissionsTitle());
        writer.mo12827T("gpsFeaturePrompt");
        this.nullableStringAdapter.toJson(writer, value_.getGpsFeaturePrompt());
        writer.mo12827T("gpsFeatureTitle");
        this.nullableStringAdapter.toJson(writer, value_.getGpsFeatureTitle());
        writer.mo12823E();
    }
}
