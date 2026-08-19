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
import sj.hJY.CsqksqyPE;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u001c\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0019¨\u00068"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_ESignatureComponentStyleJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignatureComponentStyle;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignatureComponentStyle;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$ESignatureComponentStyle;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignaturePrimaryButtonStyles;", "nullableESignaturePrimaryButtonStylesAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureSecondaryButtonStyles;", "nullableESignatureSecondaryButtonStylesAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTitleStylesContainer;", "nullableESignatureTitleStylesContainerAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextStylesContainer;", "nullableESignatureTextStylesContainerAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureFillColorStyle;", "nullableESignatureFillColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBackgroundColorStyle;", "nullableESignatureBackgroundColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontFamilyStyle;", "nullableComplexTextBasedFontFamilyStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontSizeStyle;", "nullableComplexTextBasedFontSizeStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedFontWeightStyle;", "nullableComplexTextBasedFontWeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLetterSpacingStyle;", "nullableComplexTextBasedLetterSpacingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ComplexTextBasedLineHeightStyle;", "nullableComplexTextBasedLineHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureTextColorStyle;", "nullableESignatureTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderRadiusStyle;", "nullableESignatureBorderRadiusStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderWidthStyle;", "nullableESignatureBorderWidthStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$ESignatureBorderColorStyle;", "nullableESignatureBorderColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputMarginStyle;", "nullableInputMarginStyleAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentConfig_ESignatureComponentStyleJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableComplexTextBasedFontFamilyStyleAdapter;
    private final AbstractC11471r nullableComplexTextBasedFontSizeStyleAdapter;
    private final AbstractC11471r nullableComplexTextBasedFontWeightStyleAdapter;
    private final AbstractC11471r nullableComplexTextBasedLetterSpacingStyleAdapter;
    private final AbstractC11471r nullableComplexTextBasedLineHeightStyleAdapter;
    private final AbstractC11471r nullableESignatureBackgroundColorStyleAdapter;
    private final AbstractC11471r nullableESignatureBorderColorStyleAdapter;
    private final AbstractC11471r nullableESignatureBorderRadiusStyleAdapter;
    private final AbstractC11471r nullableESignatureBorderWidthStyleAdapter;
    private final AbstractC11471r nullableESignatureFillColorStyleAdapter;
    private final AbstractC11471r nullableESignaturePrimaryButtonStylesAdapter;
    private final AbstractC11471r nullableESignatureSecondaryButtonStylesAdapter;
    private final AbstractC11471r nullableESignatureTextColorStyleAdapter;
    private final AbstractC11471r nullableESignatureTextStylesContainerAdapter;
    private final AbstractC11471r nullableESignatureTitleStylesContainerAdapter;
    private final AbstractC11471r nullableInputMarginStyleAdapter;
    private final C11475v options = C11475v.m12866a("buttonPrimaryStyle", "buttonSecondaryStyle", "titleStyle", "textStyle", "fillColor", "backgroundColor", "fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "borderRadius", "borderWidth", "borderColor", "margin");

    public UiComponentConfig_ESignatureComponentStyleJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableESignaturePrimaryButtonStylesAdapter = c11447l.m12850b(AttributeStyles.ESignaturePrimaryButtonStyles.class, c17691y, "buttonPrimaryStyle");
        this.nullableESignatureSecondaryButtonStylesAdapter = c11447l.m12850b(AttributeStyles.ESignatureSecondaryButtonStyles.class, c17691y, "buttonSecondaryStyle");
        this.nullableESignatureTitleStylesContainerAdapter = c11447l.m12850b(AttributeStyles.ESignatureTitleStylesContainer.class, c17691y, "titleStyle");
        this.nullableESignatureTextStylesContainerAdapter = c11447l.m12850b(AttributeStyles.ESignatureTextStylesContainer.class, c17691y, "textStyle");
        this.nullableESignatureFillColorStyleAdapter = c11447l.m12850b(AttributeStyles.ESignatureFillColorStyle.class, c17691y, "fillColor");
        this.nullableESignatureBackgroundColorStyleAdapter = c11447l.m12850b(AttributeStyles.ESignatureBackgroundColorStyle.class, c17691y, "backgroundColor");
        this.nullableComplexTextBasedFontFamilyStyleAdapter = c11447l.m12850b(AttributeStyles.ComplexTextBasedFontFamilyStyle.class, c17691y, "fontFamily");
        this.nullableComplexTextBasedFontSizeStyleAdapter = c11447l.m12850b(AttributeStyles.ComplexTextBasedFontSizeStyle.class, c17691y, "fontSize");
        this.nullableComplexTextBasedFontWeightStyleAdapter = c11447l.m12850b(AttributeStyles.ComplexTextBasedFontWeightStyle.class, c17691y, "fontWeight");
        this.nullableComplexTextBasedLetterSpacingStyleAdapter = c11447l.m12850b(AttributeStyles.ComplexTextBasedLetterSpacingStyle.class, c17691y, "letterSpacing");
        this.nullableComplexTextBasedLineHeightStyleAdapter = c11447l.m12850b(AttributeStyles.ComplexTextBasedLineHeightStyle.class, c17691y, "lineHeight");
        this.nullableESignatureTextColorStyleAdapter = c11447l.m12850b(AttributeStyles.ESignatureTextColorStyle.class, c17691y, "textColor");
        this.nullableESignatureBorderRadiusStyleAdapter = c11447l.m12850b(AttributeStyles.ESignatureBorderRadiusStyle.class, c17691y, "borderRadius");
        this.nullableESignatureBorderWidthStyleAdapter = c11447l.m12850b(AttributeStyles.ESignatureBorderWidthStyle.class, c17691y, "borderWidth");
        this.nullableESignatureBorderColorStyleAdapter = c11447l.m12850b(AttributeStyles.ESignatureBorderColorStyle.class, c17691y, "borderColor");
        this.nullableInputMarginStyleAdapter = c11447l.m12850b(AttributeStyles.InputMarginStyle.class, c17691y, "margin");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(64, "GeneratedJsonAdapter(UiComponentConfig.ESignatureComponentStyle)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.ESignatureComponentStyle fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        AttributeStyles.ESignaturePrimaryButtonStyles eSignaturePrimaryButtonStyles = null;
        AttributeStyles.ESignatureSecondaryButtonStyles eSignatureSecondaryButtonStyles = null;
        AttributeStyles.ESignatureTitleStylesContainer eSignatureTitleStylesContainer = null;
        AttributeStyles.ESignatureTextStylesContainer eSignatureTextStylesContainer = null;
        AttributeStyles.ESignatureFillColorStyle eSignatureFillColorStyle = null;
        AttributeStyles.ESignatureBackgroundColorStyle eSignatureBackgroundColorStyle = null;
        AttributeStyles.ComplexTextBasedFontFamilyStyle complexTextBasedFontFamilyStyle = null;
        AttributeStyles.ComplexTextBasedFontSizeStyle complexTextBasedFontSizeStyle = null;
        AttributeStyles.ComplexTextBasedFontWeightStyle complexTextBasedFontWeightStyle = null;
        AttributeStyles.ComplexTextBasedLetterSpacingStyle complexTextBasedLetterSpacingStyle = null;
        AttributeStyles.ComplexTextBasedLineHeightStyle complexTextBasedLineHeightStyle = null;
        AttributeStyles.ESignatureTextColorStyle eSignatureTextColorStyle = null;
        AttributeStyles.ESignatureBorderRadiusStyle eSignatureBorderRadiusStyle = null;
        AttributeStyles.ESignatureBorderWidthStyle eSignatureBorderWidthStyle = null;
        AttributeStyles.ESignatureBorderColorStyle eSignatureBorderColorStyle = null;
        AttributeStyles.InputMarginStyle inputMarginStyle = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    eSignaturePrimaryButtonStyles = (AttributeStyles.ESignaturePrimaryButtonStyles) this.nullableESignaturePrimaryButtonStylesAdapter.fromJson(reader);
                    break;
                case 1:
                    eSignatureSecondaryButtonStyles = (AttributeStyles.ESignatureSecondaryButtonStyles) this.nullableESignatureSecondaryButtonStylesAdapter.fromJson(reader);
                    break;
                case 2:
                    eSignatureTitleStylesContainer = (AttributeStyles.ESignatureTitleStylesContainer) this.nullableESignatureTitleStylesContainerAdapter.fromJson(reader);
                    break;
                case 3:
                    eSignatureTextStylesContainer = (AttributeStyles.ESignatureTextStylesContainer) this.nullableESignatureTextStylesContainerAdapter.fromJson(reader);
                    break;
                case 4:
                    eSignatureFillColorStyle = (AttributeStyles.ESignatureFillColorStyle) this.nullableESignatureFillColorStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    eSignatureBackgroundColorStyle = (AttributeStyles.ESignatureBackgroundColorStyle) this.nullableESignatureBackgroundColorStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    complexTextBasedFontFamilyStyle = (AttributeStyles.ComplexTextBasedFontFamilyStyle) this.nullableComplexTextBasedFontFamilyStyleAdapter.fromJson(reader);
                    break;
                case 7:
                    complexTextBasedFontSizeStyle = (AttributeStyles.ComplexTextBasedFontSizeStyle) this.nullableComplexTextBasedFontSizeStyleAdapter.fromJson(reader);
                    break;
                case 8:
                    complexTextBasedFontWeightStyle = (AttributeStyles.ComplexTextBasedFontWeightStyle) this.nullableComplexTextBasedFontWeightStyleAdapter.fromJson(reader);
                    break;
                case 9:
                    complexTextBasedLetterSpacingStyle = (AttributeStyles.ComplexTextBasedLetterSpacingStyle) this.nullableComplexTextBasedLetterSpacingStyleAdapter.fromJson(reader);
                    break;
                case 10:
                    complexTextBasedLineHeightStyle = (AttributeStyles.ComplexTextBasedLineHeightStyle) this.nullableComplexTextBasedLineHeightStyleAdapter.fromJson(reader);
                    break;
                case 11:
                    eSignatureTextColorStyle = (AttributeStyles.ESignatureTextColorStyle) this.nullableESignatureTextColorStyleAdapter.fromJson(reader);
                    break;
                case 12:
                    eSignatureBorderRadiusStyle = (AttributeStyles.ESignatureBorderRadiusStyle) this.nullableESignatureBorderRadiusStyleAdapter.fromJson(reader);
                    break;
                case 13:
                    eSignatureBorderWidthStyle = (AttributeStyles.ESignatureBorderWidthStyle) this.nullableESignatureBorderWidthStyleAdapter.fromJson(reader);
                    break;
                case 14:
                    eSignatureBorderColorStyle = (AttributeStyles.ESignatureBorderColorStyle) this.nullableESignatureBorderColorStyleAdapter.fromJson(reader);
                    break;
                case 15:
                    inputMarginStyle = (AttributeStyles.InputMarginStyle) this.nullableInputMarginStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.mo12818m();
        return new UiComponentConfig.ESignatureComponentStyle(eSignaturePrimaryButtonStyles, eSignatureSecondaryButtonStyles, eSignatureTitleStylesContainer, eSignatureTextStylesContainer, eSignatureFillColorStyle, eSignatureBackgroundColorStyle, complexTextBasedFontFamilyStyle, complexTextBasedFontSizeStyle, complexTextBasedFontWeightStyle, complexTextBasedLetterSpacingStyle, complexTextBasedLineHeightStyle, eSignatureTextColorStyle, eSignatureBorderRadiusStyle, eSignatureBorderWidthStyle, eSignatureBorderColorStyle, inputMarginStyle);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.ESignatureComponentStyle value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("buttonPrimaryStyle");
        this.nullableESignaturePrimaryButtonStylesAdapter.toJson(writer, value_.getButtonPrimaryStyle());
        writer.mo12827T("buttonSecondaryStyle");
        this.nullableESignatureSecondaryButtonStylesAdapter.toJson(writer, value_.getButtonSecondaryStyle());
        writer.mo12827T("titleStyle");
        this.nullableESignatureTitleStylesContainerAdapter.toJson(writer, value_.getTitleStyle());
        writer.mo12827T("textStyle");
        this.nullableESignatureTextStylesContainerAdapter.toJson(writer, value_.getTextStyle());
        writer.mo12827T("fillColor");
        this.nullableESignatureFillColorStyleAdapter.toJson(writer, value_.getFillColor());
        writer.mo12827T("backgroundColor");
        this.nullableESignatureBackgroundColorStyleAdapter.toJson(writer, value_.getBackgroundColor());
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
        this.nullableESignatureTextColorStyleAdapter.toJson(writer, value_.getTextColor());
        writer.mo12827T("borderRadius");
        this.nullableESignatureBorderRadiusStyleAdapter.toJson(writer, value_.getBorderRadius());
        writer.mo12827T("borderWidth");
        this.nullableESignatureBorderWidthStyleAdapter.toJson(writer, value_.getBorderWidth());
        writer.mo12827T("borderColor");
        this.nullableESignatureBorderColorStyleAdapter.toJson(writer, value_.getBorderColor());
        writer.mo12827T(CsqksqyPE.YPq);
        this.nullableInputMarginStyleAdapter.toJson(writer, value_.getMargin());
        writer.mo12823E();
    }
}
