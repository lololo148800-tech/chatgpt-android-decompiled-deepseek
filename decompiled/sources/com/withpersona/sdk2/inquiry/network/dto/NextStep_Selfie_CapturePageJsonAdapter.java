package com.withpersona.sdk2.inquiry.network.dto;

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
@Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_CapturePageJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CapturePage;)V", "Lbj/v;", "options", "Lbj/v;", "nullableStringAdapter", "Lbj/r;", "stringAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_Selfie_CapturePageJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a(UiComponentConfig.Title.type, "selfieHintTakePhoto", "selfieHintCenterFace", "selfieHintFaceTooClose", "selfieHintFaceTooFar", "selfieHintMultipleFaces", "selfieHintFaceIncomplete", "selfieHintPoseNotCenter", "selfieHintLookLeft", "selfieHintLookRight", "selfieHintHoldStill");
    private final AbstractC11471r stringAdapter;

    public NextStep_Selfie_CapturePageJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, UiComponentConfig.Title.type);
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, "selfieHintTakePhoto");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(49, "GeneratedJsonAdapter(NextStep.Selfie.CapturePage)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.Selfie.CapturePage fromJson(AbstractC11477x reader) {
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
        while (true) {
            String str12 = str;
            String str13 = str11;
            String str14 = str10;
            String str15 = str9;
            String str16 = str8;
            String str17 = str7;
            String str18 = str6;
            String str19 = str5;
            if (!reader.hasNext()) {
                reader.mo12818m();
                if (str2 == null) {
                    throw AbstractC13178c.m14832f("selfieHintTakePhoto", "selfieHintTakePhoto", reader);
                }
                if (str3 == null) {
                    throw AbstractC13178c.m14832f("selfieHintCenterFace", "selfieHintCenterFace", reader);
                }
                if (str4 == null) {
                    throw AbstractC13178c.m14832f("selfieHintFaceTooClose", "selfieHintFaceTooClose", reader);
                }
                if (str19 == null) {
                    throw AbstractC13178c.m14832f("selfieHintFaceTooFar", "selfieHintFaceTooFar", reader);
                }
                if (str18 == null) {
                    throw AbstractC13178c.m14832f("selfieHintMultipleFaces", "selfieHintMultipleFaces", reader);
                }
                if (str17 == null) {
                    throw AbstractC13178c.m14832f("selfieHintFaceIncomplete", "selfieHintFaceIncomplete", reader);
                }
                if (str16 == null) {
                    throw AbstractC13178c.m14832f("selfieHintPoseNotCenter", "selfieHintPoseNotCenter", reader);
                }
                if (str15 == null) {
                    throw AbstractC13178c.m14832f("selfieHintLookLeft", "selfieHintLookLeft", reader);
                }
                if (str14 == null) {
                    throw AbstractC13178c.m14832f("selfieHintLookRight", "selfieHintLookRight", reader);
                }
                if (str13 != null) {
                    return new NextStep.Selfie.CapturePage(str12, str2, str3, str4, str19, str18, str17, str16, str15, str14, str13);
                }
                throw AbstractC13178c.m14832f("selfieHintHoldStill", "selfieHintHoldStill", reader);
            }
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC13178c.m14838l("selfieHintTakePhoto", "selfieHintTakePhoto", reader);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC13178c.m14838l("selfieHintCenterFace", "selfieHintCenterFace", reader);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC13178c.m14838l("selfieHintFaceTooClose", "selfieHintFaceTooClose", reader);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                    break;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw AbstractC13178c.m14838l("selfieHintFaceTooFar", "selfieHintFaceTooFar", reader);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    break;
                    break;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw AbstractC13178c.m14838l("selfieHintMultipleFaces", "selfieHintMultipleFaces", reader);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str5 = str19;
                    break;
                    break;
                case 6:
                    str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        throw AbstractC13178c.m14838l("selfieHintFaceIncomplete", "selfieHintFaceIncomplete", reader);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str6 = str18;
                    str5 = str19;
                    break;
                    break;
                case 7:
                    String str20 = (String) this.stringAdapter.fromJson(reader);
                    if (str20 == null) {
                        throw AbstractC13178c.m14838l("selfieHintPoseNotCenter", "selfieHintPoseNotCenter", reader);
                    }
                    str8 = str20;
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                    break;
                    break;
                case 8:
                    str9 = (String) this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw AbstractC13178c.m14838l("selfieHintLookLeft", "selfieHintLookLeft", reader);
                    }
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                    break;
                    break;
                case 9:
                    str10 = (String) this.stringAdapter.fromJson(reader);
                    if (str10 == null) {
                        throw AbstractC13178c.m14838l("selfieHintLookRight", "selfieHintLookRight", reader);
                    }
                    str = str12;
                    str11 = str13;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                    break;
                    break;
                case 10:
                    str11 = (String) this.stringAdapter.fromJson(reader);
                    if (str11 == null) {
                        throw AbstractC13178c.m14838l("selfieHintHoldStill", "selfieHintHoldStill", reader);
                    }
                    str = str12;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                    break;
                    break;
                default:
                    str = str12;
                    str11 = str13;
                    str10 = str14;
                    str9 = str15;
                    str8 = str16;
                    str7 = str17;
                    str6 = str18;
                    str5 = str19;
                    break;
            }
        }
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.Selfie.CapturePage value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T(UiComponentConfig.Title.type);
        this.nullableStringAdapter.toJson(writer, value_.getTitle());
        writer.mo12827T("selfieHintTakePhoto");
        this.stringAdapter.toJson(writer, value_.getSelfieHintTakePhoto());
        writer.mo12827T("selfieHintCenterFace");
        this.stringAdapter.toJson(writer, value_.getSelfieHintCenterFace());
        writer.mo12827T("selfieHintFaceTooClose");
        this.stringAdapter.toJson(writer, value_.getSelfieHintFaceTooClose());
        writer.mo12827T("selfieHintFaceTooFar");
        this.stringAdapter.toJson(writer, value_.getSelfieHintFaceTooFar());
        writer.mo12827T("selfieHintMultipleFaces");
        this.stringAdapter.toJson(writer, value_.getSelfieHintMultipleFaces());
        writer.mo12827T("selfieHintFaceIncomplete");
        this.stringAdapter.toJson(writer, value_.getSelfieHintFaceIncomplete());
        writer.mo12827T("selfieHintPoseNotCenter");
        this.stringAdapter.toJson(writer, value_.getSelfieHintPoseNotCenter());
        writer.mo12827T("selfieHintLookLeft");
        this.stringAdapter.toJson(writer, value_.getSelfieHintLookLeft());
        writer.mo12827T("selfieHintLookRight");
        this.stringAdapter.toJson(writer, value_.getSelfieHintLookRight());
        writer.mo12827T("selfieHintHoldStill");
        this.stringAdapter.toJson(writer, value_.getSelfieHintHoldStill());
        writer.mo12823E();
    }
}
