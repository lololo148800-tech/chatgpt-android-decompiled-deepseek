package ee;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import nf.C17604c;
import p003A1.InterfaceC0309z1;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: ee.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C13373h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42412Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC0309z1 f42413Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13373h(InterfaceC0309z1 interfaceC0309z1, int i10) {
        super(1);
        this.f42412Y = i10;
        this.f42413Z = interfaceC0309z1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42412Y) {
            case 0:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                this.f42413Z.mo877a(it);
                break;
            case 1:
                String url = (String) obj;
                AbstractC16544l.m18094g(url, "url");
                this.f42413Z.mo877a(url);
                break;
            case 2:
                C17604c effect = (C17604c) obj;
                AbstractC16544l.m18094g(effect, "effect");
                if (effect instanceof C17604c) {
                    this.f42413Z.mo877a(effect.f56357a);
                }
                break;
            default:
                String it2 = (String) obj;
                AbstractC16544l.m18094g(it2, "it");
                this.f42413Z.mo877a(it2);
                break;
        }
        return C17296C.f55119a;
    }
}
