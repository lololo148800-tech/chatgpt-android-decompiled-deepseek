package tl;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: tl.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20001a implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f63319Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1426a f63320Z;

    public /* synthetic */ C20001a(int i10, InterfaceC1426a interfaceC1426a) {
        this.f63319Y = i10;
        this.f63320Z = interfaceC1426a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object it) {
        switch (this.f63319Y) {
            case 0:
                break;
            default:
                AbstractC16544l.m18094g(it, "it");
                break;
        }
        return this.f63320Z.invoke();
    }
}
