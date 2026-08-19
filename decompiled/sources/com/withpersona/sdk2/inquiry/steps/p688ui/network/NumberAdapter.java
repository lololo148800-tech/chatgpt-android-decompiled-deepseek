package com.withpersona.sdk2.inquiry.steps.p688ui.network;

import bj.AbstractC11440E;
import bj.AbstractC11477x;
import bj.InterfaceC11453S;
import bj.InterfaceC11467n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m18067d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/network/NumberAdapter;", "", "Lbj/x;", "reader", "", "fromJson", "(Lbj/x;)Ljava/lang/Number;", "Lbj/E;", "writer", "value", "Lmm/C;", "toJson", "(Lbj/E;Ljava/lang/Number;)V", "ui-step-renderer_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NumberAdapter {

    /* JADX INFO: renamed from: a */
    public static final NumberAdapter f40992a = new NumberAdapter();

    @InterfaceC11467n
    public final Number fromJson(AbstractC11477x reader) {
        AbstractC16544l.m18094g(reader, "reader");
        Object objM12871r0 = reader.m12871r0();
        Number numberValueOf = objM12871r0 instanceof Number ? (Number) objM12871r0 : null;
        if (numberValueOf instanceof Double) {
            Double d10 = (Double) numberValueOf;
            if (Double.compare(numberValueOf.doubleValue(), d10.intValue()) == 0) {
                numberValueOf = Integer.valueOf(d10.intValue());
            }
        } else if (!(numberValueOf instanceof Integer)) {
            return null;
        }
        return numberValueOf;
    }

    @InterfaceC11453S
    public final void toJson(AbstractC11440E writer, Number value) {
        AbstractC16544l.m18094g(writer, "writer");
    }
}
