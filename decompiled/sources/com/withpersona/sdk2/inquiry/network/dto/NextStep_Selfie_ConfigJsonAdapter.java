package com.withpersona.sdk2.inquiry.network.dto;

import bj.AbstractC11440E;
import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import dj.AbstractC13178c;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\"\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019¨\u0006,"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Selfie_ConfigJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Config;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "captureMethodAdapter", "Lbj/r;", "", "nullableBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "localizationsAdapter", "stringAdapter", "booleanAdapter", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "nullableListOfCaptureFileTypeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "nullableListOfVideoCaptureMethodAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfigAdapter", "nullableStringAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "nullableListOfSelfiePoseAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "nullablePendingPageTextPositionAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NextStep_Selfie_ConfigJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r assetConfigAdapter;
    private final AbstractC11471r booleanAdapter;
    private final AbstractC11471r captureMethodAdapter;
    private final AbstractC11471r localizationsAdapter;
    private final AbstractC11471r nullableBooleanAdapter;
    private final AbstractC11471r nullableListOfCaptureFileTypeAdapter;
    private final AbstractC11471r nullableListOfSelfiePoseAdapter;
    private final AbstractC11471r nullableListOfVideoCaptureMethodAdapter;
    private final AbstractC11471r nullablePendingPageTextPositionAdapter;
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("selfieType", "backStepEnabled", "cancelButtonEnabled", "localizations", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "enabledCaptureFileTypes", "videoCaptureMethods", "assets", "videoSessionJWT", "orderedPoses", "pendingPageTextVerticalPosition", "audioEnabled");
    private final AbstractC11471r stringAdapter;

    public NextStep_Selfie_ConfigJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.captureMethodAdapter = c11447l.m12850b(NextStep.Selfie.CaptureMethod.class, c17691y, "selfieType");
        this.nullableBooleanAdapter = c11447l.m12850b(Boolean.class, c17691y, "backStepEnabled");
        this.localizationsAdapter = c11447l.m12850b(NextStep.Selfie.Localizations.class, c17691y, "localizations");
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, "fieldKeySelfie");
        this.booleanAdapter = c11447l.m12850b(Boolean.TYPE, c17691y, "requireStrictSelfieCapture");
        this.nullableListOfCaptureFileTypeAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, NextStep.Selfie.CaptureFileType.class), c17691y, "enabledCaptureFileTypes");
        this.nullableListOfVideoCaptureMethodAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, NextStep.Selfie.VideoCaptureMethod.class), c17691y, "videoCaptureMethods");
        this.assetConfigAdapter = c11447l.m12850b(NextStep.Selfie.AssetConfig.class, c17691y, "assets");
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "videoSessionJwt");
        this.nullableListOfSelfiePoseAdapter = c11447l.m12850b(AbstractC11452Q.m12856f(List.class, NextStep.Selfie.SelfiePose.class), c17691y, "orderedPoses");
        this.nullablePendingPageTextPositionAdapter = c11447l.m12850b(PendingPageTextPosition.class, c17691y, "pendingPageTextVerticalPosition");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(44, "GeneratedJsonAdapter(NextStep.Selfie.Config)");
    }

    @Override // bj.AbstractC11471r
    public NextStep.Selfie.Config fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        Boolean bool = null;
        NextStep.Selfie.CaptureMethod captureMethod = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        NextStep.Selfie.Localizations localizations = null;
        String str = null;
        Boolean bool4 = null;
        List list = null;
        List list2 = null;
        NextStep.Selfie.AssetConfig assetConfig = null;
        String str2 = null;
        List list3 = null;
        PendingPageTextPosition pendingPageTextPosition = null;
        Boolean bool5 = null;
        while (true) {
            List list4 = list3;
            String str3 = str2;
            List list5 = list2;
            List list6 = list;
            if (!reader.hasNext()) {
                reader.mo12818m();
                if (captureMethod == null) {
                    throw AbstractC13178c.m14832f("selfieType", "selfieType", reader);
                }
                if (localizations == null) {
                    throw AbstractC13178c.m14832f("localizations", "localizations", reader);
                }
                if (str == null) {
                    throw AbstractC13178c.m14832f("fieldKeySelfie", "fieldKeySelfie", reader);
                }
                if (bool == null) {
                    throw AbstractC13178c.m14832f("requireStrictSelfieCapture", "requireStrictSelfieCapture", reader);
                }
                boolean zBooleanValue = bool.booleanValue();
                if (assetConfig != null) {
                    return new NextStep.Selfie.Config(captureMethod, bool2, bool3, localizations, str, zBooleanValue, bool4, list6, list5, assetConfig, str3, list4, pendingPageTextPosition, bool5);
                }
                throw AbstractC13178c.m14832f("assets", "assets", reader);
            }
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 0:
                    captureMethod = (NextStep.Selfie.CaptureMethod) this.captureMethodAdapter.fromJson(reader);
                    if (captureMethod == null) {
                        throw AbstractC13178c.m14838l("selfieType", "selfieType", reader);
                    }
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 1:
                    bool2 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 2:
                    bool3 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 3:
                    localizations = (NextStep.Selfie.Localizations) this.localizationsAdapter.fromJson(reader);
                    if (localizations == null) {
                        throw AbstractC13178c.m14838l("localizations", "localizations", reader);
                    }
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 4:
                    str = (String) this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw AbstractC13178c.m14838l("fieldKeySelfie", "fieldKeySelfie", reader);
                    }
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 5:
                    bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw AbstractC13178c.m14838l("requireStrictSelfieCapture", "requireStrictSelfieCapture", reader);
                    }
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 6:
                    bool4 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 7:
                    list = (List) this.nullableListOfCaptureFileTypeAdapter.fromJson(reader);
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    break;
                case 8:
                    list2 = (List) this.nullableListOfVideoCaptureMethodAdapter.fromJson(reader);
                    list3 = list4;
                    str2 = str3;
                    list = list6;
                    break;
                case 9:
                    assetConfig = (NextStep.Selfie.AssetConfig) this.assetConfigAdapter.fromJson(reader);
                    if (assetConfig == null) {
                        throw AbstractC13178c.m14838l("assets", "assets", reader);
                    }
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 10:
                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                    list3 = list4;
                    list2 = list5;
                    list = list6;
                    break;
                case 11:
                    list3 = (List) this.nullableListOfSelfiePoseAdapter.fromJson(reader);
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 12:
                    pendingPageTextPosition = (PendingPageTextPosition) this.nullablePendingPageTextPositionAdapter.fromJson(reader);
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                case 13:
                    bool5 = (Boolean) this.nullableBooleanAdapter.fromJson(reader);
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
                default:
                    list3 = list4;
                    str2 = str3;
                    list2 = list5;
                    list = list6;
                    break;
            }
        }
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, NextStep.Selfie.Config value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("selfieType");
        this.captureMethodAdapter.toJson(writer, value_.getSelfieType());
        writer.mo12827T("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getBackStepEnabled());
        writer.mo12827T("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getCancelButtonEnabled());
        writer.mo12827T("localizations");
        this.localizationsAdapter.toJson(writer, value_.getLocalizations());
        writer.mo12827T("fieldKeySelfie");
        this.stringAdapter.toJson(writer, value_.getFieldKeySelfie());
        writer.mo12827T("requireStrictSelfieCapture");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getRequireStrictSelfieCapture()));
        writer.mo12827T("skipPromptPage");
        this.nullableBooleanAdapter.toJson(writer, value_.getSkipPromptPage());
        writer.mo12827T("enabledCaptureFileTypes");
        this.nullableListOfCaptureFileTypeAdapter.toJson(writer, value_.getEnabledCaptureFileTypes());
        writer.mo12827T("videoCaptureMethods");
        this.nullableListOfVideoCaptureMethodAdapter.toJson(writer, value_.getVideoCaptureMethods());
        writer.mo12827T("assets");
        this.assetConfigAdapter.toJson(writer, value_.getAssets());
        writer.mo12827T("videoSessionJWT");
        this.nullableStringAdapter.toJson(writer, value_.getVideoSessionJwt());
        writer.mo12827T("orderedPoses");
        this.nullableListOfSelfiePoseAdapter.toJson(writer, value_.getOrderedPoses());
        writer.mo12827T("pendingPageTextVerticalPosition");
        this.nullablePendingPageTextPositionAdapter.toJson(writer, value_.getPendingPageTextVerticalPosition());
        writer.mo12827T("audioEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getAudioEnabled());
        writer.mo12823E();
    }
}
