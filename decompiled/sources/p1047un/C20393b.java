package p1047un;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1014t1.C19742s;

/* JADX INFO: renamed from: un.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C20393b implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f64500Y = 1;

    /* JADX INFO: renamed from: Z */
    public Object f64501Z;

    public /* synthetic */ C20393b() {
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f64500Y) {
            case 0:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                return Integer.valueOf(((TypeRegistry) this.f64501Z).f53303b.getAndIncrement());
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C19742s c19742s = (C19742s) this.f64501Z;
                if (c19742s != null) {
                    c19742s.f62509o0 = zBooleanValue;
                }
                return C17296C.f55119a;
        }
    }

    public C20393b(TypeRegistry typeRegistry) {
        this.f64501Z = typeRegistry;
    }
}
