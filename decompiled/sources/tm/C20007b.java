package tm;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17671e;
import p909nm.AbstractC17678l;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: tm.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20007b extends AbstractC17671e implements InterfaceC20006a, Serializable {

    /* JADX INFO: renamed from: Y */
    public final Enum[] f63325Y;

    public C20007b(Enum[] entries) {
        AbstractC16544l.m18094g(entries, "entries");
        this.f63325Y = entries;
    }

    @Override // p909nm.AbstractC17667a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        AbstractC16544l.m18094g(element, "element");
        return ((Enum) AbstractC17678l.m19278A(element.ordinal(), this.f63325Y)) == element;
    }

    @Override // p909nm.AbstractC17667a
    /* JADX INFO: renamed from: f */
    public final int mo1316f() {
        return this.f63325Y.length;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Enum[] enumArr = this.f63325Y;
        int length = enumArr.length;
        if (i10 < 0 || i10 >= length) {
            throw new IndexOutOfBoundsException(AbstractC17792x.m19534q("index: ", i10, length, ", size: "));
        }
        return enumArr[i10];
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        AbstractC16544l.m18094g(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC17678l.m19278A(iOrdinal, this.f63325Y)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p909nm.AbstractC17671e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        AbstractC16544l.m18094g(element, "element");
        return indexOf(element);
    }
}
