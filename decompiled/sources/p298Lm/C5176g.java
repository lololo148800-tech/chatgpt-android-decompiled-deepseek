package p298Lm;

import java.lang.reflect.Method;
import java.util.Comparator;
import p165G9.AbstractC3021g;
import p225Im.InterfaceC3767o;

/* JADX INFO: renamed from: Lm.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C5176g implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f16856Y;

    public /* synthetic */ C5176g(int i10) {
        this.f16856Y = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16856Y) {
            case 0:
                return AbstractC3021g.m3873a(((Method) obj).getName(), ((Method) obj2).getName());
            case 1:
                return AbstractC3021g.m3873a(((C5171d0) ((InterfaceC3767o) obj)).getName(), ((C5171d0) ((InterfaceC3767o) obj2)).getName());
            default:
                return ((Number) C5138F.f16775Y.invoke(obj, obj2)).intValue();
        }
    }
}
