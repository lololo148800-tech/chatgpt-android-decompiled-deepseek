package p769gj;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;

/* JADX INFO: renamed from: gj.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C14171m extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f44554Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC14170l f44555Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14171m(InterfaceC14170l interfaceC14170l, int i10) {
        super(2);
        this.f44554Y = i10;
        this.f44555Z = interfaceC14170l;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object rendering, Object obj) {
        switch (this.f44554Y) {
            case 0:
                C14183y environment = (C14183y) obj;
                AbstractC16544l.m18094g(rendering, "rendering");
                AbstractC16544l.m18094g(environment, "environment");
                this.f44555Z.mo1133a(rendering, environment);
                break;
            default:
                C14183y environment2 = (C14183y) obj;
                AbstractC16544l.m18094g(rendering, "rendering");
                AbstractC16544l.m18094g(environment2, "environment");
                this.f44555Z.mo1133a(rendering, environment2);
                break;
        }
        return C17296C.f55119a;
    }
}
