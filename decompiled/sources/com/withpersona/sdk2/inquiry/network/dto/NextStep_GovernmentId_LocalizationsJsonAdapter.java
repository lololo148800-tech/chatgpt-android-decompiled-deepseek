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
import p1053v3.p1054lN.IGDwkYw;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019¨\u0006*"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_LocalizationsJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$SelectPage;", "selectPageAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PromptPage;", "promptPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "capturePageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CheckPage;", "checkPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$PendingPage;", "pendingPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$RequestPage;", "requestPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "reviewUploadPageAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "nullableCancelDialogAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationPage;", "nullableAutoClassificationPageAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_GovernmentId_LocalizationsJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r capturePageAdapter;
    private final AbstractC11471r checkPageAdapter;
    private final AbstractC11471r nullableAutoClassificationPageAdapter;
    private final AbstractC11471r nullableCancelDialogAdapter;
    private final C11475v options = C11475v.m12866a("selectPage", "promptPage", "capturePage", "checkPage", "pendingPage", "requestPage", "reviewUploadPage", "cancelDialog", "autoClassificationPage");
    private final AbstractC11471r pendingPageAdapter;
    private final AbstractC11471r promptPageAdapter;
    private final AbstractC11471r requestPageAdapter;
    private final AbstractC11471r reviewUploadPageAdapter;
    private final AbstractC11471r selectPageAdapter;

    public NextStep_GovernmentId_LocalizationsJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.selectPageAdapter = c11447l.m12850b(NextStep.GovernmentId.SelectPage.class, c17691y, "selectPage");
        this.promptPageAdapter = c11447l.m12850b(NextStep.GovernmentId.PromptPage.class, c17691y, "promptPage");
        this.capturePageAdapter = c11447l.m12850b(NextStep.GovernmentId.CapturePage.class, c17691y, "capturePage");
        this.checkPageAdapter = c11447l.m12850b(NextStep.GovernmentId.CheckPage.class, c17691y, "checkPage");
        this.pendingPageAdapter = c11447l.m12850b(NextStep.GovernmentId.PendingPage.class, c17691y, "pendingPage");
        this.requestPageAdapter = c11447l.m12850b(NextStep.GovernmentId.RequestPage.class, c17691y, "requestPage");
        this.reviewUploadPageAdapter = c11447l.m12850b(NextStep.GovernmentId.ReviewUploadPage.class, c17691y, "reviewUploadPage");
        this.nullableCancelDialogAdapter = c11447l.m12850b(NextStep.CancelDialog.class, c17691y, "cancelDialog");
        this.nullableAutoClassificationPageAdapter = c11447l.m12850b(NextStep.GovernmentId.AutoClassificationPage.class, c17691y, "autoClassificationPage");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(57, "GeneratedJsonAdapter(NextStep.GovernmentId.Localizations)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.GovernmentId.Localizations fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        NextStep.GovernmentId.SelectPage selectPage = null;
        NextStep.GovernmentId.PromptPage promptPage = null;
        NextStep.GovernmentId.CapturePage capturePage = null;
        NextStep.GovernmentId.CheckPage checkPage = null;
        NextStep.GovernmentId.PendingPage pendingPage = null;
        NextStep.GovernmentId.RequestPage requestPage = null;
        NextStep.GovernmentId.ReviewUploadPage reviewUploadPage = null;
        NextStep.CancelDialog cancelDialog = null;
        NextStep.GovernmentId.AutoClassificationPage autoClassificationPage = null;
        while (true) {
            NextStep.GovernmentId.AutoClassificationPage autoClassificationPage2 = autoClassificationPage;
            NextStep.CancelDialog cancelDialog2 = cancelDialog;
            NextStep.GovernmentId.ReviewUploadPage reviewUploadPage2 = reviewUploadPage;
            if (!reader.hasNext()) {
                reader.mo12818m();
                if (selectPage == null) {
                    throw AbstractC13178c.m14832f("selectPage", "selectPage", reader);
                }
                if (promptPage == null) {
                    throw AbstractC13178c.m14832f("promptPage", "promptPage", reader);
                }
                if (capturePage == null) {
                    throw AbstractC13178c.m14832f("capturePage", "capturePage", reader);
                }
                if (checkPage == null) {
                    throw AbstractC13178c.m14832f("checkPage", "checkPage", reader);
                }
                if (pendingPage == null) {
                    throw AbstractC13178c.m14832f("pendingPage", "pendingPage", reader);
                }
                if (requestPage == null) {
                    throw AbstractC13178c.m14832f("requestPage", "requestPage", reader);
                }
                if (reviewUploadPage2 != null) {
                    return new NextStep.GovernmentId.Localizations(selectPage, promptPage, capturePage, checkPage, pendingPage, requestPage, reviewUploadPage2, cancelDialog2, autoClassificationPage2);
                }
                throw AbstractC13178c.m14832f("reviewUploadPage", "reviewUploadPage", reader);
            }
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                    break;
                case 0:
                    selectPage = (NextStep.GovernmentId.SelectPage) this.selectPageAdapter.fromJson(reader);
                    if (selectPage == null) {
                        throw AbstractC13178c.m14838l("selectPage", "selectPage", reader);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                    break;
                case 1:
                    promptPage = (NextStep.GovernmentId.PromptPage) this.promptPageAdapter.fromJson(reader);
                    if (promptPage == null) {
                        throw AbstractC13178c.m14838l("promptPage", "promptPage", reader);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                    break;
                case 2:
                    capturePage = (NextStep.GovernmentId.CapturePage) this.capturePageAdapter.fromJson(reader);
                    if (capturePage == null) {
                        throw AbstractC13178c.m14838l("capturePage", "capturePage", reader);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                    break;
                case 3:
                    checkPage = (NextStep.GovernmentId.CheckPage) this.checkPageAdapter.fromJson(reader);
                    if (checkPage == null) {
                        throw AbstractC13178c.m14838l("checkPage", "checkPage", reader);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                    break;
                case 4:
                    pendingPage = (NextStep.GovernmentId.PendingPage) this.pendingPageAdapter.fromJson(reader);
                    if (pendingPage == null) {
                        throw AbstractC13178c.m14838l("pendingPage", "pendingPage", reader);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                    break;
                case 5:
                    requestPage = (NextStep.GovernmentId.RequestPage) this.requestPageAdapter.fromJson(reader);
                    if (requestPage == null) {
                        throw AbstractC13178c.m14838l("requestPage", "requestPage", reader);
                    }
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                    break;
                case 6:
                    NextStep.GovernmentId.ReviewUploadPage reviewUploadPage3 = (NextStep.GovernmentId.ReviewUploadPage) this.reviewUploadPageAdapter.fromJson(reader);
                    if (reviewUploadPage3 == null) {
                        throw AbstractC13178c.m14838l("reviewUploadPage", "reviewUploadPage", reader);
                    }
                    reviewUploadPage = reviewUploadPage3;
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    break;
                    break;
                case 7:
                    cancelDialog = (NextStep.CancelDialog) this.nullableCancelDialogAdapter.fromJson(reader);
                    autoClassificationPage = autoClassificationPage2;
                    reviewUploadPage = reviewUploadPage2;
                    break;
                case 8:
                    autoClassificationPage = (NextStep.GovernmentId.AutoClassificationPage) this.nullableAutoClassificationPageAdapter.fromJson(reader);
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                    break;
                default:
                    autoClassificationPage = autoClassificationPage2;
                    cancelDialog = cancelDialog2;
                    reviewUploadPage = reviewUploadPage2;
                    break;
            }
        }
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.GovernmentId.Localizations value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("selectPage");
        this.selectPageAdapter.toJson(writer, value_.getSelectPage());
        writer.mo12827T(IGDwkYw.CwrWAuHVizKO);
        this.promptPageAdapter.toJson(writer, value_.getPromptPage());
        writer.mo12827T("capturePage");
        this.capturePageAdapter.toJson(writer, value_.getCapturePage());
        writer.mo12827T("checkPage");
        this.checkPageAdapter.toJson(writer, value_.getCheckPage());
        writer.mo12827T("pendingPage");
        this.pendingPageAdapter.toJson(writer, value_.getPendingPage());
        writer.mo12827T("requestPage");
        this.requestPageAdapter.toJson(writer, value_.getRequestPage());
        writer.mo12827T("reviewUploadPage");
        this.reviewUploadPageAdapter.toJson(writer, value_.getReviewUploadPage());
        writer.mo12827T("cancelDialog");
        this.nullableCancelDialogAdapter.toJson(writer, value_.getCancelDialog());
        writer.mo12827T("autoClassificationPage");
        this.nullableAutoClassificationPageAdapter.toJson(writer, value_.getAutoClassificationPage());
        writer.mo12823E();
    }
}
