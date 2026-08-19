package com.withpersona.sdk2.inquiry.network.dto.p686ui;

import android.gov.nist.javax.sip.header.ParameterNames;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.android.datatransport.cct.NwaZ.lZYtIbClQJm;
import com.google.protobuf.AbstractC12107L1;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_InputAddress_AttributesJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputAddress$Attributes;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputAddress$Attributes;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputAddress$Attributes;)V", "Lbj/v;", "options", "Lbj/v;", "nullableStringAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentConfig_InputAddress_AttributesJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableJsonLogicBooleanAdapter;
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("label", "editAddressManuallyPrompt", "placeholderAutocomplete", "fieldKeyAddressStreet1", "prefillAddressStreet1", "placeholderAddressStreet1", "fieldKeyAddressStreet2", "prefillAddressStreet2", "placeholderAddressStreet2", "fieldKeyAddressCity", "prefillAddressCity", "placeholderAddressCity", "fieldKeyAddressSubdivision", "prefillAddressSubdivision", "placeholderAddressSubdivision", "placeholderAddressSubdivisionUs", "fieldKeyAddressPostalCode", "prefillAddressPostalCode", "placeholderAddressPostalCode", "placeholderAddressPostalCodeUs", "selectedCountryCode", ParameterNames.HIDDEN, "disabled");

    public String toString() {
        return AbstractC12107L1.m13823n(63, "GeneratedJsonAdapter(UiComponentConfig.InputAddress.Attributes)");
    }

    public UiComponentConfig_InputAddress_AttributesJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, lZYtIbClQJm.Ggi);
        this.nullableJsonLogicBooleanAdapter = c11447l.m12850b(JsonLogicBoolean.class, c17691y, ParameterNames.HIDDEN);
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.InputAddress.Attributes fromJson(AbstractC11477x reader) {
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
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
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
                case 7:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 13:
                    str14 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 14:
                    str15 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    str16 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 16:
                    str17 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    str18 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 18:
                    str19 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 19:
                    str20 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 20:
                    str21 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 21:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 22:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.mo12818m();
        return new UiComponentConfig.InputAddress.Attributes(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, jsonLogicBoolean, jsonLogicBoolean2);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.InputAddress.Attributes value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("label");
        this.nullableStringAdapter.toJson(writer, value_.getLabel());
        writer.mo12827T("editAddressManuallyPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getEditAddressManuallyPrompt());
        writer.mo12827T("placeholderAutocomplete");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAutocomplete());
        writer.mo12827T("fieldKeyAddressStreet1");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyAddressStreet1());
        writer.mo12827T("prefillAddressStreet1");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillAddressStreet1());
        writer.mo12827T("placeholderAddressStreet1");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressStreet1());
        writer.mo12827T("fieldKeyAddressStreet2");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyAddressStreet2());
        writer.mo12827T("prefillAddressStreet2");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillAddressStreet2());
        writer.mo12827T("placeholderAddressStreet2");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressStreet2());
        writer.mo12827T("fieldKeyAddressCity");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyAddressCity());
        writer.mo12827T("prefillAddressCity");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillAddressCity());
        writer.mo12827T("placeholderAddressCity");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressCity());
        writer.mo12827T("fieldKeyAddressSubdivision");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyAddressSubdivision());
        writer.mo12827T("prefillAddressSubdivision");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillAddressSubdivision());
        writer.mo12827T("placeholderAddressSubdivision");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressSubdivision());
        writer.mo12827T("placeholderAddressSubdivisionUs");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressSubdivisionUs());
        writer.mo12827T("fieldKeyAddressPostalCode");
        this.nullableStringAdapter.toJson(writer, value_.getFieldKeyAddressPostalCode());
        writer.mo12827T("prefillAddressPostalCode");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillAddressPostalCode());
        writer.mo12827T("placeholderAddressPostalCode");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressPostalCode());
        writer.mo12827T("placeholderAddressPostalCodeUs");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderAddressPostalCodeUs());
        writer.mo12827T("selectedCountryCode");
        this.nullableStringAdapter.toJson(writer, value_.getSelectedCountryCode());
        writer.mo12827T(ParameterNames.HIDDEN);
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.mo12827T("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.mo12823E();
    }
}
