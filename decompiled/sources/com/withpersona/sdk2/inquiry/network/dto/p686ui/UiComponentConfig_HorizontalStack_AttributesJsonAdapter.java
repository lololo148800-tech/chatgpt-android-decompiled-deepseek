package com.withpersona.sdk2.inquiry.network.dto.p686ui;

import android.gov.nist.javax.sip.header.ParameterNames;
import bj.AbstractC11440E;
import bj.AbstractC11452Q;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import dj.AbstractC13178c;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_HorizontalStack_AttributesJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStack$Attributes;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStack$Attributes;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$HorizontalStack$Attributes;)V", "Lbj/v;", "options", "Lbj/v;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig;", "nullableListOfUiComponentConfigAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentConfig_HorizontalStack_AttributesJsonAdapter extends AbstractC11471r {
    private volatile Constructor<UiComponentConfig.HorizontalStack.Attributes> constructorRef;
    private final AbstractC11471r nullableJsonLogicBooleanAdapter;
    private final AbstractC11471r nullableListOfUiComponentConfigAdapter;
    private final C11475v options = C11475v.m12866a("children", ParameterNames.HIDDEN);

    public UiComponentConfig_HorizontalStack_AttributesJsonAdapter(C11447L c11447l) {
        Util$ParameterizedTypeImpl util$ParameterizedTypeImplM12856f = AbstractC11452Q.m12856f(List.class, UiComponentConfig.class);
        C17691y c17691y = C17691y.f56482Y;
        this.nullableListOfUiComponentConfigAdapter = c11447l.m12850b(util$ParameterizedTypeImplM12856f, c17691y, "children");
        this.nullableJsonLogicBooleanAdapter = c11447l.m12850b(JsonLogicBoolean.class, c17691y, ParameterNames.HIDDEN);
    }

    public String toString() {
        return AbstractC12107L1.m13823n(66, "GeneratedJsonAdapter(UiComponentConfig.HorizontalStack.Attributes)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.HorizontalStack.Attributes fromJson(AbstractC11477x reader) throws NoSuchMethodException {
        reader.mo12814e();
        List list = null;
        JsonLogicBoolean jsonLogicBoolean = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                list = (List) this.nullableListOfUiComponentConfigAdapter.fromJson(reader);
            } else if (iMo12819v0 == 1) {
                jsonLogicBoolean = (JsonLogicBoolean) this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                i10 = -3;
            }
        }
        reader.mo12818m();
        if (i10 == -3) {
            return new UiComponentConfig.HorizontalStack.Attributes(list, jsonLogicBoolean);
        }
        Constructor<UiComponentConfig.HorizontalStack.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = UiComponentConfig.HorizontalStack.Attributes.class.getDeclaredConstructor(List.class, JsonLogicBoolean.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(list, jsonLogicBoolean, Integer.valueOf(i10), null);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.HorizontalStack.Attributes value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("children");
        this.nullableListOfUiComponentConfigAdapter.toJson(writer, value_.getChildren());
        writer.mo12827T(ParameterNames.HIDDEN);
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.mo12823E();
    }
}
