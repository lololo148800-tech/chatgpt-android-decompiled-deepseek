package p817j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* JADX INFO: renamed from: j$.util.c */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15679c implements Comparator, Serializable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48874a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Comparator f48875b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f48876c;

    public /* synthetic */ C15679c(Comparator comparator, Object obj, int i10) {
        this.f48874a = i10;
        this.f48875b = comparator;
        this.f48876c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f48874a) {
            case 0:
                int iCompare = this.f48875b.compare(obj, obj2);
                return iCompare != 0 ? iCompare : ((Comparator) this.f48876c).compare(obj, obj2);
            default:
                Function function = (Function) this.f48876c;
                return this.f48875b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
