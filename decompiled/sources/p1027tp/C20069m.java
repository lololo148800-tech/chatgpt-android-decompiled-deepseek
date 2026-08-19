package p1027tp;

import java.util.concurrent.Executor;
import mo.C17358y;
import p658b5.C11241l;

/* JADX INFO: renamed from: tp.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C20069m implements InterfaceC20059c {

    /* JADX INFO: renamed from: Y */
    public final Executor f63560Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC20059c f63561Z;

    public C20069m(Executor executor, InterfaceC20059c interfaceC20059c) {
        this.f63560Y = executor;
        this.f63561Z = interfaceC20059c;
    }

    @Override // p1027tp.InterfaceC20059c
    /* JADX INFO: renamed from: E */
    public final void mo20893E(InterfaceC20062f interfaceC20062f) {
        this.f63561Z.mo20893E(new C11241l((Object) this, (Object) interfaceC20062f, false));
    }

    @Override // p1027tp.InterfaceC20059c
    /* JADX INFO: renamed from: P */
    public final C17358y mo20894P() {
        return this.f63561Z.mo20894P();
    }

    @Override // p1027tp.InterfaceC20059c
    public final void cancel() {
        this.f63561Z.cancel();
    }

    @Override // p1027tp.InterfaceC20059c
    /* JADX INFO: renamed from: m */
    public final boolean mo20895m() {
        return this.f63561Z.mo20895m();
    }

    @Override // p1027tp.InterfaceC20059c
    public final InterfaceC20059c clone() {
        return new C20069m(this.f63560Y, this.f63561Z.clone());
    }
}
