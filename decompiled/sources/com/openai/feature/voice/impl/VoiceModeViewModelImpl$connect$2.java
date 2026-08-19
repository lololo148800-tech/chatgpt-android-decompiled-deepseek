package com.openai.feature.voice.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1155zi.EnumC22033m2;
import p172Gi.EnumC3062D;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.voice.impl.VoiceModeViewModelImpl$connect$2", m20656f = "VoiceModeViewModelImpl.kt", m20657l = {638}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$connect$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40073Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceModeViewModelImpl f40074Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ EnumC3062D f40075o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC22033m2 f40076p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f40077q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$connect$2(VoiceModeViewModelImpl voiceModeViewModelImpl, EnumC3062D enumC3062D, EnumC22033m2 enumC22033m2, boolean z6, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40074Z = voiceModeViewModelImpl;
        this.f40075o0 = enumC3062D;
        this.f40076p0 = enumC22033m2;
        this.f40077q0 = z6;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceModeViewModelImpl$connect$2(this.f40074Z, this.f40075o0, this.f40076p0, this.f40077q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceModeViewModelImpl$connect$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40073Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            this.f40073Y = 1;
            if (VoiceModeViewModelImpl.m14375n(this.f40074Z, this.f40075o0, this.f40076p0, this.f40077q0, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
