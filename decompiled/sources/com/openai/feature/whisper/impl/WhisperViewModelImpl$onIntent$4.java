package com.openai.feature.whisper.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.whisper.impl.WhisperViewModelImpl$onIntent$4", m20656f = "WhisperViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class WhisperViewModelImpl$onIntent$4 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ WhisperViewModelImpl f40336Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhisperViewModelImpl$onIntent$4(WhisperViewModelImpl whisperViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40336Y = whisperViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new WhisperViewModelImpl$onIntent$4(this.f40336Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        WhisperViewModelImpl$onIntent$4 whisperViewModelImpl$onIntent$4 = (WhisperViewModelImpl$onIntent$4) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        whisperViewModelImpl$onIntent$4.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f40336Y.f40325i.close();
        return C17296C.f55119a;
    }
}
