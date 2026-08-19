package androidx.datastore.preferences.protobuf;

import com.google.protobuf.C12140b1;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import p732en.C13447d;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10960g0 implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f33045Y;

    /* JADX INFO: renamed from: Z */
    public int f33046Z = -1;

    /* JADX INFO: renamed from: o0 */
    public boolean f33047o0;

    /* JADX INFO: renamed from: p0 */
    public Iterator f33048p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractMap f33049q0;

    public /* synthetic */ C10960g0(AbstractMap abstractMap, int i10) {
        this.f33045Y = i10;
        this.f33049q0 = abstractMap;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m11615a() {
        switch (this.f33045Y) {
            case 0:
                if (this.f33048p0 == null) {
                    this.f33048p0 = ((C10952c0) this.f33049q0).f33023o0.entrySet().iterator();
                }
                break;
            case 1:
                if (this.f33048p0 == null) {
                    this.f33048p0 = ((C12140b1) this.f33049q0).f37017o0.entrySet().iterator();
                }
                break;
            default:
                if (this.f33048p0 == null) {
                    this.f33048p0 = ((C13447d) this.f33049q0).f42581o0.entrySet().iterator();
                }
                break;
        }
        return this.f33048p0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f33045Y) {
            case 0:
                int i10 = this.f33046Z + 1;
                C10952c0 c10952c0 = (C10952c0) this.f33049q0;
                if (i10 >= c10952c0.f33022Z.size()) {
                    return !c10952c0.f33023o0.isEmpty() && m11615a().hasNext();
                }
                return true;
            case 1:
                int i11 = this.f33046Z + 1;
                C12140b1 c12140b1 = (C12140b1) this.f33049q0;
                if (i11 >= c12140b1.f37016Z.size()) {
                    return !c12140b1.f37017o0.isEmpty() && m11615a().hasNext();
                }
                return true;
            default:
                return this.f33046Z + 1 < ((C13447d) this.f33049q0).f42580Z.size() || m11615a().hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f33045Y) {
            case 0:
                this.f33047o0 = true;
                int i10 = this.f33046Z + 1;
                this.f33046Z = i10;
                C10952c0 c10952c0 = (C10952c0) this.f33049q0;
                return i10 < c10952c0.f33022Z.size() ? (Map.Entry) c10952c0.f33022Z.get(this.f33046Z) : (Map.Entry) m11615a().next();
            case 1:
                this.f33047o0 = true;
                int i11 = this.f33046Z + 1;
                this.f33046Z = i11;
                C12140b1 c12140b1 = (C12140b1) this.f33049q0;
                return i11 < c12140b1.f37016Z.size() ? (Map.Entry) c12140b1.f37016Z.get(this.f33046Z) : (Map.Entry) m11615a().next();
            default:
                this.f33047o0 = true;
                int i12 = this.f33046Z + 1;
                this.f33046Z = i12;
                C13447d c13447d = (C13447d) this.f33049q0;
                return i12 < c13447d.f42580Z.size() ? (Map.Entry) c13447d.f42580Z.get(this.f33046Z) : (Map.Entry) m11615a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f33049q0;
        switch (this.f33045Y) {
            case 0:
                if (!this.f33047o0) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f33047o0 = false;
                int i10 = C10952c0.f33020s0;
                C10952c0 c10952c0 = (C10952c0) abstractMap;
                c10952c0.m11574b();
                if (this.f33046Z >= c10952c0.f33022Z.size()) {
                    m11615a().remove();
                    return;
                }
                int i11 = this.f33046Z;
                this.f33046Z = i11 - 1;
                c10952c0.m11579g(i11);
                return;
            case 1:
                if (!this.f33047o0) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f33047o0 = false;
                int i12 = C12140b1.f37014s0;
                C12140b1 c12140b1 = (C12140b1) abstractMap;
                c12140b1.m13930b();
                if (this.f33046Z >= c12140b1.f37016Z.size()) {
                    m11615a().remove();
                    return;
                }
                int i13 = this.f33046Z;
                this.f33046Z = i13 - 1;
                c12140b1.m13935g(i13);
                return;
            default:
                if (!this.f33047o0) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f33047o0 = false;
                int i14 = C13447d.f42578r0;
                C13447d c13447d = (C13447d) abstractMap;
                c13447d.m14970b();
                if (this.f33046Z >= c13447d.f42580Z.size()) {
                    m11615a().remove();
                    return;
                }
                int i15 = this.f33046Z;
                this.f33046Z = i15 - 1;
                c13447d.m14974f(i15);
                return;
        }
    }
}
