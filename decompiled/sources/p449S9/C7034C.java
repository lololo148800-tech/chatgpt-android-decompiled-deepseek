package p449S9;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.Iterator;

/* JADX INFO: renamed from: S9.C */
/* JADX INFO: loaded from: classes.dex */
public final class C7034C extends AbstractC7085o {

    /* JADX INFO: renamed from: p0 */
    public final transient Object f22489p0;

    public C7034C(Object obj) {
        this.f22489p0 = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f22489p0.equals(obj);
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: f */
    public final int mo7427f(Object[] objArr) {
        objArr[0] = this.f22489p0;
        return 1;
    }

    @Override // p449S9.AbstractC7085o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f22489p0.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C7094t(this.f22489p0);
    }

    @Override // p449S9.AbstractC7071h
    /* JADX INFO: renamed from: m */
    public final AbstractC7036E mo7428m() {
        return new C7094t(this.f22489p0);
    }

    @Override // p449S9.AbstractC7085o
    /* JADX INFO: renamed from: s */
    public final AbstractC7081m mo7429s() {
        Object[] objArr = {this.f22489p0};
        for (int i10 = 0; i10 < 1; i10++) {
            C7073i c7073i = AbstractC7081m.f22562Z;
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC10763a.m11048f(i10, "at index "));
            }
        }
        return AbstractC7081m.m7491s(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC10763a.m11054l("[", this.f22489p0.toString(), "]");
    }
}
