package com.withpersona.sdk2.inquiry.network.dto.p686ui;

import android.gov.nist.javax.sip.header.ParameterNames;
import bj.AbstractC11440E;
import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import dj.AbstractC13178c;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_InputInternationalDb_AttributesJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$Attributes;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$Attributes;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$Attributes;)V", "Lbj/v;", "options", "Lbj/v;", "nullableStringAdapter", "Lbj/r;", "", "nullableBooleanAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputInternationalDb$IdType;", "listOfIdTypeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentConfig_InputInternationalDb_AttributesJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r listOfIdTypeAdapter;
    private final AbstractC11471r nullableBooleanAdapter;
    private final AbstractC11471r nullableJsonLogicBooleanAdapter;
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("prefillIdbCountry", "prefillIdbType", "prefillIdbValue", "errorIdbCountry", "errorIdbType", "errorIdbValue", "hideCountryIfPrefilled", "hideTypeIfPrefilled", "hideCountryIfSingleChoice", "hideTypeIfSingleChoice", "allowedIdTypes", "label", "labelIdbCountry", "labelIdbType", "labelIdbValue", "placeholderIdbCountry", "placeholderIdbType", "placeholderIdbValue", ParameterNames.HIDDEN, "disabled");

    public UiComponentConfig_InputInternationalDb_AttributesJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "prefillIdbCountry");
        this.nullableBooleanAdapter = c11447l.m12850b(Boolean.class, c17691y, "hideCountryIfPrefilled");
        this.listOfIdTypeAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, UiComponentConfig.InputInternationalDb.IdType.class), c17691y, "allowedIdTypes");
        this.nullableJsonLogicBooleanAdapter = c11447l.m12850b(JsonLogicBoolean.class, c17691y, ParameterNames.HIDDEN);
    }

    public String toString() {
        return AbstractC12107L1.m13823n(71, "GeneratedJsonAdapter(UiComponentConfig.InputInternationalDb.Attributes)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.InputInternationalDb.Attributes fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
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
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 7:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 9:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 10:
                    list = (List) this.listOfIdTypeAdapter.fromJson(reader);
                    if (list == null) {
                        throw AbstractC13178c.m14838l("allowedIdTypes", "allowedIdTypes", reader);
                    }
                    break;
                    break;
                case 11:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 13:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 14:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 16:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 18:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 19:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.mo12818m();
        if (list != null) {
            return new UiComponentConfig.InputInternationalDb.Attributes(str, str2, str3, str4, str5, str6, bool, bool2, bool3, bool4, list, str7, str8, str9, str10, str11, str12, str13, jsonLogicBoolean, jsonLogicBoolean2);
        }
        throw AbstractC13178c.m14832f("allowedIdTypes", "allowedIdTypes", reader);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.InputInternationalDb.Attributes value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("prefillIdbCountry");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillIdbCountry());
        writer.mo12827T("prefillIdbType");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillIdbType());
        writer.mo12827T("prefillIdbValue");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillIdbValue());
        writer.mo12827T("errorIdbCountry");
        this.nullableStringAdapter.toJson(writer, value_.getErrorIdbCountry());
        writer.mo12827T("errorIdbType");
        this.nullableStringAdapter.toJson(writer, value_.getErrorIdbType());
        writer.mo12827T("errorIdbValue");
        this.nullableStringAdapter.toJson(writer, value_.getErrorIdbValue());
        writer.mo12827T("hideCountryIfPrefilled");
        this.nullableBooleanAdapter.toJson(writer, value_.getHideCountryIfPrefilled());
        writer.mo12827T("hideTypeIfPrefilled");
        this.nullableBooleanAdapter.toJson(writer, value_.getHideTypeIfPrefilled());
        writer.mo12827T("hideCountryIfSingleChoice");
        this.nullableBooleanAdapter.toJson(writer, value_.getHideCountryIfSingleChoice());
        writer.mo12827T("hideTypeIfSingleChoice");
        this.nullableBooleanAdapter.toJson(writer, value_.getHideTypeIfSingleChoice());
        writer.mo12827T("allowedIdTypes");
        this.listOfIdTypeAdapter.toJson(writer, value_.getAllowedIdTypes());
        writer.mo12827T("label");
        this.nullableStringAdapter.toJson(writer, value_.getLabel());
        writer.mo12827T("labelIdbCountry");
        this.nullableStringAdapter.toJson(writer, value_.getLabelIdbCountry());
        writer.mo12827T("labelIdbType");
        this.nullableStringAdapter.toJson(writer, value_.getLabelIdbType());
        writer.mo12827T("labelIdbValue");
        this.nullableStringAdapter.toJson(writer, value_.getLabelIdbValue());
        writer.mo12827T("placeholderIdbCountry");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderIdbCountry());
        writer.mo12827T("placeholderIdbType");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderIdbType());
        writer.mo12827T("placeholderIdbValue");
        this.nullableStringAdapter.toJson(writer, value_.getPlaceholderIdbValue());
        writer.mo12827T(ParameterNames.HIDDEN);
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.mo12827T("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.mo12823E();
    }
}
