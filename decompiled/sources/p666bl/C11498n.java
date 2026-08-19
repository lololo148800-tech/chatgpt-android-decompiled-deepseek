package p666bl;

import java.util.Comparator;
import java.util.Map;
import p165G9.AbstractC3021g;

/* JADX INFO: renamed from: bl.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C11498n implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return AbstractC3021g.m3873a((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
    }
}
