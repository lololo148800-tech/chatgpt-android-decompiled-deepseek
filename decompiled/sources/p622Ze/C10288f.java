package p622Ze;

import bf.C11391s;
import bf.C11398z;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC3959O0;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p229J0.C3949M0;
import p349O0.C6021p;

/* JADX INFO: renamed from: Ze.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C10288f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30560Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11391s f30561Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10288f(C11391s c11391s, int i10) {
        super(2);
        this.f30560Y = i10;
        this.f30561Z = c11391s;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C11398z c11398z;
        C11398z c11398z2;
        switch (this.f30560Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    C11391s c11391s = this.f30561Z;
                    String str = (c11391s == null || (c11398z = c11391s.f34417c) == null) ? null : c11398z.f34426b;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p, 0, 0, 131070);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    C11391s c11391s2 = this.f30561Z;
                    String str2 = (c11391s2 == null || (c11398z2 = c11391s2.f34417c) == null) ? null : c11398z2.f34426b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    AbstractC4124r4.m4768b(str2, null, ((C3949M0) c6021p2.m6548k(AbstractC3959O0.f12302a)).f12213a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12153i, c6021p2, 0, 0, 65530);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
