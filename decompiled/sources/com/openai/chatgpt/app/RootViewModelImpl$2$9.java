package com.openai.chatgpt.app;

import gd.EnumC13846D;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p092Dc.C1996m;
import p1155zi.EnumC21895B;
import p190Hc.InterfaceC3283d;
import ug.AbstractC20236s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lug/s;", "invoke", "(Lug/s;)Lug/s;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class RootViewModelImpl$2$9 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ EnumC21895B f37196Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3283d f37197Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C1996m f37198o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC13846D f37199p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootViewModelImpl$2$9(EnumC21895B enumC21895B, InterfaceC3283d interfaceC3283d, C1996m c1996m, EnumC13846D enumC13846D) {
        super(1);
        this.f37196Y = enumC21895B;
        this.f37197Z = interfaceC3283d;
        this.f37198o0 = c1996m;
        this.f37199p0 = enumC13846D;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        AbstractC20236s setState = (AbstractC20236s) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        RootViewModelImpl.f37186l.getClass();
        return RootViewModelImpl.Companion.m14228a(this.f37196Y, this.f37197Z, this.f37198o0, this.f37199p0);
    }
}
