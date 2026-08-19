package p449S9;

import androidx.datastore.preferences.protobuf.C10957f;
import androidx.glance.appwidget.protobuf.C11042g;
import com.google.android.gms.internal.play_billing.C11929Z0;
import com.google.protobuf.AbstractC12171m;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: S9.V */
/* JADX INFO: loaded from: classes.dex */
public final class C7052V implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22519Y = 0;

    /* JADX INFO: renamed from: Z */
    public int f22520Z = 0;

    /* JADX INFO: renamed from: o0 */
    public final int f22521o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f22522p0;

    public C7052V(C7054X c7054x) {
        this.f22522p0 = c7054x;
        this.f22521o0 = c7054x.mo7448m();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f22519Y) {
            case 0:
                return this.f22520Z < this.f22521o0;
            case 1:
                return this.f22520Z < this.f22521o0;
            case 2:
                return this.f22520Z < this.f22521o0;
            case 3:
                return this.f22520Z < this.f22521o0;
            default:
                return this.f22520Z < this.f22521o0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f22519Y) {
            case 0:
                int i10 = this.f22520Z;
                if (i10 >= this.f22521o0) {
                    throw new NoSuchElementException();
                }
                this.f22520Z = i10 + 1;
                return Byte.valueOf(((C7054X) this.f22522p0).mo7446i(i10));
            case 1:
                int i11 = this.f22520Z;
                if (i11 >= this.f22521o0) {
                    throw new NoSuchElementException();
                }
                this.f22520Z = i11 + 1;
                return Byte.valueOf(((C10957f) this.f22522p0).f33031Z[i11]);
            case 2:
                int i12 = this.f22520Z;
                if (i12 >= this.f22521o0) {
                    throw new NoSuchElementException();
                }
                this.f22520Z = i12 + 1;
                return Byte.valueOf(((C11042g) this.f22522p0).mo12003p(i12));
            case 3:
                int i13 = this.f22520Z;
                if (i13 >= this.f22521o0) {
                    throw new NoSuchElementException();
                }
                this.f22520Z = i13 + 1;
                return Byte.valueOf(((C11929Z0) this.f22522p0).mo13367i(i13));
            default:
                int i14 = this.f22520Z;
                if (i14 >= this.f22521o0) {
                    throw new NoSuchElementException();
                }
                this.f22520Z = i14 + 1;
                return Byte.valueOf(((AbstractC12171m) this.f22522p0).mo14001q(i14));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f22519Y) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C7052V(C11929Z0 c11929z0) {
        this.f22522p0 = c11929z0;
        this.f22521o0 = c11929z0.mo13368j();
    }

    public C7052V(C11042g c11042g) {
        this.f22522p0 = c11042g;
        this.f22521o0 = c11042g.size();
    }

    public C7052V(C10957f c10957f) {
        this.f22522p0 = c10957f;
        this.f22521o0 = c10957f.size();
    }

    public C7052V(AbstractC12171m abstractC12171m) {
        this.f22522p0 = abstractC12171m;
        this.f22521o0 = abstractC12171m.size();
    }
}
