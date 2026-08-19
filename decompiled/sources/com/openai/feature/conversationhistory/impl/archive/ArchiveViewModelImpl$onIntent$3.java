package com.openai.feature.conversationhistory.impl.archive;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1039ud.C20185b;
import p1039ud.InterfaceC20190g;
import p1155zi.AbstractC21955Q1;
import p403Qd.C6636i;
import p523V9.AbstractC8040Z5;
import p571X9.AbstractC9233X;
import p925oe.C18077B;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.archive.ArchiveViewModelImpl$onIntent$3", m20656f = "ArchiveViewModel.kt", m20657l = {81}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ArchiveViewModelImpl$onIntent$3 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public ArchiveViewModelImpl f37359Y;

    /* JADX INFO: renamed from: Z */
    public int f37360Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ ArchiveViewModelImpl f37361o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC20190g f37362p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArchiveViewModelImpl$onIntent$3(ArchiveViewModelImpl archiveViewModelImpl, InterfaceC20190g interfaceC20190g, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37361o0 = archiveViewModelImpl;
        this.f37362p0 = interfaceC20190g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ArchiveViewModelImpl$onIntent$3(this.f37361o0, this.f37362p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ArchiveViewModelImpl$onIntent$3) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        ArchiveViewModelImpl archiveViewModelImpl;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37360Z;
        InterfaceC20190g interfaceC20190g = this.f37362p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ArchiveViewModelImpl archiveViewModelImpl2 = this.f37361o0;
            C18077B c18077b = archiveViewModelImpl2.f37342j;
            C6636i c6636i = ((C20185b) interfaceC20190g).f63931a;
            this.f37359Y = archiveViewModelImpl2;
            this.f37360Z = 1;
            Object objM8407c = AbstractC8040Z5.m8407c(c18077b, c6636i, this);
            if (objM8407c == enumC19250a) {
                return enumC19250a;
            }
            archiveViewModelImpl = archiveViewModelImpl2;
            obj = objM8407c;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            archiveViewModelImpl = this.f37359Y;
            AbstractC9233X.m9807c(obj);
        }
        ArchiveViewModelImpl.m14236o(archiveViewModelImpl, (AbstractC21955Q1) obj, ((C20185b) interfaceC20190g).f63931a);
        return C17296C.f55119a;
    }
}
