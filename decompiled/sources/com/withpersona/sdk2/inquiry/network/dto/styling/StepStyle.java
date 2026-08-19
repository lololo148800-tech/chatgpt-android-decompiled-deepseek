package com.withpersona.sdk2.inquiry.network.dto.styling;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u0004\u0018\u00010\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0005R\u0014\u0010$\u001a\u0004\u0018\u00010\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u0004\u0018\u00010\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001f¨\u0006,"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/styling/StepStyle;", "Landroid/os/Parcelable;", "backgroundColorValue", "", "getBackgroundColorValue", "()Ljava/lang/Integer;", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonSubmitComponentStyle;", "buttonSecondaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/ButtonCancelComponentStyle;", "cancelDialogCloseStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogResumeStyleValue", "getCancelDialogResumeStyleValue", "fillColorValue", "getFillColorValue", "modalBorderRadiusValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSize;", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/StyleElements$DPSizeSet;", "processingTextStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "getProcessingTextStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/styling/TextBasedComponentStyle;", "processingTitleStyleValue", "getProcessingTitleStyleValue", "strokeColorValue", "getStrokeColorValue", "textStyleValue", "getTextStyleValue", "titleStyleValue", "getTitleStyleValue", "backgroundImageDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface StepStyle extends Parcelable {
    Drawable backgroundImageDrawable(Context context);

    Integer getBackgroundColorValue();

    ButtonSubmitComponentStyle getButtonPrimaryStyleValue();

    ButtonCancelComponentStyle getButtonSecondaryStyleValue();

    ButtonSubmitComponentStyle getCancelDialogCloseStyleValue();

    ButtonCancelComponentStyle getCancelDialogResumeStyleValue();

    Integer getFillColorValue();

    StyleElements.DPSize getModalBorderRadiusValue();

    StyleElements.DPSizeSet getModalPaddingValue();

    TextBasedComponentStyle getProcessingTextStyleValue();

    TextBasedComponentStyle getProcessingTitleStyleValue();

    Integer getStrokeColorValue();

    TextBasedComponentStyle getTextStyleValue();

    TextBasedComponentStyle getTitleStyleValue();
}
