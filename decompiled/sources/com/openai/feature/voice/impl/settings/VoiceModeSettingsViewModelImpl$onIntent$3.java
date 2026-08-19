package com.openai.feature.voice.impl.settings;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.C2056e;
import p172Gi.C3077j;
import p294Li.C5100v;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.settings.VoiceModeSettingsViewModelImpl$onIntent$3", m20656f = "VoiceModeSettingsViewModelImpl.kt", m20657l = {83}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeSettingsViewModelImpl$onIntent$3 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40274Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeSettingsViewModelImpl f40275Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeSettingsViewModelImpl$onIntent$3(VoiceModeSettingsViewModelImpl voiceModeSettingsViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40275Z = voiceModeSettingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceModeSettingsViewModelImpl$onIntent$3(this.f40275Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceModeSettingsViewModelImpl$onIntent$3) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40274Y;
        C17296C c17296c = C17296C.f55119a;
        VoiceModeSettingsViewModelImpl voiceModeSettingsViewModelImpl = this.f40275Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C3077j c3077j = ((C5100v) voiceModeSettingsViewModelImpl.m14391f()).f16672c;
            if (c3077j != null) {
                this.f40274Y = 1;
                if (voiceModeSettingsViewModelImpl.f40268i.m18595f(c3077j.f9279b, this) == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9233X.m9807c(obj);
        voiceModeSettingsViewModelImpl.m14393h(C2056e.f6277a);
        return c17296c;
    }
}
