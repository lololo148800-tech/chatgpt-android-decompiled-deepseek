package com.openai.design;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p774h1.C14356l;
import p821j1.InterfaceC16039d;
import p882m1.AbstractC17140a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Lcom/openai/design/ForwardingPainter;", "Lm1/a;", "painter", "Lm1/a;", "design_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ForwardingPainter extends AbstractC17140a {
    private final AbstractC17140a painter;

    /* JADX INFO: renamed from: r0 */
    public float f37243r0;

    /* JADX INFO: renamed from: s0 */
    public C14356l f37244s0;

    /* JADX INFO: renamed from: t0 */
    public final InterfaceC1439n f37245t0;

    /* JADX INFO: renamed from: u0 */
    public ForwardingDrawInfo f37246u0;

    public ForwardingPainter(AbstractC17140a painter, float f10, C14356l c14356l, InterfaceC1439n interfaceC1439n) {
        AbstractC16544l.m18094g(painter, "painter");
        this.painter = painter;
        this.f37243r0 = f10;
        this.f37244s0 = c14356l;
        this.f37245t0 = interfaceC1439n;
        this.f37246u0 = new ForwardingDrawInfo(painter, f10, c14356l);
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: b */
    public final boolean mo11307b(float f10) {
        if (f10 == 1.0f) {
            return true;
        }
        this.f37243r0 = f10;
        this.f37246u0 = new ForwardingDrawInfo(this.painter, f10, this.f37244s0);
        return true;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: e */
    public final boolean mo11308e(C14356l c14356l) {
        if (c14356l == null) {
            return true;
        }
        this.f37244s0 = c14356l;
        this.f37246u0 = new ForwardingDrawInfo(this.painter, this.f37243r0, c14356l);
        return true;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: h */
    public final long getF38830r0() {
        return this.painter.getF38830r0();
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: i */
    public final void mo11310i(InterfaceC16039d interfaceC16039d) {
        AbstractC16544l.m18094g(interfaceC16039d, "<this>");
        this.f37245t0.invoke(interfaceC16039d, this.f37246u0);
    }
}
