package fj;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0564B0;

/* JADX INFO: renamed from: fj.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13671c implements InterfaceC13670b {

    /* JADX INFO: renamed from: a */
    public final String f43147a;

    /* JADX INFO: renamed from: b */
    public final C0564B0 f43148b;

    /* JADX INFO: renamed from: c */
    public C13671c f43149c;

    public C13671c(String key, C0564B0 c0564b0) {
        AbstractC16544l.m18094g(key, "key");
        this.f43147a = key;
        this.f43148b = c0564b0;
    }

    @Override // fj.InterfaceC13670b
    /* JADX INFO: renamed from: a */
    public final InterfaceC13670b mo15160a() {
        return this.f43149c;
    }

    @Override // fj.InterfaceC13670b
    /* JADX INFO: renamed from: b */
    public final void mo15161b(InterfaceC13670b interfaceC13670b) {
        this.f43149c = (C13671c) interfaceC13670b;
    }
}
