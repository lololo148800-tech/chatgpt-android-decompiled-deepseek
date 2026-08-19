package p281L3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import p1016t3.C19768S;
import p1073w3.AbstractC20817s;
import p232J3.C4227a0;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: L3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C4922i extends C19768S {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ int f16046A = 0;

    /* JADX INFO: renamed from: r */
    public final boolean f16047r;

    /* JADX INFO: renamed from: s */
    public final boolean f16048s;

    /* JADX INFO: renamed from: t */
    public final boolean f16049t;

    /* JADX INFO: renamed from: u */
    public final boolean f16050u;

    /* JADX INFO: renamed from: v */
    public final boolean f16051v;

    /* JADX INFO: renamed from: w */
    public final boolean f16052w;

    /* JADX INFO: renamed from: x */
    public final boolean f16053x;

    /* JADX INFO: renamed from: y */
    public final SparseArray f16054y;

    /* JADX INFO: renamed from: z */
    public final SparseBooleanArray f16055z;

    static {
        new C4922i(new C4921h());
        AbstractC20817s.m21425z(1000);
        AbstractC20817s.m21425z(1001);
        AbstractC20817s.m21425z(1002);
        AbstractC20817s.m21425z(1003);
        AbstractC17792x.m19540w(1004, 1005, 1006, 1007, 1008);
        AbstractC17792x.m19540w(1009, 1010, 1011, 1012, 1013);
        AbstractC17792x.m19540w(1014, 1015, 1016, 1017, 1018);
    }

    public C4922i(C4921h c4921h) {
        super(c4921h);
        this.f16047r = c4921h.f16037r;
        this.f16048s = c4921h.f16038s;
        this.f16049t = c4921h.f16039t;
        this.f16050u = c4921h.f16040u;
        this.f16051v = c4921h.f16041v;
        this.f16052w = c4921h.f16042w;
        this.f16053x = c4921h.f16043x;
        this.f16054y = c4921h.f16044y;
        this.f16055z = c4921h.f16045z;
    }

    @Override // p1016t3.C19768S
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4922i.class != obj.getClass()) {
            return false;
        }
        C4922i c4922i = (C4922i) obj;
        if (super.equals(c4922i) && this.f16047r == c4922i.f16047r && this.f16048s == c4922i.f16048s && this.f16049t == c4922i.f16049t && this.f16050u == c4922i.f16050u && this.f16051v == c4922i.f16051v && this.f16052w == c4922i.f16052w && this.f16053x == c4922i.f16053x) {
            SparseBooleanArray sparseBooleanArray = this.f16055z;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = c4922i.f16055z;
            if (sparseBooleanArray2.size() == size) {
                for (int i10 = 0; i10 < size; i10++) {
                    if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) >= 0) {
                    }
                }
                SparseArray sparseArray = this.f16054y;
                int size2 = sparseArray.size();
                SparseArray sparseArray2 = c4922i.f16054y;
                if (sparseArray2.size() == size2) {
                    for (int i11 = 0; i11 < size2; i11++) {
                        int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                        if (iIndexOfKey >= 0) {
                            Map map = (Map) sparseArray.valueAt(i11);
                            Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                            if (map2.size() == map.size()) {
                                for (Map.Entry entry : map.entrySet()) {
                                    C4227a0 c4227a0 = (C4227a0) entry.getKey();
                                    if (!map2.containsKey(c4227a0) || !AbstractC20817s.m21400a(entry.getValue(), map2.get(c4227a0))) {
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p1016t3.C19768S
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f16047r ? 1 : 0)) * 961) + (this.f16048s ? 1 : 0)) * 961) + (this.f16049t ? 1 : 0)) * 28629151) + (this.f16050u ? 1 : 0)) * 31) + (this.f16051v ? 1 : 0)) * 31) + (this.f16052w ? 1 : 0)) * 961) + (this.f16053x ? 1 : 0)) * 31;
    }
}
