package p363Og;

import kotlin.jvm.internal.AbstractC16544l;
import p037B9.MeDP.MpoABj;
import p350O1.C6045C;

/* JADX INFO: renamed from: Og.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C6205i implements InterfaceC6206j {

    /* JADX INFO: renamed from: a */
    public final C6045C f20209a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6205i) && AbstractC16544l.m18089b(this.f20209a, ((C6205i) obj).f20209a);
    }

    public final int hashCode() {
        return this.f20209a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C6205i(C6045C c6045c) {
        AbstractC16544l.m18094g(c6045c, MpoABj.GmLF);
        this.f20209a = c6045c;
    }
}
