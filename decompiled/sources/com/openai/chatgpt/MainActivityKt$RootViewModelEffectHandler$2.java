package com.openai.chatgpt;

import com.openai.feature.rootviewmodel.RootViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
final class MainActivityKt$RootViewModelEffectHandler$2 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ RootViewModel f37139Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f37140Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityKt$RootViewModelEffectHandler$2(RootViewModel rootViewModel, int i10) {
        super(2);
        this.f37139Y = rootViewModel;
        this.f37140Z = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM6447d0 = C5997d.m6447d0(this.f37140Z | 1);
        AbstractC12214a.m14226d(this.f37139Y, (C6021p) obj, iM6447d0);
        return C17296C.f55119a;
    }
}
