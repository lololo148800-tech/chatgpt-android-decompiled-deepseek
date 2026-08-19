package com.openai.feature.voice.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C21902C2;
import p124Ei.C2529m1;
import p124Ei.C2532n1;
import p172Gi.EnumC3062D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$connectImpl$7 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ EnumC3062D f40099Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21902C2 f40100Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f40101o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C2529m1 f40102p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$connectImpl$7(EnumC3062D enumC3062D, C21902C2 c21902c2, boolean z6, C2529m1 c2529m1) {
        super(1);
        this.f40099Y = enumC3062D;
        this.f40100Z = c21902c2;
        this.f40101o0 = z6;
        this.f40102p0 = c2529m1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2532n1 setState = (C2532n1) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C2532n1.m3605e(setState, null, null, this.f40099Y, this.f40100Z, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, this.f40101o0, null, null, this.f40102p0, null, false, false, null, null, null, false, false, false, false, null, -369098765, 2047);
    }
}
