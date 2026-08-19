package p594Y9;

import java.util.Iterator;

/* JADX INFO: renamed from: Y9.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9711D implements Iterator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29241Y;

    /* JADX INFO: renamed from: Z */
    public final Iterator f29242Z;

    public AbstractC9711D(Iterator it, int i10) {
        this.f29241Y = i10;
        switch (i10) {
            case 1:
                it.getClass();
                this.f29242Z = it;
                break;
            default:
                it.getClass();
                this.f29242Z = it;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo10305a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract Object mo10306b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f29241Y) {
            case 0:
                break;
        }
        return this.f29242Z.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f29241Y) {
            case 0:
                return mo10306b(this.f29242Z.next());
            default:
                return mo10305a(this.f29242Z.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f29241Y) {
            case 0:
                this.f29242Z.remove();
                break;
            default:
                this.f29242Z.remove();
                break;
        }
    }
}
