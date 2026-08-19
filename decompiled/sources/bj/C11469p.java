package bj;

/* JADX INFO: renamed from: bj.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C11469p extends AbstractC11471r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34682a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC11471r f34683b;

    public /* synthetic */ C11469p(AbstractC11471r abstractC11471r, int i10) {
        this.f34682a = i10;
        this.f34683b = abstractC11471r;
    }

    @Override // bj.AbstractC11471r
    public final Object fromJson(AbstractC11477x abstractC11477x) {
        switch (this.f34682a) {
            case 0:
                return this.f34683b.fromJson(abstractC11477x);
            case 1:
                boolean z6 = abstractC11477x.f34701q0;
                abstractC11477x.f34701q0 = true;
                try {
                    return this.f34683b.fromJson(abstractC11477x);
                } finally {
                    abstractC11477x.f34701q0 = z6;
                }
            default:
                boolean z10 = abstractC11477x.f34702r0;
                abstractC11477x.f34702r0 = true;
                try {
                    return this.f34683b.fromJson(abstractC11477x);
                } finally {
                    abstractC11477x.f34702r0 = z10;
                }
        }
    }

    @Override // bj.AbstractC11471r
    public final boolean isLenient() {
        switch (this.f34682a) {
            case 0:
                return this.f34683b.isLenient();
            case 1:
                return true;
            default:
                return this.f34683b.isLenient();
        }
    }

    @Override // bj.AbstractC11471r
    public final void toJson(AbstractC11440E abstractC11440E, Object obj) {
        switch (this.f34682a) {
            case 0:
                boolean z6 = abstractC11440E.f34577s0;
                abstractC11440E.f34577s0 = true;
                try {
                    this.f34683b.toJson(abstractC11440E, obj);
                    return;
                } finally {
                    abstractC11440E.f34577s0 = z6;
                }
            case 1:
                boolean z10 = abstractC11440E.f34576r0;
                abstractC11440E.f34576r0 = true;
                try {
                    this.f34683b.toJson(abstractC11440E, obj);
                    return;
                } finally {
                    abstractC11440E.f34576r0 = z10;
                }
            default:
                this.f34683b.toJson(abstractC11440E, obj);
                return;
        }
    }

    public final String toString() {
        switch (this.f34682a) {
            case 0:
                return this.f34683b + ".serializeNulls()";
            case 1:
                return this.f34683b + ".lenient()";
            default:
                return this.f34683b + ".failOnUnknown()";
        }
    }
}
