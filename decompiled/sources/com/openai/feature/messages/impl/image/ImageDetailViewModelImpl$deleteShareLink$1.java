package com.openai.feature.messages.impl.image;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {285}, m20658m = "deleteShareLink")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ImageDetailViewModelImpl$deleteShareLink$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ImageDetailViewModelImpl f38743Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f38744Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ImageDetailViewModelImpl f38745o0;

    /* JADX INFO: renamed from: p0 */
    public int f38746p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetailViewModelImpl$deleteShareLink$1(ImageDetailViewModelImpl imageDetailViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38745o0 = imageDetailViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38744Z = obj;
        this.f38746p0 |= Integer.MIN_VALUE;
        return ImageDetailViewModelImpl.m14312n(this.f38745o0, this);
    }
}
