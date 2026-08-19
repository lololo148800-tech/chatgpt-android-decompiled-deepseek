package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p076Cm.InterfaceC1723a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractArrayMapOwner<K, V> implements Iterable<V>, InterfaceC1723a {

    public static abstract class AbstractArrayMapAccessor<K, V, T extends V> {

        /* JADX INFO: renamed from: a */
        public final int f53280a;

        public AbstractArrayMapAccessor(int i10) {
            this.f53280a = i10;
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract ArrayMap mo18443f();

    public final boolean isEmpty() {
        return mo18443f().getSize() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return mo18443f().iterator();
    }

    /* JADX INFO: renamed from: j */
    public abstract TypeAttributes.Companion mo18424j();
}
