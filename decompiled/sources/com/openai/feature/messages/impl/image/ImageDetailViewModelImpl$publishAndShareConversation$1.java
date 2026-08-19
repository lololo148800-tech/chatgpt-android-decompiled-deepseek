package com.openai.feature.messages.impl.image;

import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sm.AbstractC19687c;
import sm.InterfaceC19689e;
import tf.C19906K;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.image.ImageDetailViewModelImpl", m20656f = "ImageDetailViewModelImpl.kt", m20657l = {262, 263}, m20658m = "publishAndShareConversation")
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class ImageDetailViewModelImpl$publishAndShareConversation$1 extends AbstractC19687c {

    /* JADX INFO: renamed from: Y */
    public ImageDetailViewModelImpl f38796Y;

    /* JADX INFO: renamed from: Z */
    public C19906K f38797Z;

    /* JADX INFO: renamed from: o0 */
    public String f38798o0;

    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ Object f38799p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ ImageDetailViewModelImpl f38800q0;

    /* JADX INFO: renamed from: r0 */
    public int f38801r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetailViewModelImpl$publishAndShareConversation$1(ImageDetailViewModelImpl imageDetailViewModelImpl, AbstractC19687c abstractC19687c) {
        super(abstractC19687c);
        this.f38800q0 = imageDetailViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        this.f38799p0 = obj;
        this.f38801r0 |= Integer.MIN_VALUE;
        return ImageDetailViewModelImpl.m14314p(this.f38800q0, this);
    }
}
