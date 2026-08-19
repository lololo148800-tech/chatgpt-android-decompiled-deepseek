package p1091wn;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17656A;

/* JADX INFO: renamed from: wn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C21023d implements InterfaceC21029j, InterfaceC21024e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66893a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC21029j f66894b;

    /* JADX INFO: renamed from: c */
    public final int f66895c;

    public C21023d(InterfaceC21029j sequence, int i10, int i11) {
        this.f66893a = i11;
        switch (i11) {
            case 1:
                this.f66894b = sequence;
                this.f66895c = i10;
                if (i10 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
            default:
                AbstractC16544l.m18094g(sequence, "sequence");
                this.f66894b = sequence;
                this.f66895c = i10;
                if (i10 >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    @Override // p1091wn.InterfaceC21024e
    /* JADX INFO: renamed from: a */
    public final InterfaceC21029j mo21475a(int i10) {
        switch (this.f66893a) {
            case 0:
                int i11 = this.f66895c;
                int i12 = i11 + i10;
                return i12 < 0 ? new C21023d(this, i10, 1) : new C21035p(this.f66894b, i11, i12);
            default:
                return i10 >= this.f66895c ? this : new C21023d(this.f66894b, i10, 1);
        }
    }

    @Override // p1091wn.InterfaceC21024e
    /* JADX INFO: renamed from: b */
    public final InterfaceC21029j mo21476b(int i10) {
        switch (this.f66893a) {
            case 0:
                int i11 = this.f66895c + i10;
                return i11 < 0 ? new C21023d(this, i10, 0) : new C21023d(this.f66894b, i11, 0);
            default:
                int i12 = this.f66895c;
                return i10 >= i12 ? C21026g.f66901a : new C21035p(this.f66894b, i10, i12);
        }
    }

    @Override // p1091wn.InterfaceC21029j
    public final Iterator iterator() {
        switch (this.f66893a) {
            case 0:
                return new C17656A(this);
            default:
                return new C17656A(this, (byte) 0);
        }
    }
}
