package bb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bb.H */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC11283H implements Iterator {

    /* JADX INFO: renamed from: Y */
    public static final EnumC11283H f34173Y;

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ EnumC11283H[] f34174Z;

    static {
        EnumC11283H enumC11283H = new EnumC11283H("INSTANCE", 0);
        f34173Y = enumC11283H;
        f34174Z = new EnumC11283H[]{enumC11283H};
    }

    public static EnumC11283H valueOf(String str) {
        return (EnumC11283H) Enum.valueOf(EnumC11283H.class, str);
    }

    public static EnumC11283H[] values() {
        return (EnumC11283H[]) f34174Z.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
