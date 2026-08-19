package p364Oh;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p138F8.vJO.vRJidSveZHcTw;
import p571X9.AbstractC9150J;
import p917o6.C17872y;

/* JADX INFO: renamed from: Oh.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6229c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C6229c f20287Z = new C6229c(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C6229c f20288o0 = new C6229c(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C6229c f20289p0 = new C6229c(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C6229c f20290q0 = new C6229c(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20291Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6229c(int i10, int i11) {
        super(i10);
        this.f20291Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f20291Y) {
            case 0:
                C17872y it = (C17872y) obj;
                AbstractC16544l.m18094g(it, "it");
                return it.f56969a;
            case 1:
                AbstractC6224C it2 = (AbstractC6224C) obj;
                AbstractC16544l.m18094g(it2, "it");
                return Boolean.valueOf(AbstractC9150J.m9696a(it2));
            case 2:
                AbstractC16544l.m18094g((AbstractC6224C) obj, "it");
                return C17296C.f55119a;
            default:
                String str = (String) obj;
                AbstractC16544l.m18094g(str, vRJidSveZHcTw.DGhHvQGO);
                List list = AbstractC6241o.f20323e;
                boolean z6 = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC21322p.m21667A(str, (String) it3.next(), false)) {
                            z6 = true;
                        }
                    }
                }
                return Boolean.valueOf(z6);
        }
    }
}
