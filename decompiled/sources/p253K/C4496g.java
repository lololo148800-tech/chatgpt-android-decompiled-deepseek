package p253K;

import java.util.Enumeration;
import java.util.HashMap;

/* JADX INFO: renamed from: K.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4496g implements Enumeration {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14667a;

    /* JADX INFO: renamed from: b */
    public int f14668b;

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        switch (this.f14667a) {
            case 0:
                int i10 = this.f14668b;
                C4501l[] c4501lArr = C4499j.f14676c;
                return i10 < 4;
            default:
                int i11 = this.f14668b;
                C4501l[] c4501lArr2 = C4499j.f14676c;
                return i11 < 4;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f14667a) {
            case 0:
                HashMap map = new HashMap();
                for (C4501l c4501l : C4499j.f14677d[this.f14668b]) {
                    map.put(c4501l.f14689b, c4501l);
                }
                this.f14668b++;
                return map;
            default:
                this.f14668b++;
                return new HashMap();
        }
    }
}
