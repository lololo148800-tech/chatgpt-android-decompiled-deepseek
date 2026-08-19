package p748fc;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: fc.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13612d implements Comparator {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ C13612d f43002Y = new C13612d();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
    }
}
