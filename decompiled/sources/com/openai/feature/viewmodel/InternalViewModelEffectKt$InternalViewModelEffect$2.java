package com.openai.feature.viewmodel;

import com.openai.viewmodel.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class InternalViewModelEffectKt$InternalViewModelEffect$2 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ BaseViewModel f39942Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f39943Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalViewModelEffectKt$InternalViewModelEffect$2(BaseViewModel baseViewModel, int i10) {
        super(2);
        this.f39942Y = baseViewModel;
        this.f39943Z = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f39943Z | 1);
        InternalViewModelEffectKt.m14374a(this.f39942Y, (C6021p) obj, iM6447d0);
        return C17296C.f55119a;
    }
}
