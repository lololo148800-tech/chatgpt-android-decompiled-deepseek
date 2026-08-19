package com.withpersona.sdk2.inquiry.network.dto;

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
@Metadata(m18066d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_AssetConfigJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "nullableSelectPageAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;", "nullablePromptPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "nullableCapturePageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CheckPage;", "nullableCheckPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;", "nullablePendingPageAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_GovernmentId_AssetConfigJsonAdapter extends AbstractC11471r {
    private volatile Constructor<NextStep.GovernmentId.AssetConfig> constructorRef;
    private final AbstractC11471r nullableCapturePageAdapter;
    private final AbstractC11471r nullableCheckPageAdapter;
    private final AbstractC11471r nullablePendingPageAdapter;
    private final AbstractC11471r nullablePromptPageAdapter;
    private final AbstractC11471r nullableSelectPageAdapter;
    private final C11475v options = C11475v.m12866a("selectPage", "promptPage", "capturePage", "checkPage", "pendingPage");

    public NextStep_GovernmentId_AssetConfigJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableSelectPageAdapter = c11447l.m12850b(NextStep.GovernmentId.AssetConfig.SelectPage.class, c17691y, "selectPage");
        this.nullablePromptPageAdapter = c11447l.m12850b(NextStep.GovernmentId.AssetConfig.PromptPage.class, c17691y, "promptPage");
        this.nullableCapturePageAdapter = c11447l.m12850b(NextStep.GovernmentId.AssetConfig.CapturePage.class, c17691y, "capturePage");
        this.nullableCheckPageAdapter = c11447l.m12850b(NextStep.GovernmentId.AssetConfig.CheckPage.class, c17691y, "checkPage");
        this.nullablePendingPageAdapter = c11447l.m12850b(NextStep.GovernmentId.AssetConfig.PendingPage.class, c17691y, "pendingPage");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(55, "GeneratedJsonAdapter(NextStep.GovernmentId.AssetConfig)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.GovernmentId.AssetConfig fromJson(AbstractC11477x reader) throws NoSuchMethodException {
        reader.mo12814e();
        NextStep.GovernmentId.AssetConfig.SelectPage selectPage = null;
        NextStep.GovernmentId.AssetConfig.PromptPage promptPage = null;
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage = null;
        NextStep.GovernmentId.AssetConfig.CheckPage checkPage = null;
        NextStep.GovernmentId.AssetConfig.PendingPage pendingPage = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                selectPage = (NextStep.GovernmentId.AssetConfig.SelectPage) this.nullableSelectPageAdapter.fromJson(reader);
                i10 &= -2;
            } else if (iMo12819v0 == 1) {
                promptPage = (NextStep.GovernmentId.AssetConfig.PromptPage) this.nullablePromptPageAdapter.fromJson(reader);
                i10 &= -3;
            } else if (iMo12819v0 == 2) {
                capturePage = (NextStep.GovernmentId.AssetConfig.CapturePage) this.nullableCapturePageAdapter.fromJson(reader);
                i10 &= -5;
            } else if (iMo12819v0 == 3) {
                checkPage = (NextStep.GovernmentId.AssetConfig.CheckPage) this.nullableCheckPageAdapter.fromJson(reader);
                i10 &= -9;
            } else if (iMo12819v0 == 4) {
                pendingPage = (NextStep.GovernmentId.AssetConfig.PendingPage) this.nullablePendingPageAdapter.fromJson(reader);
                i10 &= -17;
            }
        }
        reader.mo12818m();
        if (i10 == -32) {
            return new NextStep.GovernmentId.AssetConfig(selectPage, promptPage, capturePage, checkPage, pendingPage);
        }
        Constructor<NextStep.GovernmentId.AssetConfig> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.GovernmentId.AssetConfig.class.getDeclaredConstructor(NextStep.GovernmentId.AssetConfig.SelectPage.class, NextStep.GovernmentId.AssetConfig.PromptPage.class, NextStep.GovernmentId.AssetConfig.CapturePage.class, NextStep.GovernmentId.AssetConfig.CheckPage.class, NextStep.GovernmentId.AssetConfig.PendingPage.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(selectPage, promptPage, capturePage, checkPage, pendingPage, Integer.valueOf(i10), null);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.GovernmentId.AssetConfig value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("selectPage");
        this.nullableSelectPageAdapter.toJson(writer, value_.getSelectPage());
        writer.mo12827T("promptPage");
        this.nullablePromptPageAdapter.toJson(writer, value_.getPromptPage());
        writer.mo12827T("capturePage");
        this.nullableCapturePageAdapter.toJson(writer, value_.getCapturePage());
        writer.mo12827T("checkPage");
        this.nullableCheckPageAdapter.toJson(writer, value_.getCheckPage());
        writer.mo12827T("pendingPage");
        this.nullablePendingPageAdapter.toJson(writer, value_.getPendingPage());
        writer.mo12823E();
    }
}
