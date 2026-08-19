package p523V9;

import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;
import p732en.C13445b;

/* JADX INFO: renamed from: V9.F */
/* JADX INFO: loaded from: classes.dex */
public final class C7880F implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24798Y;

    /* JADX INFO: renamed from: Z */
    public Iterator f24799Z;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f24798Y) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f24799Z.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f24798Y) {
            case 0:
                return ((Map.Entry) this.f24799Z.next()).getValue();
            case 1:
                return ((Map.Entry) this.f24799Z.next()).getValue();
            case 2:
                Map.Entry entry = (Map.Entry) this.f24799Z.next();
                if (!(entry.getValue() instanceof LazyField)) {
                    return entry;
                }
                C13445b c13445b = new C13445b();
                c13445b.f42570Y = entry;
                return c13445b;
            default:
                return (String) this.f24799Z.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f24798Y) {
            case 0:
                this.f24799Z.remove();
                return;
            case 1:
                this.f24799Z.remove();
                return;
            case 2:
                this.f24799Z.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C7880F(Iterator it, int i10) {
        this.f24798Y = i10;
        switch (i10) {
            case 1:
                it.getClass();
                this.f24799Z = it;
                break;
            default:
                it.getClass();
                this.f24799Z = it;
                break;
        }
    }
}
