package com.openai.feature.voice.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1155zi.C21902C2;
import p124Ei.C2532n1;
import p148Fi.AbstractC2792U0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$onIntent$18$state$1", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LEi/n1;", "it", "", "<anonymous>", "(LEi/n1;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$18$state$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f40155Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        VoiceModeViewModelImpl$onIntent$18$state$1 voiceModeViewModelImpl$onIntent$18$state$1 = new VoiceModeViewModelImpl$onIntent$18$state$1(2, interfaceC18770c);
        voiceModeViewModelImpl$onIntent$18$state$1.f40155Y = obj;
        return voiceModeViewModelImpl$onIntent$18$state$1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceModeViewModelImpl$onIntent$18$state$1) create((C2532n1) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        boolean z6;
        C21902C2 c21902c2;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C2532n1 c2532n1 = (C2532n1) this.f40155Y;
        if (AbstractC2792U0.m3711b(c2532n1.f7895b) && (c21902c2 = c2532n1.f7897d) != null) {
            z6 = c21902c2.m22335c();
        }
        return Boolean.valueOf(z6);
    }
}
