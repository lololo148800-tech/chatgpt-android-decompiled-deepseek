package ao;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3757e;
import p225Im.InterfaceC3777y;
import p523V9.AbstractC8138m0;

/* JADX INFO: renamed from: ao.J */
/* JADX INFO: loaded from: classes2.dex */
public final class C11136J implements InterfaceC3777y {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC3777y f33765Y;

    public C11136J(InterfaceC3777y origin) {
        AbstractC16544l.m18094g(origin, "origin");
        this.f33765Y = origin;
    }

    @Override // p225Im.InterfaceC3777y
    /* JADX INFO: renamed from: b */
    public final boolean mo4452b() {
        return this.f33765Y.mo4452b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C11136J c11136j = obj instanceof C11136J ? (C11136J) obj : null;
        InterfaceC3777y interfaceC3777y = c11136j != null ? c11136j.f33765Y : null;
        InterfaceC3777y interfaceC3777y2 = this.f33765Y;
        if (!AbstractC16544l.m18089b(interfaceC3777y2, interfaceC3777y)) {
            return false;
        }
        InterfaceC3757e classifier = interfaceC3777y2.getClassifier();
        if (classifier instanceof InterfaceC3756d) {
            InterfaceC3777y interfaceC3777y3 = obj instanceof InterfaceC3777y ? (InterfaceC3777y) obj : null;
            InterfaceC3757e classifier2 = interfaceC3777y3 != null ? interfaceC3777y3.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof InterfaceC3756d)) {
                return AbstractC8138m0.m8667b((InterfaceC3756d) classifier).equals(AbstractC8138m0.m8667b((InterfaceC3756d) classifier2));
            }
        }
        return false;
    }

    @Override // p225Im.InterfaceC3777y
    public final List getArguments() {
        return this.f33765Y.getArguments();
    }

    @Override // p225Im.InterfaceC3777y
    public final InterfaceC3757e getClassifier() {
        return this.f33765Y.getClassifier();
    }

    public final int hashCode() {
        return this.f33765Y.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f33765Y;
    }
}
