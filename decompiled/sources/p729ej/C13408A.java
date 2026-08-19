package p729ej;

import mm.C17296C;
import p025An.C0624m;
import p035B7.C0846c;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: ej.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C13408A extends AbstractC13431v {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42474a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42475b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42476c;

    public /* synthetic */ C13408A(Object obj, int i10, Object obj2) {
        this.f42474a = i10;
        this.f42475b = obj;
        this.f42476c = obj2;
    }

    @Override // p729ej.AbstractC13431v
    /* JADX INFO: renamed from: a */
    public final void mo14950a(C13430u c13430u) {
        switch (this.f42474a) {
            case 0:
                C0624m c0624m = (C0624m) this.f42476c;
                if (c0624m.m1266w()) {
                    ((AbstractC13431v) this.f42475b).mo14950a(c13430u);
                    c0624m.resumeWith(C17296C.f55119a);
                    break;
                }
                break;
            default:
                ((InterfaceC1436k) this.f42475b).invoke(c13430u);
                break;
        }
    }

    public final String toString() {
        switch (this.f42474a) {
            case 0:
                return "sendAndAwaitApplication(" + ((AbstractC13431v) this.f42475b) + ')';
            default:
                return "WorkflowAction(" + ((C0846c) this.f42476c).f2358Z + ")@" + hashCode();
        }
    }
}
