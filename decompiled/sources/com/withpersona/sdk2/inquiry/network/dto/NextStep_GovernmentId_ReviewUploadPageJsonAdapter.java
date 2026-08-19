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
import p138F8.vJO.vRJidSveZHcTw;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_ReviewUploadPageJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$ReviewUploadPage;)V", "Lbj/v;", "options", "Lbj/v;", "stringAdapter", "Lbj/r;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_GovernmentId_ReviewUploadPageJsonAdapter extends AbstractC11471r {
    private final C11475v options = C11475v.m12866a("titleFront", "titleBack", "titlePdf417", "titlePassportSignature", "descriptionFront", "descriptionBack", "descriptionPdf417", "descriptionPassportSignature", "confirmButtonText", "chooseAnotherButtonText");
    private final AbstractC11471r stringAdapter;

    public NextStep_GovernmentId_ReviewUploadPageJsonAdapter(C11447L c11447l) {
        this.stringAdapter = c11447l.m12850b(String.class, C17691y.f56482Y, "titleFront");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(60, "GeneratedJsonAdapter(NextStep.GovernmentId.ReviewUploadPage)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.GovernmentId.ReviewUploadPage fromJson(AbstractC11477x reader) {
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
        while (true) {
            boolean zHasNext = reader.hasNext();
            String str11 = str10;
            String str12 = str9;
            String str13 = vRJidSveZHcTw.RCFojSKB;
            String str14 = str8;
            String str15 = str7;
            String str16 = str6;
            String str17 = str5;
            String str18 = str4;
            if (!zHasNext) {
                reader.mo12818m();
                if (str == null) {
                    throw AbstractC13178c.m14832f("titleFront", "titleFront", reader);
                }
                if (str2 == null) {
                    throw AbstractC13178c.m14832f("titleBack", "titleBack", reader);
                }
                if (str3 == null) {
                    throw AbstractC13178c.m14832f("titlePdf417", "titlePdf417", reader);
                }
                if (str18 == null) {
                    throw AbstractC13178c.m14832f("titlePassportSignature", "titlePassportSignature", reader);
                }
                if (str17 == null) {
                    throw AbstractC13178c.m14832f(str13, str13, reader);
                }
                if (str16 == null) {
                    throw AbstractC13178c.m14832f("descriptionBack", "descriptionBack", reader);
                }
                if (str15 == null) {
                    throw AbstractC13178c.m14832f("descriptionPdf417", "descriptionPdf417", reader);
                }
                if (str14 == null) {
                    throw AbstractC13178c.m14832f("descriptionPassportSignature", "descriptionPassportSignature", reader);
                }
                if (str12 == null) {
                    throw AbstractC13178c.m14832f("confirmButtonText", "confirmButtonText", reader);
                }
                if (str11 != null) {
                    return new NextStep.GovernmentId.ReviewUploadPage(str, str2, str3, str18, str17, str16, str15, str14, str12, str11);
                }
                throw AbstractC13178c.m14832f("chooseAnotherButtonText", "chooseAnotherButtonText", reader);
            }
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    str10 = str11;
                    str9 = str12;
                    str8 = str14;
                    str7 = str15;
                    str6 = str16;
                    str5 = str17;
                    str4 = str18;
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC13178c.m14838l("titleFront", "titleFront", reader);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str14;
                    str7 = str15;
                    str6 = str16;
                    str5 = str17;
                    str4 = str18;
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC13178c.m14838l("titleBack", "titleBack", reader);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str14;
                    str7 = str15;
                    str6 = str16;
                    str5 = str17;
                    str4 = str18;
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw AbstractC13178c.m14838l("titlePdf417", "titlePdf417", reader);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str14;
                    str7 = str15;
                    str6 = str16;
                    str5 = str17;
                    str4 = str18;
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw AbstractC13178c.m14838l("titlePassportSignature", "titlePassportSignature", reader);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str14;
                    str7 = str15;
                    str6 = str16;
                    str5 = str17;
                    break;
                    break;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw AbstractC13178c.m14838l(str13, str13, reader);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str14;
                    str7 = str15;
                    str6 = str16;
                    str4 = str18;
                    break;
                    break;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw AbstractC13178c.m14838l("descriptionBack", "descriptionBack", reader);
                    }
                    str10 = str11;
                    str9 = str12;
                    str8 = str14;
                    str7 = str15;
                    str5 = str17;
                    str4 = str18;
                    break;
                    break;
                case 6:
                    String str19 = (String) this.stringAdapter.fromJson(reader);
                    if (str19 == null) {
                        throw AbstractC13178c.m14838l("descriptionPdf417", "descriptionPdf417", reader);
                    }
                    str7 = str19;
                    str10 = str11;
                    str9 = str12;
                    str8 = str14;
                    str6 = str16;
                    str5 = str17;
                    str4 = str18;
                    break;
                    break;
                case 7:
                    str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        throw AbstractC13178c.m14838l("descriptionPassportSignature", "descriptionPassportSignature", reader);
                    }
                    str10 = str11;
                    str9 = str12;
                    str7 = str15;
                    str6 = str16;
                    str5 = str17;
                    str4 = str18;
                    break;
                    break;
                case 8:
                    str9 = (String) this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        throw AbstractC13178c.m14838l("confirmButtonText", "confirmButtonText", reader);
                    }
                    str10 = str11;
                    str8 = str14;
                    str7 = str15;
                    str6 = str16;
                    str5 = str17;
                    str4 = str18;
                    break;
                    break;
                case 9:
                    str10 = (String) this.stringAdapter.fromJson(reader);
                    if (str10 == null) {
                        throw AbstractC13178c.m14838l("chooseAnotherButtonText", "chooseAnotherButtonText", reader);
                    }
                    str9 = str12;
                    str8 = str14;
                    str7 = str15;
                    str6 = str16;
                    str5 = str17;
                    str4 = str18;
                    break;
                default:
                    str10 = str11;
                    str9 = str12;
                    str8 = str14;
                    str7 = str15;
                    str6 = str16;
                    str5 = str17;
                    str4 = str18;
                    break;
            }
        }
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.GovernmentId.ReviewUploadPage value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("titleFront");
        this.stringAdapter.toJson(writer, value_.getTitleFront());
        writer.mo12827T("titleBack");
        this.stringAdapter.toJson(writer, value_.getTitleBack());
        writer.mo12827T("titlePdf417");
        this.stringAdapter.toJson(writer, value_.getTitlePdf417());
        writer.mo12827T("titlePassportSignature");
        this.stringAdapter.toJson(writer, value_.getTitlePassportSignature());
        writer.mo12827T("descriptionFront");
        this.stringAdapter.toJson(writer, value_.getDescriptionFront());
        writer.mo12827T("descriptionBack");
        this.stringAdapter.toJson(writer, value_.getDescriptionBack());
        writer.mo12827T("descriptionPdf417");
        this.stringAdapter.toJson(writer, value_.getDescriptionPdf417());
        writer.mo12827T("descriptionPassportSignature");
        this.stringAdapter.toJson(writer, value_.getDescriptionPassportSignature());
        writer.mo12827T("confirmButtonText");
        this.stringAdapter.toJson(writer, value_.getConfirmButtonText());
        writer.mo12827T("chooseAnotherButtonText");
        this.stringAdapter.toJson(writer, value_.getChooseAnotherButtonText());
        writer.mo12823E();
    }
}
