package com.withpersona.sdk2.inquiry.network.dto;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
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
import p379Pb.LVf.efyhmdM;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_PromptPageJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$PromptPage;)V", "Lbj/v;", "options", "Lbj/v;", "stringAdapter", "Lbj/r;", "nullableStringAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_Selfie_PromptPageJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("selfieTitle", "selfiePrompt", "selfiePromptCenter", "agreeToPolicy", "btnSubmit", "cameraPermissionsTitle", "cameraPermissionsPrompt", "cameraPermissionsBtnContinueMobile", "cameraPermissionsBtnCancel", "microphonePermissionsBtnCancel", "microphonePermissionsBtnContinueMobile", "microphonePermissionsPrompt", "microphonePermissionsTitle");
    private final AbstractC11471r stringAdapter;

    public NextStep_Selfie_PromptPageJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, UiComponentConfig.Title.type);
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "cameraPermissionsTitle");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(48, "GeneratedJsonAdapter(NextStep.Selfie.PromptPage)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.Selfie.PromptPage fromJson(AbstractC11477x reader) {
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
        while (true) {
            boolean zHasNext = reader.hasNext();
            String str14 = str12;
            String str15 = str11;
            String str16 = str10;
            String str17 = str9;
            String str18 = str8;
            String str19 = str7;
            String str20 = str6;
            String str21 = str5;
            String str22 = str4;
            String str23 = efyhmdM.yRwkixEu;
            if (!zHasNext) {
                reader.mo12818m();
                if (str == null) {
                    throw AbstractC13178c.m14832f(UiComponentConfig.Title.type, "selfieTitle", reader);
                }
                if (str2 == null) {
                    throw AbstractC13178c.m14832f(SDPKeywords.PROMPT, "selfiePrompt", reader);
                }
                if (str3 == null) {
                    throw AbstractC13178c.m14832f("promptCenter", "selfiePromptCenter", reader);
                }
                if (str22 == null) {
                    throw AbstractC13178c.m14832f("disclosure", "agreeToPolicy", reader);
                }
                if (str21 != null) {
                    return new NextStep.Selfie.PromptPage(str, str2, str3, str22, str21, str20, str19, str18, str17, str16, str15, str14, str13);
                }
                throw AbstractC13178c.m14832f(str23, "btnSubmit", reader);
            }
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC13178c.m14838l(UiComponentConfig.Title.type, "selfieTitle", reader);
                    }
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC13178c.m14838l(SDPKeywords.PROMPT, "selfiePrompt", reader);
                    }
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC13178c.m14838l("promptCenter", "selfiePromptCenter", reader);
                    }
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC13178c.m14838l("disclosure", "agreeToPolicy", reader);
                    }
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    break;
                    break;
                case 4:
                    String str24 = (String) this.stringAdapter.fromJson(reader);
                    if (str24 == null) {
                        throw AbstractC13178c.m14838l(str23, "btnSubmit", reader);
                    }
                    str5 = str24;
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str4 = str22;
                    break;
                    break;
                case 5:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 6:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 7:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 8:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 9:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str14;
                    str11 = str15;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 10:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str14;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 11:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                case 12:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
                default:
                    str12 = str14;
                    str11 = str15;
                    str10 = str16;
                    str9 = str17;
                    str8 = str18;
                    str7 = str19;
                    str6 = str20;
                    str5 = str21;
                    str4 = str22;
                    break;
            }
        }
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.Selfie.PromptPage value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("selfieTitle");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.mo12827T("selfiePrompt");
        this.stringAdapter.toJson(writer, value_.getPrompt());
        writer.mo12827T("selfiePromptCenter");
        this.stringAdapter.toJson(writer, value_.getPromptCenter());
        writer.mo12827T("agreeToPolicy");
        this.stringAdapter.toJson(writer, value_.getDisclosure());
        writer.mo12827T("btnSubmit");
        this.stringAdapter.toJson(writer, value_.getButtonSubmit());
        writer.mo12827T("cameraPermissionsTitle");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsTitle());
        writer.mo12827T("cameraPermissionsPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsPrompt());
        writer.mo12827T("cameraPermissionsBtnContinueMobile");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsAllowButtonText());
        writer.mo12827T("cameraPermissionsBtnCancel");
        this.nullableStringAdapter.toJson(writer, value_.getCameraPermissionsCancelButtonText());
        writer.mo12827T("microphonePermissionsBtnCancel");
        this.nullableStringAdapter.toJson(writer, value_.getMicrophonePermissionsBtnCancel());
        writer.mo12827T("microphonePermissionsBtnContinueMobile");
        this.nullableStringAdapter.toJson(writer, value_.getMicrophonePermissionsBtnContinueMobile());
        writer.mo12827T("microphonePermissionsPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getMicrophonePermissionsPrompt());
        writer.mo12827T("microphonePermissionsTitle");
        this.nullableStringAdapter.toJson(writer, value_.getMicrophonePermissionsTitle());
        writer.mo12823E();
    }
}
