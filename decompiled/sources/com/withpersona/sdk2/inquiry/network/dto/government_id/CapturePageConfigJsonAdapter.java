package com.withpersona.sdk2.inquiry.network.dto.government_id;

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
@Metadata(m18066d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfigJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;)V", "Lbj/v;", "options", "Lbj/v;", "nullableStringAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "nullableManualCaptureConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "nullableAutoCaptureConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "nullableOverlayConfigAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CapturePageConfigJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableAutoCaptureConfigAdapter;
    private final AbstractC11471r nullableManualCaptureConfigAdapter;
    private final AbstractC11471r nullableOverlayConfigAdapter;
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("side", "manualCaptureConfig", "autoCaptureConfig", "overlay");

    public CapturePageConfigJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "side");
        this.nullableManualCaptureConfigAdapter = c11447l.m12850b(CapturePageConfig.ManualCaptureConfig.class, c17691y, "manualCaptureConfig");
        this.nullableAutoCaptureConfigAdapter = c11447l.m12850b(CapturePageConfig.AutoCaptureConfig.class, c17691y, "autoCaptureConfig");
        this.nullableOverlayConfigAdapter = c11447l.m12850b(CapturePageConfig.OverlayConfig.class, c17691y, "overlay");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(39, "GeneratedJsonAdapter(CapturePageConfig)");
    }

    @Override // bj.AbstractC11471r
    public CapturePageConfig fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        String str = null;
        CapturePageConfig.ManualCaptureConfig manualCaptureConfig = null;
        CapturePageConfig.AutoCaptureConfig autoCaptureConfig = null;
        CapturePageConfig.OverlayConfig overlayConfig = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                str = (String) this.nullableStringAdapter.fromJson(reader);
            } else if (iMo12819v0 == 1) {
                manualCaptureConfig = (CapturePageConfig.ManualCaptureConfig) this.nullableManualCaptureConfigAdapter.fromJson(reader);
            } else if (iMo12819v0 == 2) {
                autoCaptureConfig = (CapturePageConfig.AutoCaptureConfig) this.nullableAutoCaptureConfigAdapter.fromJson(reader);
            } else if (iMo12819v0 == 3) {
                overlayConfig = (CapturePageConfig.OverlayConfig) this.nullableOverlayConfigAdapter.fromJson(reader);
            }
        }
        reader.mo12818m();
        return new CapturePageConfig(str, manualCaptureConfig, autoCaptureConfig, overlayConfig);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, CapturePageConfig value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("side");
        this.nullableStringAdapter.toJson(writer, value_.getSide());
        writer.mo12827T("manualCaptureConfig");
        this.nullableManualCaptureConfigAdapter.toJson(writer, value_.getManualCaptureConfig());
        writer.mo12827T("autoCaptureConfig");
        this.nullableAutoCaptureConfigAdapter.toJson(writer, value_.getAutoCaptureConfig());
        writer.mo12827T("overlay");
        this.nullableOverlayConfigAdapter.toJson(writer, value_.getOverlay());
        writer.mo12823E();
    }
}
