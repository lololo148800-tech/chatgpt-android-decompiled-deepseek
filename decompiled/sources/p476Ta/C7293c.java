package p476Ta;

import ba.C11272d;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17312o;
import p025An.C0624m;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Ta.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7293c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23100Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0624m f23101Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7293c(C0624m c0624m, int i10) {
        super(1);
        this.f23100Y = i10;
        this.f23101Z = c0624m;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f23100Y) {
            case 0:
                this.f23101Z.resumeWith(obj);
                break;
            default:
                this.f23101Z.resumeWith(new C17312o((C11272d) obj));
                break;
        }
        return C17296C.f55119a;
    }
}
