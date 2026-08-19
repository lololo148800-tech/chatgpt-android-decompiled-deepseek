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
@Metadata(m18066d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig_SpacerComponentStyleJsonAdapter;", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$SpacerComponentStyle;", "Lbj/L;", "moshi", "<init>", "(Lbj/L;)V", "", "toString", "()Ljava/lang/String;", "Lbj/x;", "reader", "fromJson", "(Lbj/x;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$SpacerComponentStyle;", "Lbj/E;", "writer", "value_", "Lmm/C;", "toJson", "(Lbj/E;Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentConfig$SpacerComponentStyle;)V", "Lbj/v;", "options", "Lbj/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerHeightStyle;", "nullableSpacerHeightStyleAdapter", "Lbj/r;", "Lcom/withpersona/sdk2/inquiry/network/dto/styling/AttributeStyles$SpacerWidthStyle;", "nullableSpacerWidthStyleAdapter", "network_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UiComponentConfig_SpacerComponentStyleJsonAdapter extends AbstractC11471r {
    private final AbstractC11471r nullableSpacerHeightStyleAdapter;
    private final AbstractC11471r nullableSpacerWidthStyleAdapter;
    private final C11475v options = C11475v.m12866a("height", "width");

    public UiComponentConfig_SpacerComponentStyleJsonAdapter(C11447L c11447l) {
        C17691y c17691y = C17691y.f56482Y;
        this.nullableSpacerHeightStyleAdapter = c11447l.m12850b(AttributeStyles.SpacerHeightStyle.class, c17691y, "height");
        this.nullableSpacerWidthStyleAdapter = c11447l.m12850b(AttributeStyles.SpacerWidthStyle.class, c17691y, "width");
    }

    public String toString() {
        return AbstractC12107L1.m13823n(60, "GeneratedJsonAdapter(UiComponentConfig.SpacerComponentStyle)");
    }

    @Override // bj.AbstractC11471r
    public UiComponentConfig.SpacerComponentStyle fromJson(AbstractC11477x reader) {
        reader.mo12814e();
        AttributeStyles.SpacerHeightStyle spacerHeightStyle = null;
        AttributeStyles.SpacerWidthStyle spacerWidthStyle = null;
        while (reader.hasNext()) {
            int iMo12819v0 = reader.mo12819v0(this.options);
            if (iMo12819v0 == -1) {
                reader.mo12802H0();
                reader.mo12800D();
            } else if (iMo12819v0 == 0) {
                spacerHeightStyle = (AttributeStyles.SpacerHeightStyle) this.nullableSpacerHeightStyleAdapter.fromJson(reader);
            } else if (iMo12819v0 == 1) {
                spacerWidthStyle = (AttributeStyles.SpacerWidthStyle) this.nullableSpacerWidthStyleAdapter.fromJson(reader);
            }
        }
        reader.mo12818m();
        return new UiComponentConfig.SpacerComponentStyle(spacerHeightStyle, spacerWidthStyle);
    }

    @Override // bj.AbstractC11471r
    public void toJson(AbstractC11440E writer, UiComponentConfig.SpacerComponentStyle value_) {
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.mo12833e();
        writer.mo12827T("height");
        this.nullableSpacerHeightStyleAdapter.toJson(writer, value_.getHeight());
        writer.mo12827T("width");
        this.nullableSpacerWidthStyleAdapter.toJson(writer, value_.getWidth());
        writer.mo12823E();
    }
}
