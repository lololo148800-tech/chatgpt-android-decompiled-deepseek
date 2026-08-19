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
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_GovernmentIdNfcScan_AttributesJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$Attributes;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$Attributes;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$Attributes;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "Lbj/r;", "nullableStringAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$GovernmentIdNfcScan$DataGroupTypes;", "nullableListOfDataGroupTypesAdapter", "", "nullableBooleanAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentConfig_GovernmentIdNfcScan_AttributesJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableBooleanAdapter;
    private final AbstractC11471r nullableJsonLogicBooleanAdapter;
    private final AbstractC11471r nullableListOfDataGroupTypesAdapter;
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a(ParameterNames.HIDDEN, "disabled", "documentNumberLabel", "prefillCardAccessNumber", "prefillDocumentNumber", "dateOfBirthLabel", "prefillDateOfBirth", "cardAccessNumberLabel", "expirationDateLabel", "prefillExpirationDate", "launchButtonText", "scanDocumentPrompt", "scanDocumentSuccess", "enabledDataGroups", "authenticating", "reading", "requiredText", "scanDocumentError", "enableNfcPrompt", "authenticationErrorPrompt", "hidePrefilledInputs", "connectionLostPrompt", "unsupportedDocumentType", "retryError");

    public UiComponentConfig_GovernmentIdNfcScan_AttributesJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableJsonLogicBooleanAdapter = c11447l.m12850b(JsonLogicBoolean.class, c17691y, ParameterNames.HIDDEN);
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "documentNumberLabel");
        this.nullableListOfDataGroupTypesAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, UiComponentConfig.GovernmentIdNfcScan.DataGroupTypes.class), c17691y, "enabledDataGroups");
        this.nullableBooleanAdapter = c11447l.m12850b(Boolean.class, c17691y, "hidePrefilledInputs");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(70, "GeneratedJsonAdapter(UiComponentConfig.GovernmentIdNfcScan.Attributes)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.GovernmentIdNfcScan.Attributes fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
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
        List list = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        Boolean bool = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 1:
                    jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 2:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    str5 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    str6 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    str7 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    str8 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 10:
                    str9 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 11:
                    str10 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    str11 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 13:
                    list = (List) this.nullableListOfDataGroupTypesAdapter.fromJson(reader);
                    break;
                case 14:
                    str12 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 15:
                    str13 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 16:
                    str14 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 17:
                    str15 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 18:
                    str16 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 19:
                    str17 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 20:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 21:
                    str18 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 22:
                    str19 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 23:
                    str20 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.mo12818m();
        return new UiComponentConfig.GovernmentIdNfcScan.Attributes(jsonLogicBoolean, jsonLogicBoolean2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, str12, str13, str14, str15, str16, str17, bool, str18, str19, str20);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.GovernmentIdNfcScan.Attributes value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T(ParameterNames.HIDDEN);
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.mo12827T("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.mo12827T("documentNumberLabel");
        this.nullableStringAdapter.toJson(writer, value_.getDocumentNumberLabel());
        writer.mo12827T("prefillCardAccessNumber");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillCardAccessNumber());
        writer.mo12827T("prefillDocumentNumber");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillDocumentNumber());
        writer.mo12827T("dateOfBirthLabel");
        this.nullableStringAdapter.toJson(writer, value_.getDateOfBirthLabel());
        writer.mo12827T("prefillDateOfBirth");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillDateOfBirth());
        writer.mo12827T("cardAccessNumberLabel");
        this.nullableStringAdapter.toJson(writer, value_.getCardAccessNumberLabel());
        writer.mo12827T("expirationDateLabel");
        this.nullableStringAdapter.toJson(writer, value_.getExpirationDateLabel());
        writer.mo12827T("prefillExpirationDate");
        this.nullableStringAdapter.toJson(writer, value_.getPrefillExpirationDate());
        writer.mo12827T("launchButtonText");
        this.nullableStringAdapter.toJson(writer, value_.getLaunchButtonText());
        writer.mo12827T("scanDocumentPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getScanDocumentPrompt());
        writer.mo12827T("scanDocumentSuccess");
        this.nullableStringAdapter.toJson(writer, value_.getScanDocumentSuccess());
        writer.mo12827T("enabledDataGroups");
        this.nullableListOfDataGroupTypesAdapter.toJson(writer, value_.getEnabledDataGroups());
        writer.mo12827T("authenticating");
        this.nullableStringAdapter.toJson(writer, value_.getAuthenticating());
        writer.mo12827T("reading");
        this.nullableStringAdapter.toJson(writer, value_.getReading());
        writer.mo12827T("requiredText");
        this.nullableStringAdapter.toJson(writer, value_.getRequiredText());
        writer.mo12827T("scanDocumentError");
        this.nullableStringAdapter.toJson(writer, value_.getScanDocumentError());
        writer.mo12827T("enableNfcPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getEnableNfcPrompt());
        writer.mo12827T("authenticationErrorPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getAuthenticationErrorPrompt());
        writer.mo12827T("hidePrefilledInputs");
        this.nullableBooleanAdapter.toJson(writer, value_.getHidePrefilledInputs());
        writer.mo12827T("connectionLostPrompt");
        this.nullableStringAdapter.toJson(writer, value_.getConnectionLostPrompt());
        writer.mo12827T("unsupportedDocumentType");
        this.nullableStringAdapter.toJson(writer, value_.getUnsupportedDocumentType());
        writer.mo12827T("retryError");
        this.nullableStringAdapter.toJson(writer, value_.getRetryError());
        writer.mo12823E();
    }
}
