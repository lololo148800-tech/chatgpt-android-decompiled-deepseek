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
@Metadata(m18066d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019¨\u00062"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_InputSelectComponentStyleJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputSelectComponentStyle;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "nullableInputMarginStyleAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedJustifyStyle;", "nullableTextBasedJustifyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontFamilyStyle;", "nullableInputSelectTextFontFamilyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontSizeStyle;", "nullableInputSelectTextFontSizeStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextFontWeightStyle;", "nullableInputSelectTextFontWeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLetterSpacingStyle;", "nullableInputSelectTextLetterSpacingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextLineHeightStyle;", "nullableInputSelectTextLineHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectTextColorStyle;", "nullableInputSelectTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderRadiusStyle;", "nullableInputSelectBorderRadiusStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderWidthStyle;", "nullableInputSelectBorderWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBackgroundColorStyle;", "nullableInputSelectBackgroundColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectBorderColorStyle;", "nullableInputSelectBorderColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputSelectStrokeColorStyle;", "nullableInputSelectStrokeColorStyleAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentConfig_InputSelectComponentStyleJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableInputMarginStyleAdapter;
    private final AbstractC11471r nullableInputSelectBackgroundColorStyleAdapter;
    private final AbstractC11471r nullableInputSelectBorderColorStyleAdapter;
    private final AbstractC11471r nullableInputSelectBorderRadiusStyleAdapter;
    private final AbstractC11471r nullableInputSelectBorderWidthStyleAdapter;
    private final AbstractC11471r nullableInputSelectStrokeColorStyleAdapter;
    private final AbstractC11471r nullableInputSelectTextColorStyleAdapter;
    private final AbstractC11471r nullableInputSelectTextFontFamilyStyleAdapter;
    private final AbstractC11471r nullableInputSelectTextFontSizeStyleAdapter;
    private final AbstractC11471r nullableInputSelectTextFontWeightStyleAdapter;
    private final AbstractC11471r nullableInputSelectTextLetterSpacingStyleAdapter;
    private final AbstractC11471r nullableInputSelectTextLineHeightStyleAdapter;
    private final AbstractC11471r nullableTextBasedJustifyStyleAdapter;
    private final C11475v options = C11475v.m12866a("margin", "justify", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "backgroundColor", "borderColor", "strokeColor");

    public UiComponentConfig_InputSelectComponentStyleJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableInputMarginStyleAdapter = c11447l.m12850b(AttributeStyles.InputMarginStyle.class, c17691y, "margin");
        this.nullableTextBasedJustifyStyleAdapter = c11447l.m12850b(AttributeStyles.TextBasedJustifyStyle.class, c17691y, "justify");
        this.nullableInputSelectTextFontFamilyStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectTextFontFamilyStyle.class, c17691y, "fontFamily");
        this.nullableInputSelectTextFontSizeStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectTextFontSizeStyle.class, c17691y, "fontSize");
        this.nullableInputSelectTextFontWeightStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectTextFontWeightStyle.class, c17691y, "fontWeight");
        this.nullableInputSelectTextLetterSpacingStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectTextLetterSpacingStyle.class, c17691y, "letterSpacing");
        this.nullableInputSelectTextLineHeightStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectTextLineHeightStyle.class, c17691y, "lineHeight");
        this.nullableInputSelectTextColorStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectTextColorStyle.class, c17691y, "textColor");
        this.nullableInputSelectBorderRadiusStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectBorderRadiusStyle.class, c17691y, "borderRadius");
        this.nullableInputSelectBorderWidthStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectBorderWidthStyle.class, c17691y, "borderWidth");
        this.nullableInputSelectBackgroundColorStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectBackgroundColorStyle.class, c17691y, "backgroundColor");
        this.nullableInputSelectBorderColorStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectBorderColorStyle.class, c17691y, "borderColor");
        this.nullableInputSelectStrokeColorStyleAdapter = c11447l.m12850b(AttributeStyles.InputSelectStrokeColorStyle.class, c17691y, "strokeColor");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(65, "GeneratedJsonAdapter(UiComponentConfig.InputSelectComponentStyle)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.InputSelectComponentStyle fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        AttributeStyles.TextBasedJustifyStyle textBasedJustifyStyle = null;
        AttributeStyles.InputSelectTextFontFamilyStyle inputSelectTextFontFamilyStyle = null;
        AttributeStyles.InputSelectTextFontSizeStyle inputSelectTextFontSizeStyle = null;
        AttributeStyles.InputSelectTextFontWeightStyle inputSelectTextFontWeightStyle = null;
        AttributeStyles.InputSelectTextLetterSpacingStyle inputSelectTextLetterSpacingStyle = null;
        AttributeStyles.InputSelectTextLineHeightStyle inputSelectTextLineHeightStyle = null;
        AttributeStyles.InputSelectTextColorStyle inputSelectTextColorStyle = null;
        AttributeStyles.InputSelectBorderRadiusStyle inputSelectBorderRadiusStyle = null;
        AttributeStyles.InputSelectBorderWidthStyle inputSelectBorderWidthStyle = null;
        AttributeStyles.InputSelectBackgroundColorStyle inputSelectBackgroundColorStyle = null;
        AttributeStyles.InputSelectBorderColorStyle inputSelectBorderColorStyle = null;
        AttributeStyles.InputSelectStrokeColorStyle inputSelectStrokeColorStyle = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    inputMarginStyle = (AttributeStyles.InputMarginStyle) this.nullableInputMarginStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    textBasedJustifyStyle = (AttributeStyles.TextBasedJustifyStyle) this.nullableTextBasedJustifyStyleAdapter.fromJson(reader);
                    break;
                case 2:
                    inputSelectTextFontFamilyStyle = (AttributeStyles.InputSelectTextFontFamilyStyle) this.nullableInputSelectTextFontFamilyStyleAdapter.fromJson(reader);
                    break;
                case 3:
                    inputSelectTextFontSizeStyle = (AttributeStyles.InputSelectTextFontSizeStyle) this.nullableInputSelectTextFontSizeStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    inputSelectTextFontWeightStyle = (AttributeStyles.InputSelectTextFontWeightStyle) this.nullableInputSelectTextFontWeightStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    inputSelectTextLetterSpacingStyle = (AttributeStyles.InputSelectTextLetterSpacingStyle) this.nullableInputSelectTextLetterSpacingStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    inputSelectTextLineHeightStyle = (AttributeStyles.InputSelectTextLineHeightStyle) this.nullableInputSelectTextLineHeightStyleAdapter.fromJson(reader);
                    break;
                case 7:
                    inputSelectTextColorStyle = (AttributeStyles.InputSelectTextColorStyle) this.nullableInputSelectTextColorStyleAdapter.fromJson(reader);
                    break;
                case 8:
                    inputSelectBorderRadiusStyle = (AttributeStyles.InputSelectBorderRadiusStyle) this.nullableInputSelectBorderRadiusStyleAdapter.fromJson(reader);
                    break;
                case 9:
                    inputSelectBorderWidthStyle = (AttributeStyles.InputSelectBorderWidthStyle) this.nullableInputSelectBorderWidthStyleAdapter.fromJson(reader);
                    break;
                case 10:
                    inputSelectBackgroundColorStyle = (AttributeStyles.InputSelectBackgroundColorStyle) this.nullableInputSelectBackgroundColorStyleAdapter.fromJson(reader);
                    break;
                case 11:
                    inputSelectBorderColorStyle = (AttributeStyles.InputSelectBorderColorStyle) this.nullableInputSelectBorderColorStyleAdapter.fromJson(reader);
                    break;
                case 12:
                    inputSelectStrokeColorStyle = (AttributeStyles.InputSelectStrokeColorStyle) this.nullableInputSelectStrokeColorStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.mo12818m();
        return new UiComponentConfig.InputSelectComponentStyle(inputMarginStyle, textBasedJustifyStyle, inputSelectTextFontFamilyStyle, inputSelectTextFontSizeStyle, inputSelectTextFontWeightStyle, inputSelectTextLetterSpacingStyle, inputSelectTextLineHeightStyle, inputSelectTextColorStyle, inputSelectBorderRadiusStyle, inputSelectBorderWidthStyle, inputSelectBackgroundColorStyle, inputSelectBorderColorStyle, inputSelectStrokeColorStyle);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.InputSelectComponentStyle value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("margin");
        this.nullableInputMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.mo12827T("justify");
        this.nullableTextBasedJustifyStyleAdapter.toJson(writer, value_.getJustify());
        writer.mo12827T("fontFamily");
        this.nullableInputSelectTextFontFamilyStyleAdapter.toJson(writer, value_.getFontFamily());
        writer.mo12827T("fontSize");
        this.nullableInputSelectTextFontSizeStyleAdapter.toJson(writer, value_.getFontSize());
        writer.mo12827T("fontWeight");
        this.nullableInputSelectTextFontWeightStyleAdapter.toJson(writer, value_.getFontWeight());
        writer.mo12827T("letterSpacing");
        this.nullableInputSelectTextLetterSpacingStyleAdapter.toJson(writer, value_.getLetterSpacing());
        writer.mo12827T("lineHeight");
        this.nullableInputSelectTextLineHeightStyleAdapter.toJson(writer, value_.getLineHeight());
        writer.mo12827T("textColor");
        this.nullableInputSelectTextColorStyleAdapter.toJson(writer, value_.getTextColor());
        writer.mo12827T("borderRadius");
        this.nullableInputSelectBorderRadiusStyleAdapter.toJson(writer, value_.getBorderRadius());
        writer.mo12827T("borderWidth");
        this.nullableInputSelectBorderWidthStyleAdapter.toJson(writer, value_.getBorderWidth());
        writer.mo12827T("backgroundColor");
        this.nullableInputSelectBackgroundColorStyleAdapter.toJson(writer, value_.getBackgroundColor());
        writer.mo12827T("borderColor");
        this.nullableInputSelectBorderColorStyleAdapter.toJson(writer, value_.getBorderColor());
        writer.mo12827T("strokeColor");
        this.nullableInputSelectStrokeColorStyleAdapter.toJson(writer, value_.getStrokeColor());
        writer.mo12823E();
    }
}
