package com.openai.feature.messages.impl.image;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p1155zi.C21952P1;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {226, 229, 242}, m20658m = "makeShareLink")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ImageDetailViewModelImpl$makeShareLink$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ImageDetailViewModelImpl f38759Y;

    /* JADX INFO: renamed from: Z */
    public C21952P1 f38760Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f38761o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ImageDetailViewModelImpl f38762p0;

    /* JADX INFO: renamed from: q0 */
    public int f38763q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetailViewModelImpl$makeShareLink$1(ImageDetailViewModelImpl imageDetailViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38762p0 = imageDetailViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38761o0 = obj;
        this.f38763q0 |= Integer.MIN_VALUE;
        return ImageDetailViewModelImpl.m14313o(this.f38762p0, null, this);
    }
}
