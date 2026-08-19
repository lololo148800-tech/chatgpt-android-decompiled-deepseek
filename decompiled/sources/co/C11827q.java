package co;

import bo.AbstractC11516d;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: co.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C11827q implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final AbstractC11516d f35840Y;

    /* JADX INFO: renamed from: Z */
    public final C11802C f35841Z;

    /* JADX INFO: renamed from: o0 */
    public final KSerializer f35842o0;

    public C11827q(AbstractC11516d json, C11802C c11802c, KSerializer kSerializer) {
        AbstractC16544l.m18094g(json, "json");
        this.f35840Y = json;
        this.f35841Z = c11802c;
        this.f35842o0 = kSerializer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35841Z.mo6939y() != 10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        EnumC11810K enumC11810K = EnumC11810K.OBJ;
        KSerializer kSerializer = this.f35842o0;
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        return new C11804E(this.f35840Y, enumC11810K, this.f35841Z, descriptor, null).mo5482p(kSerializer);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
