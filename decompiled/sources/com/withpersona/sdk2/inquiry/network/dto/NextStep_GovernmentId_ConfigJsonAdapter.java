package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import com.withpersona.sdk2.inquiry.network.dto.government_id.C12893Id;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.styling.StyleElements;
import dj.AbstractC13178c;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\"\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\"\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001aR\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u001aR\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010/0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010\u001aR\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u001aR\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u001a¨\u00065"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_GovernmentId_ConfigJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Config;)V", "Lbj/v;", "options", "Lbj/v;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "nullableListOfIdAdapter", "Lbj/r;", "", "nullableBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "localizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "nullableListOfCaptureOptionNativeMobileAdapter", "", "nullableIntAdapter", "", "nullableLongAdapter", "stringAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "nullableListOfLocalizationOverrideAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "nullableListOfCaptureFileTypeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "nullableListOfVideoCaptureMethodAdapter", "nullableStringAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "nullableAssetConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AutoClassificationConfig;", "nullableAutoClassificationConfigAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$Axis;", "nullableAxisAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "nullablePendingPageTextPositionAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_GovernmentId_ConfigJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r localizationsAdapter;
    private final AbstractC11471r nullableAssetConfigAdapter;
    private final AbstractC11471r nullableAutoClassificationConfigAdapter;
    private final AbstractC11471r nullableAxisAdapter;
    private final AbstractC11471r nullableBooleanAdapter;
    private final AbstractC11471r nullableIntAdapter;
    private final AbstractC11471r nullableListOfCaptureFileTypeAdapter;
    private final AbstractC11471r nullableListOfCaptureOptionNativeMobileAdapter;
    private final AbstractC11471r nullableListOfIdAdapter;
    private final AbstractC11471r nullableListOfLocalizationOverrideAdapter;
    private final AbstractC11471r nullableListOfVideoCaptureMethodAdapter;
    private final AbstractC11471r nullableLongAdapter;
    private final AbstractC11471r nullablePendingPageTextPositionAdapter;
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("idclasses", "backStepEnabled", "cancelButtonEnabled", "localizations", "enabledCaptureOptionsNativeMobile", "imageCaptureCount", "nativeMobileCameraManualCaptureDelayMs", "fieldKeyDocument", "fieldKeyIdclass", "localizationOverrides", "shouldSkipReviewScreen", "enabledCaptureFileTypes", "videoCaptureMethods", "videoSessionJWT", "assets", "autoClassificationConfig", "reviewCaptureButtonsAxis", "pendingPageTextVerticalPosition", "audioEnabled");
    private final AbstractC11471r stringAdapter;

    public NextStep_GovernmentId_ConfigJsonAdapter(C11447L c11447l) {
        Util$ParameterizedTypeImpl util$ParameterizedTypeImplM12856f = AbstractC11452Q.m12856f(List.class, C12893Id.class);
        C17691y c17691y = C17691y.f56482Y;
        this.nullableListOfIdAdapter = c11447l.m12850b(util$ParameterizedTypeImplM12856f, c17691y, "idclasses");
        this.nullableBooleanAdapter = c11447l.m12850b(Boolean.class, c17691y, "backStepEnabled");
        this.localizationsAdapter = c11447l.m12850b(NextStep.GovernmentId.Localizations.class, c17691y, "localizations");
        this.nullableListOfCaptureOptionNativeMobileAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, CaptureOptionNativeMobile.class), c17691y, "enabledCaptureOptionsNativeMobile");
        this.nullableIntAdapter = c11447l.m12850b(Integer.class, c17691y, "imageCaptureCount");
        this.nullableLongAdapter = c11447l.m12850b(Long.class, c17691y, "nativeMobileCameraManualCaptureDelayMs");
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, "fieldKeyDocument");
        this.nullableListOfLocalizationOverrideAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, NextStep.GovernmentId.LocalizationOverride.class), c17691y, "localizationOverrides");
        this.nullableListOfCaptureFileTypeAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, NextStep.GovernmentId.CaptureFileType.class), c17691y, "enabledCaptureFileTypes");
        this.nullableListOfVideoCaptureMethodAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, NextStep.GovernmentId.VideoCaptureMethod.class), c17691y, "videoCaptureMethods");
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "videoSessionJwt");
        this.nullableAssetConfigAdapter = c11447l.m12850b(NextStep.GovernmentId.AssetConfig.class, c17691y, "assets");
        this.nullableAutoClassificationConfigAdapter = c11447l.m12850b(NextStep.GovernmentId.AutoClassificationConfig.class, c17691y, "autoClassificationConfig");
        this.nullableAxisAdapter = c11447l.m12850b(StyleElements.Axis.class, c17691y, "reviewCaptureButtonsAxis");
        this.nullablePendingPageTextPositionAdapter = c11447l.m12850b(PendingPageTextPosition.class, c17691y, "pendingPageTextVerticalPosition");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(50, "GeneratedJsonAdapter(NextStep.GovernmentId.Config)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.GovernmentId.Config fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        List list = null;
        Boolean bool = null;
        Boolean bool2 = null;
        NextStep.GovernmentId.Localizations localizations = null;
        List list2 = null;
        Integer num = null;
        Long l4 = null;
        String str = null;
        String str2 = null;
        List list3 = null;
        Boolean bool3 = null;
        List list4 = null;
        List list5 = null;
        String str3 = null;
        NextStep.GovernmentId.AssetConfig assetConfig = null;
        NextStep.GovernmentId.AutoClassificationConfig autoClassificationConfig = null;
        StyleElements.Axis axis = null;
        PendingPageTextPosition pendingPageTextPosition = null;
        Boolean bool4 = null;
        while (true) {
            List list6 = list4;
            Boolean bool5 = bool3;
            if (!reader.hasNext()) {
                reader.mo12818m();
                if (localizations == null) {
                    throw AbstractC13178c.m14832f("localizations", "localizations", reader);
                }
                if (str == null) {
                    throw AbstractC13178c.m14832f("fieldKeyDocument", "fieldKeyDocument", reader);
                }
                if (str2 != null) {
                    return new NextStep.GovernmentId.Config(list, bool, bool2, localizations, list2, num, l4, str, str2, list3, bool5, list6, list5, str3, assetConfig, autoClassificationConfig, axis, pendingPageTextPosition, bool4);
                }
                throw AbstractC13178c.m14832f("fieldKeyIdclass", "fieldKeyIdclass", reader);
            }
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 0:
                    list = (List) this.nullableListOfIdAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 1:
                    bool = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 2:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 3:
                    localizations = (NextStep.GovernmentId.Localizations) this.localizationsAdapter.fromJson(reader);
                    if (localizations == null) {
                        throw AbstractC13178c.m14838l("localizations", "localizations", reader);
                    }
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 4:
                    list2 = (List) this.nullableListOfCaptureOptionNativeMobileAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 5:
                    num = (Integer) this.nullableIntAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 6:
                    l4 = (Long) this.nullableLongAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 7:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC13178c.m14838l("fieldKeyDocument", "fieldKeyDocument", reader);
                    }
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 8:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC13178c.m14838l("fieldKeyIdclass", "fieldKeyIdclass", reader);
                    }
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 9:
                    list3 = (List) this.nullableListOfLocalizationOverrideAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 10:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    list4 = list6;
                    break;
                case 11:
                    list4 = (List) this.nullableListOfCaptureFileTypeAdapter.fromJson(reader);
                    bool3 = bool5;
                    break;
                case 12:
                    list5 = (List) this.nullableListOfVideoCaptureMethodAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 13:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 14:
                    assetConfig = (NextStep.GovernmentId.AssetConfig) this.nullableAssetConfigAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 15:
                    autoClassificationConfig = (NextStep.GovernmentId.AutoClassificationConfig) this.nullableAutoClassificationConfigAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 16:
                    axis = (StyleElements.Axis) this.nullableAxisAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 17:
                    pendingPageTextPosition = (PendingPageTextPosition) this.nullablePendingPageTextPositionAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                case 18:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    list4 = list6;
                    bool3 = bool5;
                    break;
                default:
                    list4 = list6;
                    bool3 = bool5;
                    break;
            }
        }
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.GovernmentId.Config value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("idclasses");
        this.nullableListOfIdAdapter.toJson(writer, value_.getIdclasses());
        writer.mo12827T("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getBackStepEnabled());
        writer.mo12827T("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getCancelButtonEnabled());
        writer.mo12827T("localizations");
        this.localizationsAdapter.toJson(writer, value_.getLocalizations());
        writer.mo12827T("enabledCaptureOptionsNativeMobile");
        this.nullableListOfCaptureOptionNativeMobileAdapter.toJson(writer, value_.getEnabledCaptureOptionsNativeMobile());
        writer.mo12827T("imageCaptureCount");
        this.nullableIntAdapter.toJson(writer, value_.getImageCaptureCount());
        writer.mo12827T("nativeMobileCameraManualCaptureDelayMs");
        this.nullableLongAdapter.toJson(writer, value_.getNativeMobileCameraManualCaptureDelayMs());
        writer.mo12827T("fieldKeyDocument");
        this.stringAdapter.toJson(writer, value_.getFieldKeyDocument());
        writer.mo12827T("fieldKeyIdclass");
        this.stringAdapter.toJson(writer, value_.getFieldKeyIdclass());
        writer.mo12827T("localizationOverrides");
        this.nullableListOfLocalizationOverrideAdapter.toJson(writer, value_.getLocalizationOverrides());
        writer.mo12827T("shouldSkipReviewScreen");
        this.nullableBooleanAdapter.toJson(writer, value_.getShouldSkipReviewScreen());
        writer.mo12827T("enabledCaptureFileTypes");
        this.nullableListOfCaptureFileTypeAdapter.toJson(writer, value_.getEnabledCaptureFileTypes());
        writer.mo12827T("videoCaptureMethods");
        this.nullableListOfVideoCaptureMethodAdapter.toJson(writer, value_.getVideoCaptureMethods());
        writer.mo12827T("videoSessionJWT");
        this.nullableStringAdapter.toJson(writer, value_.getVideoSessionJwt());
        writer.mo12827T("assets");
        this.nullableAssetConfigAdapter.toJson(writer, value_.getAssets());
        writer.mo12827T("autoClassificationConfig");
        this.nullableAutoClassificationConfigAdapter.toJson(writer, value_.getAutoClassificationConfig());
        writer.mo12827T("reviewCaptureButtonsAxis");
        this.nullableAxisAdapter.toJson(writer, value_.getReviewCaptureButtonsAxis());
        writer.mo12827T("pendingPageTextVerticalPosition");
        this.nullablePendingPageTextPositionAdapter.toJson(writer, value_.getPendingPageTextVerticalPosition());
        writer.mo12827T("audioEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getAudioEnabled());
        writer.mo12823E();
    }
}
