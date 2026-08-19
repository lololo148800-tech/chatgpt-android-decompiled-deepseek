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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributesJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;)V", "Lbj/v;", "options", "Lbj/v;", "stringAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "nullableButtonTypeAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BasicButtonAttributesJsonAdapter extends AbstractC11471r {
    private volatile Constructor<BasicButtonAttributes> constructorRef;
    private final AbstractC11471r nullableButtonTypeAdapter;
    private final AbstractC11471r nullableJsonLogicBooleanAdapter;
    private final C11475v options = C11475v.m12866a("text", "buttonType", ParameterNames.HIDDEN, "disabled");
    private final AbstractC11471r stringAdapter;

    public BasicButtonAttributesJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.stringAdapter = c11447l.m12850b(String.class, c17691y, "text");
        this.nullableButtonTypeAdapter = c11447l.m12850b(UiComponentConfig.Button.ButtonType.class, c17691y, "buttonType");
        this.nullableJsonLogicBooleanAdapter = c11447l.m12850b(JsonLogicBoolean.class, c17691y, ParameterNames.HIDDEN);
    }

    public String toString() {
        return AbstractC12107L1.m13823n(43, "GeneratedJsonAdapter(BasicButtonAttributes)");
    }

    @Override // bj.AbstractC11471r
    public BasicButtonAttributes fromJson(AbstractC11477x reader) throws NoSuchMethodException {
        reader.mo12814e();
        int i10 = -1;
        String str = null;
        UiComponentConfig.Button.ButtonType buttonType = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        JsonLogicBoolean jsonLogicBoolean2 = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                str = (String) this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw AbstractC13178c.m14838l("text", "text", reader);
                }
            } else if (iMo12819v0 == 1) {
                buttonType = (UiComponentConfig.Button.ButtonType) this.nullableButtonTypeAdapter.fromJson(reader);
            } else if (iMo12819v0 == 2) {
                jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                i10 &= -5;
            } else if (iMo12819v0 == 3) {
                jsonLogicBoolean2 = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                i10 &= -9;
            }
        }
        reader.mo12818m();
        if (i10 == -13) {
            if (str != null) {
                return new BasicButtonAttributes(str, buttonType, jsonLogicBoolean, jsonLogicBoolean2);
            }
            throw AbstractC13178c.m14832f("text", "text", reader);
        }
        Constructor<BasicButtonAttributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = BasicButtonAttributes.class.getDeclaredConstructor(String.class, UiComponentConfig.Button.ButtonType.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.constructorRef = declaredConstructor;
        }
        if (str != null) {
            return declaredConstructor.newInstance(str, buttonType, jsonLogicBoolean, jsonLogicBoolean2, Integer.valueOf(i10), null);
        }
        throw AbstractC13178c.m14832f("text", "text", reader);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, BasicButtonAttributes value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("text");
        this.stringAdapter.toJson(writer, value_.getText());
        writer.mo12827T("buttonType");
        this.nullableButtonTypeAdapter.toJson(writer, value_.getButtonType());
        writer.mo12827T(ParameterNames.HIDDEN);
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.mo12827T("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.mo12823E();
    }
}
