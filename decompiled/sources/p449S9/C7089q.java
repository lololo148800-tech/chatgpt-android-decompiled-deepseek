package p449S9;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: S9.q */
/* JADX INFO: loaded from: classes.dex */
public final class C7089q extends AbstractC7085o {

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C7091r f22572p0;

    public C7089q(C7091r c7091r) {
        this.f22572p0 = c7091r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f22572p0.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // p449S9.AbstractC7085o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC7057a.m7457b(this.f22572p0.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo7429s().listIterator(0);
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: m */
    public final AbstractC7036E mo7428m() {
        return mo7429s().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22572p0.f22576p0.size();
    }

    @Override // p449S9.AbstractC7085o
    /* JADX INFO: renamed from: t */
    public final AbstractC7081m mo7497t() {
        return new C7087p(this);
    }
}
