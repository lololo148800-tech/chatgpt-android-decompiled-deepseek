package p143Fd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import p040Bd.C1075e4;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p479Td.C7351f0;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Fd.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2712b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C2712b f8349Z = new C2712b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C2712b f8350o0 = new C2712b(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C2712b f8351p0 = new C2712b(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C2712b f8352q0 = new C2712b(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f8353Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2712b(int i10, int i11) {
        super(i10);
        this.f8353Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        String strMo12922f;
        switch (this.f8353Y) {
            case 0:
                AbstractC16643b it = (AbstractC16643b) obj;
                AbstractC16544l.m18094g(it, "it");
                AbstractC16645d abstractC16645d = it instanceof AbstractC16645d ? (AbstractC16645d) it : null;
                return (abstractC16645d == null || (strMo12922f = abstractC16645d.mo12922f()) == null) ? it.toString() : strMo12922f;
            case 1:
                String line = (String) obj;
                AbstractC16544l.m18094g(line, "line");
                int iM21678L = AbstractC21322p.m21678L(line, '#', 0, false, 6);
                if (iM21678L == -1) {
                    return null;
                }
                String string = AbstractC21322p.m21711s0(AbstractC21322p.m21669C(iM21678L + 1, line)).toString();
                if (AbstractC21322p.m21681O(string)) {
                    return null;
                }
                return string;
            case 2:
                C7351f0 it2 = (C7351f0) obj;
                AbstractC16544l.m18094g(it2, "it");
                List list = it2.f23308w;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((C1075e4) it3.next()).f2927a);
                }
                return arrayList;
            default:
                C7351f0 it4 = (C7351f0) obj;
                AbstractC16544l.m18094g(it4, "it");
                return it4.f23307v;
        }
    }
}
