package com.openai.feature.whisper.impl;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.C2059h;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p571X9.AbstractC9233X;
import p906nh.C17625g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.whisper.impl.WhisperViewModelImpl$onIntent$1", m20656f = "WhisperViewModelImpl.kt", m20657l = {27}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class WhisperViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40330Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ WhisperViewModelImpl f40331Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhisperViewModelImpl$onIntent$1(WhisperViewModelImpl whisperViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40331Z = whisperViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new WhisperViewModelImpl$onIntent$1(this.f40331Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((WhisperViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40330Y;
        WhisperViewModelImpl whisperViewModelImpl = this.f40331Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17625g c17625g = whisperViewModelImpl.f40325i;
            this.f40330Y = 1;
            obj = c17625g.m19229a(this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            whisperViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        }
        return C17296C.f55119a;
    }
}
