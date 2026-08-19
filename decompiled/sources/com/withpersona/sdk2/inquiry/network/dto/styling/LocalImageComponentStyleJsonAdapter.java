package com.withpersona.sdk2.inquiry.network.dto.styling;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import dj.AbstractC13178c;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyleJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/styling/LocalImageComponentStyle;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageStrokeColorStyle;", "nullableLocalImageStrokeColorStyleAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageFillColorStyle;", "nullableLocalImageFillColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageHeightStyle;", "nullableLocalImageHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageWidthStyle;", "nullableLocalImageWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageJustifyStyle;", "nullableLocalImageJustifyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$LocalImageMarginStyle;", "nullableLocalImageMarginStyleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class LocalImageComponentStyleJsonAdapter extends AbstractC11471r {
    private volatile Constructor<LocalImageComponentStyle> constructorRef;
    private final AbstractC11471r nullableLocalImageFillColorStyleAdapter;
    private final AbstractC11471r nullableLocalImageHeightStyleAdapter;
    private final AbstractC11471r nullableLocalImageJustifyStyleAdapter;
    private final AbstractC11471r nullableLocalImageMarginStyleAdapter;
    private final AbstractC11471r nullableLocalImageStrokeColorStyleAdapter;
    private final AbstractC11471r nullableLocalImageWidthStyleAdapter;
    private final C11475v options = C11475v.m12866a("strokeColor", "fillColor", "height", "width", "justify", "margin");

    public LocalImageComponentStyleJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableLocalImageStrokeColorStyleAdapter = c11447l.m12850b(AttributeStyles.LocalImageStrokeColorStyle.class, c17691y, "strokeColor");
        this.nullableLocalImageFillColorStyleAdapter = c11447l.m12850b(AttributeStyles.LocalImageFillColorStyle.class, c17691y, "fillColor");
        this.nullableLocalImageHeightStyleAdapter = c11447l.m12850b(AttributeStyles.LocalImageHeightStyle.class, c17691y, "height");
        this.nullableLocalImageWidthStyleAdapter = c11447l.m12850b(AttributeStyles.LocalImageWidthStyle.class, c17691y, "width");
        this.nullableLocalImageJustifyStyleAdapter = c11447l.m12850b(AttributeStyles.LocalImageJustifyStyle.class, c17691y, "justify");
        this.nullableLocalImageMarginStyleAdapter = c11447l.m12850b(AttributeStyles.LocalImageMarginStyle.class, c17691y, "margin");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(46, "GeneratedJsonAdapter(LocalImageComponentStyle)");
    }

    @Override // bj.AbstractC11471r
    public LocalImageComponentStyle fromJson(AbstractC11477x reader) throws NoSuchMethodException {
        reader.mo12814e();
        int i10 = -1;
        AttributeStyles.LocalImageStrokeColorStyle localImageStrokeColorStyle = null;
        AttributeStyles.LocalImageFillColorStyle localImageFillColorStyle = null;
        AttributeStyles.LocalImageHeightStyle localImageHeightStyle = null;
        AttributeStyles.LocalImageWidthStyle localImageWidthStyle = null;
        AttributeStyles.LocalImageJustifyStyle localImageJustifyStyle = null;
        AttributeStyles.LocalImageMarginStyle localImageMarginStyle = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    localImageStrokeColorStyle = (AttributeStyles.LocalImageStrokeColorStyle) this.nullableLocalImageStrokeColorStyleAdapter.fromJson(reader);
                    i10 &= -2;
                    break;
                case 1:
                    localImageFillColorStyle = (AttributeStyles.LocalImageFillColorStyle) this.nullableLocalImageFillColorStyleAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    localImageHeightStyle = (AttributeStyles.LocalImageHeightStyle) this.nullableLocalImageHeightStyleAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    localImageWidthStyle = (AttributeStyles.LocalImageWidthStyle) this.nullableLocalImageWidthStyleAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    localImageJustifyStyle = (AttributeStyles.LocalImageJustifyStyle) this.nullableLocalImageJustifyStyleAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    localImageMarginStyle = (AttributeStyles.LocalImageMarginStyle) this.nullableLocalImageMarginStyleAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.mo12818m();
        if (i10 == -64) {
            return new LocalImageComponentStyle(localImageStrokeColorStyle, localImageFillColorStyle, localImageHeightStyle, localImageWidthStyle, localImageJustifyStyle, localImageMarginStyle);
        }
        Constructor<LocalImageComponentStyle> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = LocalImageComponentStyle.class.getDeclaredConstructor(AttributeStyles.LocalImageStrokeColorStyle.class, AttributeStyles.LocalImageFillColorStyle.class, AttributeStyles.LocalImageHeightStyle.class, AttributeStyles.LocalImageWidthStyle.class, AttributeStyles.LocalImageJustifyStyle.class, AttributeStyles.LocalImageMarginStyle.class, Integer.TYPE, AbstractC13178c.f41822c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(localImageStrokeColorStyle, localImageFillColorStyle, localImageHeightStyle, localImageWidthStyle, localImageJustifyStyle, localImageMarginStyle, Integer.valueOf(i10), null);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, LocalImageComponentStyle value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("strokeColor");
        this.nullableLocalImageStrokeColorStyleAdapter.toJson(writer, value_.getStrokeColor());
        writer.mo12827T("fillColor");
        this.nullableLocalImageFillColorStyleAdapter.toJson(writer, value_.getFillColor());
        writer.mo12827T("height");
        this.nullableLocalImageHeightStyleAdapter.toJson(writer, value_.getHeight());
        writer.mo12827T("width");
        this.nullableLocalImageWidthStyleAdapter.toJson(writer, value_.getWidth());
        writer.mo12827T("justify");
        this.nullableLocalImageJustifyStyleAdapter.toJson(writer, value_.getJustify());
        writer.mo12827T("margin");
        this.nullableLocalImageMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.mo12823E();
    }
}
