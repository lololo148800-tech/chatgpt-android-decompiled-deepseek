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
@Metadata(m18066d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019¨\u00062"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_InputDateComponentStyleJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputDateComponentStyle;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "nullableComplexTextBasedFontFamilyStyleAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "nullableComplexTextBasedFontSizeStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "nullableComplexTextBasedFontWeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "nullableComplexTextBasedLetterSpacingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "nullableComplexTextBasedLineHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectTextColorStyle;", "nullableDateSelectTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderRadiusStyle;", "nullableDateSelectBorderRadiusStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderWidthStyle;", "nullableDateSelectBorderWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBackgroundColorStyle;", "nullableDateSelectBackgroundColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectBorderColorStyle;", "nullableDateSelectBorderColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "nullableInputMarginStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;", "nullableTextBasedJustifyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$DateSelectStrokeColorStyle;", "nullableDateSelectStrokeColorStyleAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentConfig_InputDateComponentStyleJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableComplexTextBasedFontFamilyStyleAdapter;
    private final AbstractC11471r nullableComplexTextBasedFontSizeStyleAdapter;
    private final AbstractC11471r nullableComplexTextBasedFontWeightStyleAdapter;
    private final AbstractC11471r nullableComplexTextBasedLetterSpacingStyleAdapter;
    private final AbstractC11471r nullableComplexTextBasedLineHeightStyleAdapter;
    private final AbstractC11471r nullableDateSelectBackgroundColorStyleAdapter;
    private final AbstractC11471r nullableDateSelectBorderColorStyleAdapter;
    private final AbstractC11471r nullableDateSelectBorderRadiusStyleAdapter;
    private final AbstractC11471r nullableDateSelectBorderWidthStyleAdapter;
    private final AbstractC11471r nullableDateSelectStrokeColorStyleAdapter;
    private final AbstractC11471r nullableDateSelectTextColorStyleAdapter;
    private final AbstractC11471r nullableInputMarginStyleAdapter;
    private final AbstractC11471r nullableTextBasedJustifyStyleAdapter;
    private final C11475v options = C11475v.m12866a("fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "backgroundColor", "borderColor", "margin", "justify", "strokeColor");

    public UiComponentConfig_InputDateComponentStyleJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableComplexTextBasedFontFamilyStyleAdapter = c11447l.m12850b(AttributeStyles.ComplexTextBasedFontFamilyStyle.class, c17691y, "fontFamily");
        this.nullableComplexTextBasedFontSizeStyleAdapter = c11447l.m12850b(AttributeStyles.ComplexTextBasedFontSizeStyle.class, c17691y, "fontSize");
        this.nullableComplexTextBasedFontWeightStyleAdapter = c11447l.m12850b(AttributeStyles.ComplexTextBasedFontWeightStyle.class, c17691y, "fontWeight");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter = c11447l.m12850b(AttributeStyles.ComplexTextBasedLetterSpacingStyle.class, c17691y, "letterSpacing");
        this.nullableComplexTextBasedLineHeightStyleAdapter = c11447l.m12850b(AttributeStyles.ComplexTextBasedLineHeightStyle.class, c17691y, "lineHeight");
        this.nullableDateSelectTextColorStyleAdapter = c11447l.m12850b(AttributeStyles.DateSelectTextColorStyle.class, c17691y, "textColor");
        this.nullableDateSelectBorderRadiusStyleAdapter = c11447l.m12850b(AttributeStyles.DateSelectBorderRadiusStyle.class, c17691y, "borderRadius");
        this.nullableDateSelectBorderWidthStyleAdapter = c11447l.m12850b(AttributeStyles.DateSelectBorderWidthStyle.class, c17691y, "borderWidth");
        this.nullableDateSelectBackgroundColorStyleAdapter = c11447l.m12850b(AttributeStyles.DateSelectBackgroundColorStyle.class, c17691y, "backgroundColor");
        this.nullableDateSelectBorderColorStyleAdapter = c11447l.m12850b(AttributeStyles.DateSelectBorderColorStyle.class, c17691y, "borderColor");
        this.nullableInputMarginStyleAdapter = c11447l.m12850b(AttributeStyles.InputMarginStyle.class, c17691y, "margin");
        this.nullableTextBasedJustifyStyleAdapter = c11447l.m12850b(AttributeStyles.TextBasedJustifyStyle.class, c17691y, "justify");
        this.nullableDateSelectStrokeColorStyleAdapter = c11447l.m12850b(AttributeStyles.DateSelectStrokeColorStyle.class, c17691y, "strokeColor");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(63, "GeneratedJsonAdapter(UiComponentConfig.InputDateComponentStyle)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.InputDateComponentStyle fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = null;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = null;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = null;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = null;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = null;
        AttributeStyles.DateSelectTextColorStyle dateSelectTextColorStyle = null;
        AttributeStyles.DateSelectBorderRadiusStyle dateSelectBorderRadiusStyle = null;
        AttributeStyles.DateSelectBorderWidthStyle dateSelectBorderWidthStyle = null;
        AttributeStyles.DateSelectBackgroundColorStyle dateSelectBackgroundColorStyle = null;
        AttributeStyles.DateSelectBorderColorStyle dateSelectBorderColorStyle = null;
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = null;
        AttributeStyles.DateSelectStrokeColorStyle dateSelectStrokeColorStyle = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    complexTextBasedFontFamilyStyle = (AttributeStyles.ComplexTextBasedFontFamilyStyle) this.nullableComplexTextBasedFontFamilyStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    complexTextBasedFontSizeStyle = (AttributeStyles.ComplexTextBasedFontSizeStyle) this.nullableComplexTextBasedFontSizeStyleAdapter.fromJson(reader);
                    break;
                case 2:
                    complexTextBasedFontWeightStyle = (AttributeStyles.ComplexTextBasedFontWeightStyle) this.nullableComplexTextBasedFontWeightStyleAdapter.fromJson(reader);
                    break;
                case 3:
                    complexTextBasedLetterSpacingStyle = (AttributeStyles.ComplexTextBasedLetterSpacingStyle) this.nullableComplexTextBasedLetterSpacingStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    complexTextBasedLineHeightStyle = (AttributeStyles.ComplexTextBasedLineHeightStyle) this.nullableComplexTextBasedLineHeightStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    dateSelectTextColorStyle = (AttributeStyles.DateSelectTextColorStyle) this.nullableDateSelectTextColorStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    dateSelectBorderRadiusStyle = (AttributeStyles.DateSelectBorderRadiusStyle) this.nullableDateSelectBorderRadiusStyleAdapter.fromJson(reader);
                    break;
                case 7:
                    dateSelectBorderWidthStyle = (AttributeStyles.DateSelectBorderWidthStyle) this.nullableDateSelectBorderWidthStyleAdapter.fromJson(reader);
                    break;
                case 8:
                    dateSelectBackgroundColorStyle = (AttributeStyles.DateSelectBackgroundColorStyle) this.nullableDateSelectBackgroundColorStyleAdapter.fromJson(reader);
                    break;
                case 9:
                    dateSelectBorderColorStyle = (AttributeStyles.DateSelectBorderColorStyle) this.nullableDateSelectBorderColorStyleAdapter.fromJson(reader);
                    break;
                case 10:
                    inputMarginStyle = (AttributeStyles.InputMarginStyle) this.nullableInputMarginStyleAdapter.fromJson(reader);
                    break;
                case 11:
                    textBasedJustifyStyle = (AttributeStyles.TextBasedJustifyStyle) this.nullableTextBasedJustifyStyleAdapter.fromJson(reader);
                    break;
                case 12:
                    dateSelectStrokeColorStyle = (AttributeStyles.DateSelectStrokeColorStyle) this.nullableDateSelectStrokeColorStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.mo12818m();
        return new UiComponentConfig.InputDateComponentStyle(complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, dateSelectTextColorStyle, dateSelectBorderRadiusStyle, dateSelectBorderWidthStyle, dateSelectBackgroundColorStyle, dateSelectBorderColorStyle, inputMarginStyle, textBasedJustifyStyle, dateSelectStrokeColorStyle);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.InputDateComponentStyle value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("fontFamily");
        this.nullableComplexTextBasedFontFamilyStyleAdapter.toJson(writer, value_.getFontFamily());
        writer.mo12827T("fontSize");
        this.nullableComplexTextBasedFontSizeStyleAdapter.toJson(writer, value_.getFontSize());
        writer.mo12827T("fontWeight");
        this.nullableComplexTextBasedFontWeightStyleAdapter.toJson(writer, value_.getFontWeight());
        writer.mo12827T("letterSpacing");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter.toJson(writer, value_.getLetterSpacing());
        writer.mo12827T("lineHeight");
        this.nullableComplexTextBasedLineHeightStyleAdapter.toJson(writer, value_.getLineHeight());
        writer.mo12827T("textColor");
        this.nullableDateSelectTextColorStyleAdapter.toJson(writer, value_.getTextColor());
        writer.mo12827T("borderRadius");
        this.nullableDateSelectBorderRadiusStyleAdapter.toJson(writer, value_.getBorderRadius());
        writer.mo12827T("borderWidth");
        this.nullableDateSelectBorderWidthStyleAdapter.toJson(writer, value_.getBorderWidth());
        writer.mo12827T("backgroundColor");
        this.nullableDateSelectBackgroundColorStyleAdapter.toJson(writer, value_.getBackgroundColor());
        writer.mo12827T("borderColor");
        this.nullableDateSelectBorderColorStyleAdapter.toJson(writer, value_.getBorderColor());
        writer.mo12827T("margin");
        this.nullableInputMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.mo12827T("justify");
        this.nullableTextBasedJustifyStyleAdapter.toJson(writer, value_.getJustify());
        writer.mo12827T("strokeColor");
        this.nullableDateSelectStrokeColorStyleAdapter.toJson(writer, value_.getStrokeColor());
        writer.mo12823E();
    }
}
