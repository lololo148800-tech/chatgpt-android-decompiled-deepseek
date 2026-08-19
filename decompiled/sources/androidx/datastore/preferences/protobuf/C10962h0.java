package androidx.datastore.preferences.protobuf;

import com.google.protobuf.C12140b1;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import p692d0.C12964c;
import p692d0.C12966e;
import p732en.C13447d;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h0 */
/* JADX INFO: loaded from: classes.dex */
public class C10962h0 extends AbstractSet {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f33050Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Map f33051Z;

    public /* synthetic */ C10962h0(int i10, Map map) {
        this.f33050Y = i10;
        this.f33051Z = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f33050Y) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C10952c0) this.f33051Z).m11578f((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((C12140b1) this.f33051Z).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 2:
            default:
                return super.add(obj);
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((C13447d) this.f33051Z).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f33050Y) {
            case 0:
                ((C10952c0) this.f33051Z).clear();
                break;
            case 1:
                ((C12140b1) this.f33051Z).clear();
                break;
            case 2:
            default:
                super.clear();
                break;
            case 3:
                ((C13447d) this.f33051Z).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f33050Y) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C10952c0) this.f33051Z).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((C12140b1) this.f33051Z).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj3 == value2 || (obj3 != null && obj3.equals(value2));
            case 2:
            default:
                return super.contains(obj);
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj4 = ((C13447d) this.f33051Z).get(entry3.getKey());
                Object value3 = entry3.getValue();
                return obj4 == value3 || (obj4 != null && obj4.equals(value3));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f33050Y) {
            case 0:
                return new C10960g0((C10952c0) this.f33051Z, 0);
            case 1:
                return new C10960g0((C12140b1) this.f33051Z, 1);
            case 2:
                return new C12964c((C12966e) this.f33051Z);
            default:
                return new C10960g0((C13447d) this.f33051Z, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f33050Y) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C10952c0) this.f33051Z).remove(entry.getKey());
                return true;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((C12140b1) this.f33051Z).remove(entry2.getKey());
                return true;
            case 2:
            default:
                return super.remove(obj);
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((C13447d) this.f33051Z).remove(entry3.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f33050Y) {
            case 0:
                return ((C10952c0) this.f33051Z).size();
            case 1:
                return ((C12140b1) this.f33051Z).size();
            case 2:
                return ((C12966e) this.f33051Z).f41154o0;
            default:
                return ((C13447d) this.f33051Z).size();
        }
    }
}
