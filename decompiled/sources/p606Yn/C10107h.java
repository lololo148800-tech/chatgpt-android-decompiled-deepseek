package p606Yn;

import ao.C11200y;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.C0742X;
import p049Bm.InterfaceC1426a;
import p076Cm.InterfaceC1723a;
import p1091wn.InterfaceC21029j;
import p909nm.C17656A;

/* JADX INFO: renamed from: Yn.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C10107h implements Iterable, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29931Y;

    /* JADX INFO: renamed from: Z */
    public final Object f29932Z;

    public /* synthetic */ C10107h(Object obj, int i10) {
        this.f29931Y = i10;
        this.f29932Z = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f29931Y) {
            case 0:
                return new C0742X((C11200y) this.f29932Z);
            case 1:
                return AbstractC16544l.m18098k((Object[]) this.f29932Z);
            case 2:
                return new C17656A((Iterator) ((InterfaceC1426a) this.f29932Z).invoke());
            default:
                return ((InterfaceC21029j) this.f29932Z).iterator();
        }
    }
}
