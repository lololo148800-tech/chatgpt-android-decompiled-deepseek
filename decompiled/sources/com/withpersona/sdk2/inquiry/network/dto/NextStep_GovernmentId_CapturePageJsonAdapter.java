package com.withpersona.sdk2.inquiry.network.dto;

import androidx.work.impl.utils.p651oZ.HhJS;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import dj.AbstractC13178c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_CapturePageJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CapturePage;)V", "Lbj/v;", "options", "Lbj/v;", "nullableStringAdapter", "Lbj/r;", "stringAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_GovernmentId_CapturePageJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a(UiComponentConfig.Title.type, "scanFront", "scanBack", "scanPdf417", "scanFrontOrBack", "scanSignature", "capturing", "confirmCapture", "disclaimer", "hintHoldStill", "hintLowLight", HhJS.YBmgVbIxozPq, "barcodeHelpModalTitle", "barcodeHelpModalPrompt", "barcodeHelpModalHints", "barcodeHelpModalContinueBtn", "idFrontHelpModalTitle", "idFrontHelpModalPrompt", "idFrontHelpModalHintsMobile", "idFrontHelpModalContinueBtn", "idBackHelpModalTitle", "idBackHelpModalPrompt", "idBackHelpModalHintsMobile", "idBackHelpModalContinueBtn");
    private final AbstractC11471r stringAdapter;

    public String toString() {
        return AbstractC12107L1.m13823n(55, "GeneratedJsonAdapter(NextStep.GovernmentId.CapturePage)");
    }

    public NextStep_GovernmentId_CapturePageJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, UiComponentConfig.Title.type);
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, "scanFront");
    }

    @Override // bj.AbstractC11471r
    public NextStep.GovernmentId.CapturePage fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        while (true) {
            String str25 = str12;
            String str26 = str11;
            String str27 = str10;
            String str28 = str9;
            String str29 = str;
            String str30 = str8;
            if (!reader.hasNext()) {
                reader.mo12818m();
                if (str2 == null) {
                    throw AbstractC13178c.m14832f("scanFront", "scanFront", reader);
                }
                if (str3 == null) {
                    throw AbstractC13178c.m14832f("scanBack", "scanBack", reader);
                }
                if (str4 == null) {
                    throw AbstractC13178c.m14832f("scanPdf417", "scanPdf417", reader);
                }
                if (str5 == null) {
                    throw AbstractC13178c.m14832f("scanFrontOrBack", "scanFrontOrBack", reader);
                }
                if (str6 == null) {
                    throw AbstractC13178c.m14832f("scanSignature", "scanSignature", reader);
                }
                if (str7 == null) {
                    throw AbstractC13178c.m14832f("capturing", "capturing", reader);
                }
                if (str30 != null) {
                    return new NextStep.GovernmentId.CapturePage(str29, str2, str3, str4, str5, str6, str7, str30, str28, str27, str26, str25, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
                }
                throw AbstractC13178c.m14832f("confirmCapture", "confirmCapture", reader);
            }
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str8 = str30;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC13178c.m14838l("scanFront", "scanFront", reader);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC13178c.m14838l("scanBack", "scanBack", reader);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC13178c.m14838l("scanPdf417", "scanPdf417", reader);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw AbstractC13178c.m14838l("scanFrontOrBack", "scanFrontOrBack", reader);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw AbstractC13178c.m14838l("scanSignature", "scanSignature", reader);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 6:
                    str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw AbstractC13178c.m14838l("capturing", "capturing", reader);
                    }
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 7:
                    String str31 = (String) this.stringAdapter.fromJson(reader);
                    if (str31 == null) {
                        throw AbstractC13178c.m14838l("confirmCapture", "confirmCapture", reader);
                    }
                    str8 = str31;
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    break;
                    break;
                case 8:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str = str29;
                    str8 = str30;
                    break;
                case 9:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 10:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 11:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 12:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 13:
                    str14 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 14:
                    str15 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 15:
                    str16 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 16:
                    str17 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 17:
                    str18 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 18:
                    str19 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 19:
                    str20 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 20:
                    str21 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 21:
                    str22 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 22:
                    str23 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                case 23:
                    str24 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
                default:
                    str12 = str25;
                    str11 = str26;
                    str10 = str27;
                    str9 = str28;
                    str = str29;
                    str8 = str30;
                    break;
            }
        }
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.GovernmentId.CapturePage value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T(UiComponentConfig.Title.type);
        this.nullableStringAdapter.toJson(writer, value_.getTitle());
        writer.mo12827T("scanFront");
        this.stringAdapter.toJson(writer, value_.getScanFront());
        writer.mo12827T("scanBack");
        this.stringAdapter.toJson(writer, value_.getScanBack());
        writer.mo12827T("scanPdf417");
        this.stringAdapter.toJson(writer, value_.getScanPdf417());
        writer.mo12827T("scanFrontOrBack");
        this.stringAdapter.toJson(writer, value_.getScanFrontOrBack());
        writer.mo12827T("scanSignature");
        this.stringAdapter.toJson(writer, value_.getScanSignature());
        writer.mo12827T("capturing");
        this.stringAdapter.toJson(writer, value_.getCapturing());
        writer.mo12827T("confirmCapture");
        this.stringAdapter.toJson(writer, value_.getConfirmCapture());
        writer.mo12827T("disclaimer");
        this.nullableStringAdapter.toJson(writer, value_.getDisclaimer());
        writer.mo12827T("hintHoldStill");
        this.nullableStringAdapter.toJson(writer, value_.getHintHoldStill());
        writer.mo12827T("hintLowLight");
        this.nullableStringAdapter.toJson(writer, value_.getHintLowLight());
        writer.mo12827T("btnHelp");
        this.nullableStringAdapter.toJson(writer, value_.getBtnHelp());
        writer.mo12827T("barcodeHelpModalTitle");
        this.nullableStringAdapter.toJson(writer, value_.getBarcodeHelpModalTitle());
        writer.mo12827T("barcodeHelpModalPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getBarcodeHelpModalPrompt());
        writer.mo12827T("barcodeHelpModalHints");
        this.nullableStringAdapter.toJson(writer, value_.getBarcodeHelpModalHints());
        writer.mo12827T("barcodeHelpModalContinueBtn");
        this.nullableStringAdapter.toJson(writer, value_.getBarcodeHelpModalContinueBtn());
        writer.mo12827T("idFrontHelpModalTitle");
        this.nullableStringAdapter.toJson(writer, value_.getIdFrontHelpModalTitle());
        writer.mo12827T("idFrontHelpModalPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getIdFrontHelpModalPrompt());
        writer.mo12827T("idFrontHelpModalHintsMobile");
        this.nullableStringAdapter.toJson(writer, value_.getIdFrontHelpModalHintsMobile());
        writer.mo12827T("idFrontHelpModalContinueBtn");
        this.nullableStringAdapter.toJson(writer, value_.getIdFrontHelpModalContinueBtn());
        writer.mo12827T("idBackHelpModalTitle");
        this.nullableStringAdapter.toJson(writer, value_.getIdBackHelpModalTitle());
        writer.mo12827T("idBackHelpModalPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getIdBackHelpModalPrompt());
        writer.mo12827T("idBackHelpModalHintsMobile");
        this.nullableStringAdapter.toJson(writer, value_.getIdBackHelpModalHintsMobile());
        writer.mo12827T("idBackHelpModalContinueBtn");
        this.nullableStringAdapter.toJson(writer, value_.getIdBackHelpModalContinueBtn());
        writer.mo12823E();
    }
}
