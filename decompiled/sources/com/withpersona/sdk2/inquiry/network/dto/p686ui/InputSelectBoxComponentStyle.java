package com.withpersona.sdk2.inquiry.network.dto.p686ui;

import com.withpersona.sdk2.inquiry.network.dto.styling.TextBasedComponentStyle;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0012\u0010\u0012\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "", "baseBackgroundColorValue", "", "getBaseBackgroundColorValue", "()Ljava/lang/Integer;", "baseBorderColorValue", "getBaseBorderColorValue", "baseTextColor", "getBaseTextColor", "errorTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getErrorTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "focusedBackgroundColorValue", "getFocusedBackgroundColorValue", "headerCancelButtonColor", "getHeaderCancelButtonColor", "textBasedStyle", "getTextBasedStyle", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface InputSelectBoxComponentStyle {
    Integer getBaseBackgroundColorValue();

    Integer getBaseBorderColorValue();

    Integer getBaseTextColor();

    TextBasedComponentStyle getErrorTextStyle();

    Integer getFocusedBackgroundColorValue();

    Integer getHeaderCancelButtonColor();

    TextBasedComponentStyle getTextBasedStyle();
}
