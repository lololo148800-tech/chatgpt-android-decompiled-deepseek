package com.withpersona.sdk2.inquiry.network.dto.p686ui;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "buttonType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "getButtonType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$Button$ButtonType;", "disabled", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", ParameterNames.HIDDEN, "getHidden", "text", "", "getText", "()Ljava/lang/String;", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public interface BaseButtonAttributes extends UiComponentAttributes {
    UiComponentConfig.Button.ButtonType getButtonType();

    JsonLogicBoolean getDisabled();

    JsonLogicBoolean getHidden();

    String getText();
}
