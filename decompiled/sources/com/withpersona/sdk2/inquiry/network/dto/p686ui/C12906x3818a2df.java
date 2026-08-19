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

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.UiComponentConfig_InputCheckboxGroup_InputCheckboxComponentStyleJsonAdapter */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_InputCheckboxGroup_InputCheckboxComponentStyleJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup$InputCheckboxComponentStyle;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup$InputCheckboxComponentStyle;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$InputCheckboxGroup$InputCheckboxComponentStyle;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontFamilyStyle;", "nullableInputCheckboxFontFamilyStyleAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontSizeStyle;", "nullableInputCheckboxFontSizeStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxFontWeightStyle;", "nullableInputCheckboxFontWeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLetterSpacingStyle;", "nullableInputCheckboxLetterSpacingStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxLineHeightStyle;", "nullableInputCheckboxLineHeightStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$InputCheckboxTextColorStyle;", "nullableInputCheckboxTextColorStyleAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$TextBasedTextColorStyle;", "nullableTextBasedTextColorStyleAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class C12906x3818a2df extends AbstractC11471r {
    private final AbstractC11471r nullableInputCheckboxFontFamilyStyleAdapter;
    private final AbstractC11471r nullableInputCheckboxFontSizeStyleAdapter;
    private final AbstractC11471r nullableInputCheckboxFontWeightStyleAdapter;
    private final AbstractC11471r nullableInputCheckboxLetterSpacingStyleAdapter;
    private final AbstractC11471r nullableInputCheckboxLineHeightStyleAdapter;
    private final AbstractC11471r nullableInputCheckboxTextColorStyleAdapter;
    private final AbstractC11471r nullableTextBasedTextColorStyleAdapter;
    private final C11475v options = C11475v.m12866a("fontFamily", "fontSize", "fontWeight", "letterSpacing", "lineHeight", "textColor", "textColorHighlight");

    public C12906x3818a2df(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableInputCheckboxFontFamilyStyleAdapter = c11447l.m12850b(AttributeStyles.InputCheckboxFontFamilyStyle.class, c17691y, "fontFamily");
        this.nullableInputCheckboxFontSizeStyleAdapter = c11447l.m12850b(AttributeStyles.InputCheckboxFontSizeStyle.class, c17691y, "fontSize");
        this.nullableInputCheckboxFontWeightStyleAdapter = c11447l.m12850b(AttributeStyles.InputCheckboxFontWeightStyle.class, c17691y, "fontWeight");
        this.nullableInputCheckboxLetterSpacingStyleAdapter = c11447l.m12850b(AttributeStyles.InputCheckboxLetterSpacingStyle.class, c17691y, "letterSpacing");
        this.nullableInputCheckboxLineHeightStyleAdapter = c11447l.m12850b(AttributeStyles.InputCheckboxLineHeightStyle.class, c17691y, "lineHeight");
        this.nullableInputCheckboxTextColorStyleAdapter = c11447l.m12850b(AttributeStyles.InputCheckboxTextColorStyle.class, c17691y, "textColor");
        this.nullableTextBasedTextColorStyleAdapter = c11447l.m12850b(AttributeStyles.TextBasedTextColorStyle.class, c17691y, "textColorHighlight");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(86, "GeneratedJsonAdapter(UiComponentConfig.InputCheckboxGroup.InputCheckboxComponentStyle)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.InputCheckboxGroup.InputCheckboxComponentStyle fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        AttributeStyles.InputCheckboxFontFamilyStyle inputCheckboxFontFamilyStyle = null;
        AttributeStyles.InputCheckboxFontSizeStyle inputCheckboxFontSizeStyle = null;
        AttributeStyles.InputCheckboxFontWeightStyle inputCheckboxFontWeightStyle = null;
        AttributeStyles.InputCheckboxLetterSpacingStyle inputCheckboxLetterSpacingStyle = null;
        AttributeStyles.InputCheckboxLineHeightStyle inputCheckboxLineHeightStyle = null;
        AttributeStyles.InputCheckboxTextColorStyle inputCheckboxTextColorStyle = null;
        AttributeStyles.TextBasedTextColorStyle textBasedTextColorStyle = null;
        while (reader.hasNext()) {
            switch (reader.mo12819v0(this.options)) {
                case -1:
                    reader.mo12802H0();
                    reader.mo12800D();
                    break;
                case 0:
                    inputCheckboxFontFamilyStyle = (AttributeStyles.InputCheckboxFontFamilyStyle) this.nullableInputCheckboxFontFamilyStyleAdapter.fromJson(reader);
                    break;
                case 1:
                    inputCheckboxFontSizeStyle = (AttributeStyles.InputCheckboxFontSizeStyle) this.nullableInputCheckboxFontSizeStyleAdapter.fromJson(reader);
                    break;
                case 2:
                    inputCheckboxFontWeightStyle = (AttributeStyles.InputCheckboxFontWeightStyle) this.nullableInputCheckboxFontWeightStyleAdapter.fromJson(reader);
                    break;
                case 3:
                    inputCheckboxLetterSpacingStyle = (AttributeStyles.InputCheckboxLetterSpacingStyle) this.nullableInputCheckboxLetterSpacingStyleAdapter.fromJson(reader);
                    break;
                case 4:
                    inputCheckboxLineHeightStyle = (AttributeStyles.InputCheckboxLineHeightStyle) this.nullableInputCheckboxLineHeightStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    inputCheckboxTextColorStyle = (AttributeStyles.InputCheckboxTextColorStyle) this.nullableInputCheckboxTextColorStyleAdapter.fromJson(reader);
                    break;
                case 6:
                    textBasedTextColorStyle = (AttributeStyles.TextBasedTextColorStyle) this.nullableTextBasedTextColorStyleAdapter.fromJson(reader);
                    break;
            }
        }
        reader.mo12818m();
        return new UiComponentConfig.InputCheckboxGroup.InputCheckboxComponentStyle(inputCheckboxFontFamilyStyle, inputCheckboxFontSizeStyle, inputCheckboxFontWeightStyle, inputCheckboxLetterSpacingStyle, inputCheckboxLineHeightStyle, inputCheckboxTextColorStyle, textBasedTextColorStyle);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.InputCheckboxGroup.InputCheckboxComponentStyle value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("fontFamily");
        this.nullableInputCheckboxFontFamilyStyleAdapter.toJson(writer, value_.getFontFamily());
        writer.mo12827T("fontSize");
        this.nullableInputCheckboxFontSizeStyleAdapter.toJson(writer, value_.getFontSize());
        writer.mo12827T("fontWeight");
        this.nullableInputCheckboxFontWeightStyleAdapter.toJson(writer, value_.getFontWeight());
        writer.mo12827T("letterSpacing");
        this.nullableInputCheckboxLetterSpacingStyleAdapter.toJson(writer, value_.getLetterSpacing());
        writer.mo12827T("lineHeight");
        this.nullableInputCheckboxLineHeightStyleAdapter.toJson(writer, value_.getLineHeight());
        writer.mo12827T("textColor");
        this.nullableInputCheckboxTextColorStyleAdapter.toJson(writer, value_.getTextColor());
        writer.mo12827T("textColorHighlight");
        this.nullableTextBasedTextColorStyleAdapter.toJson(writer, value_.getTextColorHighlight());
        writer.mo12823E();
    }
}
