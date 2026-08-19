package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig;
import dj.AbstractC13178c;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_AutoClassificationConfigJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;)V", "Lbj/v;", "options", "Lbj/v;", "", "nullableBooleanAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "nullableCapturePageConfigAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_GovernmentId_AutoClassificationConfigJsonAdapter extends AbstractC11471r {
    private volatile Constructor<NextStep.GovernmentId.AutoClassificationConfig> constructorRef;
    private final AbstractC11471r nullableBooleanAdapter;
    private final AbstractC11471r nullableCapturePageConfigAdapter;
    private final C11475v options = C11475v.m12866a("isEnabled", "extractTextFromImage", "capturePageConfig");

    public NextStep_GovernmentId_AutoClassificationConfigJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableBooleanAdapter = c11447l.m12850b(Boolean.class, c17691y, "isEnabled");
        this.nullableCapturePageConfigAdapter = c11447l.m12850b(CapturePageConfig.class, c17691y, "capturePageConfig");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(68, "GeneratedJsonAdapter(NextStep.GovernmentId.AutoClassificationConfig)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.GovernmentId.AutoClassificationConfig fromJson(AbstractC11477x reader) throws NoSuchMethodException {
        reader.mo12814e();
        Boolean bool = null;
        Boolean bool2 = null;
        CapturePageConfig capturePageConfig = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                i10 &= -2;
            } else if (iMo12819v0 == 1) {
                bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                i10 &= -3;
            } else if (iMo12819v0 == 2) {
                capturePageConfig = (CapturePageConfig) this.nullableCapturePageConfigAdapter.fromJson(reader);
                i10 &= -5;
            }
        }
        reader.mo12818m();
        if (i10 == -8) {
            return new NextStep.GovernmentId.AutoClassificationConfig(bool, bool2, capturePageConfig);
        }
        Constructor<NextStep.GovernmentId.AutoClassificationConfig> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.GovernmentId.AutoClassificationConfig.class.getDeclaredConstructor(Boolean.class, Boolean.class, CapturePageConfig.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(bool, bool2, capturePageConfig, Integer.valueOf(i10), null);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.GovernmentId.AutoClassificationConfig value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("isEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.isEnabled());
        writer.mo12827T("extractTextFromImage");
        this.nullableBooleanAdapter.toJson(writer, value_.getExtractTextFromImage());
        writer.mo12827T("capturePageConfig");
        this.nullableCapturePageConfigAdapter.toJson(writer, value_.getCapturePageConfig());
        writer.mo12823E();
    }
}
