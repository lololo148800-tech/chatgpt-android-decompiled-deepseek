package p325Mo;

import java.util.ArrayList;
import p027Ap.C0693a;
import p078Co.InterfaceC1760b;
import p523V9.AbstractC8038Z3;
import p544W9.AbstractC8525N3;
import p571X9.AbstractC9168M;
import p571X9.AbstractC9174N;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Mo.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5558b implements InterfaceC1760b {

    /* JADX INFO: renamed from: b */
    public static final C5558b f18015b = new C5558b(0);

    /* JADX INFO: renamed from: c */
    public static final C5558b f18016c = new C5558b(1);

    /* JADX INFO: renamed from: d */
    public static final C5558b f18017d = new C5558b(2);

    /* JADX INFO: renamed from: e */
    public static final C5558b f18018e = new C5558b(3);

    /* JADX INFO: renamed from: f */
    public static final C5558b f18019f = new C5558b(4);

    /* JADX INFO: renamed from: g */
    public static final C5558b f18020g = new C5558b(5);

    /* JADX INFO: renamed from: h */
    public static final C5558b f18021h = new C5558b(6);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18022a;

    public /* synthetic */ C5558b(int i10) {
        this.f18022a = i10;
    }

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        switch (this.f18022a) {
            case 0:
                return AbstractC8525N3.m9190a(C5557a.f18010Z, AbstractC9174N.m9730b(obj));
            case 1:
                ArrayList arrayListM9722d = AbstractC9168M.m9722d(obj);
                if (arrayListM9722d.size() < 2) {
                    arrayListM9722d = null;
                }
                if (arrayListM9722d == null) {
                    return null;
                }
                Double d10 = (Double) arrayListM9722d.get(1);
                Double d11 = (Double) AbstractC17680n.m19341Q(arrayListM9722d);
                if (d11 == null || d10 == null || d10.doubleValue() == 0.0d) {
                    return null;
                }
                return Double.valueOf(d11.doubleValue() / d10.doubleValue());
            case 2:
                return AbstractC8525N3.m9190a(C5557a.f18011o0, obj);
            case 3:
                return AbstractC8525N3.m9190a(C5557a.f18012p0, obj);
            case 4:
                ArrayList arrayListM9722d2 = AbstractC9168M.m9722d(obj);
                if (arrayListM9722d2.size() < 2) {
                    arrayListM9722d2 = null;
                }
                if (arrayListM9722d2 == null) {
                    return null;
                }
                Double d12 = (Double) arrayListM9722d2.get(1);
                Double d13 = (Double) AbstractC17680n.m19341Q(arrayListM9722d2);
                if (d13 == null || d12 == null || d12.doubleValue() == 0.0d) {
                    return null;
                }
                return Double.valueOf(d13.doubleValue() % d12.doubleValue());
            case 5:
                C0693a c0693aM8396e = AbstractC8038Z3.m8396e(obj);
                int size = c0693aM8396e.f2015Y.size();
                if (size == 0) {
                    return null;
                }
                if (size == 1) {
                    return AbstractC17680n.m19341Q(c0693aM8396e);
                }
                return AbstractC8525N3.m9190a(C5557a.f18013q0, AbstractC9174N.m9730b(obj));
            default:
                ArrayList arrayListM9722d3 = AbstractC9168M.m9722d(obj);
                int size2 = arrayListM9722d3.size();
                if (size2 == 0) {
                    return null;
                }
                if (size2 == 1) {
                    Double d14 = (Double) AbstractC17680n.m19341Q(arrayListM9722d3);
                    if (d14 != null) {
                        return Double.valueOf(-d14.doubleValue());
                    }
                    return null;
                }
                Double d15 = (Double) AbstractC17680n.m19341Q(arrayListM9722d3);
                Double d16 = (Double) arrayListM9722d3.get(1);
                if (d15 == null || d16 == null) {
                    return null;
                }
                return Double.valueOf(d15.doubleValue() - d16.doubleValue());
        }
    }
}
