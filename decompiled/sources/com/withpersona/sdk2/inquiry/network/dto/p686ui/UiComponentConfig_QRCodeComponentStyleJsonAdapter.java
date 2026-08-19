package com.withpersona.sdk2.inquiry.network.dto.p686ui;

import bj.AbstractC11440E;
import bj.AbstractC11471r;
import bj.AbstractC11477x;
import bj.C11447L;
import bj.C11475v;
import com.google.protobuf.AbstractC12107L1;
import com.withpersona.sdk2.inquiry.network.dto.styling.AttributeStyles;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_QRCodeComponentStyleJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCodeComponentStyle;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCodeComponentStyle;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$QRCodeComponentStyle;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeWidthStyle;", "nullableQRCodeWidthStyleAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeJustifyStyle;", "nullableQRCodeJustifyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeMarginStyle;", "nullableQRCodeMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeStrokeColorStyle;", "nullableQRCodeStrokeColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$QRCodeFillColorStyle;", "nullableQRCodeFillColorStyleAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentConfig_QRCodeComponentStyleJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableQRCodeFillColorStyleAdapter;
    private final AbstractC11471r nullableQRCodeJustifyStyleAdapter;
    private final AbstractC11471r nullableQRCodeMarginStyleAdapter;
    private final AbstractC11471r nullableQRCodeStrokeColorStyleAdapter;
    private final AbstractC11471r nullableQRCodeWidthStyleAdapter;
    private final C11475v options = C11475v.m12866a("width", "justify", "margin", "strokeColor", "fillColor");

    public UiComponentConfig_QRCodeComponentStyleJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableQRCodeWidthStyleAdapter = c11447l.m12850b(AttributeStyles.QRCodeWidthStyle.class, c17691y, "width");
        this.nullableQRCodeJustifyStyleAdapter = c11447l.m12850b(AttributeStyles.QRCodeJustifyStyle.class, c17691y, "justify");
        this.nullableQRCodeMarginStyleAdapter = c11447l.m12850b(AttributeStyles.QRCodeMarginStyle.class, c17691y, "margin");
        this.nullableQRCodeStrokeColorStyleAdapter = c11447l.m12850b(AttributeStyles.QRCodeStrokeColorStyle.class, c17691y, "strokeColor");
        this.nullableQRCodeFillColorStyleAdapter = c11447l.m12850b(AttributeStyles.QRCodeFillColorStyle.class, c17691y, "fillColor");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(60, "GeneratedJsonAdapter(UiComponentConfig.QRCodeComponentStyle)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.QRCodeComponentStyle fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        AttributeStyles.QRCodeWidthStyle qRCodeWidthStyle = null;
        AttributeStyles.QRCodeJustifyStyle qRCodeJustifyStyle = null;
        AttributeStyles.QRCodeMarginStyle qRCodeMarginStyle = null;
        AttributeStyles.QRCodeStrokeColorStyle qRCodeStrokeColorStyle = null;
        AttributeStyles.QRCodeFillColorStyle qRCodeFillColorStyle = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                qRCodeWidthStyle = (AttributeStyles.QRCodeWidthStyle) this.nullableQRCodeWidthStyleAdapter.fromJson(reader);
            } else if (iMo12819v0 == 1) {
                qRCodeJustifyStyle = (AttributeStyles.QRCodeJustifyStyle) this.nullableQRCodeJustifyStyleAdapter.fromJson(reader);
            } else if (iMo12819v0 == 2) {
                qRCodeMarginStyle = (AttributeStyles.QRCodeMarginStyle) this.nullableQRCodeMarginStyleAdapter.fromJson(reader);
            } else if (iMo12819v0 == 3) {
                qRCodeStrokeColorStyle = (AttributeStyles.QRCodeStrokeColorStyle) this.nullableQRCodeStrokeColorStyleAdapter.fromJson(reader);
            } else if (iMo12819v0 == 4) {
                qRCodeFillColorStyle = (AttributeStyles.QRCodeFillColorStyle) this.nullableQRCodeFillColorStyleAdapter.fromJson(reader);
            }
        }
        reader.mo12818m();
        return new UiComponentConfig.QRCodeComponentStyle(qRCodeWidthStyle, qRCodeJustifyStyle, qRCodeMarginStyle, qRCodeStrokeColorStyle, qRCodeFillColorStyle);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.QRCodeComponentStyle value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("width");
        this.nullableQRCodeWidthStyleAdapter.toJson(writer, value_.getWidth());
        writer.mo12827T("justify");
        this.nullableQRCodeJustifyStyleAdapter.toJson(writer, value_.getJustify());
        writer.mo12827T("margin");
        this.nullableQRCodeMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.mo12827T("strokeColor");
        this.nullableQRCodeStrokeColorStyleAdapter.toJson(writer, value_.getStrokeColor());
        writer.mo12827T("fillColor");
        this.nullableQRCodeFillColorStyleAdapter.toJson(writer, value_.getFillColor());
        writer.mo12823E();
    }
}
