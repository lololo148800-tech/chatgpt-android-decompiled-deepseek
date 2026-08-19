package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p006A4.C0339D;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p071Ch.C1670a;
import p086D6.C1970n;
import p094De.C2025h;
import p103Dn.AbstractC2124C;
import p103Dn.AbstractC2173c0;
import p103Dn.C2146N;
import p103Dn.C2176e;
import p103Dn.C2215x0;
import p103Dn.C2219z0;
import p168Gd.C3034b;
import p193Hf.C3302D0;
import p193Hf.C3304E0;
import p193Hf.C3306F0;
import p193Hf.C3337V0;
import p349O0.C5997d;
import p349O0.InterfaceC5985X;
import p427Rc.C6849f;
import p571X9.AbstractC9206S2;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12441a extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f38950Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CanmoreViewModel f38951Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C3034b f38952o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f38953p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3337V0 f38954q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12441a(CanmoreViewModel canmoreViewModel, C3034b c3034b, InterfaceC5985X interfaceC5985X, C3337V0 c3337v0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f38951Z = canmoreViewModel;
        this.f38952o0 = c3034b;
        this.f38953p0 = interfaceC5985X;
        this.f38954q0 = c3337v0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C12441a c12441a = new C12441a(this.f38951Z, this.f38952o0, this.f38953p0, this.f38954q0, interfaceC18770c);
        c12441a.f38950Y = obj;
        return c12441a;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C12441a c12441a = (C12441a) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c12441a.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InterfaceC0571F interfaceC0571F = (InterfaceC0571F) this.f38950Y;
        C2219z0 c2219z0M6441a0 = C5997d.m6441a0(new C0339D(this.f38953p0, 15));
        String canmoreId = this.f38952o0.f9128a;
        CanmoreViewModelImpl canmoreViewModelImpl = (CanmoreViewModelImpl) this.f38951Z;
        AbstractC16544l.m18094g(canmoreId, "canmoreId");
        CanmoreViewModelImpl$filterNewAndChangedMessages$$inlined$map$1 canmoreViewModelImpl$filterNewAndChangedMessages$$inlined$map$1 = new CanmoreViewModelImpl$filterNewAndChangedMessages$$inlined$map$1(new C2146N(new C1970n(new C12435x6b4b4682(new C12434x6a524d4b(AbstractC9206S2.m9771b(new CanmoreViewModelImpl$getStreamingMessagesForWeb$1(canmoreId, null), canmoreViewModelImpl.f38868l.f45526y))), 6, new C1670a(3, (InterfaceC18770c) null, 1)), 2));
        CanmoreViewModelImpl$getStreamingMessagesForWeb$3 canmoreViewModelImpl$getStreamingMessagesForWeb$3 = new CanmoreViewModelImpl$getStreamingMessagesForWeb$3(2, null);
        int i10 = AbstractC2173c0.f6659a;
        C2176e c2176eM3210i = AbstractC2124C.m3210i(new C6849f(new C2025h(new C1970n(canmoreViewModelImpl$filterNewAndChangedMessages$$inlined$map$1, 4, canmoreViewModelImpl$getStreamingMessagesForWeb$3), 4), c2219z0M6441a0, C3302D0.f10064Z, null));
        C3337V0 c3337v0 = this.f38954q0;
        AbstractC2124C.m3226y(new C1970n(c2176eM3210i, 5, new C3304E0(c3337v0, null)), interfaceC0571F);
        C3302D0 c3302d0 = C3302D0.f10065o0;
        C2215x0 c2215x0 = canmoreViewModelImpl.f38871o;
        AbstractC16544l.m18094g(c2215x0, "<this>");
        AbstractC2124C.m3226y(new C1970n(AbstractC2124C.m3210i(new C6849f(c2215x0, c2219z0M6441a0, c3302d0, null)), 5, new C3306F0(c3337v0, null)), interfaceC0571F);
        return C17296C.f55119a;
    }
}
