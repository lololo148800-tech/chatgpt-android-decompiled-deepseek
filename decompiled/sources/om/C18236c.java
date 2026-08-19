package om;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p030B2.AbstractC0727H;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: om.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C18236c extends AbstractC0727H implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f58106q0;

    public C18236c(C18238e map, int i10) {
        this.f58106q0 = i10;
        AbstractC16544l.m18094g(map, "map");
        this.f2088p0 = map;
        this.f2086Z = -1;
        this.f2087o0 = map.f58118t0;
        m1539e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f58106q0) {
            case 0:
                m1538b();
                int i10 = this.f2085Y;
                C18238e c18238e = (C18238e) this.f2088p0;
                if (i10 >= c18238e.f58116r0) {
                    throw new NoSuchElementException();
                }
                this.f2085Y = i10 + 1;
                this.f2086Z = i10;
                C18237d c18237d = new C18237d(c18238e, i10);
                m1539e();
                return c18237d;
            case 1:
                m1538b();
                int i11 = this.f2085Y;
                C18238e c18238e2 = (C18238e) this.f2088p0;
                if (i11 >= c18238e2.f58116r0) {
                    throw new NoSuchElementException();
                }
                this.f2085Y = i11 + 1;
                this.f2086Z = i11;
                Object obj = c18238e2.f58111Y[i11];
                m1539e();
                return obj;
            default:
                m1538b();
                int i12 = this.f2085Y;
                C18238e c18238e3 = (C18238e) this.f2088p0;
                if (i12 >= c18238e3.f58116r0) {
                    throw new NoSuchElementException();
                }
                this.f2085Y = i12 + 1;
                this.f2086Z = i12;
                Object[] objArr = c18238e3.f58112Z;
                AbstractC16544l.m18091d(objArr);
                Object obj2 = objArr[this.f2086Z];
                m1539e();
                return obj2;
        }
    }
}
