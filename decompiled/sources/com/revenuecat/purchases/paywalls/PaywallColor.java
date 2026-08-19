package com.revenuecat.purchases.paywalls;

import android.graphics.Color;
import android.os.Build;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import livekit.LivekitInternal$NodeStats;
import p1113xn.C21319m;
import p523V9.AbstractC7966P5;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u001f\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallColor;", "", "stringRepresentation", "", "(Ljava/lang/String;)V", "colorInt", "", "(I)V", "underlyingColor", "Landroid/graphics/Color;", "(Ljava/lang/String;Landroid/graphics/Color;)V", "getColorInt", "()I", "getStringRepresentation", "()Ljava/lang/String;", "getUnderlyingColor", "()Landroid/graphics/Color;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "Serializer", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class PaywallColor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final C21319m rgbaColorRegex = new C21319m("^#([A-Fa-f0-9]{8})$");
    private final int colorInt;
    private final String stringRepresentation;
    private final Color underlyingColor;

    @Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallColor$Companion;", "", "<init>", "()V", "", "stringRepresentation", "", "parseRGBAColor", "(Ljava/lang/String;)I", "Lxn/m;", "rgbaColorRegex", "Lxn/m;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int parseRGBAColor(String stringRepresentation) {
            if (!PaywallColor.rgbaColorRegex.m21664d(stringRepresentation)) {
                return Color.parseColor(stringRepresentation);
            }
            String strSubstring = stringRepresentation.substring(1, 3);
            AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            AbstractC7966P5.m8254b(16);
            int i10 = Integer.parseInt(strSubstring, 16);
            String strSubstring2 = stringRepresentation.substring(3, 5);
            AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            AbstractC7966P5.m8254b(16);
            int i11 = Integer.parseInt(strSubstring2, 16);
            String strSubstring3 = stringRepresentation.substring(5, 7);
            AbstractC16544l.m18093f(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
            AbstractC7966P5.m8254b(16);
            int i12 = Integer.parseInt(strSubstring3, 16);
            String strSubstring4 = stringRepresentation.substring(7, 9);
            AbstractC16544l.m18093f(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
            AbstractC7966P5.m8254b(16);
            return Color.argb(Integer.parseInt(strSubstring4, 16), i10, i11, i12);
        }

        private Companion() {
        }
    }

    @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallColor$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/PaywallColor;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/PaywallColor;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/PaywallColor;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Serializer implements KSerializer {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor = AbstractC11336c.m12772b("PaywallColor", C10104e.f29918j);

        private Serializer() {
        }

        @Override // kotlinx.serialization.KSerializer
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer
        public PaywallColor deserialize(Decoder decoder) {
            AbstractC16544l.m18094g(decoder, "decoder");
            return new PaywallColor(decoder.mo5479m());
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(Encoder encoder, PaywallColor value) {
            AbstractC16544l.m18094g(encoder, "encoder");
            AbstractC16544l.m18094g(value, "value");
            encoder.mo5566G(value.toString());
        }
    }

    public PaywallColor(String stringRepresentation, Color color) {
        AbstractC16544l.m18094g(stringRepresentation, "stringRepresentation");
        this.stringRepresentation = stringRepresentation;
        this.underlyingColor = color;
        this.colorInt = INSTANCE.parseRGBAColor(stringRepresentation);
    }

    public static /* synthetic */ PaywallColor copy$default(PaywallColor paywallColor, String str, Color color, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paywallColor.stringRepresentation;
        }
        if ((i10 & 2) != 0) {
            color = paywallColor.underlyingColor;
        }
        return paywallColor.copy(str, color);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStringRepresentation() {
        return this.stringRepresentation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Color getUnderlyingColor() {
        return this.underlyingColor;
    }

    public final PaywallColor copy(String stringRepresentation, Color underlyingColor) {
        AbstractC16544l.m18094g(stringRepresentation, "stringRepresentation");
        return new PaywallColor(stringRepresentation, underlyingColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallColor)) {
            return false;
        }
        PaywallColor paywallColor = (PaywallColor) other;
        return AbstractC16544l.m18089b(this.stringRepresentation, paywallColor.stringRepresentation) && AbstractC16544l.m18089b(this.underlyingColor, paywallColor.underlyingColor);
    }

    public final int getColorInt() {
        return this.colorInt;
    }

    public final String getStringRepresentation() {
        return this.stringRepresentation;
    }

    public final Color getUnderlyingColor() {
        return this.underlyingColor;
    }

    public int hashCode() {
        int iHashCode = this.stringRepresentation.hashCode() * 31;
        Color color = this.underlyingColor;
        return iHashCode + (color == null ? 0 : color.hashCode());
    }

    public String toString() {
        return "PaywallColor(stringRepresentation=" + this.stringRepresentation + ", underlyingColor=" + this.underlyingColor + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallColor(String stringRepresentation) {
        this(stringRepresentation, Build.VERSION.SDK_INT >= 26 ? Color.valueOf(INSTANCE.parseRGBAColor(stringRepresentation)) : null);
        AbstractC16544l.m18094g(stringRepresentation, "stringRepresentation");
    }

    public PaywallColor(int i10) {
        this(String.format(Locale.US, "#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(16777215 & i10)}, 1)), Build.VERSION.SDK_INT >= 26 ? Color.valueOf(i10) : null);
    }
}
