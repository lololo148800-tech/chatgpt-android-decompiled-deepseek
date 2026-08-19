package com.withpersona.sdk2.inquiry.network.dto.p686ui;

import android.gov.nist.javax.sip.header.ParameterNames;
import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import dj.AbstractC13178c;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;
import sj.hJY.CsqksqyPE;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_RemoteImage_AttributesJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$Attributes;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$Attributes;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$Attributes;)V", "Lbj/v;", "options", "Lbj/v;", "nullableStringAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$RemoteImage$ContentType;", "nullableContentTypeAdapter", "stringAdapter", "contentTypeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentConfig_RemoteImage_AttributesJsonAdapter extends AbstractC11471r {
    private volatile Constructor<UiComponentConfig.RemoteImage.Attributes> constructorRef;
    private final AbstractC11471r contentTypeAdapter;
    private final AbstractC11471r nullableContentTypeAdapter;
    private final AbstractC11471r nullableJsonLogicBooleanAdapter;
    private final AbstractC11471r nullableStringAdapter;
    private final C11475v options = C11475v.m12866a("localAssetName", "localAssetContentType", "url", "width", CsqksqyPE.SOlf, "contentType", ParameterNames.HIDDEN);
    private final AbstractC11471r stringAdapter;

    public String toString() {
        return AbstractC12107L1.m13823n(62, "GeneratedJsonAdapter(UiComponentConfig.RemoteImage.Attributes)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.RemoteImage.Attributes fromJson(AbstractC11477x reader) throws NoSuchMethodException {
        reader.mo12814e();
        int i10 = -1;
        String str = null;
        UiComponentConfig.RemoteImage.ContentType contentType = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        UiComponentConfig.RemoteImage.ContentType contentType2 = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(reader);
                    i10 &= -2;
                    break;
                case 1:
                    contentType = (UiComponentConfig.RemoteImage.ContentType) this.nullableContentTypeAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw AbstractC13178c.m14838l("url", "url", reader);
                    }
                    break;
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    contentType2 = (UiComponentConfig.RemoteImage.ContentType) this.contentTypeAdapter.fromJson(reader);
                    if (contentType2 == null) {
                        throw AbstractC13178c.m14838l("contentType", "contentType", reader);
                    }
                    i10 &= -33;
                    break;
                    break;
                case 6:
                    jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
            }
        }
        reader.mo12818m();
        if (i10 == -100) {
            if (str2 != null) {
                return new UiComponentConfig.RemoteImage.Attributes(str, contentType, str2, str3, str4, contentType2, jsonLogicBoolean);
            }
            throw AbstractC13178c.m14832f("url", "url", reader);
        }
        Constructor<UiComponentConfig.RemoteImage.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = UiComponentConfig.RemoteImage.Attributes.class.getDeclaredConstructor(String.class, UiComponentConfig.RemoteImage.ContentType.class, String.class, String.class, String.class, UiComponentConfig.RemoteImage.ContentType.class, JsonLogicBoolean.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.constructorRef = declaredConstructor;
        }
        if (str2 != null) {
            return declaredConstructor.newInstance(str, contentType, str2, str3, str4, contentType2, jsonLogicBoolean, Integer.valueOf(i10), null);
        }
        throw AbstractC13178c.m14832f("url", "url", reader);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.RemoteImage.Attributes value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("localAssetName");
        this.nullableStringAdapter.toJson(writer, value_.getLocalAssetName());
        writer.mo12827T("localAssetContentType");
        this.nullableContentTypeAdapter.toJson(writer, value_.getLocalAssetContentType());
        writer.mo12827T("url");
        this.stringAdapter.toJson(writer, value_.getUrl());
        writer.mo12827T("width");
        this.nullableStringAdapter.toJson(writer, value_.getWidth());
        writer.mo12827T("height");
        this.nullableStringAdapter.toJson(writer, value_.getHeight());
        writer.mo12827T("contentType");
        this.contentTypeAdapter.toJson(writer, value_.getContentType());
        writer.mo12827T(ParameterNames.HIDDEN);
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.mo12823E();
    }

    public UiComponentConfig_RemoteImage_AttributesJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableStringAdapter = c11447l.m12850b(String.class, c17691y, "localAssetName");
        this.nullableContentTypeAdapter = c11447l.m12850b(UiComponentConfig.RemoteImage.ContentType.class, c17691y, "localAssetContentType");
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, "url");
        this.contentTypeAdapter = c11447l.m12850b(UiComponentConfig.RemoteImage.ContentType.class, c17691y, "contentType");
        this.nullableJsonLogicBooleanAdapter = c11447l.m12850b(JsonLogicBoolean.class, c17691y, ParameterNames.HIDDEN);
    }
}
