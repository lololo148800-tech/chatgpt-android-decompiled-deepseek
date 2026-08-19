package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import dj.AbstractC13178c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_LocalizationsJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "promptPageAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "capturePageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PendingPage;", "pendingPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "nullableCancelDialogAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_Selfie_LocalizationsJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r capturePageAdapter;
    private final AbstractC11471r nullableCancelDialogAdapter;
    private final C11475v options = C11475v.m12866a("promptPage", "capturePage", "pendingPage", "cancelDialog");
    private final AbstractC11471r pendingPageAdapter;
    private final AbstractC11471r promptPageAdapter;

    public NextStep_Selfie_LocalizationsJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.promptPageAdapter = c11447l.m12850b(NextStep.Selfie.PromptPage.class, c17691y, "promptPage");
        this.capturePageAdapter = c11447l.m12850b(NextStep.Selfie.CapturePage.class, c17691y, "capturePage");
        this.pendingPageAdapter = c11447l.m12850b(NextStep.Selfie.PendingPage.class, c17691y, "pendingPage");
        this.nullableCancelDialogAdapter = c11447l.m12850b(NextStep.CancelDialog.class, c17691y, "cancelDialog");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(51, "GeneratedJsonAdapter(NextStep.Selfie.Localizations)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.Selfie.Localizations fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        NextStep.Selfie.PromptPage promptPage = null;
        NextStep.Selfie.CapturePage capturePage = null;
        NextStep.Selfie.PendingPage pendingPage = null;
        NextStep.CancelDialog cancelDialog = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                promptPage = (NextStep.Selfie.PromptPage) this.promptPageAdapter.fromJson(reader);
                if (promptPage == null) {
                    throw AbstractC13178c.m14838l("promptPage", "promptPage", reader);
                }
            } else if (iMo12819v0 == 1) {
                capturePage = (NextStep.Selfie.CapturePage) this.capturePageAdapter.fromJson(reader);
                if (capturePage == null) {
                    throw AbstractC13178c.m14838l("capturePage", "capturePage", reader);
                }
            } else if (iMo12819v0 == 2) {
                pendingPage = (NextStep.Selfie.PendingPage) this.pendingPageAdapter.fromJson(reader);
                if (pendingPage == null) {
                    throw AbstractC13178c.m14838l("pendingPage", "pendingPage", reader);
                }
            } else if (iMo12819v0 == 3) {
                cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(reader);
            }
        }
        reader.mo12818m();
        if (promptPage == null) {
            throw AbstractC13178c.m14832f("promptPage", "promptPage", reader);
        }
        if (capturePage == null) {
            throw AbstractC13178c.m14832f("capturePage", "capturePage", reader);
        }
        if (pendingPage != null) {
            return new NextStep.Selfie.Localizations(promptPage, capturePage, pendingPage, cancelDialog);
        }
        throw AbstractC13178c.m14832f("pendingPage", "pendingPage", reader);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.Selfie.Localizations value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("promptPage");
        this.promptPageAdapter.toJson(writer, value_.getPromptPage());
        writer.mo12827T("capturePage");
        this.capturePageAdapter.toJson(writer, value_.getCapturePage());
        writer.mo12827T("pendingPage");
        this.pendingPageAdapter.toJson(writer, value_.getPendingPage());
        writer.mo12827T("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(writer, value_.getCancelDialog());
        writer.mo12823E();
    }
}
