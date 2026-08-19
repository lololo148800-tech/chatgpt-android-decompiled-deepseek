package p466T0;

import java.util.Iterator;
import java.util.Map;
import p415R0.InterfaceC6784b;
import p909nm.AbstractC17675i;

/* JADX INFO: renamed from: T0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7184k extends AbstractC17675i implements InterfaceC6784b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22832Y;

    /* JADX INFO: renamed from: Z */
    public final C7176c f22833Z;

    public /* synthetic */ C7184k(C7176c c7176c, int i10) {
        this.f22832Y = i10;
        this.f22833Z = c7176c;
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f22832Y) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!(entry instanceof Map.Entry)) {
                    return false;
                }
                Object key = entry.getKey();
                C7176c c7176c = this.f22833Z;
                Object obj2 = c7176c.get(key);
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && c7176c.containsKey(entry.getKey());
            default:
                return this.f22833Z.containsKey(obj);
        }
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        switch (this.f22832Y) {
            case 0:
                C7176c c7176c = this.f22833Z;
                c7176c.getClass();
                return c7176c.f22812Z;
            default:
                C7176c c7176c2 = this.f22833Z;
                c7176c2.getClass();
                return c7176c2.f22812Z;
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f22832Y) {
            case 0:
                C7176c c7176c = this.f22833Z;
                AbstractC7188o[] abstractC7188oArr = new AbstractC7188o[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    abstractC7188oArr[i10] = new C7189p(0);
                }
                return new C7185l(c7176c.f22811Y, abstractC7188oArr);
            default:
                C7176c c7176c2 = this.f22833Z;
                AbstractC7188o[] abstractC7188oArr2 = new AbstractC7188o[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    abstractC7188oArr2[i11] = new C7189p(1);
                }
                return new C7185l(c7176c2.f22811Y, abstractC7188oArr2);
        }
    }
}
