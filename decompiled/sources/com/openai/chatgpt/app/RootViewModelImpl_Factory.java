package com.openai.chatgpt.app;

import p046Bk.C1342O;
import p096Dg.C2046c;
import p1149zc.AbstractC21864z;
import p1155zi.EnumC21895B;
import p122Eg.C2435d;
import p190Hc.C3287h;
import p248Jk.C4471b;
import p248Jk.InterfaceC4473d;
import p248Jk.InterfaceC4478i;
import si.InterfaceC19652d;

/* JADX INFO: loaded from: classes3.dex */
public final class RootViewModelImpl_Factory implements InterfaceC4473d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4478i f37222a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4478i f37223b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4478i f37224c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4478i f37225d;

    /* JADX INFO: renamed from: e */
    public final C4471b f37226e;

    public RootViewModelImpl_Factory(InterfaceC4478i interfaceC4478i, InterfaceC4478i interfaceC4478i2, InterfaceC4478i interfaceC4478i3, C1342O c1342o, InterfaceC4478i interfaceC4478i4, C4471b c4471b) {
        this.f37222a = interfaceC4478i;
        this.f37223b = interfaceC4478i2;
        this.f37224c = interfaceC4478i3;
        this.f37225d = interfaceC4478i4;
        this.f37226e = c4471b;
    }

    @Override // p876lm.InterfaceC17068a
    public final Object get() {
        return new RootViewModelImpl((C2435d) this.f37222a.get(), (InterfaceC19652d) this.f37223b.get(), (C2046c) this.f37224c.get(), EnumC21895B.f69419Z, (C3287h) this.f37225d.get(), (AbstractC21864z) this.f37226e.get());
    }
}
