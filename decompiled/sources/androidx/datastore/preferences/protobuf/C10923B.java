package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p817j$.util.DesugarCollections;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.B */
/* JADX INFO: loaded from: classes.dex */
public final class C10923B extends AbstractC10949b implements InterfaceC10924C, RandomAccess {

    /* JADX INFO: renamed from: Z */
    public final ArrayList f32965Z;

    static {
        new C10923B(10).f33013Y = false;
    }

    public C10923B(int i10) {
        this(new ArrayList(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        m11524f();
        this.f32965Z.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10949b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f32965Z.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10991w
    /* JADX INFO: renamed from: b */
    public final InterfaceC10991w mo11431b(int i10) {
        ArrayList arrayList = this.f32965Z;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new C10923B(arrayList2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10949b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m11524f();
        this.f32965Z.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10924C
    /* JADX INFO: renamed from: d */
    public final Object mo11432d(int i10) {
        return this.f32965Z.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f32965Z;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C10957f) {
            C10957f c10957f = (C10957f) obj;
            c10957f.getClass();
            Charset charset = AbstractC10993x.f33099a;
            if (c10957f.size() == 0) {
                str = "";
            } else {
                str = new String(c10957f.f33031Z, c10957f.m11581i(), c10957f.size(), charset);
            }
            int iM11581i = c10957f.m11581i();
            if (AbstractC10988u0.f33098a.mo11472j(c10957f.f33031Z, iM11581i, c10957f.size() + iM11581i) == 0) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC10993x.f33099a);
            AbstractC10937P abstractC10937P = AbstractC10988u0.f33098a;
            if (AbstractC10988u0.f33098a.mo11472j(bArr, 0, bArr.length) == 0) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10924C
    public final List getUnderlyingElements() {
        return DesugarCollections.unmodifiableList(this.f32965Z);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10924C
    public final InterfaceC10924C getUnmodifiableView() {
        return this.f33013Y ? new C10972m0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC10924C
    /* JADX INFO: renamed from: l */
    public final void mo11433l(C10957f c10957f) {
        m11524f();
        this.f32965Z.add(c10957f);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m11524f();
        Object objRemove = this.f32965Z.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof C10957f)) {
            return new String((byte[]) objRemove, AbstractC10993x.f33099a);
        }
        C10957f c10957f = (C10957f) objRemove;
        c10957f.getClass();
        Charset charset = AbstractC10993x.f33099a;
        if (c10957f.size() == 0) {
            return "";
        }
        return new String(c10957f.f33031Z, c10957f.m11581i(), c10957f.size(), charset);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m11524f();
        Object obj2 = this.f32965Z.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof C10957f)) {
            return new String((byte[]) obj2, AbstractC10993x.f33099a);
        }
        C10957f c10957f = (C10957f) obj2;
        c10957f.getClass();
        Charset charset = AbstractC10993x.f33099a;
        if (c10957f.size() == 0) {
            return "";
        }
        return new String(c10957f.f33031Z, c10957f.m11581i(), c10957f.size(), charset);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32965Z.size();
    }

    public C10923B(ArrayList arrayList) {
        this.f32965Z = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC10949b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        m11524f();
        if (collection instanceof InterfaceC10924C) {
            collection = ((InterfaceC10924C) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.f32965Z.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }
}
