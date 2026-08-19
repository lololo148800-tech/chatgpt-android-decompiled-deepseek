package com.openai.design;

import com.google.protobuf.AbstractC12107L1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p774h1.C14356l;
import p882m1.AbstractC17140a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Lcom/openai/design/ForwardingDrawInfo;", "", "Lm1/a;", "painter", "Lm1/a;", "a", "()Lm1/a;", "design_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class ForwardingDrawInfo {

    /* JADX INFO: renamed from: a */
    public final float f37241a;

    /* JADX INFO: renamed from: b */
    public final C14356l f37242b;
    private final AbstractC17140a painter;

    public ForwardingDrawInfo(AbstractC17140a painter, float f10, C14356l c14356l) {
        AbstractC16544l.m18094g(painter, "painter");
        this.painter = painter;
        this.f37241a = f10;
        this.f37242b = c14356l;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC17140a getPainter() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardingDrawInfo)) {
            return false;
        }
        ForwardingDrawInfo forwardingDrawInfo = (ForwardingDrawInfo) obj;
        return AbstractC16544l.m18089b(this.painter, forwardingDrawInfo.painter) && Float.compare(this.f37241a, forwardingDrawInfo.f37241a) == 0 && AbstractC16544l.m18089b(this.f37242b, forwardingDrawInfo.f37242b);
    }

    public final int hashCode() {
        int iM13819j = AbstractC12107L1.m13819j(this.f37241a, this.painter.hashCode() * 31, 31);
        C14356l c14356l = this.f37242b;
        return iM13819j + (c14356l == null ? 0 : c14356l.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
