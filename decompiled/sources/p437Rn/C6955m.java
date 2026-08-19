package p437Rn;

import java.util.Comparator;
import mm.C17309l;
import p165G9.AbstractC3021g;

/* JADX INFO: renamed from: Rn.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C6955m implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22252Y;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f22252Y) {
            case 0:
                return AbstractC3021g.m3873a(Integer.valueOf(((C6952j) obj2).f22247a), Integer.valueOf(((C6952j) obj).f22247a));
            default:
                return AbstractC3021g.m3873a((String) ((C17309l) obj).f55136Y, (String) ((C17309l) obj2).f55136Y);
        }
    }
}
