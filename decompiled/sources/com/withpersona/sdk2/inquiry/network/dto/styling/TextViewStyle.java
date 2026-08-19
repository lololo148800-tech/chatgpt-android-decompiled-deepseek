package com.withpersona.sdk2.inquiry.network.dto.styling;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextViewStyle;", "", "fontNameValue", "", "getFontNameValue", "()Ljava/lang/String;", "fontSizeValue", "", "getFontSizeValue", "()Ljava/lang/Double;", "fontWeightValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;", "getFontWeightValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$FontWeight;", "justificationValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "getJustificationValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$PositionType;", "letterSpacingValue", "getLetterSpacingValue", "lineHeightValue", "getLineHeightValue", "marginValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getMarginValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "textColorHighlightValue", "", "getTextColorHighlightValue", "()Ljava/lang/Integer;", "textColorValue", "getTextColorValue", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface TextViewStyle {
    String getFontNameValue();

    Double getFontSizeValue();

    StyleElements.FontWeight getFontWeightValue();

    StyleElements.PositionType getJustificationValue();

    Double getLetterSpacingValue();

    Double getLineHeightValue();

    StyleElements.DPSizeSet getMarginValue();

    Integer getTextColorHighlightValue();

    Integer getTextColorValue();
}
