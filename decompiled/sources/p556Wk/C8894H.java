package p556Wk;

import java.nio.charset.Charset;
import java.util.Comparator;
import mm.C17309l;
import p165G9.AbstractC3021g;
import p523V9.AbstractC8112i6;

/* JADX INFO: renamed from: Wk.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C8894H implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27222Y;

    public /* synthetic */ C8894H(int i10) {
        this.f27222Y = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f27222Y) {
            case 0:
                return AbstractC3021g.m3873a(AbstractC8112i6.m8606d((Charset) obj), AbstractC8112i6.m8606d((Charset) obj2));
            default:
                return AbstractC3021g.m3873a((Float) ((C17309l) obj2).f55137Z, (Float) ((C17309l) obj).f55137Z);
        }
    }
}
